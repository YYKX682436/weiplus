package qn1;

/* loaded from: classes12.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn1.c f364933d;

    public a(qn1.c cVar) {
        this.f364933d = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        qn1.c cVar = this.f364933d;
        try {
            if (cVar.f364944o == null) {
                cVar.f364944o = ((android.os.PowerManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("power")).newWakeLock(26, "BackupPc Lock");
            }
            if (cVar.f364944o.isHeld()) {
                return;
            }
            android.os.PowerManager.WakeLock wakeLock = cVar.f364944o;
            yj0.a.c(wakeLock, "com/tencent/mm/plugin/backup/backuppcmove/BackupPcModel$1", "run", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
            wakeLock.acquire();
            yj0.a.f(wakeLock, "com/tencent/mm/plugin/backup/backuppcmove/BackupPcModel$1", "run", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
        } catch (java.lang.Throwable unused) {
        }
    }
}
