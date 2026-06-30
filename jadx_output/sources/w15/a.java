package w15;

/* loaded from: classes11.dex */
public class a extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f442242d;

    public a() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "appid"), com.tencent.mm.protobuf.i.u(-1, com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE), com.tencent.mm.protobuf.i.u(-1, "timeout"), com.tencent.mm.protobuf.i.u(-1, "uuid"), com.tencent.mm.protobuf.i.u(-1, "forceShow"), com.tencent.mm.protobuf.i.u(-1, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.u(-1, "syncEscape"), com.tencent.mm.protobuf.i.i(-1, "escapeChoise")});
        this.f442242d = appendAttrs;
        super.set__serialName("CommonLiteAppGuidance");
        super.set__xmlPrefixTag("sysmsg");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, null, null, null, null, null, null, 0});
    }

    public java.lang.String getAppid() {
        return super.getString(this.f442242d + 0);
    }

    public java.lang.String getScene() {
        return super.getString(this.f442242d + 5);
    }

    public java.lang.String getUuid() {
        return super.getString(this.f442242d + 3);
    }

    public int j() {
        return super.getInteger(this.f442242d + 7);
    }

    public java.lang.String k() {
        return super.getString(this.f442242d + 1);
    }

    public java.lang.String l() {
        return super.getString(this.f442242d + 6);
    }
}
