package r45;

/* loaded from: classes.dex */
public class fm1 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public fm1() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.u(3, "finder_username"), com.tencent.mm.protobuf.i.l(4, "song_id_list"), com.tencent.mm.protobuf.i.i(5, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.a(6, "live_cookies"), com.tencent.mm.protobuf.i.n(7, "live_id"), com.tencent.mm.protobuf.i.n(8, "object_id"), com.tencent.mm.protobuf.i.s(9, "brief_music_infos", r45.rm1.class));
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
