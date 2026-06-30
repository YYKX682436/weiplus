package tf1;

/* loaded from: classes7.dex */
public class a extends com.tencent.mm.plugin.appbrand.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tf1.f f418854d;

    public a(tf1.f fVar) {
        this.f418854d = fVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void b() {
        super.b();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "onCreate");
        this.f418854d.f418861g = false;
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "onDestroy");
        tf1.f fVar = this.f418854d;
        fVar.b();
        com.tencent.mm.plugin.appbrand.x0.e(fVar.f418859e, this);
        fVar.f418863i.clear();
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void e(com.tencent.mm.plugin.appbrand.w0 w0Var) {
        super.e(w0Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "onPause, type: " + w0Var);
        this.f418854d.s(w0Var);
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void g() {
        super.g();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "onResume");
        tf1.f fVar = this.f418854d;
        fVar.f418861g = false;
        if (fVar.f418874w.getAndSet(false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "onRuntimeForeground, ignore");
            return;
        }
        tf.q g17 = fVar.g();
        if (g17 == null) {
            return;
        }
        if (fVar.l()) {
            fVar.A(g17);
        }
        fVar.f418864m = false;
        fVar.f418860f.a();
        fVar.f418865n = null;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "onRuntimeForeground, disableAppBrandBackgroundRun");
        fVar.b();
    }
}
