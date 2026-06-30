package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes7.dex */
public class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.taskbar.ui.TaskBarView f172615d;

    public g1(com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView) {
        this.f172615d = taskBarView;
    }

    @Override // java.lang.Runnable
    public void run() {
        rh4.m mVar = this.f172615d.f172533m2;
        if (mVar != null) {
            mVar.u();
        }
    }
}
