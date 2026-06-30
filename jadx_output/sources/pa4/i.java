package pa4;

/* loaded from: classes4.dex */
public final class i implements pa4.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pa4.l f353047a;

    public i(pa4.l lVar) {
        this.f353047a = lVar;
    }

    public void a(boolean z17, boolean z18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUploadResult", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager$uploadCallback$1");
        pa4.l lVar = this.f353047a;
        if (z18) {
            int i17 = lVar.d().f380570n;
            com.tencent.mars.xlog.Log.i("MicroMsg.LivePhotoUpload", "videoUploadCallback onUploadResult >> localId: " + pa4.l.b(lVar) + " res: " + z17 + " imgUploadResult: " + i17 + " thread: " + java.lang.Thread.currentThread().getName());
            if (i17 != 2) {
                pa4.l.c(lVar, false, z17 && i17 == 0);
                if (com.tencent.mm.plugin.sns.model.l4.Nj() != null) {
                    com.tencent.mm.plugin.sns.model.l4.Nj().d();
                }
            }
        } else {
            int i18 = lVar.d().D.f380570n;
            com.tencent.mars.xlog.Log.i("MicroMsg.LivePhotoUpload", "imgUploadCallback onUploadResult >> localId: " + pa4.l.b(lVar) + " res: " + z17 + " videoUploadResult: " + i18 + " thread: " + java.lang.Thread.currentThread().getName());
            if (i18 != 2) {
                pa4.l.c(lVar, !z17, z17 && i18 == 0);
                if (com.tencent.mm.plugin.sns.model.l4.Nj() != null) {
                    com.tencent.mm.plugin.sns.model.l4.Nj().d();
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUploadResult", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager$uploadCallback$1");
    }
}
