package r45;

/* loaded from: classes5.dex */
public class k71 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public k71() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.n(2, "liveId"), com.tencent.mm.protobuf.i.u(3, "finder_username"), com.tencent.mm.protobuf.i.i(4, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.u(5, "export_id"), com.tencent.mm.protobuf.i.r(6, "live_status", r45.rn1.class), com.tencent.mm.protobuf.i.r(7, "ad_bypass_info", r45.s74.class), com.tencent.mm.protobuf.i.r(8, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.r(9, "notification_info", r45.m71.class), com.tencent.mm.protobuf.i.r(11, "get_audience_mic_stats_args", r45.da3.class));
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
