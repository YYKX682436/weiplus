package r45;

/* loaded from: classes.dex */
public class jo1 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public jo1() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.n(3, "live_id"), com.tencent.mm.protobuf.i.n(4, "object_id"), com.tencent.mm.protobuf.i.u(5, "object_nonce_id"), com.tencent.mm.protobuf.i.r(6, "config", r45.le2.class), com.tencent.mm.protobuf.i.i(7, "op_type"));
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
