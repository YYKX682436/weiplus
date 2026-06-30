package wj1;

/* loaded from: classes14.dex */
public class w implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI f446640d;

    public w(com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI appBrandIDCardUI) {
        this.f446640d = appBrandIDCardUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem phoneItem;
        db1.p pVar;
        int i17 = com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI.C;
        com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI appBrandIDCardUI = this.f446640d;
        appBrandIDCardUI.V6(17);
        java.util.Iterator it = appBrandIDCardUI.f89549y.f227869z.iterator();
        while (true) {
            if (!it.hasNext()) {
                phoneItem = null;
                break;
            }
            phoneItem = (com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem) it.next();
            if (phoneItem.f87407o) {
                break;
            }
        }
        appBrandIDCardUI.A = phoneItem;
        fl1.c0 c0Var = appBrandIDCardUI.f89548x;
        if (c0Var != null && (pVar = appBrandIDCardUI.f89549y) != null) {
            c0Var.a(pVar);
        }
        ((wj1.c0) appBrandIDCardUI.B).b();
        return null;
    }
}
