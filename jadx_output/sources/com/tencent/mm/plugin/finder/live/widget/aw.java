package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class aw implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.bw f117799d;

    public aw(com.tencent.mm.plugin.finder.live.widget.bw bwVar) {
        this.f117799d = bwVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        gk2.e S0;
        yg2.b bVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveSuperFansDescPanel$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.bw bwVar = this.f117799d;
        bwVar.a();
        com.tencent.mm.plugin.finder.live.plugin.l lVar = bwVar.f117925i;
        if (lVar != null && (S0 = lVar.S0()) != null && (bVar = S0.f272475i) != null) {
            kotlinx.coroutines.l.d(bVar, null, null, new com.tencent.mm.plugin.finder.live.widget.zv(bwVar, null), 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveSuperFansDescPanel$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
