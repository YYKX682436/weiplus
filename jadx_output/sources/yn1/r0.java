package yn1;

/* loaded from: classes11.dex */
public final class r0 extends com.tencent.matrix.lifecycle.h {
    @Override // com.tencent.matrix.lifecycle.h
    public void onEnterForeground() {
        com.tencent.wechat.aff.migration.f.f217390b.a(true);
        android.content.Intent intent = com.tencent.mm.plugin.backup.migration.MigrationForegroundService.f92546d;
        com.tencent.mars.xlog.Log.i("MicroMsg.MigrationForegroundService", "removeNotification");
        pm0.v.X(yn1.e0.f463645d);
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onExitForeground() {
        com.tencent.wechat.aff.migration.f.f217390b.a(false);
        yn1.z0 z0Var = yn1.z0.f463933a;
        if (z0Var.i() == bw5.bj0.NOTIFY_CODE_START || z0Var.i() == bw5.bj0.NOTIFY_CODE_IMPORTING) {
            android.content.Intent intent = com.tencent.mm.plugin.backup.migration.MigrationForegroundService.f92546d;
            com.tencent.mars.xlog.Log.i("MicroMsg.MigrationForegroundService", "showNotification");
            pm0.v.X(yn1.f0.f463662d);
        }
    }
}
