package l01;

/* loaded from: classes7.dex */
public class e implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l01.f f314762d;

    public e(l01.f fVar) {
        this.f314762d = fVar;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "AppBrandSimpleImageLoaderDownloadThread";
    }

    @Override // java.lang.Runnable
    public void run() {
        l01.f fVar = this.f314762d;
        l01.c0.d(fVar.f314765f, fVar.f314768i, fVar.f314764e.f314744f);
        r.a aVar = fVar.f314766g;
        if (aVar != null) {
            try {
                aVar.apply(((l01.k) fVar.f314764e.f314744f).b(fVar.f314765f.f314773b));
            } catch (java.lang.Throwable unused) {
            }
        }
        fVar.c();
    }
}
