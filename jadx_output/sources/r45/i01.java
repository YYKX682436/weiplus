package r45;

/* loaded from: classes5.dex */
public class i01 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public i01() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.u(3, "finder_username"), com.tencent.mm.protobuf.i.u(4, "mic_finder_username"), com.tencent.mm.protobuf.i.n(5, "mic_object_id"), com.tencent.mm.protobuf.i.n(6, "mic_live_id"), com.tencent.mm.protobuf.i.u(7, "mic_object_nonce_id"), com.tencent.mm.protobuf.i.s(10, "gesture_list", r45.ir1.class), com.tencent.mm.protobuf.i.n(11, "gesture_sdk_version"), com.tencent.mm.protobuf.i.i(12, "qrcode_poster_styles_version"), com.tencent.mm.protobuf.i.i(15, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE));
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
