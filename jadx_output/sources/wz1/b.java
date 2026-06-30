package wz1;

/* loaded from: classes12.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final wz1.b f450694d = new wz1.b();

    /* renamed from: e, reason: collision with root package name */
    public static com.tencent.wcdb.support.CancellationSignal f450695e;

    /* renamed from: f, reason: collision with root package name */
    public static java.util.concurrent.Future f450696f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f450697g;

    /* renamed from: h, reason: collision with root package name */
    public static volatile boolean f450698h;

    public static final void b(boolean z17) {
        if (!f450698h) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DBLeafBackup", "Will update backup soon.");
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            c17.A(94, 0L);
            c17.i(false);
            f450698h = true;
            wz1.g.a(75, 0L, 2, null);
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DBLeafBackup", "Drop DB leaf backup.");
            com.tencent.mm.vfs.w6.h(gm0.j1.u().f273153f.getPath() + ".li");
            wz1.g.a(76, 0L, 2, null);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.wcdb.support.CancellationSignal cancellationSignal;
        long s17;
        synchronized (this) {
            cancellationSignal = f450695e;
        }
        if (cancellationSignal == null) {
            return;
        }
        if (kotlin.jvm.internal.o.b("0", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_db_backup_leaf_android", "0"))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DBLeafBackup", "Leaf backup disabled.");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            s17 = currentTimeMillis - gm0.j1.u().c().s(94, 0L);
        } catch (com.tencent.wcdb.support.OperationCanceledException unused) {
            long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
            com.tencent.mars.xlog.Log.i("MicroMsg.DBLeafBackup", "Leaf backup cancelled, time: " + currentTimeMillis2 + " ms");
            java.lang.String[] strArr = wz1.g.f450703a;
            jx3.f.INSTANCE.k(181, 181, 67, 70, (int) 1, (int) (currentTimeMillis2 / ((long) 1000)), true);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.DBLeafBackup", e17, "Leaf backup failed.", new java.lang.Object[0]);
            wz1.g.a(68, 0L, 2, null);
            jx3.f.INSTANCE.d(21388, "@DBLeafBackupFailed", 0, 0, e17.getMessage(), com.tencent.mm.sdk.platformtools.z.f193109e);
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            c17.A(94, currentTimeMillis);
            c17.i(false);
        }
        if (s17 < 86400000) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DBLeafBackup", "Backup interval not reached, skip: [" + s17 + " / 86400000]");
            return;
        }
        wz1.g.a(65, 0L, 2, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.DBLeafBackup", "Start leaf backup, interval: [" + s17 + " / 86400000]");
        l75.k0 k0Var = gm0.j1.u().f273153f;
        com.tencent.wcdb.repair.RepairKit.LeafInfo i17 = k0Var.i(wz1.g.f450703a, cancellationSignal);
        if (i17 != null) {
            i17.save(k0Var.getPath() + ".li.tmp");
        }
        com.tencent.mm.vfs.w6.w(k0Var.getPath() + ".li.tmp", k0Var.getPath() + ".li");
        com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
        c18.A(94, currentTimeMillis);
        c18.i(false);
        f450698h = false;
        long currentTimeMillis3 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        com.tencent.mars.xlog.Log.i("MicroMsg.DBLeafBackup", "Leaf backup done, time: " + currentTimeMillis3 + " ms");
        jx3.f.INSTANCE.k(181, 181, 66, 69, (int) 1, (int) (currentTimeMillis3 / ((long) 1000)), true);
        synchronized (this) {
            f450695e = null;
            f450696f = null;
        }
    }
}
