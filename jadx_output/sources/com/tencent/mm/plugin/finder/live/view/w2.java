package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class w2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulSuitView f116763d;

    public w2(com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulSuitView finderLiveCameraOptBeautyPowerfulSuitView) {
        this.f116763d = finderLiveCameraOptBeautyPowerfulSuitView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulSuitView.e(this.f116763d);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
