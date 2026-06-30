package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class bs implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.et f117916d;

    public bs(com.tencent.mm.plugin.finder.live.widget.et etVar) {
        this.f117916d = etVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLivePrizePanel$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.et etVar = this.f117916d;
        etVar.getClass();
        com.tencent.mm.plugin.finder.live.widget.e0.t(etVar, false, 1, null);
        com.tencent.mm.plugin.finder.live.plugin.r30 r30Var = (com.tencent.mm.plugin.finder.live.plugin.r30) etVar.I.getPlugin(com.tencent.mm.plugin.finder.live.plugin.r30.class);
        if (r30Var != null) {
            r30Var.v1(null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLivePrizePanel$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
