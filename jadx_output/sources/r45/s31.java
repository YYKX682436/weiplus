package r45;

/* loaded from: classes2.dex */
public class s31 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public s31() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.u(2, "postUsername"), com.tencent.mm.protobuf.i.i(3, "opType"), com.tencent.mm.protobuf.i.n(4, "refObjectId"), com.tencent.mm.protobuf.i.u(5, "finderUsername"), com.tencent.mm.protobuf.i.u(6, "refObjectNonceId"), com.tencent.mm.protobuf.i.r(7, "finderBaseRequest", r45.kv0.class), com.tencent.mm.protobuf.i.u(8, "sessionBuffer"), com.tencent.mm.protobuf.i.i(9, "enterType"), com.tencent.mm.protobuf.i.r(10, "live_report_base_info", r45.o72.class), com.tencent.mm.protobuf.i.i(11, "follow_scene"), com.tencent.mm.protobuf.i.a(12, "ref_live_cookies"), com.tencent.mm.protobuf.i.i(13, "reserve_inner_scene"), com.tencent.mm.protobuf.i.n(14, "from_mention_id"), com.tencent.mm.protobuf.i.a(15, "ux_info"), com.tencent.mm.protobuf.i.i(16, "enhance_follow_btn"), com.tencent.mm.protobuf.i.r(17, "newlife_report_info", r45.p31.class), com.tencent.mm.protobuf.i.u(19, "ref_mic_id"));
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
