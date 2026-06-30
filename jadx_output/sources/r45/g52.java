package r45;

/* loaded from: classes.dex */
public class g52 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public g52() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finderBasereq", r45.kv0.class), com.tencent.mm.protobuf.i.u(3, "finderUsername"), com.tencent.mm.protobuf.i.n(4, "liveId"), com.tencent.mm.protobuf.i.n(5, "objectId"), com.tencent.mm.protobuf.i.n(6, "productId"), com.tencent.mm.protobuf.i.i(7, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.u(8, "object_nonce_id"), com.tencent.mm.protobuf.i.i(9, "promote_type"), com.tencent.mm.protobuf.i.n(10, "ad_id"), com.tencent.mm.protobuf.i.n(11, "spu_id"), com.tencent.mm.protobuf.i.i(12, "product_type"), com.tencent.mm.protobuf.i.a(13, "product_ext_info"), com.tencent.mm.protobuf.i.i(15, "promoting_business_type"), com.tencent.mm.protobuf.i.r(16, "item", r45.y46.class));
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
