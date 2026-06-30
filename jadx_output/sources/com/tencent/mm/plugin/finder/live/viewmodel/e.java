package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.g f117052d;

    public e(com.tencent.mm.plugin.finder.live.viewmodel.g gVar) {
        this.f117052d = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveAccountUIC$show$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.viewmodel.g.O6(this.f117052d, true);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveAccountUIC$show$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
