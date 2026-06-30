package com.tencent.mm.plugin.finder.live.wish.widget;

/* loaded from: classes3.dex */
public final class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.wish.widget.x f120793d;

    public v(com.tencent.mm.plugin.finder.live.wish.widget.x xVar) {
        this.f120793d = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        dk2.z7 z7Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/wish/widget/WishAudiencePanelWidget$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.wish.widget.x xVar = this.f120793d;
        ln2.e eVar = (ln2.e) xVar.y().getValue();
        if (eVar != null && (z7Var = eVar.f319886c) != null && z7Var.f234425b) {
            kn2.c cVar = xVar.f120798n;
            int i17 = (int) z7Var.f234424a.getLong(0);
            com.tencent.mm.plugin.finder.live.plugin.wn0 wn0Var = (com.tencent.mm.plugin.finder.live.plugin.wn0) cVar;
            wn0Var.getClass();
            com.tencent.mars.xlog.Log.i("FinderLiveWishPanelPlug", "remindInteractionWishAction: " + i17 + ", delay: 300ms");
            wn0Var.f365323d.postDelayed(new com.tencent.mm.plugin.finder.live.plugin.pn0(i17, wn0Var), 300L);
        }
        xVar.a();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/wish/widget/WishAudiencePanelWidget$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
