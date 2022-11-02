import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _442 {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(!set.contains(nums[i])) {
                set.add(nums[i]);
            } else {
                list.add(nums[i]);
            }
        }
        return list;
    }
}
