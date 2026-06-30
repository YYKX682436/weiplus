package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class yk implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.bl f136583d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f136584e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f136585f;

    public yk(com.tencent.mm.plugin.finder.viewmodel.component.bl blVar, android.view.View view, android.widget.FrameLayout frameLayout) {
        this.f136583d = blVar;
        this.f136584e = view;
        this.f136585f = frameLayout;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        view.removeOnLayoutChangeListener(this);
        com.tencent.mm.plugin.finder.viewmodel.component.bl blVar = this.f136583d;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) blVar.findViewById(com.tencent.mm.R.id.nzl);
        if (weImageView != null) {
            weImageView.setIconColor(-1);
        }
        android.view.View findViewById = blVar.findViewById(com.tencent.mm.R.id.nzm);
        android.view.View view2 = this.f136584e;
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(0.5f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$showTeenModeAnimLayout$lambda$30$$inlined$doOnLayout$1", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            findViewById.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$showTeenModeAnimLayout$lambda$30$$inlined$doOnLayout$1", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            findViewById.animate().translationX(-(view2.getWidth() + blVar.getActivity().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479646bl))).alpha(0.8f).setDuration(250L).start();
        }
        android.view.View findViewById2 = blVar.findViewById(com.tencent.mm.R.id.nfb);
        float f17 = 0.0f;
        if (findViewById2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$showTeenModeAnimLayout$lambda$30$$inlined$doOnLayout$1", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            findViewById2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$showTeenModeAnimLayout$lambda$30$$inlined$doOnLayout$1", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        com.tencent.mm.plugin.finder.view.FinderEdgeTransparentView finderEdgeTransparentView = (com.tencent.mm.plugin.finder.view.FinderEdgeTransparentView) blVar.findViewById(com.tencent.mm.R.id.nuq);
        if (finderEdgeTransparentView != null) {
            finderEdgeTransparentView.setEnable(true);
            f17 = finderEdgeTransparentView.getWidth() - ((finderEdgeTransparentView.getX() - view2.getX()) - blVar.getActivity().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479723df));
        }
        view2.animate().alpha(1.0f).setDuration(250L).setUpdateListener(new com.tencent.mm.plugin.finder.viewmodel.component.vk(blVar, f17)).setListener(new com.tencent.mm.plugin.finder.viewmodel.component.xk(view2, blVar, this.f136585f)).start();
    }
}
