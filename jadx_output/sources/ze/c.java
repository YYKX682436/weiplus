package ze;

/* loaded from: classes7.dex */
public final class c implements xi1.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ze.g f471719a;

    public c(ze.g gVar) {
        this.f471719a = gVar;
    }

    @Override // xi1.n
    public final void e(xi1.o oVar, boolean z17) {
        com.tencent.mars.xlog.Log.i("Luggage.AppBrandWindowLayoutManager", "request orientation result: [%b]", java.lang.Boolean.valueOf(z17));
        ze.g gVar = this.f471719a;
        if (gVar.getInitConfig() != null) {
            gVar.tuningRtContentView("requestDeviceOrientation done", true);
        }
    }
}
