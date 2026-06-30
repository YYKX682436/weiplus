package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class wl implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderTagView f133299d;

    public wl(com.tencent.mm.plugin.finder.view.FinderTagView finderTagView) {
        this.f133299d = finderTagView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderTagView$genItemView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.view.ql qlVar = com.tencent.mm.plugin.finder.view.FinderTagView.f131494w;
        java.lang.Object tag = view.getTag(-1);
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue = ((java.lang.Boolean) tag).booleanValue();
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        java.lang.Object tag2 = view.getTag(-2);
        kotlin.jvm.internal.o.e(tag2, "null cannot be cast to non-null type kotlin.Int");
        f0Var.f310116d = ((java.lang.Integer) tag2).intValue();
        com.tencent.mm.plugin.finder.view.FinderTagView finderTagView = this.f133299d;
        int size = finderTagView.getAllAddViews().size();
        for (int i17 = 0; i17 < size; i17++) {
            if (i17 == f0Var.f310116d) {
                android.view.View view2 = finderTagView.getAllAddViews().get(i17);
                kotlin.jvm.internal.o.f(view2, "get(...)");
                finderTagView.c(true, view2, -1);
            } else {
                android.view.View view3 = finderTagView.getAllAddViews().get(i17);
                kotlin.jvm.internal.o.f(view3, "get(...)");
                finderTagView.c(false, view3, -1);
            }
        }
        if (!booleanValue) {
            new com.tencent.mm.sdk.platformtools.n3().postUI(new com.tencent.mm.plugin.finder.view.vl(finderTagView, f0Var));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderTagView$genItemView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
