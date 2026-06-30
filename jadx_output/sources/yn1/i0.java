package yn1;

/* loaded from: classes11.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f463697d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(java.lang.String str) {
        super(0);
        this.f463697d = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (com.tencent.mm.plugin.backup.migration.MigrationForegroundService.f92546d == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MigrationForegroundService", "service has stopped");
        } else {
            z2.k0 k0Var = com.tencent.mm.plugin.backup.migration.MigrationForegroundService.f92548f;
            if (k0Var == null) {
                kotlin.jvm.internal.o.o("notificationBuilder");
                throw null;
            }
            k0Var.e(this.f463697d);
            android.app.NotificationManager notificationManager = com.tencent.mm.plugin.backup.migration.MigrationForegroundService.f92547e;
            if (notificationManager != null) {
                z2.k0 k0Var2 = com.tencent.mm.plugin.backup.migration.MigrationForegroundService.f92548f;
                if (k0Var2 == null) {
                    kotlin.jvm.internal.o.o("notificationBuilder");
                    throw null;
                }
                notificationManager.notify(539298089, k0Var2.b());
            }
        }
        return jz5.f0.f302826a;
    }
}
