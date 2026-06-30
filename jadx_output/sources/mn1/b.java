package mn1;

/* loaded from: classes12.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mn1.d f329827d;

    public b(mn1.d dVar) {
        this.f329827d = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        mn1.d dVar = this.f329827d;
        try {
            if (dVar.f329836o == null) {
                dVar.f329836o = ((android.os.PowerManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("power")).newWakeLock(26, "BackupMove Lock");
            }
            if (dVar.f329836o.isHeld()) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupMoveModel", "wakeLock.acquire()");
            android.os.PowerManager.WakeLock wakeLock = dVar.f329836o;
            yj0.a.c(wakeLock, "com/tencent/mm/plugin/backup/backupmove/BackupMoveModel$2", "run", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
            wakeLock.acquire();
            yj0.a.f(wakeLock, "com/tencent/mm/plugin/backup/backupmove/BackupMoveModel$2", "run", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
        } catch (java.lang.Throwable unused) {
        }
    }
}
