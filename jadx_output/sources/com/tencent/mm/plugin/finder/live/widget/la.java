package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes.dex */
public final class la implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.ra f118923d;

    public la(com.tencent.mm.plugin.finder.live.widget.ra raVar) {
        this.f118923d = raVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveCoLiveInviteePreparePanel$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveCoLiveInviteePreparePanel", "quit co-live btn clicked");
        com.tencent.mm.plugin.finder.live.widget.ra raVar = this.f118923d;
        raVar.getClass();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(raVar.f118183e, 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.finder.live.widget.pa(raVar);
        k0Var.f211881s = new com.tencent.mm.plugin.finder.live.widget.qa(raVar);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveCoLiveInviteePreparePanel$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
