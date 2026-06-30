package zm;

/* loaded from: classes7.dex */
public class a implements com.tencent.mars.cdn.CronetLogic.CronetTaskCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.network.j2 f474088a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zm.b f474089b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f474090c;

    public a(com.tencent.mm.network.j2 j2Var, zm.b bVar, java.lang.String str) {
        this.f474088a = j2Var;
        this.f474089b = bVar;
        this.f474090c = str;
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

    /* JADX WARN: Removed duplicated region for block: B:19:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCronetTaskCompleted(java.lang.String r19, com.tencent.mars.cdn.CronetLogic.CronetTaskResult r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zm.a.onCronetTaskCompleted(java.lang.String, com.tencent.mars.cdn.CronetLogic$CronetTaskResult, java.lang.String):void");
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onDownloadProgressChanged(java.lang.String str, com.tencent.mars.cdn.CronetLogic.CronetDownloadProgress cronetDownloadProgress) {
    }
}
