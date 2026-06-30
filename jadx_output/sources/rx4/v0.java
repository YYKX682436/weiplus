package rx4;

/* loaded from: classes8.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f401300a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f401301b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f401302c;

    /* renamed from: d, reason: collision with root package name */
    public final int f401303d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f401304e;

    /* renamed from: f, reason: collision with root package name */
    public final int f401305f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f401306g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f401307h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f401308i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f401309j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f401310k;

    public v0(int i17, java.lang.String iconUrl, java.lang.String subTitle, int i18, java.lang.String mixerCommonContext, int i19, java.lang.String appId, java.lang.String weappUrl, java.lang.String userName, java.lang.String ecsAction, java.lang.String ecsJumpInfoBase64) {
        kotlin.jvm.internal.o.g(iconUrl, "iconUrl");
        kotlin.jvm.internal.o.g(subTitle, "subTitle");
        kotlin.jvm.internal.o.g(mixerCommonContext, "mixerCommonContext");
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(weappUrl, "weappUrl");
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(ecsAction, "ecsAction");
        kotlin.jvm.internal.o.g(ecsJumpInfoBase64, "ecsJumpInfoBase64");
        this.f401300a = i17;
        this.f401301b = iconUrl;
        this.f401302c = subTitle;
        this.f401303d = i18;
        this.f401304e = mixerCommonContext;
        this.f401305f = i19;
        this.f401306g = appId;
        this.f401307h = weappUrl;
        this.f401308i = userName;
        this.f401309j = ecsAction;
        this.f401310k = ecsJumpInfoBase64;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx4.v0)) {
            return false;
        }
        rx4.v0 v0Var = (rx4.v0) obj;
        return this.f401300a == v0Var.f401300a && kotlin.jvm.internal.o.b(this.f401301b, v0Var.f401301b) && kotlin.jvm.internal.o.b(this.f401302c, v0Var.f401302c) && this.f401303d == v0Var.f401303d && kotlin.jvm.internal.o.b(this.f401304e, v0Var.f401304e) && this.f401305f == v0Var.f401305f && kotlin.jvm.internal.o.b(this.f401306g, v0Var.f401306g) && kotlin.jvm.internal.o.b(this.f401307h, v0Var.f401307h) && kotlin.jvm.internal.o.b(this.f401308i, v0Var.f401308i) && kotlin.jvm.internal.o.b(this.f401309j, v0Var.f401309j) && kotlin.jvm.internal.o.b(this.f401310k, v0Var.f401310k);
    }

    public int hashCode() {
        return (((((((((((((((((((java.lang.Integer.hashCode(this.f401300a) * 31) + this.f401301b.hashCode()) * 31) + this.f401302c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f401303d)) * 31) + this.f401304e.hashCode()) * 31) + java.lang.Integer.hashCode(this.f401305f)) * 31) + this.f401306g.hashCode()) * 31) + this.f401307h.hashCode()) * 31) + this.f401308i.hashCode()) * 31) + this.f401309j.hashCode()) * 31) + this.f401310k.hashCode();
    }

    public java.lang.String toString() {
        return "FTSRecommendBannerInfo(type=" + this.f401300a + ", iconUrl=" + this.f401301b + ", subTitle=" + this.f401302c + ", parentType=" + this.f401303d + ", mixerCommonContext=" + this.f401304e + ", jumpType=" + this.f401305f + ", appId=" + this.f401306g + ", weappUrl=" + this.f401307h + ", userName=" + this.f401308i + ", ecsAction=" + this.f401309j + ", ecsJumpInfoBase64=" + this.f401310k + ')';
    }
}
