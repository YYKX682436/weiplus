package dc1;

/* loaded from: classes8.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dc1.d f228682d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f228683e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f228684f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f228685g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f228686h;

    public b(dc1.d dVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, int i18, java.lang.String str) {
        this.f228682d = dVar;
        this.f228683e = lVar;
        this.f228684f = i17;
        this.f228685g = i18;
        this.f228686h = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f228682d.E(this.f228683e, this.f228684f, this.f228685g, this.f228686h);
    }
}
