package wz2;

/* loaded from: classes7.dex */
public final class b implements com.tencent.mars.cdn.CronetLogic.CronetTaskCallback {
    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onCronetReceiveChunkedData(com.tencent.mars.cdn.CronetLogic.ChunkedData data, long j17) {
        kotlin.jvm.internal.o.g(data, "data");
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public int onCronetReceiveHeader(com.tencent.mars.cdn.CronetLogic.ResponseHeader header, int i17, java.lang.String protocol) {
        kotlin.jvm.internal.o.g(header, "header");
        kotlin.jvm.internal.o.g(protocol, "protocol");
        return 0;
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onCronetReceiveUploadProgress(long j17, long j18) {
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onCronetTaskCompleted(java.lang.String filekey, com.tencent.mars.cdn.CronetLogic.CronetTaskResult result, java.lang.String protocol) {
        kotlin.jvm.internal.o.g(filekey, "filekey");
        kotlin.jvm.internal.o.g(result, "result");
        kotlin.jvm.internal.o.g(protocol, "protocol");
        com.tencent.mars.xlog.Log.i("FaceUtilNew", "reportTimeCostByHttp completed: %s", result.toString());
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onDownloadProgressChanged(java.lang.String filekey, com.tencent.mars.cdn.CronetLogic.CronetDownloadProgress progress) {
        kotlin.jvm.internal.o.g(filekey, "filekey");
        kotlin.jvm.internal.o.g(progress, "progress");
    }
}
