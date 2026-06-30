package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class k8 implements java.lang.Runnable {
    public k8(com.tencent.mm.ui.l8 l8Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().terminateApp(android.os.Process.myTid(), android.os.SystemClock.elapsedRealtimeNanos());
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "resumeLogoutJump terminateApp done");
    }
}
