package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class kc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.mc f116446d;

    public kc(com.tencent.mm.plugin.finder.live.view.mc mcVar) {
        this.f116446d = mcVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/LiveProductGiftCardWidget$refresh$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f116446d.b("rootClick");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/LiveProductGiftCardWidget$refresh$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
