package pa4;

/* loaded from: classes4.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f353017d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pa4.e f353018e;

    public c(int i17, pa4.e eVar) {
        this.f353017d = i17;
        this.f353018e = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pa4.e eVar = this.f353018e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload$onErrorServer$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onErrorServer >> errCode: ");
        int i17 = this.f353017d;
        sb6.append(i17);
        sb6.append(" thread: ");
        sb6.append(java.lang.Thread.currentThread().getName());
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsLivePhotoImgUpload", sb6.toString());
        try {
            pa4.e.K(eVar).f380570n = 1;
            pa4.e.K(eVar).f380575s = i17;
            pa4.e.J(eVar).m(pa4.e.K(eVar).toByteArray());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsLivePhotoImgUpload", "onErrorServer >> " + e17.getMessage());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getUploadCallback$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        pa4.m mVar = eVar.f353028f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getUploadCallback$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        ((pa4.i) mVar).a(false, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload$onErrorServer$1");
    }
}
