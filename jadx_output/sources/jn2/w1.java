package jn2;

/* loaded from: classes8.dex */
public final class w1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn2.s1 f300742d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jn2.z1 f300743e;

    public w1(jn2.s1 s1Var, jn2.z1 z1Var) {
        this.f300742d = s1Var;
        this.f300743e = z1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanelAdapter$onBindSingSongHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int adapterPosition = this.f300742d.getAdapterPosition();
        boolean z17 = false;
        jn2.z1 z1Var = this.f300743e;
        if (adapterPosition >= 0 && adapterPosition < z1Var.f300769h.size()) {
            z17 = true;
        }
        if (z17) {
            java.lang.Object obj = z1Var.f300769h.get(adapterPosition);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            z1Var.getClass();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanelAdapter$onBindSingSongHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
