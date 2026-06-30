package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes8.dex */
public class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f172642d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.taskbar.ui.TaskBarView f172643e;

    public l1(com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView, int i17) {
        this.f172643e = taskBarView;
        this.f172642d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView = this.f172643e;
        androidx.recyclerview.widget.f2 adapter = taskBarView.getAdapter();
        int i17 = com.tencent.mm.plugin.taskbar.ui.TaskBarView.f172519c3;
        adapter.notifyItemChanged(taskBarView.f172525e2.indexOf(java.lang.Integer.valueOf(this.f172642d)), java.lang.Boolean.TRUE);
    }
}
