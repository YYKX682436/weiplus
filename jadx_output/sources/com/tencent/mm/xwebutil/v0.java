package com.tencent.mm.xwebutil;

/* loaded from: classes11.dex */
public class v0 implements java.lang.Runnable {
    public v0(com.tencent.mm.xwebutil.w0 w0Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.tencent.matrix.lifecycle.supervisor.AppDeepBackgroundOwner.INSTANCE.isBackground()) {
            com.tencent.mars.xlog.Log.i("XWeb.MM.XWebUtil", "onEnterBackground, do force kill child process");
            com.tencent.xweb.a3.d();
        }
    }
}
