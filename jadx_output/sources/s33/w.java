package s33;

/* loaded from: classes15.dex */
public abstract class w {
    public static y33.e a(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData chatroomUserData) {
        y33.e eVar = new y33.e();
        if (chatroomUserData == null) {
            return eVar;
        }
        eVar.field_userName = chatroomUserData.username;
        eVar.field_roomName = chatroomUserData.chatroom_name;
        eVar.field_nickName = chatroomUserData.nickname;
        eVar.field_avatarURL = chatroomUserData.avatar;
        eVar.field_sex = chatroomUserData.sex;
        eVar.field_jumpInfo = chatroomUserData.jump_info;
        eVar.field_isAuthorized = chatroomUserData.is_authorized;
        eVar.field_tagInfo = chatroomUserData.tag_info;
        eVar.field_lbsInfo = chatroomUserData.lbs_info;
        eVar.field_role = chatroomUserData.role;
        eVar.field_canBeAt = chatroomUserData.can_be_at;
        eVar.field_isRobot = chatroomUserData.is_robot;
        eVar.field_canKickMember = chatroomUserData.can_kick_member;
        eVar.field_userRole = chatroomUserData.user_role;
        eVar.field_canBeKicked = chatroomUserData.can_be_kicked;
        eVar.field_canAtAll = chatroomUserData.can_at_all;
        try {
            eVar.field_rawPbData = chatroomUserData.toByteArray();
        } catch (java.io.IOException unused) {
        }
        return eVar;
    }
}
