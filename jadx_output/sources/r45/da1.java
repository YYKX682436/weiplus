package r45;

/* loaded from: classes.dex */
public class da1 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public da1() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.u(3, "finder_username"), com.tencent.mm.protobuf.i.n(4, "object_id"), com.tencent.mm.protobuf.i.n(5, "product_id"), com.tencent.mm.protobuf.i.i(6, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.n(7, "spu_id"), com.tencent.mm.protobuf.i.i(8, "product_type"), com.tencent.mm.protobuf.i.a(9, "product_ext_info"), com.tencent.mm.protobuf.i.u(10, "ec_source"), com.tencent.mm.protobuf.i.i(11, "req_type"), com.tencent.mm.protobuf.i.u(13, "product_card_key"));
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
