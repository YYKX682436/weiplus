package x03;

/* loaded from: classes15.dex */
public final class w1 implements com.tencent.mars.cdn.CdnManager.DownloadCallback {

    /* renamed from: d, reason: collision with root package name */
    public final x03.j f451156d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f451157e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f451158f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f451159g;

    public w1(x03.j cdnService, java.lang.String tempSavePath, java.lang.String finalSavePath) {
        kotlin.jvm.internal.o.g(cdnService, "cdnService");
        kotlin.jvm.internal.o.g(tempSavePath, "tempSavePath");
        kotlin.jvm.internal.o.g(finalSavePath, "finalSavePath");
        this.f451156d = cdnService;
        this.f451157e = tempSavePath;
        this.f451158f = finalSavePath;
        this.f451159g = "MicroMsg.FlutterCdnService";
    }

    @Override // com.tencent.mars.cdn.CdnManager.DownloadCallback
    public void onC2CDownloadCompleted(java.lang.String str, com.tencent.mars.cdn.CdnManager.C2CDownloadResult c2CDownloadResult) {
        boolean z17 = false;
        if (c2CDownloadResult != null && c2CDownloadResult.errorCode == 0) {
            z17 = true;
        }
        if (z17) {
            java.lang.String str2 = this.f451159g;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("PreviewMetaCallback.onC2CDownloadCompleted success mediaId:");
            sb6.append(str);
            sb6.append(" fileId: ");
            sb6.append(c2CDownloadResult != null ? c2CDownloadResult.fileid : null);
            com.tencent.mars.xlog.Log.i(str2, sb6.toString());
        } else {
            java.lang.String str3 = this.f451159g;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("PreviewMetaCallback.onC2CDownloadCompleted error mediaId:");
            sb7.append(str);
            sb7.append(" result: ");
            sb7.append(c2CDownloadResult != null ? java.lang.Integer.valueOf(c2CDownloadResult.errorCode) : null);
            sb7.append(" fileId: ");
            sb7.append(c2CDownloadResult != null ? c2CDownloadResult.fileid : null);
            com.tencent.mars.xlog.Log.e(str3, sb7.toString());
        }
        ((ku5.t0) ku5.t0.f312615d).q(new x03.v1(this, str));
    }

    @Override // com.tencent.mars.cdn.CdnManager.DownloadCallback
    public void onDownloadProgressChanged(java.lang.String str, long j17, long j18, boolean z17) {
        this.f451156d.onDownloadProgressChanged(str, j17, j18, z17);
    }
}
