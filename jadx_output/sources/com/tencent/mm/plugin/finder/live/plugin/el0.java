package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class el0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f112433d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.gl0 f112434e;

    public el0(android.view.View view, com.tencent.mm.plugin.finder.live.plugin.gl0 gl0Var) {
        this.f112433d = view;
        this.f112434e = gl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.plugin.gl0 gl0Var = this.f112434e;
        android.view.View view = this.f112433d;
        view.setTranslationY(com.tencent.mm.ui.bl.b(gl0Var.f365323d.getContext()).y / 2.0f);
        android.view.View view2 = this.f112433d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorVRActionTipsLazyPlugin$showVrTip$1$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorVRActionTipsLazyPlugin$showVrTip$1$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view3 = this.f112433d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorVRActionTipsLazyPlugin$showVrTip$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorVRActionTipsLazyPlugin$showVrTip$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.postDelayed((java.lang.Runnable) ((jz5.n) gl0Var.f112713q).getValue(), 8000L);
    }
}
