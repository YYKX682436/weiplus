package ne1;

/* loaded from: classes7.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ne1.d f336512d;

    public a(ne1.d dVar) {
        this.f336512d = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC;
        ne1.d dVar = this.f336512d;
        com.tencent.mm.plugin.appbrand.o6 t37 = dVar.f336516e.f336517a.t3();
        wg1.b bVar = wg1.b.f445713f;
        if (t37 == null || (appBrandInitConfigWC = dVar.f336515d) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.RuntimeRestartHelper", "restart skip with Null runtime");
        } else {
            t37.m(new com.tencent.mm.plugin.appbrand.ze(t37, bVar, appBrandInitConfigWC));
        }
    }
}
