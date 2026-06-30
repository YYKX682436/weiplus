package wj1;

/* loaded from: classes14.dex */
public class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.o56 f446580d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardShowFrag f446581e;

    public e(com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardShowFrag appBrandIDCardShowFrag, r45.o56 o56Var) {
        this.f446581e = appBrandIDCardShowFrag;
        this.f446580d = o56Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardShowFrag$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        wj1.m0 m0Var = this.f446581e.f89516d;
        if (m0Var != null) {
            java.lang.String str = ((r45.ic) this.f446580d.f381960r.get(0)).f376922e;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandIDCardUI", "urlJump click");
            com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI.T6(((wj1.c0) m0Var).f446576a, str);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardShowFrag$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
