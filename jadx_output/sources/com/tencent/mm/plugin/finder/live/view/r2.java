package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes5.dex */
public final class r2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsView f116625d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f116626e;

    public r2(com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsView finderLiveCameraOptBeautyPowerfulDetailsView, int i17) {
        this.f116625d = finderLiveCameraOptBeautyPowerfulDetailsView;
        this.f116626e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsView$BeautyAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsView finderLiveCameraOptBeautyPowerfulDetailsView = this.f116625d;
        finderLiveCameraOptBeautyPowerfulDetailsView.setSelectedEffect((qs5.c) kz5.n0.a0(finderLiveCameraOptBeautyPowerfulDetailsView.getEffectItems(), this.f116626e));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsView$BeautyAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
