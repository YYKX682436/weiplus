package pa4;

/* loaded from: classes4.dex */
public final class a implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pa4.e f353015d;

    public a(pa4.e eVar) {
        this.f353015d = eVar;
    }

    @Override // dn.k
    public void O(java.lang.String mediaId, java.io.ByteArrayOutputStream buff) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCdnAuthInfo", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload$cdnCallback$1");
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(buff, "buff");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCdnAuthInfo", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload$cdnCallback$1");
    }

    @Override // dn.k
    public int r4(java.lang.String mediaId, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload$cdnCallback$1");
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        pa4.e eVar = this.f353015d;
        if (i17 == -21005) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsLivePhotoImgUpload", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", pa4.e.L(eVar), java.lang.Integer.valueOf(i17), gVar, hVar);
            com.tencent.mm.plugin.sns.statistics.v0.a(pa4.e.H(eVar), 3, -1);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload$cdnCallback$1");
            return 0;
        }
        if (hVar != null && hVar.field_retCode == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsLivePhotoImgUpload", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", pa4.e.L(eVar), java.lang.Integer.valueOf(i17), gVar, hVar);
            pa4.e eVar2 = this.f353015d;
            java.lang.String field_fileUrl = hVar.field_fileUrl;
            kotlin.jvm.internal.o.f(field_fileUrl, "field_fileUrl");
            java.lang.String field_thumbUrl = hVar.field_thumbUrl;
            kotlin.jvm.internal.o.f(field_thumbUrl, "field_thumbUrl");
            java.lang.String str = "upload_" + pa4.e.L(eVar);
            java.lang.String str2 = hVar.field_filemd5;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$onPostScene", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
            eVar2.O(field_fileUrl, 1, field_thumbUrl, 1, str, str2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$onPostScene", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("uploadsns cdndone pass: ");
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSt_new$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
            long j17 = eVar.f353038s;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSt_new$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
            sb6.append(currentTimeMillis - j17);
            sb6.append(' ');
            sb6.append(hVar.field_filemd5);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsLivePhotoImgUpload", sb6.toString());
            com.tencent.mm.plugin.sns.statistics.v0.a(pa4.e.H(eVar), 0, 0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload$cdnCallback$1");
            return 0;
        }
        if (hVar == null || hVar.field_retCode == 0) {
            if (i17 == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsLivePhotoImgUpload", "cdn tra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", pa4.e.L(eVar), java.lang.Integer.valueOf(i17), gVar, hVar);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload$cdnCallback$1");
                return 0;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsLivePhotoImgUpload", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", pa4.e.L(eVar), java.lang.Integer.valueOf(i17), gVar, hVar);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$onErrorServer", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
            eVar.N(0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$onErrorServer", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
            com.tencent.mm.plugin.sns.statistics.v0.a(pa4.e.H(eVar), 3, -1);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload$cdnCallback$1");
            return 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsLivePhotoImgUpload", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", pa4.e.L(eVar), java.lang.Integer.valueOf(i17), gVar, hVar);
        int i18 = hVar.field_retCode;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$processError", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        eVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("processError", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        int i19 = 0;
        while (true) {
            if (i19 >= 8) {
                eVar.M();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processError", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
                break;
            }
            if (i18 == dn.a.f241762a[i19]) {
                eVar.N(0);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processError", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
                break;
            }
            i19++;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$processError", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        com.tencent.mm.plugin.sns.statistics.v0.a(pa4.e.H(eVar), 3, -1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload$cdnCallback$1");
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String mediaId, byte[] inbuf) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("decodePrepareResponse", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload$cdnCallback$1");
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(inbuf, "inbuf");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("decodePrepareResponse", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload$cdnCallback$1");
        return null;
    }
}
