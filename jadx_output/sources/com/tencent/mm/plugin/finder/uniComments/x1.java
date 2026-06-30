package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes8.dex */
public final class x1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.a2 f130449d;

    public x1(com.tencent.mm.plugin.finder.uniComments.a2 a2Var) {
        this.f130449d = a2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder$onBuildDrawerHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l lVar = this.f130449d.f130183w;
        kotlin.jvm.internal.o.d(view);
        ((com.tencent.mm.plugin.finder.uniComments.y1) lVar).invoke(view);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder$onBuildDrawerHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
