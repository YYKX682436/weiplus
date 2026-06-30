package r45;

/* loaded from: classes.dex */
public class nw2 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public nw2() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finderBasereq", r45.kv0.class), com.tencent.mm.protobuf.i.a(3, "lastBuffer"), com.tencent.mm.protobuf.i.s(4, "stats", r45.vd6.class));
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
