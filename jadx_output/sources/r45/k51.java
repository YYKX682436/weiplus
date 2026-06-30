package r45;

/* loaded from: classes10.dex */
public class k51 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public k51() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finderBasereq", r45.kv0.class), com.tencent.mm.protobuf.i.w(3, "usernameList"), com.tencent.mm.protobuf.i.i(4, "contact_type"), com.tencent.mm.protobuf.i.u(5, "finder_username"), com.tencent.mm.protobuf.i.s(6, "msgContactList", r45.lz0.class), com.tencent.mm.protobuf.i.s(7, "fansContactList", r45.iz0.class), com.tencent.mm.protobuf.i.s(8, "commentContactList", r45.ez0.class), com.tencent.mm.protobuf.i.s(9, "comment_like_contact_list", r45.fz0.class), com.tencent.mm.protobuf.i.i(10, "enter_type"), com.tencent.mm.protobuf.i.s(11, "stranger_infos", r45.pz0.class), com.tencent.mm.protobuf.i.s(12, "favContactList", r45.jz0.class), com.tencent.mm.protobuf.i.u(13, "wxUsername"), com.tencent.mm.protobuf.i.r(14, "extRelInfo", r45.gz0.class), com.tencent.mm.protobuf.i.i(16, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE));
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
