package r45;

/* loaded from: classes8.dex */
public class zy2 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public zy2() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.i(2, "selector"), com.tencent.mm.protobuf.i.r(3, "keyBuf", r45.cu5.class), com.tencent.mm.protobuf.i.s(4, "contacts", com.tencent.mm.protocal.protobuf.FinderContact.class), com.tencent.mm.protobuf.i.s(5, "self", com.tencent.mm.protocal.protobuf.FinderContact.class), com.tencent.mm.protobuf.i.u(6, "finderUsername"), com.tencent.mm.protobuf.i.r(7, "finderBaseRequest", r45.kv0.class), com.tencent.mm.protobuf.i.i(8, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.s(9, "ctrlInfoList", r45.vs2.class), com.tencent.mm.protobuf.i.u(10, "entranceTipsId"), com.tencent.mm.protobuf.i.s(11, "nearby_ctrl_info_list", r45.vs2.class), com.tencent.mm.protobuf.i.u(12, "nearby_entrance_tips_id"), com.tencent.mm.protobuf.i.i(13, "stay_display_tab_type"), com.tencent.mm.protobuf.i.u(14, "clientAiInfo"), com.tencent.mm.protobuf.i.i(15, "fredDeleted"), com.tencent.mm.protobuf.i.n(16, "freqctrlSet"), com.tencent.mm.protobuf.i.r(17, "clientInfo", r45.jy2.class), com.tencent.mm.protobuf.i.r(18, "clientStatus", r45.ky2.class), com.tencent.mm.protobuf.i.w(19, "multi_finder_username"), com.tencent.mm.protobuf.i.r(20, "coordinate", r45.sz0.class), com.tencent.mm.protobuf.i.r(21, "entrance_expose_content", r45.el0.class), com.tencent.mm.protobuf.i.a(22, "last_buffer"), com.tencent.mm.protobuf.i.s(23, "sync_club_info_list", r45.ly2.class), com.tencent.mm.protobuf.i.s(24, "sns_ctrl_info_list", r45.vs2.class), com.tencent.mm.protobuf.i.s(25, "reddot_expose_infos", r45.zs2.class), com.tencent.mm.protobuf.i.r(26, "finder_client_status", r45.dx0.class), com.tencent.mm.protobuf.i.a(27, "reliable_notify_buff"));
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
