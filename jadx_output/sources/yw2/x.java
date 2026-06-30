package yw2;

/* loaded from: classes2.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw2.a0 f466674d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f466675e;

    public x(yw2.a0 a0Var, yz5.a aVar) {
        this.f466674d = a0Var;
        this.f466675e = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder$showLastViewedAnchor$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yw2.a0 a0Var = this.f466674d;
        if (a0Var.E) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder$showLastViewedAnchor$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        this.f466675e.invoke();
        a0Var.E = true;
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder$showLastViewedAnchor$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
