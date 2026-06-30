package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class sh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.xh f119777d;

    public sh(com.tencent.mm.plugin.finder.live.widget.xh xhVar) {
        this.f119777d = xhVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansModifyGiftWidget$updateViews$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f119777d.e();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansModifyGiftWidget$updateViews$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
