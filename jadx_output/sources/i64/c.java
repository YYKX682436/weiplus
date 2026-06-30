package i64;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final i64.c f289111a = new i64.c();

    public final a44.a a(java.lang.String str) {
        i64.b bVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.ad.model.AdComplianceModelManager$DownloadInfoMap");
        a44.a aVar = null;
        if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.ad.model.AdComplianceModelManager$DownloadInfoMap");
            return null;
        }
        kotlinx.coroutines.flow.j2 j2Var = (kotlinx.coroutines.flow.j2) ((java.util.LinkedHashMap) i64.i.f289183d.c()).get(str);
        if (j2Var != null && (bVar = (i64.b) ((kotlinx.coroutines.flow.h3) j2Var).getValue()) != null) {
            aVar = bVar.a();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.ad.model.AdComplianceModelManager$DownloadInfoMap");
        return aVar;
    }

    public final void b(java.lang.String str, a44.a aVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("set", "com.tencent.mm.plugin.sns.ad.model.AdComplianceModelManager$DownloadInfoMap");
        if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("set", "com.tencent.mm.plugin.sns.ad.model.AdComplianceModelManager$DownloadInfoMap");
        } else {
            if (aVar == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("set", "com.tencent.mm.plugin.sns.ad.model.AdComplianceModelManager$DownloadInfoMap");
                return;
            }
            if (!r26.n0.N(str)) {
                i64.i.f289183d.a(str, new i64.b(str, a44.k.f1285g.c(aVar), aVar));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("set", "com.tencent.mm.plugin.sns.ad.model.AdComplianceModelManager$DownloadInfoMap");
        }
    }
}
