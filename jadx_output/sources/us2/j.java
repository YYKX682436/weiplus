package us2;

/* loaded from: classes5.dex */
public final class j implements com.tencent.mars.cdn.CdnManager.DownloadCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vt3.p f430494d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f430495e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f430496f;

    public j(vt3.p pVar, kotlinx.coroutines.q qVar, java.lang.String str) {
        this.f430494d = pVar;
        this.f430495e = qVar;
        this.f430496f = str;
    }

    @Override // com.tencent.mars.cdn.CdnManager.DownloadCallback
    public void onC2CDownloadCompleted(java.lang.String str, com.tencent.mars.cdn.CdnManager.C2CDownloadResult c2CDownloadResult) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onC2CDownloadCompleted] templateId:");
        vt3.p pVar = this.f430494d;
        sb6.append(pVar.f440020b);
        sb6.append(" errorCode:");
        sb6.append(c2CDownloadResult != null ? java.lang.Integer.valueOf(c2CDownloadResult.errorCode) : null);
        com.tencent.mars.xlog.Log.i("ShootComposingTemplateManager", sb6.toString());
        boolean z17 = c2CDownloadResult != null && c2CDownloadResult.errorCode == 0;
        kotlinx.coroutines.q qVar = this.f430495e;
        if (!z17) {
            us2.u uVar = us2.u.f430548a;
            ((yy0.o7) ((pp0.m0) i95.n0.c(pp0.m0.class))).Di("mjpublisher_sc_download_template", pVar.f440020b, "Error", kz5.b1.e(new jz5.l(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE, java.lang.Integer.valueOf(c2CDownloadResult != null ? c2CDownloadResult.errorCode : 0))));
            ((kotlinx.coroutines.r) qVar).s(null, null);
            return;
        }
        us2.u uVar2 = us2.u.f430548a;
        java.lang.String str2 = pVar.f440020b;
        pp0.m0 m0Var = (pp0.m0) i95.n0.c(pp0.m0.class);
        kotlin.jvm.internal.o.d(m0Var);
        pp0.m0.ee(m0Var, "mjpublisher_sc_download_template", str2, "Completed", null, 8, null);
        ((kotlinx.coroutines.r) qVar).s(this.f430496f, null);
    }

    @Override // com.tencent.mars.cdn.CdnManager.DownloadCallback
    public void onDownloadProgressChanged(java.lang.String str, long j17, long j18, boolean z17) {
    }
}
