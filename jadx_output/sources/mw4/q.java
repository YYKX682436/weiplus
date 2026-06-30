package mw4;

/* loaded from: classes7.dex */
public final class q implements com.tencent.mars.cdn.CronetLogic.CronetTaskCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f331788a;

    public q(yz5.l lVar) {
        this.f331788a = lVar;
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onCronetReceiveChunkedData(com.tencent.mars.cdn.CronetLogic.ChunkedData chunkedData, long j17) {
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public int onCronetReceiveHeader(com.tencent.mars.cdn.CronetLogic.ResponseHeader responseHeader, int i17, java.lang.String protocol) {
        com.tencent.mars.cdn.CronetLogic.HeaderMap[] headerMapArr;
        kotlin.jvm.internal.o.g(protocol, "protocol");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCronetReceiveHeader: ");
        sb6.append((responseHeader == null || (headerMapArr = responseHeader.headers) == null) ? null : kz5.z.d0(headerMapArr, ", ", null, null, 0, null, null, 62, null));
        com.tencent.mars.xlog.Log.i("MicroMsg.BizMpVideoInterceptor", sb6.toString());
        return 0;
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onCronetReceiveUploadProgress(long j17, long j18) {
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onCronetTaskCompleted(java.lang.String str, com.tencent.mars.cdn.CronetLogic.CronetTaskResult cronetTaskResult, java.lang.String protocol) {
        com.tencent.mars.cdn.CronetLogic.HeaderMap[] headerMapArr;
        kotlin.jvm.internal.o.g(protocol, "protocol");
        this.f331788a.invoke(cronetTaskResult);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCronetTaskCompleted: ");
        sb6.append((cronetTaskResult == null || (headerMapArr = cronetTaskResult.headers) == null) ? null : kz5.z.d0(headerMapArr, ", ", null, null, 0, null, null, 62, null));
        com.tencent.mars.xlog.Log.i("MicroMsg.BizMpVideoInterceptor", sb6.toString());
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onDownloadProgressChanged(java.lang.String str, com.tencent.mars.cdn.CronetLogic.CronetDownloadProgress cronetDownloadProgress) {
    }
}
