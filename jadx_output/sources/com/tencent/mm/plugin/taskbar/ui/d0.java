package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes11.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.taskbar.ui.z f172587d;

    public d0(com.tencent.mm.plugin.taskbar.ui.z zVar) {
        this.f172587d = zVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.taskbar.ui.z zVar = this.f172587d;
        zVar.f172769m = com.tencent.mm.ui.bl.a(zVar.f172762d) + com.tencent.mm.ui.bl.h(zVar.f172762d);
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarAnimController", "[run] mScrollOffset:%d UIUtilsStatusBar:%d WeUIToolHelperStatusBar:%d", java.lang.Integer.valueOf(zVar.f172769m), java.lang.Integer.valueOf(com.tencent.mm.ui.bk.p(zVar.f172762d)), java.lang.Integer.valueOf(com.tencent.mm.ui.bl.h(zVar.f172762d)));
    }
}
