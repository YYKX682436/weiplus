package hv1;

/* loaded from: classes12.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f285263d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dn.m f285264e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hv1.d f285265f;

    public a(hv1.d dVar, int i17, dn.m mVar) {
        this.f285265f = dVar;
        this.f285263d = i17;
        this.f285264e = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        int i18;
        int i19;
        int t17;
        int m17;
        dn.m mVar = this.f285264e;
        hv1.d dVar = this.f285265f;
        int i27 = this.f285263d;
        if (i27 != -1) {
            ((java.util.concurrent.ConcurrentHashMap) dVar.f285278g).put(mVar.field_mediaId, java.lang.Integer.valueOf(i27));
        }
        ((java.util.LinkedList) dVar.f285275d).add(mVar.field_mediaId);
        ((java.util.concurrent.ConcurrentHashMap) dVar.f285276e).put(mVar.field_mediaId, mVar);
        java.util.Queue queue = dVar.f285275d;
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnDownloadNativeService", "summersafecdn tryStart queue:%d", java.lang.Integer.valueOf(((java.util.LinkedList) queue).size()));
        com.tencent.mars.cdn.CdnManager.Config config = new com.tencent.mars.cdn.CdnManager.Config();
        config.EnableSafeCDN = 1;
        java.lang.String str = "clicfg_android_new_multiconn_game_download=" + j62.e.g().a("clicfg_android_new_multiconn_game_download", "0", false, true) + ";";
        config.MiscellaneousExptValues = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnDownloadNativeService", "[push.miscell.config] expt %s", str);
        ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).setConfig(config);
        while (!queue.isEmpty()) {
            dn.m mVar2 = (dn.m) ((java.util.concurrent.ConcurrentHashMap) dVar.f285276e).remove((java.lang.String) ((java.util.LinkedList) queue).poll());
            if (mVar2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CdnDownloadNativeService", "summersafecdn task queue is empty , maybe bug here");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.CdnDownloadNativeService", "summersafecdn id:%s cdnautostart :%s chatroom:%s", mVar2.field_mediaId, java.lang.Boolean.valueOf(mVar2.field_autostart), java.lang.Integer.valueOf(mVar2.field_chattype));
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            mVar2.field_startTime = java.lang.System.currentTimeMillis();
            boolean z18 = mVar2.f241786e;
            java.util.Map map = dVar.f285277f;
            if (z18) {
                java.lang.Object[] objArr = new java.lang.Object[7];
                java.lang.String str2 = mVar2.field_fullpath;
                objArr[0] = java.lang.Integer.valueOf(str2 == null ? -1 : str2.length());
                java.lang.String str3 = mVar2.field_thumbpath;
                objArr[1] = java.lang.Integer.valueOf(str3 == null ? -1 : str3.length());
                objArr[2] = com.tencent.mm.sdk.platformtools.t8.G1(mVar2.field_svr_signature);
                objArr[3] = com.tencent.mm.sdk.platformtools.t8.G1(mVar2.field_aesKey);
                objArr[4] = java.lang.Integer.valueOf(mVar2.field_fileType);
                objArr[5] = mVar2.field_mediaId;
                objArr[6] = java.lang.Boolean.valueOf(mVar2.field_onlycheckexist);
                com.tencent.mars.xlog.Log.i("MicroMsg.CdnDownloadNativeService", "summersafecdn tryStart send file:%d thumb:%d, field_svr_signature[%s], field_aesKey[%s], field_fileType[%d], field_mediaId[%s], onlycheckexist[%b]", objArr);
                if (mVar2.field_fullpath == null) {
                    mVar2.field_fullpath = "";
                }
                if (mVar2.field_thumbpath == null) {
                    mVar2.field_thumbpath = "";
                }
                int u17 = dVar.e().u(mVar2);
                if (u17 != 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.CdnDownloadNativeService", "summersafecdn startupUploadMedia error:%d clientid:%s", java.lang.Integer.valueOf(u17), mVar2.field_mediaId);
                    dn.k kVar = mVar2.f241787f;
                    if (kVar != null) {
                        kVar.r4(mVar2.field_mediaId, u17, null, null, mVar2.field_onlycheckexist);
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.CdnDownloadNativeService", "summersafecdn startupUploadMedia ok, field_mediaId[%s]", mVar2.field_mediaId);
                    ((java.util.concurrent.ConcurrentHashMap) map).put(mVar2.field_mediaId, mVar2);
                }
            } else {
                int i28 = mVar2.field_fileType;
                if (i28 == 30001 || i28 == 30003 || i28 == 30007 || i28 == 30004 || i28 == 30005 || i28 == 30006 || i28 == 50001) {
                    java.lang.String str4 = mVar2.field_fullpath;
                    if (str4 == null || str4.isEmpty()) {
                        i17 = -1;
                        i18 = -1;
                    } else {
                        i17 = -1;
                        mVar2.f241789h = -1;
                        int i29 = mVar2.field_fileType;
                        if ((i29 == 30003 || i29 == 30007) && mVar2.M) {
                            mVar2.f241812z1 = 30002;
                            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_patchdl_maxpcdn, 0);
                            mVar2.f241810y1 = Ni;
                            com.tencent.mars.xlog.Log.i("MicroMsg.CdnDownloadNativeService", "pcdn maxconn %d for patch", java.lang.Integer.valueOf(Ni));
                        }
                        if (!mVar2.C) {
                            mVar2.N = "Accept-Encoding:";
                        }
                        i18 = dVar.e().j(mVar2);
                    }
                    java.lang.Object[] objArr2 = new java.lang.Object[5];
                    java.lang.String str5 = mVar2.field_fullpath;
                    objArr2[0] = java.lang.Integer.valueOf(str5 == null ? i17 : str5.length());
                    objArr2[1] = mVar2.field_mediaId;
                    objArr2[2] = mVar2.f241811z;
                    objArr2[3] = java.lang.Integer.valueOf(mVar2.field_fileType);
                    objArr2[4] = java.lang.Integer.valueOf(i18);
                    com.tencent.mars.xlog.Log.i("MicroMsg.CdnDownloadNativeService", "url download tryStart recv file:%d field_mediaId[%s], download_url[%s], filetype:[%d], ret:%d", objArr2);
                    i19 = i18;
                } else {
                    if (mVar2.F) {
                        java.lang.String str6 = mVar2.field_fullpath;
                        if (str6 == null || str6.isEmpty()) {
                            t17 = -1;
                        } else {
                            mVar2.f241789h = -1;
                            mVar2.N = java.lang.String.format("X-Forwarded-Access-Type:%s\r\n", com.tencent.mars.comm.NetStatusUtil.getFormatedNetType(com.tencent.mm.sdk.platformtools.x2.f193071a));
                            mVar2.field_fileType = 30002;
                            mVar2.D = 18;
                            mVar2.f241812z1 = 30003;
                            mVar2.f241810y1 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_gamedl_maxpcdn, 0);
                            t17 = dVar.e().j(mVar2);
                        }
                        java.lang.Object[] objArr3 = new java.lang.Object[4];
                        java.lang.String str7 = mVar2.field_fullpath;
                        objArr3[0] = str7 != null ? str7 : "";
                        objArr3[1] = mVar2.field_mediaId;
                        objArr3[2] = mVar2.f241811z;
                        objArr3[3] = mVar2.I;
                        com.tencent.mars.xlog.Log.i("MicroMsg.CdnDownloadNativeService", "game package download tryStart recv file:%s field_mediaId[%s], download_url[%s] https url[%s]", objArr3);
                    } else {
                        java.lang.Object[] objArr4 = new java.lang.Object[7];
                        java.lang.String str8 = mVar2.field_fullpath;
                        objArr4[0] = java.lang.Integer.valueOf(str8 == null ? -1 : str8.length());
                        java.lang.String str9 = mVar2.field_thumbpath;
                        objArr4[1] = java.lang.Integer.valueOf(str9 == null ? -1 : str9.length());
                        objArr4[2] = mVar2.field_svr_signature;
                        objArr4[3] = mVar2.field_aesKey;
                        objArr4[4] = java.lang.Integer.valueOf(mVar2.field_fileType);
                        objArr4[5] = mVar2.field_mediaId;
                        objArr4[6] = java.lang.Boolean.valueOf(mVar2.field_onlycheckexist);
                        com.tencent.mars.xlog.Log.i("MicroMsg.CdnDownloadNativeService", "summersafecdn tryStart recv file:%d thumb:%d, field_svr_signature[%s], field_aesKey[%s], field_fileType[%d], field_mediaId[%s], onlycheckexist[%b]", objArr4);
                        if (mVar2.Y == 2) {
                            if (mVar2 instanceof dn.o) {
                                dn.o oVar = (dn.o) mVar2;
                                if (oVar.h()) {
                                    m17 = dVar.e().s(mVar2, 2);
                                } else if (oVar.i()) {
                                    oVar.f241806x0 = 1;
                                    oVar.f241809y0 = 1;
                                    m17 = dVar.e().m(oVar);
                                }
                                t17 = m17;
                            }
                            t17 = -1;
                        } else {
                            t17 = dVar.e().t(mVar2);
                        }
                    }
                    i19 = t17;
                    i17 = -1;
                }
                if (i19 != 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.CdnDownloadNativeService", "summersafecdn startupDownloadMedia error:%d clientid:%s", java.lang.Integer.valueOf(i19), mVar2.field_mediaId);
                    dn.k kVar2 = mVar2.f241787f;
                    if (kVar2 != null) {
                        kVar2.r4(mVar2.field_mediaId, i19, null, null, mVar2.field_onlycheckexist);
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.CdnDownloadNativeService", "summersafecdn startupDownloadMedia ok, field_mediaId[%s]", mVar2.field_mediaId);
                    ((java.util.concurrent.ConcurrentHashMap) map).put(mVar2.field_mediaId, mVar2);
                }
            }
        }
    }

    public java.lang.String toString() {
        return super.toString() + "|addRecvTask";
    }
}
