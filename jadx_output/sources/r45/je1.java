package r45;

/* loaded from: classes.dex */
public class je1 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public je1() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.u(3, "finder_username"), com.tencent.mm.protobuf.i.i(4, "biz_scene"), com.tencent.mm.protobuf.i.a(5, "live_cookies"), com.tencent.mm.protobuf.i.n(6, "object_id"), com.tencent.mm.protobuf.i.n(7, "live_id"), com.tencent.mm.protobuf.i.i(8, "cur_volume"), com.tencent.mm.protobuf.i.i(9, "cur_song_id"), com.tencent.mm.protobuf.i.i(10, "cur_song_ratio"), com.tencent.mm.protobuf.i.i(11, "action"), com.tencent.mm.protobuf.i.r(12, "new_cur_brief_music_infos", r45.rm1.class));
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
