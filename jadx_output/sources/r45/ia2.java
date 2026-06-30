package r45;

/* loaded from: classes2.dex */
public class ia2 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public ia2() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finderBaseRequest", r45.kv0.class), com.tencent.mm.protobuf.i.s(3, "object_uid_list", r45.in2.class), com.tencent.mm.protobuf.i.i(4, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.i(5, "live_report_scene"), com.tencent.mm.protobuf.i.i(6, "comment_scene"), com.tencent.mm.protobuf.i.u(7, "finder_username"), com.tencent.mm.protobuf.i.u(8, "client_user_agent"), com.tencent.mm.protobuf.i.u(9, "uxinfo"), com.tencent.mm.protobuf.i.l(10, "scenes"), com.tencent.mm.protobuf.i.c(11, "is_refresh"), com.tencent.mm.protobuf.i.i(12, "trigger_scene"), com.tencent.mm.protobuf.i.r(13, "user_location", r45.va4.class), com.tencent.mm.protobuf.i.w(14, "live_aggregation_card_id"), com.tencent.mm.protobuf.i.s(15, "card_info_list", r45.gu.class), com.tencent.mm.protobuf.i.s(16, "liveroom_info", r45.ca4.class), com.tencent.mm.protobuf.i.l(17, "interaction_entry_type"));
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
