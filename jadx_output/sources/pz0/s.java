package pz0;

/* loaded from: classes5.dex */
public final class s implements com.tencent.mars.cdn.CdnManager.DownloadCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.bl6 f359166d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f359167e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.r6 f359168f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f359169g;

    public s(r45.bl6 bl6Var, java.lang.String str, com.tencent.mm.vfs.r6 r6Var, kotlin.coroutines.Continuation continuation) {
        this.f359166d = bl6Var;
        this.f359167e = str;
        this.f359168f = r6Var;
        this.f359169g = continuation;
    }

    @Override // com.tencent.mars.cdn.CdnManager.DownloadCallback
    public void onC2CDownloadCompleted(java.lang.String str, com.tencent.mars.cdn.CdnManager.C2CDownloadResult c2CDownloadResult) {
        r45.bl6 bl6Var = this.f359166d;
        boolean b17 = kotlin.jvm.internal.o.b(str, bl6Var.f370860f);
        kotlin.coroutines.Continuation continuation = this.f359169g;
        java.lang.String str2 = this.f359167e;
        if (b17) {
            boolean z17 = false;
            if (c2CDownloadResult != null && c2CDownloadResult.errorCode == 0) {
                z17 = true;
            }
            if (z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Maas.MusicVideoResManager", "onC2CDownloadCompleted: " + bl6Var.f370860f + " download successful at " + str2 + ", size: " + this.f359168f.C());
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                continuation.resumeWith(kotlin.Result.m521constructorimpl(str2));
                return;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onC2CDownloadCompleted: resource ");
        sb6.append(bl6Var.f370860f);
        sb6.append(" download error error code: ");
        sb6.append(c2CDownloadResult != null ? java.lang.Integer.valueOf(c2CDownloadResult.errorCode) : null);
        com.tencent.mars.xlog.Log.e("MicroMsg.Maas.MusicVideoResManager", sb6.toString());
        com.tencent.mm.vfs.w6.h(str2);
        continuation.resumeWith(kotlin.Result.m521constructorimpl(null));
    }

    @Override // com.tencent.mars.cdn.CdnManager.DownloadCallback
    public void onDownloadProgressChanged(java.lang.String str, long j17, long j18, boolean z17) {
    }
}
