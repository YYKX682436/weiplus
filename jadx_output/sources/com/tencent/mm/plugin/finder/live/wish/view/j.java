package com.tencent.mm.plugin.finder.live.wish.view;

/* loaded from: classes3.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.wish.view.x f120635d;

    public j(com.tencent.mm.plugin.finder.live.wish.view.x xVar) {
        this.f120635d = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/wish/view/GiftWallViewHelper$initInnerHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.wish.view.x xVar = this.f120635d;
        com.tencent.mm.plugin.finder.live.wish.view.x.e(xVar, new com.tencent.mm.plugin.finder.live.wish.view.i(xVar, view));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/wish/view/GiftWallViewHelper$initInnerHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
