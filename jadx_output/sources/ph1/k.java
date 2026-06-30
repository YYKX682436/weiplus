package ph1;

/* loaded from: classes7.dex */
public class k implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f354335d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ph1.l f354336e;

    public k(ph1.l lVar, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        this.f354336e = lVar;
        this.f354335d = appBrandRuntime;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        ph1.l lVar = this.f354336e;
        if (!lVar.f354343m && !lVar.f354344n) {
            com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f354335d;
            android.content.Context r07 = appBrandRuntime.r0();
            if (r07 == null) {
                r07 = appBrandRuntime.f74795d;
            }
            r.a aVar = lVar.f354337d;
            fl1.a2 a2Var = aVar == null ? null : (fl1.a2) aVar.apply(r07);
            if (a2Var == null) {
                a2Var = new fl1.g1(r07);
            }
            fl1.g1 g1Var = (fl1.g1) a2Var;
            g1Var.setOnCancelListener(lVar.f354341h);
            g1Var.setCancelable(true);
            g1Var.setCanceledOnTouchOutside(false);
            ((fl1.c0) appBrandRuntime.getDialogContainer()).c(g1Var);
            lVar.f354339f = g1Var;
            int i17 = lVar.f354342i;
            if (i17 > 0 && (g1Var instanceof fl1.g1)) {
                g1Var.setProgress(i17);
            }
        }
        return false;
    }
}
