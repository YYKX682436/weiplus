package wj1;

/* loaded from: classes14.dex */
public class n0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardVerifyPwdFrag f446615d;

    public n0(com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardVerifyPwdFrag appBrandIDCardVerifyPwdFrag) {
        this.f446615d = appBrandIDCardVerifyPwdFrag;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardVerifyPwdFrag$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        wj1.m0 m0Var = this.f446615d.f89551d;
        if (m0Var != null) {
            int i17 = com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI.C;
            ((wj1.c0) m0Var).f446576a.U6();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardVerifyPwdFrag$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
