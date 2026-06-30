package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes8.dex */
public class t1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f172727d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.taskbar.ui.TaskBarView f172728e;

    public t1(com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView, int i17) {
        this.f172728e = taskBarView;
        this.f172727d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f172728e.f172536p2.notifyItemRemoved(this.f172727d);
    }
}
