package com.tencent.wechat.aff.data_report;

/* loaded from: classes11.dex */
class ZIDL_MK0DaVBcKE {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f216604a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f216605b = new java.util.concurrent.ConcurrentHashMap();

    private void ZIDL_II(int i17, int i18, int i19) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f216604a;
        com.tencent.wechat.zlog.Zlog.a("DataReportCgiManagerKE", "onDataReportIdKeyEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a("DataReportCgiManagerKE", "onDataReportIdKeyEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            ((com.tencent.wechat.aff.data_report.a) entry.getValue()).a(i17, i18, i19);
        }
    }

    private void ZIDL_KI(int i17, byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f216605b;
        com.tencent.wechat.zlog.Zlog.a("DataReportCgiManagerKE", "onDataReportKVEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a("DataReportCgiManagerKE", "onDataReportKVEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            com.tencent.wechat.aff.data_report.b bVar = (com.tencent.wechat.aff.data_report.b) entry.getValue();
            new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            bVar.getClass();
        }
    }
}
