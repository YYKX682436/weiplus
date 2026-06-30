package r45;

/* loaded from: classes.dex */
public class jd2 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public jd2() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finderBasereq", r45.kv0.class), com.tencent.mm.protobuf.i.n(3, "objectId"), com.tencent.mm.protobuf.i.n(4, "liveId"), com.tencent.mm.protobuf.i.n(5, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_SEQ), com.tencent.mm.protobuf.i.i(6, "optype"), com.tencent.mm.protobuf.i.a(7, "liveCookies"), com.tencent.mm.protobuf.i.u(8, "clientMsgId"), com.tencent.mm.protobuf.i.n(9, "objectNonceId"), com.tencent.mm.protobuf.i.u(10, "finderUsername"), com.tencent.mm.protobuf.i.u(11, "nonce_id"), com.tencent.mm.protobuf.i.i(12, "live_scene"), com.tencent.mm.protobuf.i.u(13, "orignal_client_msg_id"));
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
