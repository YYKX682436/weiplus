package r45;

/* loaded from: classes.dex */
public class k91 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public k91() {
        super(com.tencent.mm.protobuf.i.r(1, "baseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.n(3, "topic_id"), com.tencent.mm.protobuf.i.u(4, "by_pass_info"), com.tencent.mm.protobuf.i.a(5, "last_buffer"), com.tencent.mm.protobuf.i.r(6, "status", r45.dx0.class), com.tencent.mm.protobuf.i.i(7, "prefetch_type"), com.tencent.mm.protobuf.i.i(8, "tab_id"), com.tencent.mm.protobuf.i.n(9, "from_object_id"), com.tencent.mm.protobuf.i.u(10, "jump_info_native_by_pass_info"));
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
