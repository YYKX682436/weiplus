package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes13.dex */
public class j2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k2 f211847d;

    public j2(com.tencent.mm.ui.widget.dialog.k2 k2Var) {
        this.f211847d = k2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Runnable runnable;
        try {
            com.tencent.mm.ui.yk.c("MicroMsg.MMDialog", "run on hijack runnable", new java.lang.Object[0]);
            runnable = this.f211847d.mHijackDismissAction;
            runnable.run();
        } catch (java.lang.Exception e17) {
            com.tencent.mm.ui.yk.b("MicroMsg.MMDialog", "protect : " + e17.getMessage(), new java.lang.Object[0]);
        }
    }
}
