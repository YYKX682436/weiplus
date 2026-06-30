package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes8.dex */
public class u1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f172731d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.taskbar.ui.TaskBarView f172732e;

    public u1(com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView, int i17) {
        this.f172732e = taskBarView;
        this.f172731d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f172732e.f172536p2.notifyItemChanged(this.f172731d);
    }
}
