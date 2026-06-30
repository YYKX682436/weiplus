package qn1;

/* loaded from: classes12.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn1.c f364936d;

    public b(qn1.c cVar) {
        this.f364936d = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        qn1.c cVar = this.f364936d;
        try {
            android.os.PowerManager.WakeLock wakeLock = cVar.f364944o;
            if (wakeLock == null || !wakeLock.isHeld()) {
                return;
            }
            android.os.PowerManager.WakeLock wakeLock2 = cVar.f364944o;
            yj0.a.c(wakeLock2, "com/tencent/mm/plugin/backup/backuppcmove/BackupPcModel$2", "run", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            wakeLock2.release();
            yj0.a.f(wakeLock2, "com/tencent/mm/plugin/backup/backuppcmove/BackupPcModel$2", "run", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        } catch (java.lang.Throwable unused) {
        }
    }
}
