package r45;

/* loaded from: classes.dex */
public class wr1 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public wr1() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class));
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
