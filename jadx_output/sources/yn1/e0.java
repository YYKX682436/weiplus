package yn1;

/* loaded from: classes11.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final yn1.e0 f463645d = new yn1.e0();

    public e0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (com.tencent.mm.plugin.backup.migration.MigrationForegroundService.f92549g) {
            com.tencent.mm.plugin.backup.migration.MigrationForegroundService.f92549g = false;
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            java.lang.Object systemService = context.getSystemService("notification");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((android.app.NotificationManager) systemService).cancel(539298096);
        }
        return jz5.f0.f302826a;
    }
}
