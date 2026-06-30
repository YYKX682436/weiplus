package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes.dex */
public final class vn implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f120076d;

    public vn(yz5.l lVar) {
        this.f120076d = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget$showVerificationLayerInfo$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f120076d.invoke(java.lang.Boolean.TRUE);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget$showVerificationLayerInfo$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
