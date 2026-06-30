package r45;

/* loaded from: classes5.dex */
public class r71 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public r71() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.s(2, "contacts", com.tencent.mm.protocal.protobuf.FinderContact.class), com.tencent.mm.protobuf.i.s(3, "msgList", r45.t12.class), com.tencent.mm.protobuf.i.r(4, "liveInfo", r45.nw1.class), com.tencent.mm.protobuf.i.a(5, "liveCookies"), com.tencent.mm.protobuf.i.i(6, "curOnlineCount"), com.tencent.mm.protobuf.i.i(7, "liveInfoEnableFlag"), com.tencent.mm.protobuf.i.i(8, "liveCloseFlag"), com.tencent.mm.protobuf.i.r(9, "live_mic_info", r45.wz1.class), com.tencent.mm.protobuf.i.i(10, "live_mic_info_enable_flag"), com.tencent.mm.protobuf.i.i(11, "pk_close_flag"), com.tencent.mm.protobuf.i.i(12, "live_ext_flag"), com.tencent.mm.protobuf.i.r(13, "livePreloadInfo", r45.l42.class), com.tencent.mm.protobuf.i.i(14, "cur_participant_count"), com.tencent.mm.protobuf.i.s(15, "app_msg_list", r45.ch1.class), com.tencent.mm.protobuf.i.s(16, "templateInfoList", r45.gd2.class), com.tencent.mm.protobuf.i.r(17, "badge_info", r45.yl1.class), com.tencent.mm.protobuf.i.i(18, "next_retry_interval"), com.tencent.mm.protobuf.i.n(19, "cur_like_cnt"), com.tencent.mm.protobuf.i.s(20, "badge_infos", r45.yl1.class), com.tencent.mm.protobuf.i.r(21, "live_game_data", r45.uq1.class), com.tencent.mm.protobuf.i.r(22, "client_config", r45.b94.class), com.tencent.mm.protobuf.i.i(23, "is_history_msg"), com.tencent.mm.protobuf.i.l(24, "enable_extra_sync_cmds"), com.tencent.mm.protobuf.i.l(25, "notify_extra_sync_cmds"), com.tencent.mm.protobuf.i.l(26, "disable_extra_sync_cmds"), com.tencent.mm.protobuf.i.n(27, "backend_anchor_status_flag"), com.tencent.mm.protobuf.i.c(28, "is_fan_club_member"), com.tencent.mm.protobuf.i.r(29, "fan_club_info", r45.eq1.class), com.tencent.mm.protobuf.i.r(33, "event_info", r45.gl1.class), com.tencent.mm.protobuf.i.r(36, "promote_ext_info", r45.x42.class), com.tencent.mm.protobuf.i.r(37, "cheer_info", r45.on1.class), com.tencent.mm.protobuf.i.r(38, "live_ext_flag_info", r45.up1.class), com.tencent.mm.protobuf.i.i(39, "live_close_page_delay_ms"), com.tencent.mm.protobuf.i.c(41, "is_fan_club_super_fans"), com.tencent.mm.protobuf.i.r(42, "on_quality_change_info", r45.ty4.class), com.tencent.mm.protobuf.i.r(43, "mode_info", r45.q12.class), com.tencent.mm.protobuf.i.r(44, "realname_like_bubble_info", r45.i62.class), com.tencent.mm.protobuf.i.a(45, "get_live_online_member_buf"), com.tencent.mm.protobuf.i.i(47, "ktv_player_count"), com.tencent.mm.protobuf.i.r(48, "notice_bubble_info", r45.e32.class), com.tencent.mm.protobuf.i.r(49, "anchor_contact", r45.xn1.class), com.tencent.mm.protobuf.i.c(50, "is_never_join_fanclub"), com.tencent.mm.protobuf.i.r(51, "live_bubble_info", r45.tm1.class), com.tencent.mm.protobuf.i.r(52, "play_together_icon_jump_info", com.tencent.mm.protocal.protobuf.FinderJumpInfo.class), com.tencent.mm.protobuf.i.r(53, "backend_sei_info", r45.vl1.class), com.tencent.mm.protobuf.i.r(54, ya.b.LOCATION, r45.ze2.class), com.tencent.mm.protobuf.i.n(55, "cur_forward_count"), com.tencent.mm.protobuf.i.r(57, "extra_client_config", r45.nn0.class));
        this.__printBytes = true;
    }

    @Override // r45.ny3
    public final r45.ie getBaseResponse() {
        return (r45.ie) getCustom(0);
    }

    @Override // r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        set(0, ieVar);
        return this;
    }
}
