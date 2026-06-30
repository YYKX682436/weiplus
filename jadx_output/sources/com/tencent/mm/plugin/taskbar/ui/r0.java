package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes3.dex */
public class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.taskbar.ui.s0 f172693d;

    public r0(com.tencent.mm.plugin.taskbar.ui.s0 s0Var) {
        this.f172693d = s0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.taskbar.ui.s0 s0Var = this.f172693d;
        android.view.View view = s0Var.f172696d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer$6$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer$6$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        s0Var.f172704o.D.setAlpha(1.0f);
    }
}
