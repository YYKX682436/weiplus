package ho1;

/* loaded from: classes5.dex */
public final class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f282838d;

    public v0(boolean z17) {
        this.f282838d = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.backup.roambackup.impl.RoamBackupActivity.f92622v;
        java.lang.ref.WeakReference weakReference2 = com.tencent.mm.plugin.backup.roambackup.impl.RoamBackupActivity.f92622v;
        com.tencent.mm.plugin.backup.roambackup.impl.RoamBackupActivity roamBackupActivity = weakReference2 != null ? (com.tencent.mm.plugin.backup.roambackup.impl.RoamBackupActivity) weakReference2.get() : null;
        if (roamBackupActivity != null) {
            if (this.f282838d) {
                roamBackupActivity.getWindow().addFlags(128);
            } else {
                roamBackupActivity.getWindow().clearFlags(128);
            }
        }
    }
}
