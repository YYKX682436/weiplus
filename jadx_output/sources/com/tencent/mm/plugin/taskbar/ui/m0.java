package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes11.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.taskbar.ui.z f172646d;

    public m0(com.tencent.mm.plugin.taskbar.ui.z zVar) {
        this.f172646d = zVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarAnimController", "virbg: delayHideBackgroundView");
        this.f172646d.g();
    }
}
