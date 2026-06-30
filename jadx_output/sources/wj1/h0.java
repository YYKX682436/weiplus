package wj1;

/* loaded from: classes14.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI f446591d;

    public h0(com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI appBrandIDCardUI) {
        this.f446591d = appBrandIDCardUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardVerifyPwdFrag appBrandIDCardVerifyPwdFrag = new com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardVerifyPwdFrag();
        com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI appBrandIDCardUI = this.f446591d;
        appBrandIDCardUI.f89531d = appBrandIDCardVerifyPwdFrag;
        ((com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardVerifyPwdFrag) appBrandIDCardUI.f89531d).f89551d = appBrandIDCardUI.B;
        androidx.fragment.app.i2 beginTransaction = appBrandIDCardUI.getSupportFragmentManager().beginTransaction();
        int i17 = com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI.C;
        beginTransaction.k(com.tencent.mm.R.id.f483136xj, appBrandIDCardUI.f89531d, null);
        beginTransaction.e();
    }
}
