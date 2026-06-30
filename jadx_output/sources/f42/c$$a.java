package f42;

/* loaded from: classes5.dex */
public final /* synthetic */ class c$$a implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.w("MicroMsg.KillselfMonitor", "on kill proc: runtimeExit, pid=" + android.os.Process.myPid());
        mm.g0.f328483a.d(kz5.b0.c(java.lang.Integer.valueOf(android.os.Process.myPid())));
    }
}
