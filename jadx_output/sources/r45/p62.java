package r45;

/* loaded from: classes.dex */
public class p62 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public p62() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.n(3, "object_id"), com.tencent.mm.protobuf.i.n(4, "live_id"), com.tencent.mm.protobuf.i.w(5, "stock_ids"), com.tencent.mm.protobuf.i.u(6, "anchor_finder_username"), com.tencent.mm.protobuf.i.a(7, "live_cookies"), com.tencent.mm.protobuf.i.u(8, "request_id"), com.tencent.mm.protobuf.i.u(9, "finder_username"), com.tencent.mm.protobuf.i.i(10, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.u(11, "notice_id"));
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
