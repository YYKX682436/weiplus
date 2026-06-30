package zy3;

/* loaded from: classes7.dex */
public final class g implements com.tencent.mars.cdn.CronetLogic.CronetTaskCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zy3.h f477650a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f477651b;

    public g(zy3.h hVar, long j17) {
        this.f477650a = hVar;
        this.f477651b = j17;
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
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onCronetTaskCompleted(java.lang.String str, com.tencent.mars.cdn.CronetLogic.CronetTaskResult cronetTaskResult, java.lang.String str2) {
        zy3.h hVar = this.f477650a;
        if (cronetTaskResult == null) {
            com.tencent.mars.xlog.Log.e(hVar.f477652a, "result is null");
            zy3.f fVar = hVar.f477653b;
            return;
        }
        com.tencent.mars.xlog.Log.i(hVar.f477652a, "cronet onCronetTaskCompleted errorCode:%d,errorMsg:%s,statusCode:%d", java.lang.Integer.valueOf(cronetTaskResult.errorCode), cronetTaskResult.errorMsg, java.lang.Integer.valueOf(cronetTaskResult.statusCode));
        if (cronetTaskResult.errorCode != 0) {
            zy3.f fVar2 = hVar.f477653b;
            return;
        }
        org.json.JSONObject e17 = uh1.j0.e(cronetTaskResult.getHeaderMapList(), 2);
        int i17 = cronetTaskResult.statusCode;
        if (i17 != 200) {
            java.lang.String str3 = "cronet failed codoe: " + i17 + ",url: " + hVar.f477654c.url;
            com.tencent.mars.xlog.Log.e(hVar.f477652a, str3);
            zy3.f fVar3 = hVar.f477653b;
            if (fVar3 != null) {
                ((zy3.i) fVar3).a("fail", str3, i17, e17, null, null);
                return;
            }
            return;
        }
        java.lang.String dataString = cronetTaskResult.getDataString();
        com.tencent.mars.xlog.Log.i("cronet request time", "request time is " + (java.lang.System.currentTimeMillis() - this.f477651b));
        zy3.f fVar4 = hVar.f477653b;
        if (fVar4 != null) {
            ((zy3.i) fVar4).a("ok", dataString, cronetTaskResult.statusCode, e17, null, null);
        }
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onDownloadProgressChanged(java.lang.String str, com.tencent.mars.cdn.CronetLogic.CronetDownloadProgress cronetDownloadProgress) {
    }
}
