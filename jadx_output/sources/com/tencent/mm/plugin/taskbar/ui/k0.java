package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes11.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.taskbar.ui.z f172633d;

    public k0(com.tencent.mm.plugin.taskbar.ui.z zVar) {
        this.f172633d = zVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarAnimController", "setIgnoreInLayout false");
        this.f172633d.W = false;
    }
}
