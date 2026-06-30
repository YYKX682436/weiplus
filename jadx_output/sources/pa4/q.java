package pa4;

/* loaded from: classes4.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f353064d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pa4.s f353065e;

    public q(int i17, pa4.s sVar) {
        this.f353064d = i17;
        this.f353065e = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload$onErrorServer$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("snsUpload sight by cdn error code: ");
        int i17 = this.f353064d;
        sb6.append(i17);
        sb6.append("  thread: ");
        sb6.append(java.lang.Thread.currentThread().getName());
        com.tencent.mars.xlog.Log.e("MicroMsg.SnsLivePhotoVideoUpload", sb6.toString());
        com.tencent.mm.plugin.sns.storage.m2 Hj = com.tencent.mm.plugin.sns.model.l4.Hj();
        pa4.s sVar = this.f353065e;
        com.tencent.mm.plugin.sns.storage.l2 n17 = Hj.n1(pa4.s.c(sVar));
        try {
            pa4.s.b(sVar).f380570n = 1;
            pa4.s.b(sVar).f380575s = i17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getUploadInfo$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
            r45.mj4 mj4Var = sVar.f353073b;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getUploadInfo$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
            n17.m(mj4Var.toByteArray());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsLivePhotoVideoUpload", "onErrorServer >> " + e17.getMessage());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getCallback$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getCallback$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
        ((pa4.i) sVar.f353076e).a(false, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload$onErrorServer$1");
    }
}
