package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class pk implements android.view.View.OnScrollChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.bl f135554a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderEdgeTransparentView f135555b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.HorizontalScrollView f135556c;

    public pk(com.tencent.mm.plugin.finder.viewmodel.component.bl blVar, com.tencent.mm.plugin.finder.view.FinderEdgeTransparentView finderEdgeTransparentView, android.widget.HorizontalScrollView horizontalScrollView) {
        this.f135554a = blVar;
        this.f135555b = finderEdgeTransparentView;
        this.f135556c = horizontalScrollView;
    }

    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(android.view.View view, int i17, int i18, int i19, int i27) {
        zj0.b bVar = new zj0.b();
        bVar.c(view);
        bVar.b(i17);
        bVar.b(i18);
        bVar.b(i19);
        bVar.b(i27);
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$setTabLayoutScroll$1$2$1", "android/view/View$OnScrollChangeListener", "onScrollChange", "(Landroid/view/View;IIII)V", this, bVar.a());
        com.tencent.mm.plugin.finder.viewmodel.component.bl.o7(this.f135554a, this.f135555b, this.f135556c, 0, 0, 12, null);
        androidx.appcompat.app.AppCompatActivity activity = this.f135554a.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment fragment = ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class)).getActiveFragment();
        kotlin.jvm.internal.o.g(fragment, "fragment");
        com.tencent.mm.plugin.finder.convert.qg qgVar = ((com.tencent.mm.plugin.finder.viewmodel.component.d1) pf5.z.f353948a.b(fragment).a(com.tencent.mm.plugin.finder.viewmodel.component.d1.class)).f134062i;
        if (qgVar != null) {
            int abs = java.lang.Math.abs(i17 - i19);
            com.tencent.mm.plugin.finder.view.FinderHomeTabRedDotTipsBubbleView finderHomeTabRedDotTipsBubbleView = qgVar.f104390r;
            if (finderHomeTabRedDotTipsBubbleView != null && finderHomeTabRedDotTipsBubbleView.getVisibility() == 0 && abs >= ((java.lang.Number) ((jz5.n) qgVar.f104394v).getValue()).intValue()) {
                java.lang.Runnable runnable = qgVar.f104386n;
                if (runnable != null) {
                    qgVar.f104387o.removeCallbacks(runnable);
                }
                com.tencent.mars.xlog.Log.i("Finder.FeedFullMergedHeaderConvert", "onTabScroll tipsLayoutDismiss");
                finderHomeTabRedDotTipsBubbleView.a(false);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$setTabLayoutScroll$1$2$1", "android/view/View$OnScrollChangeListener", "onScrollChange", "(Landroid/view/View;IIII)V");
    }
}
