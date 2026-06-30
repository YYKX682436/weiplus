package r45;

/* loaded from: classes2.dex */
public class g01 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public g01() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finderBasereq", r45.kv0.class), com.tencent.mm.protobuf.i.u(3, "finderUsername"), com.tencent.mm.protobuf.i.r(4, "liveNoticeInfo", r45.h32.class), com.tencent.mm.protobuf.i.i(5, "optype"), com.tencent.mm.protobuf.i.i(6, "platform_scene"), com.tencent.mm.protobuf.i.s(7, "attach_info", r45.jb.class), com.tencent.mm.protobuf.i.r(8, "payment_setting", r45.t32.class), com.tencent.mm.protobuf.i.u(9, "del_reason"), com.tencent.mm.protobuf.i.i(10, "notice_aggregate_type"), com.tencent.mm.protobuf.i.i(11, "source_scene"), com.tencent.mm.protobuf.i.u(12, "modify_reason"), com.tencent.mm.protobuf.i.n(13, "modify_field_flag"));
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
