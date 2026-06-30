package r45;

/* loaded from: classes.dex */
public class u91 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public u91() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.u(3, "jump_info_by_pass_info"), com.tencent.mm.protobuf.i.i(4, "prefetch_type"), com.tencent.mm.protobuf.i.u(5, "jump_info_native_by_pass_info"));
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
