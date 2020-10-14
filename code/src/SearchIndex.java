import java.util.HashMap;
import java.util.List;

public class SearchIndex implements Search {
    HashMap<String, List<Member>> memberNames;
    HashMap<String, List<Group>> groupNames;
    HashMap<String, List<Page>> pageTitles;
    HashMap<String, List<Post>> posts;

    public void addMember(Member member) {
        if(memberNames.containsKey(member.getName())) {
            memberNames.get(member.getName()).add(member);
        } else {
            memberNames.put(member.getName(), member);
        }
    }


    public List<Member> searchMember(String name) {
        return memberNames.get(name);
    }

    public List<Group> searchGroup(String name) {
        return groupNames.get(name);
    }

    public List<Page> searchPage(String name) {
        return pageTitles.get(name);
    }

    public List<Post> searchPost(String word) {
        return posts.get(word);
    }
}