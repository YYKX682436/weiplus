package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes.dex */
public final class l8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f151284d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.j8 f151285e;

    public l8(android.view.View view, com.tencent.mm.plugin.mv.ui.uic.j8 j8Var) {
        this.f151284d = view;
        this.f151285e = j8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f151284d;
        int i17 = this.f151285e.f151227b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/uic/VisibleRecord$restore$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/mv/ui/uic/VisibleRecord$restore$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
