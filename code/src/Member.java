import metadata.Person;

import java.util.Date;
import java.util.Map;
import java.util.Set;

public class Member extends Person {
    private Integer memberId;
    private Date dateOfMembership;

    private Profile profile;
    private Set<Integer> memberFollows;
    private Set<Integer> memberConnections;
    private Set<Integer> pageFollows;
    private Set<Integer> memberSuggestions;
    private Set<ConnectionInvitation> connectionInvitations;
    private Set<Integer> groupFollows;

    public boolean sendMessage(Message message);
    public boolean createPost(Post post);
    public boolean sendConnectionInvitation(ConnectionInvitation invitation);
    private Map<Integer, Integer> searchMemberSuggestions();

    public Integer getMemberId() {
        return memberId;
    }
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Date getDateOfMembership() {
        return dateOfMembership;
    }
    public void setDateOfMembership(Date dateOfMembership) {
        this.dateOfMembership = dateOfMembership;
    }

    public Profile getProfile() {
        return profile;
    }
    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Set<Integer> getMemberFollows() {
        return memberFollows;
    }
    public void setMemberFollows(Set<Integer> memberFollows) {
        this.memberFollows = memberFollows;
    }

    public Set<Integer> getMemberConnections() {
        return memberConnections;
    }
    public void setMemberConnections(Set<Integer> memberConnections) {
        this.memberConnections = memberConnections;
    }

    public Set<Integer> getPageFollows() {
        return pageFollows;
    }
    public void setPageFollows(Set<Integer> pageFollows) {
        this.pageFollows = pageFollows;
    }

    public Set<Integer> getMemberSuggestions() {
        return memberSuggestions;
    }
    public void setMemberSuggestions(Set<Integer> memberSuggestions) {
        this.memberSuggestions = memberSuggestions;
    }

    public Set<ConnectionInvitation> getConnectionInvitations() {
        return connectionInvitations;
    }
    public void setConnectionInvitations(Set<ConnectionInvitation> connectionInvitations) {
        this.connectionInvitations = connectionInvitations;
    }

    public Set<Integer> getGroupFollows() {
        return groupFollows;
    }
    public void setGroupFollows(Set<Integer> groupFollows) {
        this.groupFollows = groupFollows;
    }
}