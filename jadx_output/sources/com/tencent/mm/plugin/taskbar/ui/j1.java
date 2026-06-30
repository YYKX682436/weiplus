package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes2.dex */
public class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.taskbar.ui.TaskBarView f172630d;

    public j1(com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView) {
        this.f172630d = taskBarView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView = this.f172630d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(taskBarView, arrayList.toArray(), "com/tencent/mm/plugin/taskbar/ui/TaskBarView$15", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        taskBarView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(taskBarView, "com/tencent/mm/plugin/taskbar/ui/TaskBarView$15", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        this.f172630d.setTranslationY(0.0f);
    }
}
