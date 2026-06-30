package com.tencent.mm.ui.tools;

/* loaded from: classes8.dex */
public class g8 implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.pluginsdk.ui.tools.o3 o3Var = com.tencent.mm.pluginsdk.ui.tools.o3.f191799r;
        if (o3Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FilesFloatBall.QbCallBackBroadcast", "foregroundRunnable, FilesFloatBallHelper is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FilesFloatBall.QbCallBackBroadcast", "foregroundRunnable, onEnterPage");
        o3Var.x();
        gp1.v vVar = o3Var.f93136h;
        if (vVar != null) {
            vVar.R(true);
        }
        if (vVar != null) {
            vVar.E0(true);
        }
    }
}
