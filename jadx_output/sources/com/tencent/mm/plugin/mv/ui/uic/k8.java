package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes.dex */
public final class k8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f151260d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.j8 f151261e;

    public k8(android.view.View view, com.tencent.mm.plugin.mv.ui.uic.j8 j8Var) {
        this.f151260d = view;
        this.f151261e = j8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f151260d;
        int i17 = this.f151261e.f151229d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/uic/VisibleRecord$hide$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/mv/ui/uic/VisibleRecord$hide$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
