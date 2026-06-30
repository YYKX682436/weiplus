package r45;

/* loaded from: classes.dex */
public class nd1 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public nd1() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.n(3, "live_id"), com.tencent.mm.protobuf.i.n(4, "count"), com.tencent.mm.protobuf.i.a(5, "live_cookies"), com.tencent.mm.protobuf.i.n(6, "object_id"), com.tencent.mm.protobuf.i.n(7, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_SEQ), com.tencent.mm.protobuf.i.i(8, "live_msg_type"), com.tencent.mm.protobuf.i.u(9, "client_msg_id"), com.tencent.mm.protobuf.i.i(10, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.i(11, "optype"), com.tencent.mm.protobuf.i.u(12, "object_nonce_id"), com.tencent.mm.protobuf.i.u(13, "finder_username"), com.tencent.mm.protobuf.i.r(14, "live_report_base_info", r45.o72.class), com.tencent.mm.protobuf.i.i(16, ya.b.SOURCE), com.tencent.mm.protobuf.i.n(17, "accumulate_like_count"), com.tencent.mm.protobuf.i.u(18, "session_buffer"));
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
