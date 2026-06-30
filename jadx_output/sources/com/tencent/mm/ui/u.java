package com.tencent.mm.ui;

/* loaded from: classes5.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.AlertActivity f211060d;

    public u(com.tencent.mm.ui.AlertActivity alertActivity) {
        this.f211060d = alertActivity;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.AlertActivity alertActivity = this.f211060d;
        if (alertActivity.getWindow() == null || alertActivity.isDestroyed()) {
            return;
        }
        com.tencent.mm.ui.yk.c("MicroMsg.AlertActivity", "showSnackBar, finish AlertActivity", new java.lang.Object[0]);
        alertActivity.finish();
    }
}
