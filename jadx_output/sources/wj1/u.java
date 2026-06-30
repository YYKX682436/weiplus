package wj1;

/* loaded from: classes14.dex */
public class u implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI f446636d;

    public u(com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI appBrandIDCardUI) {
        this.f446636d = appBrandIDCardUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI appBrandIDCardUI = this.f446636d;
        android.content.Intent intent = new android.content.Intent(appBrandIDCardUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.phonenumber.PhoneNumberManagerUI.class);
        intent.putExtra("APPID", appBrandIDCardUI.f89532e);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        intent.putExtra("PAGEPATH", "");
        appBrandIDCardUI.startActivityForResult(intent, 10001);
        return null;
    }
}
