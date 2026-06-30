package pa4;

/* loaded from: classes4.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pa4.e f353016d;

    public b(pa4.e eVar) {
        this.f353016d = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pa4.e eVar = this.f353016d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload$onError$1");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsLivePhotoImgUpload", "onErrorServer >> onError thread: " + java.lang.Thread.currentThread().getName());
        try {
            pa4.e.K(eVar).f380572p = "";
            pa4.e.J(eVar).m(pa4.e.K(eVar).toByteArray());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getUploadCallback$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getUploadCallback$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
            ((pa4.i) eVar.f353028f).a(false, false);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload$onError$1");
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsLivePhotoImgUpload", "parseFrom MediaUploadInfo error in NetSceneSnsUpload");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload$onError$1");
        }
    }
}
