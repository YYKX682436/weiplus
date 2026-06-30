package wj1;

/* loaded from: classes14.dex */
public class a0 implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI f446572d;

    public a0(com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI appBrandIDCardUI) {
        this.f446572d = appBrandIDCardUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI appBrandIDCardUI = this.f446572d;
        android.content.Intent intent = new android.content.Intent(appBrandIDCardUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.phonenumber.PhoneNumberAddUI.class);
        intent.putExtra("APPID", appBrandIDCardUI.f89532e);
        appBrandIDCardUI.startActivityForResult(intent, 10000);
        return null;
    }
}
