package tc3;

/* loaded from: classes7.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tc3.c f417151d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f417152e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f417153f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f417154g;

    public a(tc3.c cVar, int i17, java.lang.String str, java.lang.String str2) {
        this.f417151d = cVar;
        this.f417152e = i17;
        this.f417153f = str;
        this.f417154g = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        super/*com.tencent.mm.appbrand.commonjni.AppBrandJsBridgeBinding*/.invokeCallbackHandler(this.f417152e, this.f417153f, this.f417154g);
    }
}
