package rg1;

/* loaded from: classes7.dex */
public final class q implements com.tencent.mars.cdn.CronetLogic.CronetTaskCallback {

    /* renamed from: a, reason: collision with root package name */
    public boolean f395229a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rg1.o f395230b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.network.j2 f395231c;

    public q(rg1.o oVar, com.tencent.mm.network.j2 j2Var) {
        this.f395230b = oVar;
        this.f395231c = j2Var;
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onCronetReceiveChunkedData(com.tencent.mars.cdn.CronetLogic.ChunkedData chunkedData, long j17) {
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public int onCronetReceiveHeader(com.tencent.mars.cdn.CronetLogic.ResponseHeader responseHeader, int i17, java.lang.String str) {
        if (this.f395229a) {
            return 0;
        }
        this.f395229a = true;
        ((rg1.p) this.f395230b).getClass();
        com.tencent.mm.network.j2 connection = this.f395231c;
        kotlin.jvm.internal.o.g(connection, "connection");
        return 0;
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onCronetReceiveUploadProgress(long j17, long j18) {
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onCronetTaskCompleted(java.lang.String str, com.tencent.mars.cdn.CronetLogic.CronetTaskResult cronetTaskResult, java.lang.String str2) {
        rg1.p pVar = (rg1.p) this.f395230b;
        pVar.getClass();
        com.tencent.mm.network.j2 connection = this.f395231c;
        kotlin.jvm.internal.o.g(connection, "connection");
        int i17 = cronetTaskResult != null ? cronetTaskResult.statusCode : 0;
        kotlinx.coroutines.q qVar = pVar.f395227a;
        if (i17 != 200) {
            ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(null));
        } else {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(pVar.f395228b.o()));
        }
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onDownloadProgressChanged(java.lang.String str, com.tencent.mars.cdn.CronetLogic.CronetDownloadProgress cronetDownloadProgress) {
    }
}
