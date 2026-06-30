package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class f7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.k7 f116296d;

    public f7(com.tencent.mm.plugin.finder.live.view.k7 k7Var) {
        this.f116296d = k7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLiveMultiNoticeWidget$initView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.view.k7 k7Var = this.f116296d;
        k7Var.s(true);
        bm2.x5 x5Var = k7Var.Q;
        if (x5Var != null) {
            java.util.LinkedList linkedList = x5Var.f22432f;
            if (linkedList != null) {
                linkedList.clear();
            }
            x5Var.notifyDataSetChanged();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveMultiNoticeWidget$initView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
