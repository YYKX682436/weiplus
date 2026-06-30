package zv1;

/* loaded from: classes15.dex */
public final class z {
    public z(kotlin.jvm.internal.i iVar) {
    }

    public static zv1.a0 a(zv1.z zVar, com.tencent.mm.plugin.clean.cache.CleanCacheTrigger trigger, boolean z17, int i17, java.lang.Object obj) {
        java.util.Set D0;
        boolean z18 = (i17 & 2) != 0 ? false : z17;
        zVar.getClass();
        kotlin.jvm.internal.o.g(trigger, "trigger");
        boolean z19 = zv1.s.f476367f;
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        long c17 = j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigGlobalCacheBizThreshold1());
        if (c17 < 100) {
            c17 = 100;
        }
        long j17 = 1000000;
        long j18 = c17 * j17;
        long c18 = j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigGlobalCacheBizThreshold2());
        if (c18 < 200) {
            c18 = 200;
        }
        long j19 = c18 * j17;
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.HOURS;
        h62.d dVar = (h62.d) e0Var;
        long c19 = com.tencent.mm.sdk.platformtools.b8.c(dVar.aj("clicfg_auto_clean_cache_report_interval", java.lang.String.valueOf(zv1.s.f476370i)));
        if (c19 < 1) {
            c19 = 1;
        }
        long millis = timeUnit.toMillis(c19);
        long c27 = com.tencent.mm.sdk.platformtools.b8.c(dVar.aj("clicfg_auto_clean_cache_report_interval_prod", "0"));
        if (c27 < 0) {
            c27 = 0;
        }
        long millis2 = timeUnit.toMillis(c27);
        int a17 = com.tencent.mm.storage.m2.a(dVar.aj("clicfg_auto_clean_cache_report_sampling", "1"));
        if (a17 < 0) {
            a17 = 0;
        }
        int a18 = com.tencent.mm.storage.m2.a(dVar.aj("clicfg_auto_clean_cache_log_expire_days", "3"));
        int i18 = a18 < 1 ? 1 : a18;
        int a19 = com.tencent.mm.storage.m2.a(dVar.aj("clicfg_auto_clean_cache_other_type_enable", "0"));
        int i19 = a19 < 0 ? 0 : a19;
        int a27 = com.tencent.mm.storage.m2.a(dVar.aj("clicfg_auto_clean_cache_apply_vfs_expire", "0"));
        if (a27 < 0) {
            a27 = 0;
        }
        zv1.s sVar = new zv1.s(j18, j19, millis, millis2, a17, i18, i19, a27);
        int i27 = zv1.x.f476392a[trigger.ordinal()];
        if (i27 == 1) {
            D0 = kz5.z.D0(new com.tencent.mm.plugin.clean.cache.CacheClassifyType[]{com.tencent.mm.plugin.clean.cache.CacheClassifyType.MISC_LOG, com.tencent.mm.plugin.clean.cache.CacheClassifyType.MISC_MATRIX});
        } else {
            if (i27 != 2) {
                throw new java.lang.IllegalArgumentException("Unknown trigger: " + trigger);
            }
            D0 = kz5.z.D0(new com.tencent.mm.plugin.clean.cache.CacheClassifyType[]{com.tencent.mm.plugin.clean.cache.CacheClassifyType.OTHER, com.tencent.mm.plugin.clean.cache.CacheClassifyType.APPBRAND, com.tencent.mm.plugin.clean.cache.CacheClassifyType.MINI_GAME, com.tencent.mm.plugin.clean.cache.CacheClassifyType.FINDER, com.tencent.mm.plugin.clean.cache.CacheClassifyType.FAVORITE, com.tencent.mm.plugin.clean.cache.CacheClassifyType.MAP, com.tencent.mm.plugin.clean.cache.CacheClassifyType.EMOJI, com.tencent.mm.plugin.clean.cache.CacheClassifyType.TING, com.tencent.mm.plugin.clean.cache.CacheClassifyType.LIVE, com.tencent.mm.plugin.clean.cache.CacheClassifyType.SNS, com.tencent.mm.plugin.clean.cache.CacheClassifyType.BIZ, com.tencent.mm.plugin.clean.cache.CacheClassifyType.WEB, com.tencent.mm.plugin.clean.cache.CacheClassifyType.GAME_CENTER});
        }
        return new zv1.a0(trigger, D0, new zv1.e0(j18, j19), false, z18, sVar);
    }
}
