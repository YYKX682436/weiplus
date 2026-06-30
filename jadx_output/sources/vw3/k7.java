package vw3;

/* loaded from: classes.dex */
public final class k7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerXLogUI f441018d;

    public k7(com.tencent.mm.plugin.repairer.ui.RepairerXLogUI repairerXLogUI) {
        this.f441018d = repairerXLogUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.appenderFlushSync();
        com.tencent.mars.xlog.Log.moveLogsFromCacheDirToLogDir();
        com.tencent.mm.plugin.repairer.ui.RepairerXLogUI repairerXLogUI = this.f441018d;
        repairerXLogUI.runOnUiThread(new vw3.j7(repairerXLogUI));
    }
}
