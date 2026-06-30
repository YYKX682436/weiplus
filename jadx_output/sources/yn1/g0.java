package yn1;

/* loaded from: classes11.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final yn1.g0 f463671d = new yn1.g0();

    public g0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start: ");
        sb6.append(com.tencent.mm.plugin.backup.migration.MigrationForegroundService.f92546d == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.MigrationForegroundService", sb6.toString());
        if (com.tencent.mm.plugin.backup.migration.MigrationForegroundService.f92546d == null) {
            com.tencent.mm.plugin.backup.migration.MigrationForegroundService.f92546d = new android.content.Intent(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.plugin.backup.migration.MigrationForegroundService.class);
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                com.tencent.mm.sdk.platformtools.x2.f193071a.startForegroundService(com.tencent.mm.plugin.backup.migration.MigrationForegroundService.f92546d);
            } else {
                com.tencent.mm.sdk.platformtools.x2.f193071a.startService(com.tencent.mm.plugin.backup.migration.MigrationForegroundService.f92546d);
            }
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.MigrationForegroundService", "already started");
        }
        return jz5.f0.f302826a;
    }
}
