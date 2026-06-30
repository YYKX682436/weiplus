package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class o10 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.z10 f119239d;

    public o10(com.tencent.mm.plugin.finder.live.widget.z10 z10Var) {
        this.f119239d = z10Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTogetherWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zg2.b bVar = ((mm2.c1) this.f119239d.f120494c.P0(mm2.c1.class)).f328889t6;
        boolean z17 = !bVar.f472818d;
        bVar.f472818d = z17;
        bVar.postValue(java.lang.Boolean.valueOf(z17));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTogetherWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
