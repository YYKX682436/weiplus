package r45;

/* loaded from: classes.dex */
public class lf2 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public lf2() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.i(3, "target_level"), com.tencent.mm.protobuf.i.s(4, ya.b.ITEM_LIST, r45.n30.class), com.tencent.mm.protobuf.i.n(5, "order_wecoin_amount"), com.tencent.mm.protobuf.i.u(6, "request_id"), com.tencent.mm.protobuf.i.a(7, "live_cookies"), com.tencent.mm.protobuf.i.n(8, "object_id"), com.tencent.mm.protobuf.i.n(9, "live_id"), com.tencent.mm.protobuf.i.u(10, "finder_username"));
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
