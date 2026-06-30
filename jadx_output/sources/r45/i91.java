package r45;

/* loaded from: classes.dex */
public class i91 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public i91() {
        super(com.tencent.mm.protobuf.i.r(1, "baseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.u(3, "by_pass_info"), com.tencent.mm.protobuf.i.a(4, "last_buffer"), com.tencent.mm.protobuf.i.r(5, "status", r45.dx0.class), com.tencent.mm.protobuf.i.i(6, "prefetch_type"), com.tencent.mm.protobuf.i.i(8, "tab_id"));
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
