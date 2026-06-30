package r45;

/* loaded from: classes.dex */
public class r32 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public r32() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.n(2, "object_id"), com.tencent.mm.protobuf.i.n(3, "live_id"), com.tencent.mm.protobuf.i.a(4, "live_cookies"), com.tencent.mm.protobuf.i.n(5, "product_id"));
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
