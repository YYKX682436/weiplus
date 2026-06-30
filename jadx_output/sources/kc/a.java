package kc;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f306256a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f306257b;

    /* renamed from: c, reason: collision with root package name */
    public final int f306258c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f306259d;

    /* renamed from: e, reason: collision with root package name */
    public final int f306260e;

    /* renamed from: f, reason: collision with root package name */
    public final double f306261f;

    /* renamed from: g, reason: collision with root package name */
    public final int f306262g;

    public a(int i17, java.lang.String str, int i18, java.lang.String str2, int i19, double d17, int i27) {
        this.f306256a = -1;
        this.f306257b = "";
        this.f306256a = i17;
        this.f306257b = str;
        this.f306258c = i18;
        this.f306259d = str2;
        this.f306260e = i19;
        this.f306261f = java.lang.Math.round(d17 * 10.0d) / 10.0d;
        this.f306262g = i27;
        mc.p.f325531a.b("CameraParams", "camera params: " + this);
    }

    public final java.lang.String toString() {
        return "CameraParams{code=" + this.f306256a + ", message='" + this.f306257b + "', requestId=" + this.f306258c + ", comment='" + this.f306259d + "', whiteBalance=" + this.f306260e + ", needChangeWhiteBalance=false, exposure=" + this.f306261f + ", needChangeExposure=false, zoom=" + this.f306262g + ", needChangeZoom=false}";
    }
}
