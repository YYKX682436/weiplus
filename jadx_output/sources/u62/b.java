package u62;

/* loaded from: classes12.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v25.b f424943d;

    public b(com.tencent.mm.plugin.ext.provider.ExtContentProviderBase extContentProviderBase, v25.b bVar) {
        this.f424943d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (gm0.j1.a()) {
                c01.d9.e().g(new c01.ra(new u62.a(this), null));
            }
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ExtContentProviderBase", "exception in NetSceneLocalProxy");
            this.f424943d.a();
        }
    }
}
