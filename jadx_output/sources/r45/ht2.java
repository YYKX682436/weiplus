package r45;

/* loaded from: classes.dex */
public class ht2 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public ht2() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "baserequest", r45.kv0.class), com.tencent.mm.protobuf.i.r(3, "status", r45.dx0.class));
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
