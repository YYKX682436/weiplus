package r45;

/* loaded from: classes.dex */
public class sr1 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public sr1() {
        super(com.tencent.mm.protobuf.i.r(1, "baseRequest", r45.he.class), com.tencent.mm.protobuf.i.u(2, "anchor_finder_username"), com.tencent.mm.protobuf.i.n(3, "object_id"));
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
