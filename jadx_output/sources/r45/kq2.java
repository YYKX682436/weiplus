package r45;

/* loaded from: classes.dex */
public class kq2 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public kq2() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finderBaseReq", r45.kv0.class), com.tencent.mm.protobuf.i.u(3, dm.i4.COL_USERNAME), com.tencent.mm.protobuf.i.u(4, "event_name"), com.tencent.mm.protobuf.i.u(5, "event_description"), com.tencent.mm.protobuf.i.u(6, "eventCoverImageUrl"), com.tencent.mm.protobuf.i.n(7, "eventEndTime"), com.tencent.mm.protobuf.i.i(8, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE));
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
