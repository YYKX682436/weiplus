package q10;

/* loaded from: classes7.dex */
public final class j implements com.tencent.mars.cdn.CronetLogic.CronetTaskCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f359515a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f359516b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f359517c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f359518d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f359519e;

    public j(long j17, kotlin.jvm.internal.c0 c0Var, java.lang.String str, java.lang.String str2, kotlinx.coroutines.q qVar) {
        this.f359515a = j17;
        this.f359516b = c0Var;
        this.f359517c = str;
        this.f359518d = str2;
        this.f359519e = qVar;
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onCronetReceiveChunkedData(com.tencent.mars.cdn.CronetLogic.ChunkedData chunkedData, long j17) {
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public int onCronetReceiveHeader(com.tencent.mars.cdn.CronetLogic.ResponseHeader header, int i17, java.lang.String str) {
        kotlin.jvm.internal.o.g(header, "header");
        com.tencent.mars.xlog.Log.i("MicroMsg.MBProfileUtil", "uploadFile onCronetReceiveHeader: statusCode=" + i17 + ", protocol=" + str + ", elapsed=" + (java.lang.System.currentTimeMillis() - this.f359515a) + "ms");
        return 0;
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onCronetReceiveUploadProgress(long j17, long j18) {
        if (j18 > 0) {
            long j19 = (j17 * 100) / j18;
        }
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onCronetTaskCompleted(java.lang.String str, com.tencent.mars.cdn.CronetLogic.CronetTaskResult cronetTaskResult, java.lang.String str2) {
        java.lang.String str3;
        kotlin.jvm.internal.c0 c0Var = this.f359516b;
        if (c0Var.f310112d) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MBProfileUtil", "uploadFile already callback");
            return;
        }
        c0Var.f310112d = true;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f359515a;
        java.lang.String str4 = this.f359518d;
        java.lang.String str5 = this.f359517c;
        kotlinx.coroutines.q qVar = this.f359519e;
        if (cronetTaskResult == null) {
            q10.k.a(q10.k.f359520a, "Upload Error:\nFile: " + str5 + "\nURL: " + str4 + "\nError: Result is null\nElapsed Time: " + currentTimeMillis + "ms");
            com.tencent.mars.xlog.Log.e("MicroMsg.MBProfileUtil", "uploadFile failed: result is null");
            qVar.resumeWith(kotlin.Result.m521constructorimpl(""));
            return;
        }
        if (cronetTaskResult.errorCode != 0) {
            q10.k.a(q10.k.f359520a, "Upload Error:\nFile: " + str5 + "\nURL: " + str4 + "\nProtocol: " + str2 + "\nError Code: " + cronetTaskResult.errorCode + "\nError Message: " + cronetTaskResult.errorMsg + "\nElapsed Time: " + currentTimeMillis + "ms");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("uploadFile failed: errorCode=");
            sb6.append(cronetTaskResult.errorCode);
            sb6.append(", errorMsg=");
            sb6.append(cronetTaskResult.errorMsg);
            com.tencent.mars.xlog.Log.e("MicroMsg.MBProfileUtil", sb6.toString());
            qVar.resumeWith(kotlin.Result.m521constructorimpl(""));
            return;
        }
        byte[] bArr = cronetTaskResult.data;
        if (bArr != null) {
            java.nio.charset.Charset forName = java.nio.charset.Charset.forName(com.tencent.mapsdk.internal.rv.f51270c);
            kotlin.jvm.internal.o.f(forName, "forName(...)");
            str3 = new java.lang.String(bArr, forName);
        } else {
            str3 = "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MBProfileUtil", "uploadFile success: statusCode=" + cronetTaskResult.statusCode + ", response=" + str3 + ", elapsedTime=" + currentTimeMillis + "ms");
        try {
            qVar.resumeWith(kotlin.Result.m521constructorimpl(new org.json.JSONObject(str3).optString("jobUrl")));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MBProfileUtil", "uploadFile parse response failed: " + e17.getMessage());
            qVar.resumeWith(kotlin.Result.m521constructorimpl(""));
        }
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onDownloadProgressChanged(java.lang.String str, com.tencent.mars.cdn.CronetLogic.CronetDownloadProgress cronetDownloadProgress) {
    }
}
