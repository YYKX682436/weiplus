package x03;

/* loaded from: classes15.dex */
public final class y1 implements com.tencent.mars.cdn.CdnManager.DownloadCallback {

    /* renamed from: d, reason: collision with root package name */
    public final x03.j f451170d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f451171e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f451172f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f451173g;

    /* renamed from: h, reason: collision with root package name */
    public final long f451174h;

    public y1(x03.j cdnService, java.lang.String tempSavePath, java.lang.String finalSavePath) {
        kotlin.jvm.internal.o.g(cdnService, "cdnService");
        kotlin.jvm.internal.o.g(tempSavePath, "tempSavePath");
        kotlin.jvm.internal.o.g(finalSavePath, "finalSavePath");
        this.f451170d = cdnService;
        this.f451171e = tempSavePath;
        this.f451172f = finalSavePath;
        this.f451173g = "MicroMsg.FlutterCdnService";
        this.f451174h = java.lang.System.currentTimeMillis();
    }

    @Override // com.tencent.mars.cdn.CdnManager.DownloadCallback
    public void onC2CDownloadCompleted(java.lang.String str, com.tencent.mars.cdn.CdnManager.C2CDownloadResult c2CDownloadResult) {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f451174h;
        java.lang.Long valueOf = c2CDownloadResult != null ? java.lang.Long.valueOf(c2CDownloadResult.fileSize) : null;
        boolean z17 = false;
        if (c2CDownloadResult != null && c2CDownloadResult.errorCode == 0) {
            z17 = true;
        }
        if (z17) {
            java.lang.String str2 = this.f451173g;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("PreviewSegmentCallback.onC2CDownloadCompleted success.mediaId:");
            sb6.append(str);
            sb6.append(" fileSize: ");
            sb6.append(valueOf);
            sb6.append(" costTime: ");
            sb6.append(currentTimeMillis);
            sb6.append(" fileId: ");
            sb6.append(c2CDownloadResult != null ? c2CDownloadResult.fileid : null);
            com.tencent.mars.xlog.Log.i(str2, sb6.toString());
        } else {
            java.lang.String str3 = this.f451173g;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("PreviewSegmentCallback.onC2CDownloadCompleted error. mediaId:");
            sb7.append(str);
            sb7.append(" fileSize: ");
            sb7.append(valueOf);
            sb7.append(" costTime: ");
            sb7.append(currentTimeMillis);
            sb7.append(" resultCode: ");
            sb7.append(c2CDownloadResult != null ? java.lang.Integer.valueOf(c2CDownloadResult.errorCode) : null);
            sb7.append(" fileId: ");
            sb7.append(c2CDownloadResult != null ? c2CDownloadResult.fileid : null);
            com.tencent.mars.xlog.Log.e(str3, sb7.toString());
        }
        ((ku5.t0) ku5.t0.f312615d).q(new x03.x1(this, str, c2CDownloadResult));
    }

    @Override // com.tencent.mars.cdn.CdnManager.DownloadCallback
    public void onDownloadProgressChanged(java.lang.String str, long j17, long j18, boolean z17) {
        this.f451170d.onDownloadProgressChanged(str, j17, j18, z17);
    }
}
