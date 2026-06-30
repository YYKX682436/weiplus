package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.n1 f117234d;

    public m1(com.tencent.mm.plugin.finder.live.viewmodel.n1 n1Var) {
        this.f117234d = n1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.viewmodel.n1 n1Var = this.f117234d;
        android.view.View view = n1Var.f117266f;
        if (view == null) {
            kotlin.jvm.internal.o.o("viewRoot");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLivePromoteUIC", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLivePromoteUIC", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        el2.i0 i0Var = n1Var.f117265e;
        if (i0Var != null) {
            i0Var.p0();
        } else {
            kotlin.jvm.internal.o.o("view");
            throw null;
        }
    }
}
