package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class bo implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveLocSingleTagLayout f117912d;

    public bo(com.tencent.mm.plugin.finder.live.widget.FinderLiveLocSingleTagLayout finderLiveLocSingleTagLayout) {
        this.f117912d = finderLiveLocSingleTagLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveLocSingleTagLayout$updateTagView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.FinderLiveLocSingleTagLayout finderLiveLocSingleTagLayout = this.f117912d;
        int indexOfChild = finderLiveLocSingleTagLayout.indexOfChild(view);
        com.tencent.mm.plugin.finder.live.widget.ao onTagClickListener = finderLiveLocSingleTagLayout.getOnTagClickListener();
        if (onTagClickListener != null) {
            com.tencent.mm.plugin.finder.live.widget.ir irVar = (com.tencent.mm.plugin.finder.live.widget.ir) onTagClickListener;
            com.tencent.mm.plugin.finder.live.widget.mr mrVar = irVar.f118692a;
            mrVar.h0(3);
            r45.c64 c64Var = (r45.c64) kz5.n0.a0(irVar.f118693b, indexOfChild);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onTagClick] name = ");
            sb6.append(c64Var != null ? c64Var.f371311e : null);
            com.tencent.mars.xlog.Log.i(mrVar.I, sb6.toString());
            r45.ze2 ze2Var = irVar.f118694c;
            if (c64Var != null) {
                ze2Var.set(3, c64Var.f371311e);
                ze2Var.set(5, c64Var.f371310d);
            }
            mrVar.f119113x1 = ze2Var;
            ((kotlinx.coroutines.flow.h3) ((mm2.g1) mrVar.H.a(mm2.g1.class)).f329073n).k(ze2Var);
            mrVar.g0(ze2Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLocSingleTagLayout$updateTagView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
