package r45;

/* loaded from: classes.dex */
public class f61 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public f61() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.n(2, "object_id"), com.tencent.mm.protobuf.i.i(3, "count"), com.tencent.mm.protobuf.i.u(4, "last_buff"));
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
