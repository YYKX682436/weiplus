package r45;

/* loaded from: classes.dex */
public class ee1 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public ee1() {
        super(com.tencent.mm.protobuf.i.u(1, "anchor_finder_username"), com.tencent.mm.protobuf.i.n(2, "object_id"), com.tencent.mm.protobuf.i.a(3, "product_buffer"), com.tencent.mm.protobuf.i.i(4, "req_scene"), com.tencent.mm.protobuf.i.r(5, "BaseRequest", r45.he.class));
        this.__printBytes = true;
    }

    @Override // r45.my3
    public final r45.he getBaseRequest() {
        return (r45.he) getCustom(4);
    }

    @Override // r45.my3
    public r45.my3 setBaseRequest(r45.he heVar) {
        set(4, heVar);
        return this;
    }
}
