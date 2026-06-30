package r45;

/* loaded from: classes.dex */
public class nz1 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public nz1() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.u(3, "anchor_finderusername"), com.tencent.mm.protobuf.i.n(4, "object_id"), com.tencent.mm.protobuf.i.r(5, "item", r45.dz1.class), com.tencent.mm.protobuf.i.u(6, "request_id"), com.tencent.mm.protobuf.i.i(7, "method_id"));
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
