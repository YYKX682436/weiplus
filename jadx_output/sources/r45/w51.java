package r45;

/* loaded from: classes.dex */
public class w51 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public w51() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finderBasereq", r45.kv0.class), com.tencent.mm.protobuf.i.u(3, "finderUsername"), com.tencent.mm.protobuf.i.a(4, "lastBuffer"), com.tencent.mm.protobuf.i.i(5, "tabType"), com.tencent.mm.protobuf.i.r(6, "status", r45.dx0.class), com.tencent.mm.protobuf.i.n(7, "topicId"));
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
