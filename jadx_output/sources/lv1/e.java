package lv1;

/* loaded from: classes7.dex */
public class e implements com.tencent.mars.cdn.CronetLogic.CronetTaskCallback {

    /* renamed from: a, reason: collision with root package name */
    public final dn.k f321494a;

    public e(dn.k kVar) {
        this.f321494a = kVar;
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
        dn.h hVar = new dn.h();
        hVar.field_retCode = cronetTaskResult.errorCode;
        this.f321494a.r4((java.lang.String) ((java.util.HashMap) com.tencent.mm.plugin.cdndownloader.service.CDNDownloadServiceSlot.f95517f).get(str), 0, null, hVar, false);
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onDownloadProgressChanged(java.lang.String str, com.tencent.mars.cdn.CronetLogic.CronetDownloadProgress cronetDownloadProgress) {
        dn.g gVar = new dn.g();
        gVar.field_finishedLength = cronetDownloadProgress.currentWriteByte;
        gVar.field_toltalLength = cronetDownloadProgress.totalByte;
        this.f321494a.r4((java.lang.String) ((java.util.HashMap) com.tencent.mm.plugin.cdndownloader.service.CDNDownloadServiceSlot.f95517f).get(str), 0, gVar, null, false);
    }
}
