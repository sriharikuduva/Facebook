import metadata.ConnectionInvitationStatus;

import java.util.Date;

public class ConnectionInvitation {
    private Member memberInvited;
    private ConnectionInvitationStatus status;
    private Date dateCreated, dateUpdated;

    public void acceptConnection();
    public void rejectConnection();

    public Member getMemberInvited() {
        return memberInvited;
    }
    public void setMemberInvited(Member memberInvited) {
        this.memberInvited = memberInvited;
    }

    public ConnectionInvitationStatus getStatus() {
        return status;
    }
    public void setStatus(ConnectionInvitationStatus status) {
        this.status = status;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }
    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }
}