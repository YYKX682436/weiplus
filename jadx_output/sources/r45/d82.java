package r45;

/* loaded from: classes5.dex */
public class d82 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public d82() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.u(3, "reward_finder_username"), com.tencent.mm.protobuf.i.u(4, "income_finder_username"), com.tencent.mm.protobuf.i.a(5, "live_cookies"), com.tencent.mm.protobuf.i.n(6, "object_id"), com.tencent.mm.protobuf.i.n(7, "live_id"), com.tencent.mm.protobuf.i.u(8, "reward_product_id"), com.tencent.mm.protobuf.i.i(9, "reward_product_count"), com.tencent.mm.protobuf.i.i(10, "reward_amount_in_wecoin"), com.tencent.mm.protobuf.i.i(11, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.i(12, "prepare_reward_product_count"), com.tencent.mm.protobuf.i.i(13, "scene_flag"), com.tencent.mm.protobuf.i.a(14, "business_buff"));
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
