package r45;

/* loaded from: classes2.dex */
public class ho3 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public ho3() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.u(3, dm.i4.COL_ID), com.tencent.mm.protobuf.i.i(4, "type"), com.tencent.mm.protobuf.i.i(5, "sdk_version"), com.tencent.mm.protobuf.i.i(6, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.u(7, "short_url"), com.tencent.mm.protobuf.i.i(8, "not_use_cache"));
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
