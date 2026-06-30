package r45;

/* loaded from: classes.dex */
public class u31 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public u31() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.n(2, "followId"), com.tencent.mm.protobuf.i.i(3, "optype"), com.tencent.mm.protobuf.i.r(4, "finderBasereq", r45.kv0.class), com.tencent.mm.protobuf.i.u(5, "finder_username"));
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
