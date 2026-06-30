package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ux implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.io f120011d;

    public ux(com.tencent.mm.plugin.finder.live.widget.io ioVar) {
        this.f120011d = ioVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVideoDefinitionWidget$showCustomerVideoLevel$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f120011d.q();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVideoDefinitionWidget$showCustomerVideoLevel$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
