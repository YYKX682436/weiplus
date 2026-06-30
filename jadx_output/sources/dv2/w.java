package dv2;

/* loaded from: classes.dex */
public final class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dv2.x f243966d;

    public w(dv2.x xVar) {
        this.f243966d = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/uic/FinderMixCellSearchUIC$onCreate$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        androidx.appcompat.app.AppCompatActivity activity = this.f243966d.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((dv2.b0) pf5.z.f353948a.a(activity).a(dv2.b0.class)).getActiveFragment().w0();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/uic/FinderMixCellSearchUIC$onCreate$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
