package pa4;

/* loaded from: classes4.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pa4.l f353048d;

    public j(pa4.l lVar) {
        this.f353048d = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5 = "run";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager$uploadLivePhoto$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("uploadLivePhoto >> localId: ");
        pa4.l lVar = this.f353048d;
        sb6.append(pa4.l.b(lVar));
        sb6.append(" thread: ");
        sb6.append(java.lang.Thread.currentThread().getName());
        sb6.append(" isMulti: ");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$isMulti$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$isMulti$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
        sb6.append(lVar.f353052c);
        sb6.append(" objType: ");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getObjType$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getObjType$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
        sb6.append(lVar.f353053d);
        sb6.append(" time: ");
        sb6.append(java.lang.System.currentTimeMillis());
        com.tencent.mars.xlog.Log.i("MicroMsg.LivePhotoUpload", sb6.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$checkUploadState", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkUploadState", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
        int i17 = lVar.d().f380570n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLivePhotoMediaInfo", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
        r45.mj4 mj4Var = (r45.mj4) ((jz5.n) lVar.f353058i).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLivePhotoMediaInfo", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
        int i18 = mj4Var.f380570n;
        com.tencent.mars.xlog.Log.i("MicroMsg.LivePhotoUpload", "checkUploadState >> img: " + i17 + " video: " + i18);
        if (i17 == 1 || i18 == 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkUploadState", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
            lVar = null;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkUploadState", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$checkUploadState", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
        if (lVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$doUpload", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doUpload", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
            int i19 = lVar.d().f380570n;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLivePhotoMediaInfo", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
            r45.mj4 mj4Var2 = (r45.mj4) ((jz5.n) lVar.f353058i).getValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLivePhotoMediaInfo", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
            int i27 = mj4Var2.f380570n;
            if (i19 != 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LivePhotoUpload", "doUpload img thread: " + java.lang.Thread.currentThread() + " time: " + java.lang.System.currentTimeMillis());
                com.tencent.mm.modelbase.r1 r1Var = gm0.j1.n().f273288b;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getImgUploader", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
                pa4.e eVar = (pa4.e) ((jz5.n) lVar.f353060k).getValue();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImgUploader", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
                r1Var.g(eVar);
            }
            if (i27 != 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LivePhotoUpload", "doUpload video thread: " + java.lang.Thread.currentThread() + " time: " + java.lang.System.currentTimeMillis());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVideoUploader", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
                pa4.s sVar = (pa4.s) ((jz5.n) lVar.f353059j).getValue();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoUploader", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
                sVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("uploadVideo", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
                java.lang.String str6 = sVar.f353080i;
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsLivePhotoVideoUpload", "uploadVideo >> videoPath: " + str6 + ", thumbPath: " + sVar.f353081j + ", clientId: " + sVar.f353082k + ", md5: " + sVar.f353083l + ", fileLen: " + com.tencent.mm.vfs.w6.k(str6) + ", thread: " + java.lang.Thread.currentThread().getName() + (char) 65292);
                com.tencent.mm.plugin.sns.storage.l2 l2Var = sVar.f353075d;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
                sVar.f353083l = com.tencent.mm.vfs.w6.p(str6);
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("initData >> md5: ");
                sb7.append(sVar.f353083l);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsLivePhotoVideoUpload", sb7.toString());
                java.lang.String str7 = sVar.f353083l;
                r45.mj4 mj4Var3 = sVar.f353074c;
                mj4Var3.f380579w = str7;
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("init clientId: ");
                sb8.append(mj4Var3.f380572p);
                sb8.append(" livePhotoUUId: ");
                str = "run";
                sb8.append(mj4Var3.E);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsLivePhotoVideoUpload", sb8.toString());
                java.lang.String str8 = sVar.f353082k;
                if (str8 == null || str8.length() == 0) {
                    java.lang.StringBuilder sb9 = new java.lang.StringBuilder("");
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    str3 = "uploadVideo";
                    str4 = "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager";
                    sb9.append(android.os.SystemClock.elapsedRealtime());
                    byte[] bytes = sb9.toString().getBytes(r26.c.f368865a);
                    kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                    java.lang.String g17 = kk.k.g(bytes);
                    sVar.f353082k = g17;
                    mj4Var3.f380572p = g17;
                } else {
                    str3 = "uploadVideo";
                    str4 = "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager";
                }
                java.lang.String str9 = mj4Var3.E;
                if (str9 == null || str9.length() == 0) {
                    mj4Var3.E = sVar.f353077f;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsLivePhotoVideoUpload", "init clientId: " + mj4Var3.f380572p + " livePhotoUUId: " + mj4Var3.E);
                try {
                    r45.mj4 mj4Var4 = sVar.f353073b;
                    mj4Var4.D = mj4Var3;
                    l2Var.m(mj4Var4.toByteArray());
                    com.tencent.mm.plugin.sns.model.l4.Hj().Y2(l2Var.c(), l2Var);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsLivePhotoVideoUpload", e17, "", new java.lang.Object[0]);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
                com.tencent.mm.plugin.sns.statistics.v0.c(sVar.f353072a);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkVideoInfo", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
                com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(str6, true);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsLivePhotoVideoUpload", "checkVideoInfo >> mediaInfo: " + d17);
                ((hs.v) ((qk.r7) i95.n0.c(qk.r7.class))).getClass();
                long c17 = qp.b.f365674a.c();
                int i28 = d17.f162382a;
                if (i28 <= 0 || i28 > c17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SnsLivePhotoVideoUpload", "checkVideoInfo >> duration: " + d17.f162382a);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkVideoInfo", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
                    sVar = null;
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkVideoInfo", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
                }
                if (sVar != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doUpload", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsLivePhotoVideoUpload", "doUpload >> clientId: " + sVar.f353082k);
                    dn.m mVar = new dn.m();
                    mVar.f241785d = "task_NetSceneSnsUpload_2";
                    mVar.f241787f = sVar.f353085n;
                    mVar.field_mediaId = sVar.f353082k;
                    java.lang.String str10 = sVar.f353080i;
                    mVar.field_fullpath = str10;
                    java.lang.String str11 = sVar.f353081j;
                    mVar.field_thumbpath = str11;
                    if (com.tencent.mm.plugin.sns.storage.m2.D2(str11)) {
                        mVar.f241793n = 20251;
                        com.tencent.mars.xlog.Log.i("MicroMsg.SnsLivePhotoVideoUpload", "upload sight with wxam thumb, %s", str11);
                    }
                    mVar.field_fileType = 20202;
                    mVar.field_talker = "";
                    mVar.field_priority = 2;
                    mVar.field_needStorage = true;
                    mVar.field_isStreamMedia = false;
                    mVar.field_appType = 102;
                    mVar.field_bzScene = 1;
                    mVar.field_largesvideo = 0;
                    mVar.N = "live_photo_uuid:" + sVar.f353074c.E + "\r\nis_single_media:" + (sVar.f353078g ? "0" : "1");
                    java.lang.StringBuilder sb10 = new java.lang.StringBuilder("customHeader: ");
                    sb10.append(mVar.N);
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsLivePhotoVideoUpload", sb10.toString());
                    if (com.tencent.mm.pluginsdk.model.e4.c(str10)) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(106L, 31L, 1L, false);
                    }
                    java.lang.String p17 = com.tencent.mm.vfs.w6.p(str10);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(sVar.f353083l) || kotlin.jvm.internal.o.b(sVar.f353083l, p17)) {
                        if (pc4.f.f353435a.a()) {
                            try {
                                r45.u76 u76Var = new r45.u76();
                                u76Var.f387130d = 2;
                                mVar.P = u76Var.toByteArray();
                            } catch (java.io.IOException unused) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.SnsLivePhotoVideoUpload", "set cdnUploadInfo error");
                            }
                        }
                        if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar)) {
                            sVar.f353084m = 5;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doUpload", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
                        } else {
                            com.tencent.mars.xlog.Log.e("MicroMsg.SnsLivePhotoVideoUpload", "cdntra addSendTask failed. clientid:%s", sVar.f353082k);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doUpload", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
                        }
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.SnsLivePhotoVideoUpload", "isNotSafeSightVideo old srcmd5 %s newmd5 %s ", sVar.f353083l, p17);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onErrorServer", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
                        sVar.f353079h.a("VideoOnErrorServer", new pa4.q(-2, sVar));
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onErrorServer", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doUpload", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str3, "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
                str2 = str4;
            } else {
                str = "run";
                str2 = "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doUpload", str2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$doUpload", str2);
            str5 = str;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str5, "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager$uploadLivePhoto$1");
    }
}
