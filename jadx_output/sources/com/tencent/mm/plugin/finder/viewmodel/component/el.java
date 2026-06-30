package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class el extends com.tencent.mm.plugin.finder.view.FinderFragmentChangeObserver {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f134275d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC f134276e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public el(androidx.appcompat.app.AppCompatActivity appCompatActivity, com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC finderHomeUIC, java.util.ArrayList arrayList) {
        super((com.tencent.mm.ui.MMActivity) appCompatActivity, arrayList);
        this.f134275d = appCompatActivity;
        this.f134276e = finderHomeUIC;
        kotlin.jvm.internal.o.e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
    }

    @Override // com.tencent.mm.plugin.finder.view.ka
    public void G3(int i17, int i18, int i19, int i27) {
        java.util.Iterator it = this.f134276e.f133575o.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.finder.view.ka) it.next()).G3(i17, i18, i19, i27);
        }
    }

    @Override // com.tencent.mm.plugin.finder.view.ka
    public void l(int i17, int i18, int i19, int i27) {
        zj0.b bVar = new zj0.b();
        bVar.b(i17);
        bVar.b(i18);
        bVar.b(i19);
        bVar.b(i27);
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeUIC$fragmentChangeObserver$1", "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeUIC$fragmentChangeObserver$com/tencent/mm/plugin/finder/view/FinderFragmentChangeObserver", "onFragmentChange", "(IIII)V", this, bVar.a());
        if (i17 != -1) {
            com.tencent.mm.plugin.finder.report.q1.e(com.tencent.mm.plugin.finder.report.q1.f125255a, true, false, 2, null);
        }
        com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC finderHomeUIC = this.f134276e;
        ey2.t0 t0Var = finderHomeUIC.f133574n;
        t0Var.f257507m = i27;
        t0Var.f257508n = i27;
        finderHomeUIC.getClass();
        androidx.appcompat.app.AppCompatActivity activity = this.f134275d;
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.bl.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        ((com.tencent.mm.plugin.finder.viewmodel.component.bl) a17).n7(i18);
        java.util.Iterator it = finderHomeUIC.f133575o.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.finder.view.ka) it.next()).l(i17, i18, i19, i27);
        }
        if (finderHomeUIC.b7()) {
            androidx.appcompat.app.AppCompatActivity activity2 = finderHomeUIC.getActivity();
            kotlin.jvm.internal.o.g(activity2, "activity");
            ((com.tencent.mm.plugin.finder.viewmodel.component.ya0) pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.finder.viewmodel.component.ya0.class)).P6();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeUIC$fragmentChangeObserver$1", "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeUIC$fragmentChangeObserver$com/tencent/mm/plugin/finder/view/FinderFragmentChangeObserver", "onFragmentChange", "(IIII)V");
    }

    @Override // com.tencent.mm.plugin.finder.view.FinderFragmentChangeObserver, androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
        java.util.Iterator it = this.f134276e.f133575o.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.finder.view.ka) it.next()).onPageScrollStateChanged(i17);
        }
    }

    @Override // com.tencent.mm.plugin.finder.view.FinderFragmentChangeObserver, androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
        java.util.Iterator it = this.f134276e.f133575o.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.finder.view.ka) it.next()).onPageScrolled(i17, f17, i18);
        }
    }

    @Override // com.tencent.mm.plugin.finder.view.ka
    public void z(boolean z17, int i17, com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment fragment) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(java.lang.Boolean.valueOf(z17));
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(fragment);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeUIC$fragmentChangeObserver$1", "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeUIC$fragmentChangeObserver$com/tencent/mm/plugin/finder/view/FinderFragmentChangeObserver", "onUserVisibleFragmentChange", "(ZILcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;)V", this, array);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        if (z17) {
            androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f134275d;
            com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI finderProfileUI = appCompatActivity instanceof com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI ? (com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI) appCompatActivity : null;
            boolean c76 = finderProfileUI != null ? finderProfileUI.c7() : false;
            java.lang.String name = fragment.getClass().getName();
            ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).getClass();
            java.lang.String str = (java.lang.String) ml2.j0.f327583i.H.get(name);
            if (!c76 && str != null) {
                p52.h.f352023h = fragment.getClass().getName();
            }
        }
        java.util.Iterator it = this.f134276e.f133575o.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.finder.view.ka) it.next()).z(z17, i17, fragment);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeUIC$fragmentChangeObserver$1", "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeUIC$fragmentChangeObserver$com/tencent/mm/plugin/finder/view/FinderFragmentChangeObserver", "onUserVisibleFragmentChange", "(ZILcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;)V");
    }
}
