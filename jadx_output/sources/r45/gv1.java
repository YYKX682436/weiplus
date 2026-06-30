package r45;

/* loaded from: classes5.dex */
public class gv1 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public gv1() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.u(3, "finder_username"), com.tencent.mm.protobuf.i.u(4, com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID), com.tencent.mm.protobuf.i.i(5, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.r(6, "ext_device_info", r45.rm0.class), com.tencent.mm.protobuf.i.u(7, "extra_anti_info"), com.tencent.mm.protobuf.i.i(8, "opensdk_version"), com.tencent.mm.protobuf.i.i(9, "platform_id"), com.tencent.mm.protobuf.i.u(10, "game_user_id"), com.tencent.mm.protobuf.i.c(11, "only_need_play_together_info"), com.tencent.mm.protobuf.i.r(12, "dynamic_card_version", r45.ap1.class), com.tencent.mm.protobuf.i.r(13, "paging_get_dynamic_item", r45.l45.class), com.tencent.mm.protobuf.i.r(14, "game_category_info", r45.b63.class));
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
