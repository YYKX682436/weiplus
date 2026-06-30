package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class tt implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.ut f119908d;

    public tt(com.tencent.mm.plugin.finder.live.widget.ut utVar) {
        this.f119908d = utVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveRecommendVideoWidget$show$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.oo0 oo0Var = this.f119908d.f120000b;
        im2.h6 h6Var = oo0Var instanceof im2.h6 ? (im2.h6) oo0Var : null;
        if (h6Var != null) {
            h6Var.o();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveRecommendVideoWidget$show$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
