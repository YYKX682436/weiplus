package r45;

/* loaded from: classes.dex */
public class h13 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public h13() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.u(3, "song_name"), com.tencent.mm.protobuf.i.i(4, "state"), com.tencent.mm.protobuf.i.n(5, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_SEQ), com.tencent.mm.protobuf.i.n(6, "object_id"), com.tencent.mm.protobuf.i.n(7, "live_id"), com.tencent.mm.protobuf.i.u(8, "finder_username"));
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
