package r45;

/* loaded from: classes5.dex */
public class v65 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public v65() {
        super(com.tencent.mm.protobuf.i.r(1, "base_request", r45.he.class), com.tencent.mm.protobuf.i.i(2, "report_type"), com.tencent.mm.protobuf.i.a(3, "report_link"), com.tencent.mm.protobuf.i.n(4, "aid"), com.tencent.mm.protobuf.i.a(5, "trace_id"), com.tencent.mm.protobuf.i.u(6, "pos_id"), com.tencent.mm.protobuf.i.u(7, "report_extra_data"), com.tencent.mm.protobuf.i.i(8, "not_display_ad_reason"));
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
