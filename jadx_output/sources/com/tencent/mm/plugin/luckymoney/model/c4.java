package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class c4 implements com.tencent.mars.cdn.CdnManager.DownloadCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f145208d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f145209e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f145210f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f145211g;

    public c4(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f145208d = j17;
        this.f145209e = str;
        this.f145210f = str2;
        this.f145211g = str3;
    }

    @Override // com.tencent.mars.cdn.CdnManager.DownloadCallback
    public void onC2CDownloadCompleted(java.lang.String str, com.tencent.mars.cdn.CdnManager.C2CDownloadResult c2CDownloadResult) {
        com.tencent.mars.cdn.CdnManager.CronetTaskResult cronetTaskResult;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeResUpdateListener", "pag resource download end , cost：%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f145208d));
        if (c2CDownloadResult != null && (cronetTaskResult = c2CDownloadResult.cronetTaskResult) != null && cronetTaskResult.performance != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeResUpdateListener", "pag resource download end, fileId:%s, statusCode:%d, profile:%s", this.f145209e, java.lang.Integer.valueOf(cronetTaskResult.statusCode), c2CDownloadResult.cronetTaskResult.performance);
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(c2CDownloadResult.errorCode);
        java.lang.String str2 = this.f145211g;
        java.lang.String str3 = this.f145210f;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeResUpdateListener", "pag resource download result.errorCode ：%s， tempFilePath ：%s , md5：%s , file downaload md5:%s ", valueOf, str3, str2, com.tencent.mm.vfs.w6.p(str3));
        int i17 = c2CDownloadResult.errorCode;
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeResUpdateListener", "pag resource download failed:%s", java.lang.Integer.valueOf(i17));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(991, 28);
        } else if (!com.tencent.mm.vfs.w6.j(str3)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeResUpdateListener", "pag resource download File fail:%s", str3);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(991, 28);
        } else if (com.tencent.mm.plugin.luckymoney.model.e5.i(str3, com.tencent.mm.plugin.luckymoney.model.e5.e())) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(991, 29);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(991, 30);
        }
    }

    @Override // com.tencent.mars.cdn.CdnManager.DownloadCallback
    public void onDownloadProgressChanged(java.lang.String str, long j17, long j18, boolean z17) {
    }
}
