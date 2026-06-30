package m81;

/* loaded from: classes7.dex */
public abstract class b extends com.tencent.mm.pluginsdk.res.downloader.model.u {

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f324688l;

    /* renamed from: m, reason: collision with root package name */
    public final int f324689m;

    /* renamed from: n, reason: collision with root package name */
    public final int f324690n;

    /* renamed from: o, reason: collision with root package name */
    public volatile r45.y50 f324691o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f324692p;

    public b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, int i18) {
        super(str, str2, java.lang.String.valueOf(i17), "AppBrandWxaPkgDownloader", str3, "GET", 1, 2, 0);
        this.f324692p = new java.util.LinkedList();
        this.f324688l = str4;
        this.f324689m = i17;
        this.f324690n = i18;
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        this.f189719h = (int) timeUnit.toMillis(15L);
        this.f189720i = (int) timeUnit.toMillis(30L);
    }

    public java.util.List d() {
        return java.util.Collections.singletonList(this.f189714c);
    }

    public final boolean e() {
        if (!this.f324692p.isEmpty()) {
            return true;
        }
        r45.y50 y50Var = this.f324691o;
        return y50Var != null && y50Var.f390799f == 1;
    }
}
