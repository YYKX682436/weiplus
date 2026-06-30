package r45;

/* loaded from: classes2.dex */
public class u71 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public u71() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.u(2, "notice_id"), com.tencent.mm.protobuf.i.r(3, "verify_info", r45.u32.class), com.tencent.mm.protobuf.i.u(4, "anchor_finder_username"), com.tencent.mm.protobuf.i.i(5, "last_notice_start_time"), com.tencent.mm.protobuf.i.i(6, "order"), com.tencent.mm.protobuf.i.i(7, "notice_aggregate_type"), com.tencent.mm.protobuf.i.l(8, "notice_aggregate_type_list"), com.tencent.mm.protobuf.i.i(9, "request_scene"));
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
