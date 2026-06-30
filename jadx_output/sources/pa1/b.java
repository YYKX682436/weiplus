package pa1;

/* loaded from: classes7.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pa1.e f352952d;

    public b(pa1.e eVar) {
        this.f352952d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        na1.a aVar = new na1.a();
        pa1.e eVar = this.f352952d;
        com.tencent.mm.plugin.appbrand.e9 C0 = ((com.tencent.mm.plugin.appbrand.AppBrandRuntime) eVar.f352957b.get()).C0();
        java.lang.String str = eVar.f352956a.f388139e;
        com.tencent.mars.xlog.Log.i("MicroMsg.OnCanvasReportEventSampleConfigReceivedEvent", "hy: sending config; %s", str);
        aVar.u(C0);
        java.util.HashMap hashMap = new java.util.HashMap(1);
        hashMap.put("keyEventSampleConfig", str);
        aVar.t(hashMap);
        aVar.m();
    }
}
