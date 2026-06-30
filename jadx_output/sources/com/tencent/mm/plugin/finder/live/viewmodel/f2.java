package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes.dex */
public final class f2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.k2 f117087d;

    public f2(com.tencent.mm.plugin.finder.live.viewmodel.k2 k2Var) {
        this.f117087d = k2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f117087d.f117179g;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameProtocolUIC$hide$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameProtocolUIC$hide$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
