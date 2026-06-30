package ha3;

/* loaded from: classes15.dex */
public final class o0 implements com.tencent.mars.cdn.CdnManager.DownloadCallback {

    /* renamed from: d, reason: collision with root package name */
    public final ha3.i0 f279910d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f279911e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f279912f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f279913g;

    public o0(ha3.i0 cdnService, java.lang.String tempSavePath, java.lang.String finalSavePath) {
        kotlin.jvm.internal.o.g(cdnService, "cdnService");
        kotlin.jvm.internal.o.g(tempSavePath, "tempSavePath");
        kotlin.jvm.internal.o.g(finalSavePath, "finalSavePath");
        this.f279910d = cdnService;
        this.f279911e = tempSavePath;
        this.f279912f = finalSavePath;
        this.f279913g = "MicroMsg.FlutterCdnService";
    }

    @Override // com.tencent.mars.cdn.CdnManager.DownloadCallback
    public void onC2CDownloadCompleted(java.lang.String str, com.tencent.mars.cdn.CdnManager.C2CDownloadResult c2CDownloadResult) {
        boolean z17 = false;
        if (c2CDownloadResult != null && c2CDownloadResult.errorCode == 0) {
            z17 = true;
        }
        if (z17) {
            java.lang.String str2 = this.f279913g;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("PreviewMetaCallback.onC2CDownloadCompleted success mediaId:");
            sb6.append(str);
            sb6.append(" fileId: ");
            sb6.append(c2CDownloadResult != null ? c2CDownloadResult.fileid : null);
            com.tencent.mars.xlog.Log.i(str2, sb6.toString());
        } else {
            java.lang.String str3 = this.f279913g;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("PreviewMetaCallback.onC2CDownloadCompleted error mediaId:");
            sb7.append(str);
            sb7.append(" result: ");
            sb7.append(c2CDownloadResult != null ? java.lang.Integer.valueOf(c2CDownloadResult.errorCode) : null);
            sb7.append(" fileId: ");
            sb7.append(c2CDownloadResult != null ? c2CDownloadResult.fileid : null);
            com.tencent.mars.xlog.Log.e(str3, sb7.toString());
        }
        ((ku5.t0) ku5.t0.f312615d).q(new ha3.n0(this, str));
    }

    @Override // com.tencent.mars.cdn.CdnManager.DownloadCallback
    public void onDownloadProgressChanged(java.lang.String str, long j17, long j18, boolean z17) {
        this.f279910d.onDownloadProgressChanged(str, j17, j18, z17);
    }
}
