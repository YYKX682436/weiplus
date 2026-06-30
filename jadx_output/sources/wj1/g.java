package wj1;

/* loaded from: classes14.dex */
public class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.o56 f446586d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardShowFrag f446587e;

    public g(com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardShowFrag appBrandIDCardShowFrag, r45.o56 o56Var) {
        this.f446587e = appBrandIDCardShowFrag;
        this.f446586d = o56Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardShowFrag$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        wj1.m0 m0Var = this.f446587e.f89516d;
        if (m0Var != null) {
            java.lang.String str = ((r45.ic) this.f446586d.f381960r.get(1)).f376922e;
            wj1.c0 c0Var = (wj1.c0) m0Var;
            c0Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandIDCardUI", "url2Jump click");
            com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI.T6(c0Var.f446576a, str);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardShowFrag$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
