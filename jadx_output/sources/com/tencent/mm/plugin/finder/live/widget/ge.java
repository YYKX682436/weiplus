package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ge implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.se f118427d;

    public ge(com.tencent.mm.plugin.finder.live.widget.se seVar) {
        this.f118427d = seVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveExceptionWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.se seVar = this.f118427d;
        seVar.getClass();
        pm0.v.X(new com.tencent.mm.plugin.finder.live.widget.ke(seVar));
        yz5.l lVar = seVar.f119757e;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.TRUE);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveExceptionWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
