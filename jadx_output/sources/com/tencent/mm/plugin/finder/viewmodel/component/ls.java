package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ls implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.os f135079d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f135080e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f135081f;

    public ls(com.tencent.mm.plugin.finder.viewmodel.component.os osVar, in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f135079d = osVar;
        this.f135080e = s0Var;
        this.f135081f = baseFinderFeed;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderOrientationUIC$HDRHorizontalLivePreviewLayout$setLandscapeLiveLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.viewmodel.component.os.a(this.f135079d, this.f135080e, this.f135081f, 1);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderOrientationUIC$HDRHorizontalLivePreviewLayout$setLandscapeLiveLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
