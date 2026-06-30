package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class xk implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderSpeedIndicatorView f133338d;

    public xk(com.tencent.mm.plugin.finder.view.FinderSpeedIndicatorView finderSpeedIndicatorView) {
        this.f133338d = finderSpeedIndicatorView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderSpeedIndicatorView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.view.FinderSpeedIndicatorView finderSpeedIndicatorView = this.f133338d;
        yz5.l lVar = finderSpeedIndicatorView.f131478q;
        if (lVar != null) {
            lVar.invoke(java.lang.Float.valueOf(finderSpeedIndicatorView.f131477p));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderSpeedIndicatorView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
