package tc3;

/* loaded from: classes7.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tc3.c f417156d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f417157e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f417158f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f417159g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f417160h;

    public b(tc3.c cVar, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3) {
        this.f417156d = cVar;
        this.f417157e = str;
        this.f417158f = str2;
        this.f417159g = i17;
        this.f417160h = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        super/*com.tencent.mm.appbrand.commonjni.AppBrandJsBridgeBinding*/.subscribeHandler(this.f417157e, this.f417158f, this.f417159g, this.f417160h);
    }
}
