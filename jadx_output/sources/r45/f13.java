package r45;

/* loaded from: classes.dex */
public class f13 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public f13() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.w(3, "song_names"), com.tencent.mm.protobuf.i.n(4, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_SEQ), com.tencent.mm.protobuf.i.n(5, "object_id"), com.tencent.mm.protobuf.i.n(6, "live_id"), com.tencent.mm.protobuf.i.u(7, "finder_username"));
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
