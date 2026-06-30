package il0;

/* loaded from: classes13.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ il0.c f292007d;

    public b(il0.c cVar) {
        this.f292007d = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        synchronized (this.f292007d.f292008d) {
            il0.e eVar = il0.e.f292009f;
            synchronized (eVar) {
                z17 = eVar.f292013d;
            }
            if (z17) {
                com.tencent.mars.xlog.Log.i("Kara.DiscoveryReddotEnv", "clear res");
                eVar.b();
            }
        }
    }
}
