package mi1;

/* loaded from: classes7.dex */
public class q2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f326667d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mi1.n2 f326668e;

    public q2(mi1.n2 n2Var, int i17) {
        this.f326668e = n2Var;
        this.f326667d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context r07;
        mi1.n2 n2Var = this.f326668e;
        try {
            com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = ((mi1.g) n2Var.f326642o).f326555e;
            try {
                r07 = appBrandRuntime.x0().getCurrentPage().getCurrentPageView().r1().getContext();
            } catch (java.lang.NullPointerException unused) {
                r07 = appBrandRuntime.r0();
            }
            n2Var.b(r07.getResources().getString(this.f326667d));
        } catch (android.content.res.Resources.NotFoundException unused2) {
            n2Var.b(null);
        }
    }
}
