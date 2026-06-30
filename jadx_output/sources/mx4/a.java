package mx4;

/* loaded from: classes7.dex */
public final class a implements com.tencent.mars.cdn.CronetLogic.CronetTaskCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.k f332632a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f332633b;

    public a(nw4.k kVar, nw4.y2 y2Var) {
        this.f332632a = kVar;
        this.f332633b = y2Var;
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onCronetReceiveChunkedData(com.tencent.mars.cdn.CronetLogic.ChunkedData chunkedData, long j17) {
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public int onCronetReceiveHeader(com.tencent.mars.cdn.CronetLogic.ResponseHeader responseHeader, int i17, java.lang.String str) {
        return 0;
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onCronetReceiveUploadProgress(long j17, long j18) {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onCronetTaskCompleted(java.lang.String str, com.tencent.mars.cdn.CronetLogic.CronetTaskResult cronetTaskResult, java.lang.String str2) {
        boolean z17 = false;
        if (cronetTaskResult != null && cronetTaskResult.errorCode == 0) {
            z17 = true;
        }
        nw4.y2 y2Var = this.f332633b;
        nw4.k kVar = this.f332632a;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MagicLiveCardDevTools.JsApiHandleDynamicCardDebugAction", "download debugPkgPath success!");
            kVar.f340863d.e(y2Var.f341013c, "handleDynamicCardDebugAction:ok", null);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("download debugPkgPath fail errCode:");
        sb6.append(cronetTaskResult != null ? java.lang.Integer.valueOf(cronetTaskResult.errorCode) : null);
        sb6.append('!');
        com.tencent.mars.xlog.Log.e("MagicLiveCardDevTools.JsApiHandleDynamicCardDebugAction", sb6.toString());
        kVar.f340863d.e(y2Var.f341013c, "handleDynamicCardDebugAction:fail", null);
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onDownloadProgressChanged(java.lang.String str, com.tencent.mars.cdn.CronetLogic.CronetDownloadProgress cronetDownloadProgress) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDownloadProgressChanged fileKey:");
        sb6.append(str);
        sb6.append(" currentWriteBytes:");
        sb6.append(cronetDownloadProgress != null ? java.lang.Long.valueOf(cronetDownloadProgress.currentWriteByte) : null);
        sb6.append(" totalBytes:");
        sb6.append(cronetDownloadProgress != null ? java.lang.Long.valueOf(cronetDownloadProgress.totalByte) : null);
        com.tencent.mars.xlog.Log.i("MagicLiveCardDevTools.JsApiHandleDynamicCardDebugAction", sb6.toString());
    }
}
