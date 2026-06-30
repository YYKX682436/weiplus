package ph1;

/* loaded from: classes7.dex */
public final class l implements android.content.DialogInterface {

    /* renamed from: d, reason: collision with root package name */
    public r.a f354337d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f354338e;

    /* renamed from: f, reason: collision with root package name */
    public fl1.a2 f354339f;

    /* renamed from: g, reason: collision with root package name */
    public fl1.b2 f354340g;

    /* renamed from: h, reason: collision with root package name */
    public android.content.DialogInterface.OnCancelListener f354341h;

    /* renamed from: i, reason: collision with root package name */
    public int f354342i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f354343m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f354344n = false;

    public void b(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, boolean z17) {
        if (!com.tencent.mm.sdk.platformtools.u3.e()) {
            com.tencent.mm.sdk.platformtools.u3.h(new ph1.j(this, appBrandRuntime));
            return;
        }
        if (z17) {
            this.f354340g = new ph1.a(appBrandRuntime.f74795d, appBrandRuntime.m0().g() ? -15132391 : -1);
            ((fl1.c0) appBrandRuntime.getDialogContainer()).c(this.f354340g);
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new ph1.k(this, appBrandRuntime), false);
        this.f354338e = b4Var;
        b4Var.c(500L, 500L);
    }

    @Override // android.content.DialogInterface
    public void cancel() {
        this.f354343m = true;
        fl1.a2 a2Var = this.f354339f;
        if (a2Var != null) {
            a2Var.cancel();
        } else {
            android.content.DialogInterface.OnCancelListener onCancelListener = this.f354341h;
            if (onCancelListener != null) {
                onCancelListener.onCancel(this);
            }
        }
        fl1.b2 b2Var = this.f354340g;
        if (b2Var != null) {
            ((ph1.a) b2Var).dismiss();
        }
    }

    @Override // android.content.DialogInterface
    public void dismiss() {
        this.f354344n = true;
        fl1.a2 a2Var = this.f354339f;
        if (a2Var != null) {
            ((fl1.g1) a2Var).dismiss();
        }
        fl1.b2 b2Var = this.f354340g;
        if (b2Var != null) {
            ((ph1.a) b2Var).dismiss();
        }
    }
}
