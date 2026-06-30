package com.tencent.mm.plugin.sns.statistics;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public int f164909b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.Map f164910c;

    /* renamed from: d, reason: collision with root package name */
    public long f164911d;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f164908a = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f164912e = "";

    public final void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("flush", "com.tencent.mm.plugin.sns.statistics.SnsGalleryReporter");
        java.util.Map map = this.f164910c;
        if (map != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f164911d;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.putAll(map);
            linkedHashMap.put("stay_time", java.lang.Long.valueOf(currentTimeMillis));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
            com.tencent.mm.plugin.sns.statistics.w wVar = new com.tencent.mm.plugin.sns.statistics.w("SnsGalleryReporter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
            wVar.a("view_unexp", "sns_large_image", linkedHashMap);
        }
        this.f164910c = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("flush", "com.tencent.mm.plugin.sns.statistics.SnsGalleryReporter");
    }
}
