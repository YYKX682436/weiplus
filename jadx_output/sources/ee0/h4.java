package ee0;

@j95.b
/* loaded from: classes8.dex */
public final class h4 extends i95.w implements fe0.d4 {
    public boolean Ai(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("needCheckFinderValid", "com.tencent.mm.feature.sns.SnsCoverConfigService");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("needCheckFinderValid", "com.tencent.mm.plugin.sns.cover.config.SnsCoverConfig");
        boolean z17 = true;
        if (gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_COVER_FINDER_CHECK_INT_SYNC, -1) == 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("needCheckFinderValid", "com.tencent.mm.plugin.sns.cover.config.SnsCoverConfig");
        } else {
            if (java.lang.System.currentTimeMillis() - j17 > ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_cover_finder_check_interval, 3600) * 1000) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("needCheckFinderValid", "com.tencent.mm.plugin.sns.cover.config.SnsCoverConfig");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("needCheckFinderValid", "com.tencent.mm.plugin.sns.cover.config.SnsCoverConfig");
                z17 = false;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("needCheckFinderValid", "com.tencent.mm.feature.sns.SnsCoverConfigService");
        return z17;
    }

    public boolean wi() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkErrorType", "com.tencent.mm.feature.sns.SnsCoverConfigService");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkErrorType", "com.tencent.mm.plugin.sns.cover.config.SnsCoverConfig");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_cover_error_code_check, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkErrorType", "com.tencent.mm.plugin.sns.cover.config.SnsCoverConfig");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkErrorType", "com.tencent.mm.feature.sns.SnsCoverConfigService");
        return fj6;
    }
}
