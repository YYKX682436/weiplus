package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class p0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.a1 f117312d;

    public p0(com.tencent.mm.plugin.finder.live.viewmodel.a1 a1Var) {
        this.f117312d = a1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLivePostUIC$initView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.viewmodel.a1 a1Var = this.f117312d;
        boolean W6 = a1Var.W6();
        com.tencent.mm.plugin.finder.assist.x2 x2Var = com.tencent.mm.plugin.finder.assist.x2.f102672a;
        if (W6) {
            if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Bi(a1Var.getContext(), "android.permission.RECORD_AUDIO", 80, "", "", new com.tencent.mm.plugin.finder.live.viewmodel.o0(a1Var))) {
                x2Var.f(9, a1Var.f116884t);
                a1Var.a7();
            }
        } else {
            if (com.tencent.mm.plugin.finder.assist.x2.f102673b == 18) {
                x2Var.b(5);
            }
            if (com.tencent.mm.plugin.finder.assist.x2.f102673b == 19) {
                x2Var.b(2);
            }
            a1Var.a7();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLivePostUIC$initView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
