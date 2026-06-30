package wc1;

/* loaded from: classes7.dex */
public final class h implements ph1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f444479a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f444480b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f444481c;

    public h(com.tencent.mm.plugin.appbrand.y yVar, int i17, java.lang.String str) {
        this.f444479a = yVar;
        this.f444480b = i17;
        this.f444481c = str;
    }

    @Override // ph1.c
    public final void a(com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress progress) {
        kotlin.jvm.internal.o.g(progress, "progress");
        wc1.p.y(this.f444479a, java.lang.String.valueOf(this.f444480b), "progressUpdate", this.f444481c, progress.f75394d, progress.f75395e, progress.f75396f, null);
    }
}
