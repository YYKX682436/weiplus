package ec4;

/* loaded from: classes4.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ec4.h f251148d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f251149e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f251150f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f251151g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f251152h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f251153i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ec4.s f251154m;

    public g(ec4.h hVar, java.lang.String str, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, java.lang.String str2, java.lang.String str3, java.lang.String str4, ec4.s sVar) {
        this.f251148d = hVar;
        this.f251149e = str;
        this.f251150f = snsInfo;
        this.f251151g = str2;
        this.f251152h = str3;
        this.f251153i = str4;
        this.f251154m = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o55.a Bi;
        float f17;
        r45.lj4 lj4Var;
        java.lang.String str;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo;
        boolean z17;
        boolean z18;
        int l17;
        androidx.lifecycle.c1 a17;
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader$commitFakeVideo$1");
        ec4.h hVar = this.f251148d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getExtInfo$p", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader");
        r45.vh4 vh4Var = hVar.f251157a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getExtInfo$p", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader");
        boolean z19 = vh4Var.f388243p;
        com.tencent.mars.xlog.Log.i("MicroMsg.BackgroundVideoFakeUploader", "commitFakeVideo >> " + java.lang.Thread.currentThread().getName() + ", isMediaFromMaasSdk=" + z19);
        if (z19) {
            Bi = ((yy0.g8) ((pp0.o0) i95.n0.c(pp0.o0.class))).Bi(this.f251149e);
        } else {
            Bi = ((wp4.x) ((n55.f) i95.n0.c(n55.f.class))).Bi(this.f251149e);
        }
        if (Bi == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BackgroundVideoFakeUploader", "workType is error");
            ((ku5.t0) ku5.t0.f312615d).B(new ec4.a(this.f251154m, Bi, this.f251149e));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader$commitFakeVideo$1");
            return;
        }
        int i18 = Bi.f343162a;
        if (i18 == 4007) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BackgroundVideoFakeUploader", "result is done " + this.f251149e);
            ((ku5.t0) ku5.t0.f312615d).B(new ec4.b(this.f251154m, Bi, this.f251149e));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader$commitFakeVideo$1");
            return;
        }
        if (i18 == 4008) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BackgroundVideoFakeUploader", "result is done error");
            ((ku5.t0) ku5.t0.f312615d).B(new ec4.c(this.f251154m, Bi, this.f251149e));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader$commitFakeVideo$1");
            return;
        }
        ec4.h hVar2 = this.f251148d;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = this.f251150f;
        java.lang.String videoPath = this.f251151g;
        java.lang.String thumbPath = this.f251152h;
        java.lang.String desc = this.f251153i;
        java.lang.String workId = this.f251149e;
        hVar2.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addSightObjectByPath", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader");
        kotlin.jvm.internal.o.g(snsInfo2, "snsInfo");
        kotlin.jvm.internal.o.g(videoPath, "videoPath");
        kotlin.jvm.internal.o.g(thumbPath, "thumbPath");
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(workId, "workId");
        dw3.d0 a18 = dw3.e0.f244202a.a(videoPath);
        if (a18 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BackgroundVideoFakeUploader", "addSightObjectByPath commit video_info:" + a18);
            f17 = ((float) a18.f244192c) / 1000.0f;
        } else {
            f17 = 0.0f;
        }
        if (f17 <= 0.01f) {
            if (z19) {
                o55.a Bi2 = ((yy0.g8) ((pp0.o0) i95.n0.c(pp0.o0.class))).Bi(workId);
                if (Bi2 != null) {
                    i17 = Bi2.f343169h;
                    f17 = i17 / 1000.0f;
                }
            } else {
                o55.a Bi3 = ((wp4.x) ((n55.f) i95.n0.c(n55.f.class))).Bi(workId);
                if (Bi3 != null) {
                    i17 = Bi3.f343169h;
                    f17 = i17 / 1000.0f;
                }
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.tencent.mm.plugin.sns.model.l4.Ni());
        java.nio.charset.Charset charset = r26.c.f368865a;
        byte[] bytes = videoPath.getBytes(charset);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        sb6.append(kk.k.g(bytes));
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkToCreateDir", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader");
        com.tencent.mm.vfs.w6.u(com.tencent.mm.vfs.w6.r(sb7));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkToCreateDir", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader");
        long d17 = com.tencent.mm.vfs.w6.d(videoPath, sb7, false);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(com.tencent.mm.plugin.sns.model.l4.Ni());
        byte[] bytes2 = thumbPath.getBytes(charset);
        kotlin.jvm.internal.o.f(bytes2, "getBytes(...)");
        sb8.append(kk.k.g(bytes2));
        java.lang.String sb9 = sb8.toString();
        com.tencent.mm.vfs.w6.c(thumbPath, sb9);
        com.tencent.mars.xlog.Log.i("MicroMsg.BackgroundVideoFakeUploader", "addSightObjectByPath: copyVideoResult " + d17 + ", video copy from " + videoPath + " t0 " + sb7 + "; thumb copy from " + thumbPath + " to " + sb9);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("produceSightByPath", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader");
        r45.jj4 f18 = m21.y.f();
        f18.f377855d = "";
        com.tencent.mars.xlog.Log.i("MicroMsg.BackgroundVideoFakeUploader", "mediaType %d  videopath %s sightmd5 %s,cdnUrl %s,cdnThumbUrl %s", 6, sb7, "", "", "");
        f18.f377856e = 6;
        ca4.w0 w0Var = new ca4.w0(sb7, 6);
        w0Var.f40046n = "";
        com.tencent.mm.plugin.sns.model.l4.Hj().P1(w0Var, sb7, sb9, "", "");
        if (w0Var.f40040h <= 0 || w0Var.f40039g <= 0 || w0Var.f40041i <= 0) {
            lj4Var = null;
        } else {
            lj4Var = new r45.lj4();
            lj4Var.f379521e = w0Var.f40040h;
            lj4Var.f379520d = w0Var.f40039g;
            lj4Var.f379522f = w0Var.f40041i;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        boolean z27 = true;
        if (gm0.j1.a()) {
            str = "MicroMsg.BackgroundVideoFakeUploader";
            snsInfo = snsInfo2;
            z17 = false;
            int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_FLUTTER_SELF_PAGE_INT_SYNC, 0);
            if (r17 == 1) {
                z18 = true;
            } else if (r17 != 2) {
                z18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_flutter_self_page, false);
            } else {
                z18 = false;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
            snsInfo = snsInfo2;
            str = "MicroMsg.BackgroundVideoFakeUploader";
            z17 = false;
            z18 = false;
        }
        if (z18) {
            java.lang.String i19 = com.tencent.mm.vfs.w6.i(sb7, z17);
            if (i19 == null) {
                i19 = "";
            }
            f18.f377858g = i19;
            java.lang.String i27 = com.tencent.mm.vfs.w6.i(sb9, z17);
            if (i27 == null) {
                i27 = "";
            }
            f18.f377860i = i27;
        }
        f18.f377855d = "Locall_path" + w0Var.f40038f;
        f18.f377865p = lj4Var;
        f18.f377870s = w0Var.f40038f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("produceSightByPath", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader");
        f18.f377856e = 8;
        f18.f377857f = desc;
        if (com.tencent.mm.sdk.platformtools.t8.K0(f18.f377864o)) {
            f18.f377864o = desc;
        }
        f18.R = f17;
        f18.f377866p0 = workId;
        r45.ec4 ec4Var = new r45.ec4();
        ec4Var.f373266d = f18.f377870s;
        r45.kj4 postInfo = snsInfo.getPostInfo();
        postInfo.f378745h.add(ec4Var);
        try {
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo3 = snsInfo;
            com.tencent.mm.protobuf.f parseFrom = new com.tencent.mm.protocal.protobuf.TimeLineObject().parseFrom(snsInfo3.field_content);
            kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.TimeLineObject");
            com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = (com.tencent.mm.protocal.protobuf.TimeLineObject) parseFrom;
            timeLineObject.ContentObj.f369840h.add(f18);
            snsInfo3.setTimeLine(timeLineObject);
            snsInfo3.setPostBuf(postInfo.toByteArray());
            com.tencent.mars.xlog.Log.i(str, "commit mediaId: " + f18.f377870s + ", " + f18.f377855d + ", " + f18.f377857f);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addSightObjectByPath", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader");
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.i(str, "fake error");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addSightObjectByPath", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader");
            z27 = z17;
        }
        if (!z27) {
            ((ku5.t0) ku5.t0.f312615d).B(new ec4.d(this.f251154m));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader$commitFakeVideo$1");
            return;
        }
        com.tencent.mm.plugin.sns.storage.f2 Fj = com.tencent.mm.plugin.sns.model.l4.Fj();
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo4 = this.f251150f;
        Fj.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("insertAndNotify", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (snsInfo4 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("insertAndNotify", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            l17 = -1;
        } else {
            l17 = (int) Fj.f165994d.l(dm.va.TABLE_NAME, "", snsInfo4.convertTo());
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoStorage", "SnsInfo Insert result " + l17);
            synchronized (jm0.k.f300270i) {
                gm0.j1.b().c();
                if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                    throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
                a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(zc4.h.class);
            }
            ((zc4.g) ((zc4.h) a17).P6(zc4.g.class)).h7(l17, o75.b.f343582c);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("insertAndNotify", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        }
        int size = this.f251150f.getTimeLine().ContentObj.f369840h.size();
        int createTime = this.f251150f.getCreateTime();
        ta4.b1.f416725a.b(l17, kz5.b0.c(this.f251151g));
        com.tencent.mars.xlog.Log.i("MicroMsg.BackgroundVideoFakeUploader", "commit size: " + size + ", " + l17 + ", " + createTime);
        com.tencent.mm.plugin.sns.model.l4.Dj().z0(l17);
        java.lang.StringBuilder sb10 = new java.lang.StringBuilder("commitFakeVideo >> localId: ");
        sb10.append(l17);
        com.tencent.mars.xlog.Log.i("MicroMsg.BackgroundVideoFakeUploader", sb10.toString());
        try {
            ec4.h hVar3 = this.f251148d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getExtInfo$p", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader");
            r45.vh4 vh4Var2 = hVar3.f251157a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getExtInfo$p", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader");
            byte[] byteArray = vh4Var2.toByteArray();
            kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
            if (z19) {
                pp0.o0 o0Var = (pp0.o0) i95.n0.c(pp0.o0.class);
                java.lang.String workTagId = this.f251149e;
                com.tencent.mm.plugin.sns.statistics.w0 w0Var2 = com.tencent.mm.plugin.sns.statistics.w0.f164989a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentSessionId", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
                java.lang.String str2 = com.tencent.mm.plugin.sns.statistics.w0.f164990b;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentSessionId", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
                yy0.g8 g8Var = (yy0.g8) o0Var;
                g8Var.getClass();
                kotlin.jvm.internal.o.g(workTagId, "workTagId");
                com.tencent.mars.xlog.Log.i(g8Var.f468112d, "updateWorkToPublish >> workTagId: " + workTagId + ", workType: 4006, snsLocalId: " + l17 + ", postSessionId: " + str2 + ", snsCreateTime: " + createTime);
                iz0.d dVar = iz0.d.f296044a;
                dm.ib d18 = dVar.d(workTagId);
                if (d18 == null) {
                    com.tencent.mars.xlog.Log.e(g8Var.f468112d, "updateWorkToPublish get info is null ".concat(workTagId));
                } else {
                    int i28 = d18.field_work_type;
                    com.tencent.mars.xlog.Log.i(g8Var.f468112d, "updateWorkToPublish >> lastWorkType >> " + i28);
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    l75.k0 a19 = dVar.a();
                    p75.n0 n0Var = dm.ib.f237670y;
                    android.content.ContentValues contentValues = new android.content.ContentValues();
                    contentValues.put("work_type", java.lang.Integer.valueOf(com.google.android.gms.wearable.WearableStatusCodes.DUPLICATE_CAPABILITY));
                    contentValues.put("sns_local_id", java.lang.Integer.valueOf(l17));
                    contentValues.put("sns_ext_info", byteArray);
                    contentValues.put("confirm_publish_video_time_stamp", java.lang.Long.valueOf(currentTimeMillis));
                    contentValues.put("post_session_id", str2);
                    contentValues.put("sns_create_time", java.lang.Integer.valueOf(createTime));
                    p75.m0 j17 = dm.ib.f237671z.j(workTagId);
                    p75.h1 j18 = dm.ib.f237670y.j(contentValues);
                    j18.f352651c = j17;
                    com.tencent.mars.xlog.Log.i("MicroMsg.TemplateBackgroundVideoInfoStorageManager", "updateWorkToPublish >> workType: 4006, snsLocalId: " + l17 + ", workTagId: " + workTagId + ", confirmPublishTimeStamp: " + currentTimeMillis + ", snsCreateTime: " + createTime + ", result: " + j18.a().f(a19));
                    ((ku5.t0) ku5.t0.f312615d).B(new yy0.d8(workTagId, i28, com.google.android.gms.wearable.WearableStatusCodes.DUPLICATE_CAPABILITY));
                }
            } else {
                n55.f fVar = (n55.f) i95.n0.c(n55.f.class);
                java.lang.String workTagId2 = this.f251149e;
                com.tencent.mm.plugin.sns.statistics.w0 w0Var3 = com.tencent.mm.plugin.sns.statistics.w0.f164989a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentSessionId", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
                java.lang.String str3 = com.tencent.mm.plugin.sns.statistics.w0.f164990b;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentSessionId", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
                wp4.x xVar = (wp4.x) fVar;
                xVar.getClass();
                kotlin.jvm.internal.o.g(workTagId2, "workTagId");
                com.tencent.mars.xlog.Log.i(xVar.f448453d, "updateWorkToPublish >> workTagId: " + workTagId2 + ", workType: 4006, snsLocalId: " + l17 + ", postSessionId: " + str3 + ", snsCreateTime: " + createTime);
                zp4.e eVar = zp4.e.f474954a;
                dm.q0 d19 = eVar.d(workTagId2);
                if (d19 == null) {
                    com.tencent.mars.xlog.Log.e(xVar.f448453d, "updateWorkToPublish get info is null ".concat(workTagId2));
                } else {
                    int i29 = d19.field_work_type;
                    com.tencent.mars.xlog.Log.i(xVar.f448453d, "updateWorkToPublish >> lastWorkType >> " + i29);
                    long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                    l75.k0 a27 = eVar.a();
                    p75.n0 n0Var2 = dm.q0.R;
                    android.content.ContentValues contentValues2 = new android.content.ContentValues();
                    contentValues2.put("work_type", java.lang.Integer.valueOf(com.google.android.gms.wearable.WearableStatusCodes.DUPLICATE_CAPABILITY));
                    contentValues2.put("sns_local_id", java.lang.Integer.valueOf(l17));
                    contentValues2.put("sns_ext_info", byteArray);
                    contentValues2.put("confirm_publish_video_time_stamp", java.lang.Long.valueOf(currentTimeMillis2));
                    contentValues2.put("post_session_id", str3);
                    contentValues2.put("sns_create_time", java.lang.Integer.valueOf(createTime));
                    p75.m0 j19 = dm.q0.S.j(workTagId2);
                    p75.h1 j27 = dm.q0.R.j(contentValues2);
                    j27.f352651c = j19;
                    com.tencent.mars.xlog.Log.i("MicroMsg，BackgroundVideoInfoStorageManager", "updateWorkToPublish >> workType: 4006, snsLocalId: " + l17 + ", workTagId: " + workTagId2 + ", confirmPublishTimeStamp: " + currentTimeMillis2 + ", snsCreateTime: " + createTime + ", result: " + j27.a().f(a27));
                    ((ku5.t0) ku5.t0.f312615d).B(new wp4.u(workTagId2, i29, com.google.android.gms.wearable.WearableStatusCodes.DUPLICATE_CAPABILITY));
                }
            }
            ((ku5.t0) ku5.t0.f312615d).B(new ec4.f(this.f251154m, l17));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader$commitFakeVideo$1");
        } catch (java.io.IOException unused2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BackgroundVideoFakeUploader", "parse byte error");
            ((ku5.t0) ku5.t0.f312615d).B(new ec4.e(this.f251154m));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader$commitFakeVideo$1");
        }
    }
}
