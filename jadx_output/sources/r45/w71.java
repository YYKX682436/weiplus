package r45;

/* loaded from: classes.dex */
public class w71 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public w71() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finderBasereq", r45.kv0.class), com.tencent.mm.protobuf.i.n(3, "liveId"), com.tencent.mm.protobuf.i.n(4, "objectId"), com.tencent.mm.protobuf.i.u(5, "finderUsername"), com.tencent.mm.protobuf.i.u(6, "object_nonce_id"), com.tencent.mm.protobuf.i.i(7, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.a(8, "live_contacts_last_buffer"), com.tencent.mm.protobuf.i.c(9, "clear_recent_reward_history"), com.tencent.mm.protobuf.i.u(10, "mic_id"), com.tencent.mm.protobuf.i.u(11, "board_key"), com.tencent.mm.protobuf.i.i(12, "board_type"), com.tencent.mm.protobuf.i.i(13, "business_filter_scene"), com.tencent.mm.protobuf.i.a(14, "get_live_online_member_buf"));
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
