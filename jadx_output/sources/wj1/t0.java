package wj1;

/* loaded from: classes14.dex */
public class t0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardVerifyPwdFrag f446635d;

    public t0(com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardVerifyPwdFrag appBrandIDCardVerifyPwdFrag) {
        this.f446635d = appBrandIDCardVerifyPwdFrag;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardVerifyPwdFrag$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardVerifyPwdFrag appBrandIDCardVerifyPwdFrag = this.f446635d;
        db5.e1.C(appBrandIDCardVerifyPwdFrag.getContext(), appBrandIDCardVerifyPwdFrag.getString(com.tencent.mm.R.string.f490170mv) + appBrandIDCardVerifyPwdFrag.f89553f.f377693e, appBrandIDCardVerifyPwdFrag.getString(com.tencent.mm.R.string.f490167ms), appBrandIDCardVerifyPwdFrag.getString(com.tencent.mm.R.string.f490507x1), appBrandIDCardVerifyPwdFrag.getString(com.tencent.mm.R.string.f490347sg), false, new wj1.r0(this), new wj1.s0(this));
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardVerifyPwdFrag$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
