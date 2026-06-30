package zv4;

/* loaded from: classes8.dex */
public final class e implements com.tencent.mars.cdn.CdnManager.UploadCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f476459d;

    public e(kotlinx.coroutines.q qVar) {
        this.f476459d = qVar;
    }

    @Override // com.tencent.mars.cdn.CdnManager.UploadCallback
    public void onC2CUploadCompleted(java.lang.String str, com.tencent.mars.cdn.CdnManager.C2CUploadResult c2CUploadResult) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onC2CUploadCompleted filekey ");
        sb6.append(str);
        sb6.append(" error ");
        sb6.append(c2CUploadResult != null ? java.lang.Integer.valueOf(c2CUploadResult.errorCode) : null);
        sb6.append(" url ");
        sb6.append(c2CUploadResult != null ? c2CUploadResult.fileUrl : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSImageRecognizeUploader", sb6.toString());
        boolean z17 = false;
        if (c2CUploadResult != null && c2CUploadResult.errorCode == 0) {
            z17 = true;
        }
        kotlinx.coroutines.q qVar = this.f476459d;
        if (!z17 || com.tencent.mm.sdk.platformtools.t8.K0(c2CUploadResult.fileid) || com.tencent.mm.sdk.platformtools.t8.K0(c2CUploadResult.aeskey)) {
            qVar.resumeWith(kotlin.Result.m521constructorimpl(null));
        } else {
            qVar.resumeWith(kotlin.Result.m521constructorimpl(kz5.c1.k(new jz5.l("dataType", 4), new jz5.l("aesKey", c2CUploadResult.aeskey), new jz5.l("fileId", c2CUploadResult.fileid))));
        }
    }

    @Override // com.tencent.mars.cdn.CdnManager.UploadCallback
    public void onUploadProgressChanged(java.lang.String str, long j17, long j18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSImageRecognizeUploader", "onC2CUploadCompleted filekey " + str + " finished " + j17 + " total " + j18);
    }
}
