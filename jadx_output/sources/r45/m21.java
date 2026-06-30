package r45;

/* loaded from: classes2.dex */
public class m21 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public m21() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.u(2, "finderUsername"), com.tencent.mm.protobuf.i.i(3, "actionType"), com.tencent.mm.protobuf.i.s(4, "extStats", r45.jn0.class), com.tencent.mm.protobuf.i.r(5, "finderBasereq", r45.kv0.class));
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
