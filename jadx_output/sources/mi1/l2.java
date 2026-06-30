package mi1;

/* loaded from: classes7.dex */
public final class l2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View.OnClickListener f326614d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.AppBrandRuntime f326615e;

    public l2(android.view.View.OnClickListener onClickListener, com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        this.f326614d = onClickListener;
        this.f326615e = runtime;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/page/capsulebar/OptionBtnClickListenerHooker", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        mi1.z0 z0Var = mi1.z0.f326739e;
        mi1.q1 q1Var = this.f326615e.f74821z.f326707f;
        mi1.h2 h2Var = q1Var.f326665f;
        if (h2Var.f326567a > 0) {
            mi1.r1 e17 = q1Var.e(h2Var);
            kotlin.jvm.internal.o.d(e17);
            i17 = e17.f326676e | 0;
        } else {
            i17 = 0;
        }
        if (this.f326615e.f74821z.b().j() != Integer.MIN_VALUE) {
            i17 |= mi1.a1.e(this.f326615e.f74821z.b().j()).f326747d;
        }
        if ((this.f326615e.f74821z.d().f91034e != null) && this.f326615e.f74821z.b().d() != Integer.MIN_VALUE) {
            int d17 = this.f326615e.f74821z.b().d();
            i17 |= (d17 == 1 ? mi1.z0.f326744m : d17 == 0 ? mi1.z0.f326745n : mi1.z0.f326739e).f326747d;
        }
        this.f326615e.D1(i17);
        android.view.View.OnClickListener onClickListener = this.f326614d;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/page/capsulebar/OptionBtnClickListenerHooker", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
