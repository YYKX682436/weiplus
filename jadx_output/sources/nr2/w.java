package nr2;

/* loaded from: classes.dex */
public final class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nr2.j0 f339325d;

    public w(nr2.j0 j0Var) {
        this.f339325d = j0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionHeaderUIC$initViews$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.app.Activity context = this.f339325d.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        nr2.u0 u0Var = (nr2.u0) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(nr2.u0.class);
        if (u0Var != null) {
            kotlin.jvm.internal.o.d(view);
            u0Var.O6(view, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/paidcollection/FinderPaidCollectionHeaderUIC$initViews$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
