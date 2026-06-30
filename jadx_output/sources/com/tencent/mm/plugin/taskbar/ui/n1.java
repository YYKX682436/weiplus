package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes8.dex */
public class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.taskbar.ui.TaskBarView f172651d;

    public n1(com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView) {
        this.f172651d = taskBarView;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f172651d.setLayoutFrozen(false);
    }
}
