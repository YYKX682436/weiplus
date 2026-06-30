package r01;

/* loaded from: classes8.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f368093a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f368094b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f368095c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f368096d;

    /* renamed from: e, reason: collision with root package name */
    public final int f368097e;

    /* renamed from: f, reason: collision with root package name */
    public final int f368098f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f368099g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f368100h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f368101i;

    /* renamed from: j, reason: collision with root package name */
    public final int f368102j;

    public h0(java.lang.String urlKey, boolean z17, java.lang.String brandName, java.lang.String alias, int i17, int i18, java.lang.String shareImageWatermarkParams, java.lang.String brandUserName, java.lang.String title, int i19) {
        kotlin.jvm.internal.o.g(urlKey, "urlKey");
        kotlin.jvm.internal.o.g(brandName, "brandName");
        kotlin.jvm.internal.o.g(alias, "alias");
        kotlin.jvm.internal.o.g(shareImageWatermarkParams, "shareImageWatermarkParams");
        kotlin.jvm.internal.o.g(brandUserName, "brandUserName");
        kotlin.jvm.internal.o.g(title, "title");
        this.f368093a = urlKey;
        this.f368094b = z17;
        this.f368095c = brandName;
        this.f368096d = alias;
        this.f368097e = i17;
        this.f368098f = i18;
        this.f368099g = shareImageWatermarkParams;
        this.f368100h = brandUserName;
        this.f368101i = title;
        this.f368102j = i19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r01.h0)) {
            return false;
        }
        r01.h0 h0Var = (r01.h0) obj;
        return kotlin.jvm.internal.o.b(this.f368093a, h0Var.f368093a) && this.f368094b == h0Var.f368094b && kotlin.jvm.internal.o.b(this.f368095c, h0Var.f368095c) && kotlin.jvm.internal.o.b(this.f368096d, h0Var.f368096d) && this.f368097e == h0Var.f368097e && this.f368098f == h0Var.f368098f && kotlin.jvm.internal.o.b(this.f368099g, h0Var.f368099g) && kotlin.jvm.internal.o.b(this.f368100h, h0Var.f368100h) && kotlin.jvm.internal.o.b(this.f368101i, h0Var.f368101i) && this.f368102j == h0Var.f368102j;
    }

    public int hashCode() {
        return (((((((((((((((((this.f368093a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f368094b)) * 31) + this.f368095c.hashCode()) * 31) + this.f368096d.hashCode()) * 31) + java.lang.Integer.hashCode(this.f368097e)) * 31) + java.lang.Integer.hashCode(this.f368098f)) * 31) + this.f368099g.hashCode()) * 31) + this.f368100h.hashCode()) * 31) + this.f368101i.hashCode()) * 31) + java.lang.Integer.hashCode(this.f368102j);
    }

    public java.lang.String toString() {
        return "BizMpInfo(urlKey=" + this.f368093a + ", enableWaterMark=" + this.f368094b + ", brandName=" + this.f368095c + ", alias=" + this.f368096d + ", brandServiceType=" + this.f368097e + ", imageWatermarkType=" + this.f368098f + ", shareImageWatermarkParams=" + this.f368099g + ", brandUserName=" + this.f368100h + ", title=" + this.f368101i + ", itemShowType=" + this.f368102j + ')';
    }
}
