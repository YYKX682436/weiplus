package w05;

/* loaded from: classes9.dex */
public class k extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f441942d;

    public k() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "appid"), com.tencent.mm.protobuf.i.u(-1, "app_username"), com.tencent.mm.protobuf.i.u(-1, com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH), com.tencent.mm.protobuf.i.i(-1, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.u(-1, "scene_note"), com.tencent.mm.protobuf.i.i(-1, "version_type")});
        this.f441942d = appendAttrs;
        super.set__serialName("mini_app_info");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", "", "", 0, "", 0});
    }

    public java.lang.String getAppId() {
        return super.getString(this.f441942d + 0);
    }

    public java.lang.String getPath() {
        return super.getString(this.f441942d + 2);
    }

    public int getScene() {
        return super.getInteger(this.f441942d + 3);
    }

    public java.lang.String j() {
        return super.getString(this.f441942d + 1);
    }

    public java.lang.String k() {
        return super.getString(this.f441942d + 4);
    }

    public int l() {
        return super.getInteger(this.f441942d + 5);
    }
}
