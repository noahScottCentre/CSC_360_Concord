package concordSprint2;

import ConcordData.*;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface serverInterface extends Remote {


	public GroupData getGroupData(long UserId, long GroupID) throws RemoteException;
	public GroupData sendMsg(long UserId, long GroupId, long ChatId, MsgData message) throws RemoteException;
	public GroupData makeGroup(long UserId, GroupData newGroup) throws RemoteException;
	public GroupData makeRole(long UserId, long GroupId, Role newRole) throws RemoteException;
	public GroupData makeChatListing(long UserId, long GroupId, ChatListing newChat) throws RemoteException;
	public GroupData inviteUser(long UserId, long GroupId, long InvitedUserId) throws RemoteException;
	public GroupData deleteMsg(long UserId, long GroupId, long ChatId, long MsgId) throws RemoteException;
	public GroupData deleteChatListing(long UserId, long GroupId, long ChatId) throws RemoteException;
	public boolean deleteGroup(long UserId, long GroupId) throws RemoteException;
	public GroupData deleteRole(long UserId, long GroupId, String RoleName) throws RemoteException;
	public boolean deleteUser(long UserId, String Password) throws RemoteException;
	public UserData addUser(UserData newUser) throws RemoteException;
	public GroupData giveTakeRole(long UserId, long GroupId, long TargetUser, String RoleName, boolean giveOrTake) throws RemoteException; 
	public void alertStatus(long UserId, long Status) throws RemoteException;
	public UserData login(String Name, String Password, ClientInterface client) throws RemoteException;
}
