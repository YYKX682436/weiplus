package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.k0 f116219d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.yv f116220e;

    public c0(com.tencent.mm.plugin.finder.live.view.k0 k0Var, com.tencent.mm.plugin.finder.live.widget.yv yvVar) {
        this.f116219d = k0Var;
        this.f116220e = yvVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderBaseLivePluginLayout$showStatistics$1$callback$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((mm2.k2) this.f116219d.business(mm2.k2.class)).getClass();
        mm2.k2.f329192h = false;
        com.tencent.mm.plugin.finder.live.widget.yv yvVar = this.f116220e;
        yvVar.f120474a.setVisibility(8);
        yvVar.f120475b.setVisibility(8);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderBaseLivePluginLayout$showStatistics$1$callback$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
