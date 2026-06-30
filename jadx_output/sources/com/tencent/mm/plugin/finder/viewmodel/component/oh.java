package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class oh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.qh f135474d;

    public oh(com.tencent.mm.plugin.finder.viewmodel.component.qh qhVar) {
        this.f135474d = qhVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderFriendsLeftSlideGuideUIC$refreshSlideLeftTipsLayout$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFriendsLeftSlideGuideUIC$refreshSlideLeftTipsLayout$1$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFriendsLeftSlideGuideUIC$refreshSlideLeftTipsLayout$1$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.finder.viewmodel.component.qh qhVar = this.f135474d;
        boolean z17 = qhVar.f135714i;
        int i17 = qhVar.f135711f;
        if (z17) {
            ey2.o0 N6 = ((ey2.t0) pf5.u.f353936a.e(c61.l7.class).a(ey2.t0.class)).N6(i17);
            N6.a(ey2.q0.f257474g);
            N6.f257448h = java.lang.System.currentTimeMillis();
            qhVar.f135714i = false;
        }
        androidx.appcompat.app.AppCompatActivity activity = qhVar.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("Source", 4);
        ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) a17).f7(i17, bundle);
        zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
        nk6.q0("finder_tl_hot_tab", "onLeftSlide");
        nk6.N("finder_tl_hot_tab");
        qhVar.P6();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFriendsLeftSlideGuideUIC$refreshSlideLeftTipsLayout$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
