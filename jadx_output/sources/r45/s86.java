package r45;

/* loaded from: classes.dex */
public class s86 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public s86() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.w(2, "url"), com.tencent.mm.protobuf.i.u(3, "client_id"));
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
