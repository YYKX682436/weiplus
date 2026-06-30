package zi1;

/* loaded from: classes7.dex */
public final class b implements com.tencent.mm.plugin.appbrand.platform.window.activity.j {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f473094b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final xi1.g f473095a;

    public b(xi1.g window) {
        kotlin.jvm.internal.o.g(window, "window");
        this.f473095a = window;
    }

    @Override // xi1.p
    public xi1.o a() {
        android.util.DisplayMetrics vDisplayMetrics = this.f473095a.getVDisplayMetrics();
        if (vDisplayMetrics.heightPixels >= vDisplayMetrics.widthPixels) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CenterInsideWindowOrientationHandler", "getCurrentOrientation: portrait");
            return xi1.o.PORTRAIT;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CenterInsideWindowOrientationHandler", "getCurrentOrientation: landscape");
        return xi1.o.LANDSCAPE_SENSOR;
    }

    @Override // xi1.p
    public void b(xi1.o oVar, xi1.n nVar) {
        if (oVar == null) {
            if (nVar != null) {
                nVar.e(null, false);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CenterInsideWindowOrientationHandler", "requestDeviceOrientation: " + oVar.f454712d + ',' + oVar.name());
        zi1.a aVar = new zi1.a(oVar, this, nVar);
        if (com.tencent.mm.plugin.appbrand.utils.d5.a()) {
            aVar.run();
        } else {
            ((ku5.t0) ku5.t0.f312615d).B(aVar);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.platform.window.activity.j
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
    }

    @Override // com.tencent.mm.plugin.appbrand.platform.window.activity.j
    public void onPause() {
    }

    @Override // com.tencent.mm.plugin.appbrand.platform.window.activity.j
    public void onResume() {
    }

    @Override // com.tencent.mm.plugin.appbrand.platform.window.activity.j
    public void release() {
    }
}
