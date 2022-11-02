import java.util.*;

public class _609 {
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> contentMap = new HashMap<>();
        List<List<String>> rezList = new ArrayList<>();

        for (String path : paths) {
            char[] chrArr = path.toCharArray();
            int spaceIndex = -1;
            int openBracketIndex = -1;
            String root = "";
            for (int i = 0; i < chrArr.length; i++) {
                if (chrArr[i] == ' ') {
                    if (spaceIndex == -1) {
                        root = path.substring(0, i);
                    }
                    spaceIndex = i;
                } else if (chrArr[i] == '(') {
                    openBracketIndex = i;
                } else if (chrArr[i] == ')') {
                    StringBuilder sb = new StringBuilder();
                    String key = path.substring(openBracketIndex, i);
                    List<String> groupLst = contentMap.getOrDefault(key, new ArrayList<>());
                    sb.append(root).append("/").append(path.substring(spaceIndex + 1, openBracketIndex));
                    groupLst.add(sb.toString());
                    contentMap.put(key, groupLst);
                }
            }
        }

        for (Map.Entry<String, List<String>> entry : contentMap.entrySet()) {
            if (entry.getValue().size() > 1)
                rezList.add(entry.getValue());
        }
        return rezList;
    }
}
