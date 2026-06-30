package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class dl0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f112302d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.gl0 f112303e;

    public dl0(android.view.View view, com.tencent.mm.plugin.finder.live.plugin.gl0 gl0Var) {
        this.f112302d = view;
        this.f112303e = gl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nn0.a W;
        android.view.View view = this.f112302d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorVRActionTipsLazyPlugin$hideVrTip$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorVRActionTipsLazyPlugin$hideVrTip$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.finder.live.plugin.ob0 ob0Var = (com.tencent.mm.plugin.finder.live.plugin.ob0) this.f112303e.X0(com.tencent.mm.plugin.finder.live.plugin.ob0.class);
        mn0.b0 B1 = ob0Var != null ? ob0Var.B1() : null;
        nn0.c cVar = B1 instanceof nn0.c ? (nn0.c) B1 : null;
        if (cVar == null || (W = cVar.W()) == null) {
            return;
        }
        ((nn0.b) W).v(false);
    }
}
