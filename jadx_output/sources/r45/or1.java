package r45;

/* loaded from: classes.dex */
public class or1 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public or1() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.u(3, "finder_username"), com.tencent.mm.protobuf.i.u(4, com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_DEVICE_ID), com.tencent.mm.protobuf.i.u(5, "ticket"), com.tencent.mm.protobuf.i.u(6, com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID), com.tencent.mm.protobuf.i.i(7, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.i(8, "op_type"), com.tencent.mm.protobuf.i.i(9, "platform_id"), com.tencent.mm.protobuf.i.u(10, "game_user_id"));
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
