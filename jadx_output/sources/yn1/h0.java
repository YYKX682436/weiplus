package yn1;

/* loaded from: classes11.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final yn1.h0 f463685d = new yn1.h0();

    public h0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Intent intent = com.tencent.mm.plugin.backup.migration.MigrationForegroundService.f92546d;
        if (intent != null) {
            com.tencent.mm.plugin.backup.migration.MigrationForegroundService.f92546d = null;
            com.tencent.mm.sdk.platformtools.x2.f193071a.stopService(intent);
        }
        return jz5.f0.f302826a;
    }
}
