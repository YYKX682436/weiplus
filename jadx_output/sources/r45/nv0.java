package r45;

/* loaded from: classes2.dex */
public class nv0 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public nv0() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finderBasereq", r45.kv0.class), com.tencent.mm.protobuf.i.s(3, "object_uid_list", r45.in2.class), com.tencent.mm.protobuf.i.i(4, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.i(5, "liveReportScene"), com.tencent.mm.protobuf.i.i(6, "commentcene"), com.tencent.mm.protobuf.i.u(7, "finderUsername"), com.tencent.mm.protobuf.i.u(8, "clientUserAgent"), com.tencent.mm.protobuf.i.u(9, "uxinfo"), com.tencent.mm.protobuf.i.l(10, "scenes"), com.tencent.mm.protobuf.i.c(11, "is_refresh"), com.tencent.mm.protobuf.i.i(12, "trigger_scene"), com.tencent.mm.protobuf.i.r(13, "user_location", r45.fr0.class), com.tencent.mm.protobuf.i.i(14, "location_generated_time"), com.tencent.mm.protobuf.i.a(15, "async_load_info_buffer"));
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
