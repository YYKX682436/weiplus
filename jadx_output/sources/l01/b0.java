package l01;

/* loaded from: classes7.dex */
public class b0 implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l01.c0 f314745d;

    public b0(l01.c0 c0Var) {
        this.f314745d = c0Var;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "AppBrandSimpleImageLoaderDownloadThread";
    }

    @Override // java.lang.Runnable
    public void run() {
        l01.c0 c0Var = this.f314745d;
        l01.c0.d(c0Var.f314750d, c0Var.f314751e, c0Var.f314755i);
        l01.p pVar = c0Var.f314753g.f314742d;
        pVar.f314784a.post(new l01.a0(this));
    }
}
