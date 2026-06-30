package r45;

/* loaded from: classes.dex */
public class w41 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public w41() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.a(2, "lastBuffer"), com.tencent.mm.protobuf.i.r(3, "finderBasereq", r45.kv0.class));
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
