package r45;

/* loaded from: classes.dex */
public class av0 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public av0() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.a(3, "last_buffer"), com.tencent.mm.protobuf.i.n(4, "object_id"), com.tencent.mm.protobuf.i.i(5, "display_tab_type"), com.tencent.mm.protobuf.i.g(6, "longitude"), com.tencent.mm.protobuf.i.g(7, "latitude"), com.tencent.mm.protobuf.i.u(8, "object_nonce_id"), com.tencent.mm.protobuf.i.s(9, "stats", r45.vd6.class), com.tencent.mm.protobuf.i.s(10, "mark_unread_object_list", r45.e13.class), com.tencent.mm.protobuf.i.r(11, "status", r45.dx0.class));
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
