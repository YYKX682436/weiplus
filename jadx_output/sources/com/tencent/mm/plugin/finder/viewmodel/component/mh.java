package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class mh implements com.tencent.mm.plugin.finder.view.ka {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.qh f135173d;

    public mh(com.tencent.mm.plugin.finder.viewmodel.component.qh qhVar) {
        this.f135173d = qhVar;
    }

    @Override // com.tencent.mm.plugin.finder.view.ka
    public void G3(int i17, int i18, int i19, int i27) {
    }

    @Override // com.tencent.mm.plugin.finder.view.ka
    public void l(int i17, int i18, int i19, int i27) {
        com.tencent.mm.plugin.finder.viewmodel.component.qh qhVar = this.f135173d;
        android.view.View O6 = qhVar.O6();
        if (O6 != null && O6.getVisibility() == 0 && qhVar.f135712g) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(O6, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFriendsLeftSlideGuideUIC$onCreate$1", "onFragmentChange", "(IIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            O6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(O6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFriendsLeftSlideGuideUIC$onCreate$1", "onFragmentChange", "(IIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            qhVar.P6();
            int i28 = qhVar.f135711f;
            if (i27 == i28 && qhVar.f135714i) {
                ey2.o0 N6 = ((ey2.t0) pf5.u.f353936a.e(c61.l7.class).a(ey2.t0.class)).N6(i28);
                N6.a(ey2.q0.f257474g);
                N6.f257448h = java.lang.System.currentTimeMillis();
                qhVar.f135714i = false;
                zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
                nk6.q0("finder_tl_hot_tab", "onLeftSlide");
                nk6.N("finder_tl_hot_tab");
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.view.ka
    public void onPageScrolled(int i17, float f17, int i18) {
    }

    @Override // com.tencent.mm.plugin.finder.view.ka
    public void z(boolean z17, int i17, com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment fragment) {
        kotlin.jvm.internal.o.g(fragment, "fragment");
    }
}
