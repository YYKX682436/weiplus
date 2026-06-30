package hw4;

/* loaded from: classes7.dex */
public final class b implements com.tencent.mars.cdn.CronetLogic.CronetTaskCallback {

    /* renamed from: a, reason: collision with root package name */
    public boolean f285587a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hw4.a f285588b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.network.j2 f285589c;

    public b(hw4.a aVar, com.tencent.mm.network.j2 j2Var) {
        this.f285588b = aVar;
        this.f285589c = j2Var;
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onCronetReceiveChunkedData(com.tencent.mars.cdn.CronetLogic.ChunkedData chunkedData, long j17) {
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public int onCronetReceiveHeader(com.tencent.mars.cdn.CronetLogic.ResponseHeader responseHeader, int i17, java.lang.String str) {
        if (this.f285587a) {
            return 0;
        }
        this.f285587a = true;
        return this.f285588b.a(this.f285589c, responseHeader, i17, str);
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onCronetReceiveUploadProgress(long j17, long j18) {
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onCronetTaskCompleted(java.lang.String str, com.tencent.mars.cdn.CronetLogic.CronetTaskResult cronetTaskResult, java.lang.String str2) {
        this.f285588b.c(this.f285589c, str, cronetTaskResult, str2);
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onDownloadProgressChanged(java.lang.String str, com.tencent.mars.cdn.CronetLogic.CronetDownloadProgress cronetDownloadProgress) {
        this.f285588b.b(this.f285589c, str, cronetDownloadProgress);
    }
}
