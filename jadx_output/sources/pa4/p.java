package pa4;

/* loaded from: classes4.dex */
public final class p implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pa4.s f353063d;

    public p(pa4.s sVar) {
        this.f353063d = sVar;
    }

    @Override // dn.k
    public void O(java.lang.String mediaId, java.io.ByteArrayOutputStream buff) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCdnAuthInfo", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload$cdnCallback$1");
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(buff, "buff");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCdnAuthInfo", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload$cdnCallback$1");
    }

    @Override // dn.k
    public int r4(java.lang.String mediaId, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload$cdnCallback$1");
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        pa4.s sVar = this.f353063d;
        if (i17 == -21005) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsLivePhotoVideoUpload", "cdnTra cdnCallback clientId: " + pa4.s.a(sVar) + " startRet:" + i17 + " progInfo:" + gVar + " res:" + hVar);
            com.tencent.mm.plugin.sns.statistics.v0.a(pa4.s.c(sVar), 3, -1);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload$cdnCallback$1");
            return 0;
        }
        if (hVar != null && hVar.field_retCode == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsLivePhotoVideoUpload", "cdnTra cdnCallback clientId:" + pa4.s.a(sVar) + " startRet:" + i17 + " progInfo:" + gVar + " res:" + hVar);
            java.lang.String field_fileUrl = hVar.field_fileUrl;
            kotlin.jvm.internal.o.f(field_fileUrl, "field_fileUrl");
            java.lang.String str = hVar.field_thumbUrl;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("upload_");
            sb6.append(pa4.s.a(sVar));
            java.lang.String sb7 = sb6.toString();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$onPostScene", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPostScene", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
            sVar.f353079h.a("VideoOnPostScene", new pa4.r(sVar, field_fileUrl, sb7, 1, str, 1));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPostScene", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$onPostScene", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
            t21.i2 wi6 = t21.i2.wi();
            int c17 = pa4.s.c(sVar);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSendScene$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
            int i18 = sVar.f353084m;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSendScene$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
            wi6.Bi(c17, hVar, i18);
            com.tencent.mm.plugin.sns.statistics.v0.a(pa4.s.c(sVar), 0, 0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload$cdnCallback$1");
            return 0;
        }
        if (hVar != null && hVar.field_retCode != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsLivePhotoVideoUpload", "sceneResult.field_retCode != 0 cdnTra cdnCallback clientId:" + pa4.s.a(sVar) + " startRet:" + i17 + " progInfo:" + gVar + " res:" + hVar);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$onErrorServer", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onErrorServer", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
            sVar.f353079h.a("VideoOnErrorServer", new pa4.q(0, sVar));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onErrorServer", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$onErrorServer", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
            com.tencent.mm.plugin.sns.statistics.v0.a(pa4.s.c(sVar), 3, -1);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload$cdnCallback$1");
            return 0;
        }
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsLivePhotoVideoUpload", "cdnTra cdnCallback clientId:" + pa4.s.a(sVar) + " startRet:" + i17 + " progInfo: " + gVar + " res:" + hVar);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload$cdnCallback$1");
            return 0;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.SnsLivePhotoVideoUpload", "start ret != 0 cdnTra cdnCallback clientId:" + pa4.s.a(sVar) + " startRet:" + i17 + " progInfo: " + gVar + " res:" + hVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$onErrorServer", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onErrorServer", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
        sVar.f353079h.a("VideoOnErrorServer", new pa4.q(0, sVar));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onErrorServer", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$onErrorServer", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
        com.tencent.mm.plugin.sns.statistics.v0.a(pa4.s.c(sVar), 3, -1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload$cdnCallback$1");
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String mediaId, byte[] inbuf) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("decodePrepareResponse", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload$cdnCallback$1");
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(inbuf, "inbuf");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("decodePrepareResponse", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload$cdnCallback$1");
        return null;
    }
}
