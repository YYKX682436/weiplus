package ys2;

/* loaded from: classes3.dex */
public final class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ys2.x f465194d;

    public v(ys2.x xVar) {
        this.f465194d = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/replay/controller/WonderfulFragmentController$onViewMount$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f465194d.Z6();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/replay/controller/WonderfulFragmentController$onViewMount$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
