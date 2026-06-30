package wj1;

/* loaded from: classes14.dex */
public class q0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardVerifyPwdFrag f446630d;

    public q0(com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardVerifyPwdFrag appBrandIDCardVerifyPwdFrag) {
        this.f446630d = appBrandIDCardVerifyPwdFrag;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardVerifyPwdFrag$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardVerifyPwdFrag appBrandIDCardVerifyPwdFrag = this.f446630d;
        wj1.m0 m0Var = appBrandIDCardVerifyPwdFrag.f89551d;
        if (m0Var != null) {
            wj1.c0 c0Var = (wj1.c0) m0Var;
            c0Var.getClass();
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI appBrandIDCardUI = c0Var.f446576a;
            g0Var.d(14943, appBrandIDCardUI.f89532e, 6, appBrandIDCardUI.f89539o.f381961s);
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) appBrandIDCardVerifyPwdFrag.getContext(), 1, false);
        k0Var.f211872n = new wj1.o0(this);
        k0Var.f211881s = new wj1.p0(this);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardVerifyPwdFrag$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
