package ol0;

/* loaded from: classes7.dex */
public class a implements com.tencent.mars.cdn.CronetLogic.CronetTaskCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.network.j2 f346119a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ol0.b f346120b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f346121c;

    public a(com.tencent.mm.network.j2 j2Var, ol0.b bVar, java.lang.String str) {
        this.f346119a = j2Var;
        this.f346120b = bVar;
        this.f346121c = str;
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
        this.f346119a.getClass();
        com.tencent.mars.xlog.Log.i("KaraModelDownloadHelper", "downloadUrl onCronetTaskCompleted statusCode: %s", java.lang.Integer.valueOf(cronetTaskResult.statusCode));
        int i17 = cronetTaskResult.statusCode;
        ol0.b bVar = this.f346120b;
        if (i17 != 200) {
            bVar.a();
        } else {
            bVar.b(this.f346121c);
        }
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onDownloadProgressChanged(java.lang.String str, com.tencent.mars.cdn.CronetLogic.CronetDownloadProgress cronetDownloadProgress) {
    }
}
