package w05;

/* loaded from: classes9.dex */
public class j extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f441941d;

    public j() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "appid"), com.tencent.mm.protobuf.i.u(-1, com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH), com.tencent.mm.protobuf.i.u(-1, "query"), com.tencent.mm.protobuf.i.u(-1, "default_url")});
        this.f441941d = appendAttrs;
        super.set__serialName("lite_app_info");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", "", "", ""});
    }

    public java.lang.String getAppId() {
        return super.getString(this.f441941d + 0);
    }

    public java.lang.String getPath() {
        return super.getString(this.f441941d + 1);
    }

    public java.lang.String j() {
        return super.getString(this.f441941d + 3);
    }

    public java.lang.String k() {
        return super.getString(this.f441941d + 2);
    }
}
