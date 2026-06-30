package r45;

/* loaded from: classes.dex */
public class tq extends com.tencent.mm.protobuf.e implements r45.my3 {
    public tq() {
        super(com.tencent.mm.protobuf.i.r(1, "base_request", r45.he.class), com.tencent.mm.protobuf.i.u(2, dm.i4.COL_USERNAME));
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
