package wj1;

/* loaded from: classes14.dex */
public class j0 implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI f446600d;

    public j0(com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI appBrandIDCardUI) {
        this.f446600d = appBrandIDCardUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI appBrandIDCardUI = this.f446600d;
        r45.lc lcVar = appBrandIDCardUI.f89539o.f381965w.f373264m;
        if (lcVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandIDCardUI", "authorize_wording is null");
            return null;
        }
        java.lang.String str = lcVar.f379297f;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str2 = str == null ? "" : str;
        java.lang.String str3 = lcVar.f379296e;
        java.lang.String str4 = str3 == null ? "" : str3;
        int measuredHeight = appBrandIDCardUI.f89549y.f227850d.getMeasuredHeight();
        fl1.c0 c0Var = appBrandIDCardUI.f89548x;
        if (c0Var == null) {
            return null;
        }
        c0Var.c(new db1.u(c0Var, str2, str4, appBrandIDCardUI.getContext(), measuredHeight, measuredHeight, new wj1.d0(appBrandIDCardUI)));
        return null;
    }
}
