package r45;

/* loaded from: classes5.dex */
public class ft0 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public ft0() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.a(3, "live_cookies"), com.tencent.mm.protobuf.i.n(4, "live_id"), com.tencent.mm.protobuf.i.n(5, "object_id"), com.tencent.mm.protobuf.i.u(6, "object_nonce_id"), com.tencent.mm.protobuf.i.i(7, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.u(8, "finder_username"), com.tencent.mm.protobuf.i.u(9, "live_mic_id"), com.tencent.mm.protobuf.i.i(10, "mic_type"), com.tencent.mm.protobuf.i.s(11, "mic_info_list", r45.fl4.class), com.tencent.mm.protobuf.i.s(12, "self_audience_mic_info_list", r45.fl4.class), com.tencent.mm.protobuf.i.s(13, "other_live_mic_info_list", r45.ea4.class), com.tencent.mm.protobuf.i.s(14, "unrecognized_audience_mic_info_list", r45.fl4.class), com.tencent.mm.protobuf.i.i(15, "report_scene"), com.tencent.mm.protobuf.i.n(16, "client_timestamp_ms"), com.tencent.mm.protobuf.i.r(17, "self_anchor_mic_info", r45.fl4.class));
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
