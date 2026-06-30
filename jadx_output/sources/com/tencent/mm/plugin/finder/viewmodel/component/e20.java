package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class e20 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f50 f134185d;

    public e20(com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var) {
        this.f134185d = f50Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$canPostButRevingUi$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        ya2.g gVar = ya2.h.f460484a;
        com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var = this.f134185d;
        ya2.b2 b17 = gVar.b(xy2.c.e(f50Var.getContext()));
        kotlin.jvm.internal.o.d(b17);
        if (b17.G0()) {
            intent.setClass(f50Var.getActivity(), com.tencent.mm.plugin.finder.ui.FinderExposeUI.class);
            androidx.appcompat.app.AppCompatActivity activity = f50Var.getActivity();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(activity, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$canPostButRevingUi$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(activity, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$canPostButRevingUi$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            com.tencent.mm.plugin.finder.viewmodel.component.iy.d(com.tencent.mm.plugin.finder.viewmodel.component.ny.L1, f50Var.getActivity(), intent, 0L, null, 0, 0, false, 0, null, 508, null);
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Rj(f50Var.getActivity(), intent);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$canPostButRevingUi$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
