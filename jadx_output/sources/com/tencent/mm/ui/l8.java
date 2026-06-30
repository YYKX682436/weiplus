package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class l8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public long f209071d = 2000;

    public l8(com.tencent.mm.ui.LauncherUI launcherUI) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "resumeLogoutJump logoutExitCheck tid[%d]", java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        com.tencent.mm.sdk.platformtools.u3.l(this);
        if (c01.d9.h()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "resumeLogoutJump logoutExitCheck done uin[%d]", java.lang.Integer.valueOf(gm0.j1.b().h()));
            return;
        }
        boolean z17 = com.tencent.mm.app.w.INSTANCE.f53889n;
        if (z17 || z65.c.f470455a) {
            long j17 = this.f209071d + 2000;
            this.f209071d = j17;
            if (j17 > com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT) {
                this.f209071d = 2000L;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "resumeLogoutJump logoutExitCheck isAppOnForeground[%b] foreground[%b] trigger next [%d]", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z65.c.f470455a), java.lang.Long.valueOf(this.f209071d));
            com.tencent.mm.sdk.platformtools.u3.i(this, this.f209071d);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "resumeLogoutJump terminateApp logoutExitCheck logout and background kill exit!!!");
        if (com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().isCheckEnv()) {
            ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.ui.k8(this), "terminateApp");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "resumeLogoutJump terminateApp logoutExitCheck logout and background kill exit app done");
    }
}
