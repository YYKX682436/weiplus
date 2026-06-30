package wj1;

/* loaded from: classes14.dex */
public class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardShowFrag f446575d;

    public c(com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardShowFrag appBrandIDCardShowFrag) {
        this.f446575d = appBrandIDCardShowFrag;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardShowFrag$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandIDCardShowFrag", "verifyPayPassword click");
        wj1.m0 m0Var = this.f446575d.f89516d;
        if (m0Var != null) {
            ((wj1.c0) m0Var).b();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardShowFrag$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
