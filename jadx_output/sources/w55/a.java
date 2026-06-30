package w55;

/* loaded from: classes11.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final jz5.l a() {
        try {
            boolean z17 = false;
            int c17 = ku5.t0.f312615d != null ? j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigGlobalStorageNoSpaceThreshold()) : com.tencent.mm.sdk.platformtools.o4.L().getInt("RepairerConfig_StorageNoSpaceThreshold", 0);
            if (100 <= c17 && c17 < 10001) {
                z17 = true;
            }
            return new jz5.l(java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(c17 * 1000000));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RepairerConfigGlobalStorage", "getThresholdBytes failed: " + e17);
            return new jz5.l(java.lang.Boolean.FALSE, 0L);
        }
    }

    public final void b(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        boolean exists = new java.io.File(context.getFilesDir(), ".newstoragealert_threshold").exists();
        jz5.l a17 = a();
        boolean booleanValue = ((java.lang.Boolean) a17.f302833d).booleanValue();
        long longValue = ((java.lang.Number) a17.f302834e).longValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.RepairerConfigGlobalStorage", "refreshFileFlag:hasFileFlag=" + exists + ", valid=" + booleanValue + ", threshold=" + longValue);
        try {
            if (!booleanValue) {
                l75.d1.f316946b = 0L;
                if (exists) {
                    try {
                        new java.io.File(context.getFilesDir(), ".newstoragealert_threshold").delete();
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RepairerConfigGlobalStorage", e17, "delete file failed", new java.lang.Object[0]);
                    }
                }
                com.tencent.mm.sdk.platformtools.o4.L().remove("RepairerConfig_StorageNoSpaceThreshold");
                return;
            }
            l75.d1.f316946b = longValue;
            if (!exists) {
                try {
                    new java.io.File(context.getFilesDir(), ".newstoragealert_threshold").createNewFile();
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.RepairerConfigGlobalStorage", "create file failed: " + e18);
                }
            }
            com.tencent.mm.sdk.platformtools.o4.L().putInt("RepairerConfig_StorageNoSpaceThreshold", j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigGlobalStorageNoSpaceThreshold()));
            return;
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RepairerConfigGlobalStorage", "refreshFileFlag failed: " + e19);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.RepairerConfigGlobalStorage", "refreshFileFlag failed: " + e19);
    }
}
