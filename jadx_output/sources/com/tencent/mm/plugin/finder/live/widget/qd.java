package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class qd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.rd f119520d;

    public qd(com.tencent.mm.plugin.finder.live.widget.rd rdVar) {
        this.f119520d = rdVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveDesignedGiftTipsDialog$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_DESIGNED_GIFT_TIPS_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        com.tencent.mm.plugin.finder.live.widget.rd rdVar = this.f119520d;
        rdVar.a();
        rdVar.f119631h.invoke();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveDesignedGiftTipsDialog$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
