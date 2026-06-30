package r45;

/* loaded from: classes2.dex */
public class mp2 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public mp2() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.u(3, dm.i4.COL_USERNAME), com.tencent.mm.protobuf.i.u(4, "clientid"), com.tencent.mm.protobuf.i.r(5, "trace_info", r45.jq2.class), com.tencent.mm.protobuf.i.n(6, "post_flag"), com.tencent.mm.protobuf.i.i(7, "post_scene"));
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
