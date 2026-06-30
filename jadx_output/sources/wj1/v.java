package wj1;

/* loaded from: classes14.dex */
public class v implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI f446638d;

    public v(com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI appBrandIDCardUI) {
        this.f446638d = appBrandIDCardUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI.C;
        com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI appBrandIDCardUI = this.f446638d;
        appBrandIDCardUI.V6(16);
        if (android.text.TextUtils.isEmpty(appBrandIDCardUI.f89533f)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandIDCardUI", "wecoin protocol url is null");
            return null;
        }
        com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI.T6(appBrandIDCardUI, appBrandIDCardUI.f89533f);
        return null;
    }
}
