package r45;

/* loaded from: classes5.dex */
public class e01 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public e01() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.u(3, "finder_username"), com.tencent.mm.protobuf.i.r(4, "cover_img", com.tencent.mm.protocal.protobuf.FinderMedia.class), com.tencent.mm.protobuf.i.u(5, "description"), com.tencent.mm.protobuf.i.r(6, ya.b.LOCATION, r45.ze2.class), com.tencent.mm.protobuf.i.u(7, "livegame_auth_ticket"), com.tencent.mm.protobuf.i.u(8, com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID), com.tencent.mm.protobuf.i.i(9, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.i(10, "visibility_mode"), com.tencent.mm.protobuf.i.w(11, "visibility_file_id_list"), com.tencent.mm.protobuf.i.i(12, "anchor_status_flag"), com.tencent.mm.protobuf.i.i(13, "join_team_up_setting"), com.tencent.mm.protobuf.i.w(14, "visible_chatroom_id_list"), com.tencent.mm.protobuf.i.w(15, "visible_username_list"), com.tencent.mm.protobuf.i.r(16, "payment_setting", r45.j73.class), com.tencent.mm.protobuf.i.r(17, "shortcut_wording_setting", r45.pi2.class), com.tencent.mm.protobuf.i.w(18, "redpacket_refer_chatroom_id_list"), com.tencent.mm.protobuf.i.i(19, "anchor_switch_flag"), com.tencent.mm.protobuf.i.a(20, "spam_check_info"), com.tencent.mm.protobuf.i.i(21, "acknowledge_spam_msg"), com.tencent.mm.protobuf.i.i(22, "live_entrance_type"), com.tencent.mm.protobuf.i.i(23, "platform_id"), com.tencent.mm.protobuf.i.u(24, "game_user_id"), com.tencent.mm.protobuf.i.i(26, "live_mode"), com.tencent.mm.protobuf.i.r(27, "special_gift_setting", r45.l73.class), com.tencent.mm.protobuf.i.l(29, "visibility_friend_label_list"));
        this.__printBytes = true;
    }

    @Override // r45.my3
    public final r45.he getBaseRequest() {
        return (r45.he) getCustom(0);
    }

    @Override // r45.my3
    public r45.my3 setBaseRequest(r45.he heVar) {
        set(0, heVar);
        return this;
    }
}
