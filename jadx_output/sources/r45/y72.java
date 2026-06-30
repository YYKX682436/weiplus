package r45;

/* loaded from: classes.dex */
public class y72 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public y72() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.u(3, "finder_username"), com.tencent.mm.protobuf.i.n(4, "object_id"), com.tencent.mm.protobuf.i.n(5, "live_id"), com.tencent.mm.protobuf.i.u(6, "reward_product_id"), com.tencent.mm.protobuf.i.u(7, "request_id"), com.tencent.mm.protobuf.i.a(8, "live_cookies"), com.tencent.mm.protobuf.i.w(9, "free_gift_ids"), com.tencent.mm.protobuf.i.i(10, "reward_scene"));
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
