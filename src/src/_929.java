import java.util.HashSet;
import java.util.Set;

public class _929 {
    public int numUniqueEmails(String[] emails) {
        Set<String> res = new HashSet<>();
        for(String e : emails){
            StringBuilder eUpdated = new StringBuilder();
            for(int i=0; i< e.length(); i++){
                if (e.charAt(i)=='.') {
                    continue;
                }
                else if (e.charAt(i) == '+' || e.charAt(i) == '@') {
                    eUpdated.append(e.substring(e.indexOf('@'), e.length()));
                    break;
                }else {
                    eUpdated.append(e.charAt(i));
                }
            }
            res.add(eUpdated.toString());
        }
        return res.size();
    }
}
