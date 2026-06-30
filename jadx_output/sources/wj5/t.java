package wj5;

/* loaded from: classes9.dex */
public final class t implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wj5.u f446840d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xj5.h f446841e;

    public t(wj5.u uVar, xj5.h hVar) {
        this.f446840d = uVar;
        this.f446841e = hVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.Integer valueOf = menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(27193, 1, 3);
            h45.s sVar = (h45.s) i95.n0.c(h45.s.class);
            java.lang.String x17 = this.f446840d.f446842e.x();
            xj5.h hVar = this.f446841e;
            ((li3.g) sVar).Ni(x17, hVar.f454905u);
            hVar.f454897e = 3;
        }
    }
}
