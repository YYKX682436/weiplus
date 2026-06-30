package e04;

/* loaded from: classes12.dex */
public final class p2 implements dn.k {
    @Override // dn.k
    public void O(java.lang.String mediaId, java.io.ByteArrayOutputStream buff) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(buff, "buff");
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationCdnService", "getCdnAuthInfo, mediaId = %s", mediaId);
    }

    @Override // dn.k
    public int r4(java.lang.String mediaId, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationCdnService", "scanTranslateUploadCdn on cdn callback mediaId = %s, startRet = %d, keep_ProgressInfo = %s, keep_SceneResult = %s", mediaId, java.lang.Integer.valueOf(i17), gVar, hVar);
        e04.r2 r2Var = new e04.r2();
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ScanTranslationCdnService", "scanTranslateUploadCdn start failed : %d, media id is :%s", java.lang.Integer.valueOf(i17), mediaId);
            r2Var.f246079a = i17;
            e04.t2 t2Var = e04.t2.f246106a;
            java.util.HashMap hashMap = (java.util.HashMap) e04.t2.f246108c;
            if (hashMap.containsKey(mediaId)) {
                java.lang.Object remove = hashMap.remove(mediaId);
                kotlin.jvm.internal.o.d(remove);
                ((e04.q2) remove).a(mediaId, r2Var);
            }
            return 0;
        }
        if (hVar != null) {
            int i18 = hVar.field_retCode;
            r2Var.f246079a = i18;
            if (i18 != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ScanTranslationCdnService", "scanTranslateUploadCdn cdntra clientid:%s sceneResult.retCode:%d sceneResult[%s]", mediaId, java.lang.Integer.valueOf(i18), hVar);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationCdnService", "scanTranslateUploadCdn cdn trans suceess, media id : %s", mediaId);
                r2Var.f246080b = hVar.field_fileId;
                r2Var.f246081c = hVar.field_aesKey;
            }
            e04.t2 t2Var2 = e04.t2.f246106a;
            java.util.HashMap hashMap2 = (java.util.HashMap) e04.t2.f246108c;
            if (hashMap2.containsKey(mediaId)) {
                java.lang.Object remove2 = hashMap2.remove(mediaId);
                kotlin.jvm.internal.o.d(remove2);
                ((e04.q2) remove2).a(mediaId, r2Var);
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String mediaId, byte[] inbuf) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(inbuf, "inbuf");
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationCdnService", "decodePrepareResponse, mediaId = %s", mediaId);
        return null;
    }
}
