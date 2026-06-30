package gf0;

/* loaded from: classes15.dex */
public final class f extends com.tencent.mm.plugin.appbrand.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gf0.i f271201d;

    public f(gf0.i iVar) {
        this.f271201d = iVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TingAudioRecorder", "AppBrandLifeCycle onDestroy");
        gf0.i iVar = this.f271201d;
        com.tencent.mm.plugin.appbrand.x0.e(iVar.f271209f, iVar.f271211h);
        iVar.f271211h = null;
        kf1.h hVar = iVar.f271210g;
        if (hVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DefaultLuggageRecorder", "onDestroy");
            ((kf1.d) hVar).release();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void e(com.tencent.mm.plugin.appbrand.w0 type) {
        kotlin.jvm.internal.o.g(type, "type");
        com.tencent.mars.xlog.Log.i("MicroMsg.TingAudioRecorder", "AppBrandLifeCycle onPause");
        if (this.f271201d.f271210g != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DefaultLuggageRecorder", "onBackground");
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void g() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TingAudioRecorder", "AppBrandLifeCycle onResume");
        if (this.f271201d.f271210g != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DefaultLuggageRecorder", "onForeground");
        }
    }
}
