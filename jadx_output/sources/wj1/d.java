package wj1;

/* loaded from: classes14.dex */
public class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.o56 f446577d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardShowFrag f446578e;

    public d(com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardShowFrag appBrandIDCardShowFrag, r45.o56 o56Var) {
        this.f446578e = appBrandIDCardShowFrag;
        this.f446577d = o56Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardShowFrag$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        wj1.m0 m0Var = this.f446578e.f89516d;
        if (m0Var != null) {
            java.lang.String str = this.f446577d.f381959q.f376922e;
            wj1.c0 c0Var = (wj1.c0) m0Var;
            c0Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandIDCardUI", "protocalUrl click");
            com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI.T6(c0Var.f446576a, str);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardShowFrag$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
