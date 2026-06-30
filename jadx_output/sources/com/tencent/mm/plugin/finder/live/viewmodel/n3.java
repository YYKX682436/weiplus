package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes.dex */
public final class n3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f117277d;

    public n3(yz5.a aVar) {
        this.f117277d = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveCashOutMultiAuthUIC$initSubtypeView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f117277d.invoke();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveCashOutMultiAuthUIC$initSubtypeView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
