package s15;

/* loaded from: classes9.dex */
public class a extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f402151d;

    public a() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "mainTitle"), com.tencent.mm.protobuf.i.u(-1, "subTitle"), com.tencent.mm.protobuf.i.u(-1, "imgUrl"), com.tencent.mm.protobuf.i.u(-1, "themeId")});
        this.f402151d = appendAttrs;
        super.set__serialName("FinderLiveThemeItem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", "", "", ""});
    }

    public java.lang.String getHeadImgUrl() {
        return super.getString(this.f402151d + 2);
    }

    public java.lang.String j() {
        return super.getString(this.f402151d + 0);
    }

    public java.lang.String k() {
        return super.getString(this.f402151d + 3);
    }

    public void l(java.lang.String str) {
        super.set(this.f402151d + 2, str);
    }

    public void n(java.lang.String str) {
        super.set(this.f402151d + 0, str);
    }

    public void o(java.lang.String str) {
        super.set(this.f402151d + 1, str);
    }

    public void p(java.lang.String str) {
        super.set(this.f402151d + 3, str);
    }
}
