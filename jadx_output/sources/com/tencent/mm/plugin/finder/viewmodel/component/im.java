package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class im implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC f134758d;

    public im(com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC finderHorizontalVideoDrawerUIC) {
        this.f134758d = finderHorizontalVideoDrawerUIC;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC$initRecommendDrawer$onClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick: isPeek=");
        com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC finderHorizontalVideoDrawerUIC = this.f134758d;
        sb6.append(finderHorizontalVideoDrawerUIC.f133589f);
        com.tencent.mars.xlog.Log.i("FinderHorizontalVideoDrawerUIC", sb6.toString());
        if (finderHorizontalVideoDrawerUIC.f133589f) {
            finderHorizontalVideoDrawerUIC.f133589f = false;
            com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout.m(finderHorizontalVideoDrawerUIC.Q6(), false, 1, null);
            androidx.appcompat.app.AppCompatActivity activity = finderHorizontalVideoDrawerUIC.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            ((com.tencent.mm.plugin.finder.viewmodel.component.mn) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.mn.class)).f135180e = 3;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC$initRecommendDrawer$onClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
