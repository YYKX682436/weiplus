package r45;

/* loaded from: classes.dex */
public class sw0 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public sw0() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.a(2, "lastbuffer"), com.tencent.mm.protobuf.i.p(3, "ids"), com.tencent.mm.protobuf.i.r(4, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.p(5, "read_items"), com.tencent.mm.protobuf.i.p(6, "unread_items"), com.tencent.mm.protobuf.i.a(7, "last_check_context"), com.tencent.mm.protobuf.i.r(8, "live_report_base_info", r45.o72.class), com.tencent.mm.protobuf.i.i(9, "check_type"), com.tencent.mm.protobuf.i.r(10, "status", r45.dx0.class));
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
