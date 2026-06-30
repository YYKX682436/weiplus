package r45;

/* loaded from: classes8.dex */
public class q01 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public q01() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.u(2, "nickname"), com.tencent.mm.protobuf.i.a(3, "headImg"), com.tencent.mm.protobuf.i.u(4, "headImgUrl"), com.tencent.mm.protobuf.i.r(5, "finderBaseRequest", r45.kv0.class), com.tencent.mm.protobuf.i.u(6, "signature"), com.tencent.mm.protobuf.i.r(7, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO, r45.hz0.class), com.tencent.mm.protobuf.i.i(8, "notShowLocationSwitch"), com.tencent.mm.protobuf.i.i(9, "notShowSexSwitch"), com.tencent.mm.protobuf.i.r(10, "registerInfo", r45.hz0.class), com.tencent.mm.protobuf.i.i(11, "showFinderInWx"), com.tencent.mm.protobuf.i.r(12, "create_info", r45.fa0.class), com.tencent.mm.protobuf.i.i(13, "not_recommend_to_friend"), com.tencent.mm.protobuf.i.u(14, "clientid"));
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
