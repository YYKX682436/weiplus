package pa4;

/* loaded from: classes4.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pa4.s f353066d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f353067e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f353068f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f353069g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f353070h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f353071i;

    public r(pa4.s sVar, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, int i18) {
        this.f353066d = sVar;
        this.f353067e = str;
        this.f353068f = str2;
        this.f353069g = i17;
        this.f353070h = str3;
        this.f353071i = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload$onPostScene$1");
        com.tencent.mm.plugin.sns.storage.m2 Hj = com.tencent.mm.plugin.sns.model.l4.Hj();
        pa4.s sVar = this.f353066d;
        com.tencent.mm.plugin.sns.storage.l2 n17 = Hj.n1(pa4.s.c(sVar));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("upload ok ");
        java.lang.String str = this.f353067e;
        sb6.append(str);
        sb6.append("  ");
        sb6.append(this.f353068f);
        sb6.append("  ");
        int i17 = this.f353069g;
        sb6.append(i17);
        sb6.append(" thread: ");
        sb6.append(java.lang.Thread.currentThread().getName());
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsLivePhotoVideoUpload", sb6.toString());
        r45.cj4 cj4Var = new r45.cj4();
        cj4Var.f371596e = i17;
        cj4Var.f371595d = str;
        pa4.s.b(sVar).f380566g = cj4Var;
        pa4.s.b(sVar).f380570n = 0;
        r45.mj4 b17 = pa4.s.b(sVar);
        sx.a0 a0Var = (sx.a0) i95.n0.c(sx.a0.class);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getVideoPath$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getVideoPath$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
        b17.A = ((rx.a) a0Var).Di(sVar.f353080i);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsLivePhotoVideoUpload", "onPostScene videoMd5 %s", pa4.s.b(sVar).A);
        java.lang.String str2 = this.f353070h;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            r45.cj4 cj4Var2 = new r45.cj4();
            cj4Var2.f371596e = this.f353071i;
            cj4Var2.f371595d = str2;
            pa4.s.b(sVar).f380568i.add(cj4Var2);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getUploadInfo$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getUploadInfo$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
        r45.mj4 b18 = pa4.s.b(sVar);
        r45.mj4 mj4Var = sVar.f353073b;
        mj4Var.D = b18;
        try {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getUploadInfo$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getUploadInfo$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
            n17.m(mj4Var.toByteArray());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsLivePhotoVideoUpload", e17, "", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getCallback$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getCallback$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
        ((pa4.i) sVar.f353076e).a(true, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload$onPostScene$1");
    }
}
