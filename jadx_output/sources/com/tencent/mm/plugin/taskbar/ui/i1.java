package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes8.dex */
public class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.taskbar.ui.TaskBarView f172626d;

    public i1(com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView) {
        this.f172626d = taskBarView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.taskbar.ui.TaskBarView.h1(this.f172626d);
    }
}
