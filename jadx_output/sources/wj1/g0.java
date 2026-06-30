package wj1;

/* loaded from: classes14.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI f446588d;

    public g0(com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI appBrandIDCardUI) {
        this.f446588d = appBrandIDCardUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardShowFrag appBrandIDCardShowFrag = new com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardShowFrag();
        com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI appBrandIDCardUI = this.f446588d;
        appBrandIDCardUI.f89531d = appBrandIDCardShowFrag;
        ((com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardShowFrag) appBrandIDCardUI.f89531d).f89516d = appBrandIDCardUI.B;
        androidx.fragment.app.i2 beginTransaction = appBrandIDCardUI.getSupportFragmentManager().beginTransaction();
        int i17 = com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI.C;
        beginTransaction.k(com.tencent.mm.R.id.f483136xj, appBrandIDCardUI.f89531d, null);
        beginTransaction.e();
    }
}
