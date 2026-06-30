package r45;

/* loaded from: classes.dex */
public class vb3 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public vb3() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.i(3, "wevision_sdk_version"), com.tencent.mm.protobuf.i.a(4, "page_buffer"), com.tencent.mm.protobuf.i.i(5, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.i(6, "enter_type"), com.tencent.mm.protobuf.i.u(7, "from_tpl_id"), com.tencent.mm.protobuf.i.n(8, "event_topic_id"), com.tencent.mm.protobuf.i.c(9, "force_test_env"), com.tencent.mm.protobuf.i.u(10, "finder_username"), com.tencent.mm.protobuf.i.a(11, "tab_tips_by_pass_info"), com.tencent.mm.protobuf.i.u(12, "song_id"), com.tencent.mm.protobuf.i.i(13, "enter_scene"), com.tencent.mm.protobuf.i.n(14, "tab_id"), com.tencent.mm.protobuf.i.n(15, "feed_id"));
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
