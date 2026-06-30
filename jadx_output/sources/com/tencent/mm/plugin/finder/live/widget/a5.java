package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class a5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.io f117726d;

    public a5(com.tencent.mm.plugin.finder.live.widget.io ioVar) {
        this.f117726d = ioVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorDefinitionWidget$show$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f117726d.q();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorDefinitionWidget$show$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
