package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes.dex */
public final class hb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f116357d;

    public hb(yz5.a aVar) {
        this.f116357d = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLiveShoppingListSubPageHeader$setDismissAction$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f116357d.invoke();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveShoppingListSubPageHeader$setDismissAction$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
