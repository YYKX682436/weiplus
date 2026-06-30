package m54;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final m54.a f324241a = new m54.a();

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.r2 f324242b = new com.tencent.mm.sdk.platformtools.r2(5);

    public final com.tencent.mm.plugin.sns.storage.SnsInfo a(java.lang.String id6) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("snsInfo", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicAdSnsInfoLoader");
        kotlin.jvm.internal.o.g(id6, "id");
        long n17 = com.tencent.mm.plugin.sns.storage.w2.n(id6);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("snsInfo", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicAdSnsInfoLoader");
        com.tencent.mm.sdk.platformtools.r2 r2Var = f324242b;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) r2Var.get(java.lang.Long.valueOf(n17));
        if (snsInfo == null && (snsInfo = com.tencent.mm.plugin.sns.model.l4.Fj().b1(java.lang.String.valueOf(n17))) != null) {
            r2Var.put(java.lang.Long.valueOf(n17), snsInfo);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("snsInfo", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicAdSnsInfoLoader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("snsInfo", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicAdSnsInfoLoader");
        return snsInfo;
    }
}
