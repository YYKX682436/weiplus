package i64;

/* loaded from: classes4.dex */
public final class i extends i64.a0 {

    /* renamed from: d, reason: collision with root package name */
    public static final i64.i f289183d = new i64.i();

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f289184e = "AdComplianceModelManager";

    /* renamed from: f, reason: collision with root package name */
    public static final i64.c f289185f = i64.c.f289111a;

    @Override // i64.a0
    public java.lang.String d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.model.AdComplianceModelManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.model.AdComplianceModelManager");
        return f289184e;
    }

    public void g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ad.model.AdComplianceModelManager");
        ((java.util.LinkedHashMap) c()).clear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMutexes", "com.tencent.mm.plugin.sns.ad.model.AdModelManager");
        java.util.Map map = this.f289063b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMutexes", "com.tencent.mm.plugin.sns.ad.model.AdModelManager");
        ((java.util.LinkedHashMap) map).clear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ad.model.AdComplianceModelManager");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x019c A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #1 {all -> 0x0053, blocks: (B:13:0x004d, B:15:0x0194, B:17:0x019c), top: B:12:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ff A[Catch: all -> 0x01c1, TRY_LEAVE, TryCatch #0 {all -> 0x01c1, blocks: (B:45:0x00f9, B:47:0x00ff, B:50:0x0113, B:53:0x0141), top: B:44:0x00f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0113 A[Catch: all -> 0x01c1, TRY_ENTER, TryCatch #0 {all -> 0x01c1, blocks: (B:45:0x00f9, B:47:0x00ff, B:50:0x0113, B:53:0x0141), top: B:44:0x00f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.tencent.mm.plugin.sns.storage.SnsInfo r25, kotlin.coroutines.Continuation r26) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i64.i.h(com.tencent.mm.plugin.sns.storage.SnsInfo, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final i64.c i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDownloadInfoMap", "com.tencent.mm.plugin.sns.ad.model.AdComplianceModelManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDownloadInfoMap", "com.tencent.mm.plugin.sns.ad.model.AdComplianceModelManager");
        return f289185f;
    }
}
