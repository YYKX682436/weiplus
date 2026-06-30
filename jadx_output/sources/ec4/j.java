package ec4;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f251163a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.TimeLineObject f251164b;

    /* renamed from: c, reason: collision with root package name */
    public r45.kj4 f251165c;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f251167e;

    /* renamed from: d, reason: collision with root package name */
    public int f251166d = -1;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f251168f = "";

    public static final /* synthetic */ java.lang.String a(ec4.j jVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getFakeVideoLocalId$p", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
        java.lang.String str = jVar.f251168f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getFakeVideoLocalId$p", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
        return str;
    }

    public final ec4.j b(java.lang.String mixPath, java.lang.String thumbPath) {
        float f17;
        r45.lj4 lj4Var;
        r45.a90 a90Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addSightObjectByPath", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
        kotlin.jvm.internal.o.g(mixPath, "mixPath");
        kotlin.jvm.internal.o.g(thumbPath, "thumbPath");
        java.lang.String p17 = com.tencent.mm.vfs.w6.p(mixPath);
        com.tencent.mars.xlog.Log.i("MicroMag.BackgroundVideoFinishUploader", "addSightObjectByPath >> mixPath: " + mixPath + ", sightMd5: " + p17 + ", thumbPath: " + thumbPath);
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = this.f251164b;
        java.util.LinkedList linkedList = (timeLineObject == null || (a90Var = timeLineObject.ContentObj) == null) ? null : a90Var.f369840h;
        if (linkedList == null || linkedList.size() <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMag.BackgroundVideoFinishUploader", "addSightObjectByPath >> mediaObj is error");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addSightObjectByPath", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
            return null;
        }
        java.lang.Object obj = linkedList.get(0);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        r45.jj4 jj4Var = (r45.jj4) obj;
        if (jj4Var.f377856e != 8) {
            com.tencent.mars.xlog.Log.i("MicroMag.BackgroundVideoFinishUploader", "mediaObj is upload");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addSightObjectByPath", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
            return null;
        }
        java.lang.String Id = jj4Var.f377855d;
        kotlin.jvm.internal.o.f(Id, "Id");
        this.f251168f = Id;
        com.tencent.mars.xlog.Log.i("MicroMag.BackgroundVideoFinishUploader", "mediaObj url: " + jj4Var.f377858g + ", desc: " + jj4Var.f377857f + ", thumb: " + jj4Var.f377860i + ", id: " + jj4Var.f377870s);
        dw3.d0 a17 = dw3.e0.f244202a.a(mixPath);
        if (a17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMag.BackgroundVideoFinishUploader", "addSightObjectByPath commit video_info:" + a17);
            f17 = ((float) a17.f244192c) / 1000.0f;
        } else {
            f17 = 0.0f;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.tencent.mm.plugin.sns.model.l4.Ni());
        java.nio.charset.Charset charset = r26.c.f368865a;
        byte[] bytes = mixPath.getBytes(charset);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        sb6.append(kk.k.g(bytes));
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkToCreateDir", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
        com.tencent.mm.vfs.w6.u(com.tencent.mm.vfs.w6.r(sb7));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkToCreateDir", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
        com.tencent.mm.vfs.w6.c(mixPath, sb7);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(com.tencent.mm.plugin.sns.model.l4.Ni());
        byte[] bytes2 = thumbPath.getBytes(charset);
        kotlin.jvm.internal.o.f(bytes2, "getBytes(...)");
        sb8.append(kk.k.g(bytes2));
        java.lang.String sb9 = sb8.toString();
        com.tencent.mm.vfs.w6.c(thumbPath, sb9);
        kotlin.jvm.internal.o.d(p17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("produceSightByPath", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
        r45.jj4 f18 = m21.y.f();
        f18.f377855d = "";
        com.tencent.mars.xlog.Log.i("MicroMag.BackgroundVideoFinishUploader", "mediaType %d  videopath %s sightmd5 %s,cdnUrl %s,cdnThumbUrl %s", 6, sb7, p17, "", "");
        f18.f377856e = 6;
        if (com.tencent.mm.vfs.w6.k(sb7) <= 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("produceSightByPath", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
            f18 = null;
        } else {
            ca4.w0 w0Var = new ca4.w0(sb7, 6);
            w0Var.f40046n = p17;
            com.tencent.mm.plugin.sns.model.l4.Hj().P1(w0Var, sb7, sb9, "", "");
            if (w0Var.f40040h <= 0 || w0Var.f40039g <= 0 || w0Var.f40041i <= 0) {
                lj4Var = null;
            } else {
                lj4Var = new r45.lj4();
                lj4Var.f379521e = w0Var.f40040h;
                lj4Var.f379520d = w0Var.f40039g;
                lj4Var.f379522f = w0Var.f40041i;
            }
            f18.f377855d = "Locall_path" + w0Var.f40038f;
            f18.f377865p = lj4Var;
            f18.f377870s = w0Var.f40038f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("produceSightByPath", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
        }
        if (f18 == null) {
            com.tencent.mars.xlog.Log.e("MicroMag.BackgroundVideoFinishUploader", "share img o.imagePath is null!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addSightObjectByPath", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
            return null;
        }
        f18.f377857f = jj4Var.f377857f;
        if (com.tencent.mm.sdk.platformtools.t8.K0(f18.f377864o)) {
            f18.f377864o = jj4Var.f377857f;
        }
        f18.R = f17;
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject2 = this.f251164b;
        kotlin.jvm.internal.o.d(timeLineObject2);
        timeLineObject2.ContentObj.f369840h.clear();
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject3 = this.f251164b;
        kotlin.jvm.internal.o.d(timeLineObject3);
        timeLineObject3.ContentObj.f369840h.add(f18);
        r45.ec4 ec4Var = new r45.ec4();
        ec4Var.f373266d = f18.f377870s;
        r45.kj4 kj4Var = this.f251165c;
        kotlin.jvm.internal.o.d(kj4Var);
        kj4Var.f378745h.clear();
        r45.kj4 kj4Var2 = this.f251165c;
        kotlin.jvm.internal.o.d(kj4Var2);
        kj4Var2.f378745h.add(ec4Var);
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f251163a;
        kotlin.jvm.internal.o.d(snsInfo);
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject4 = this.f251164b;
        kotlin.jvm.internal.o.d(timeLineObject4);
        snsInfo.setTimeLine(timeLineObject4);
        try {
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = this.f251163a;
            kotlin.jvm.internal.o.d(snsInfo2);
            r45.kj4 kj4Var3 = this.f251165c;
            kotlin.jvm.internal.o.d(kj4Var3);
            snsInfo2.setPostBuf(kj4Var3.toByteArray());
            com.tencent.mars.xlog.Log.i("MicroMag.BackgroundVideoFinishUploader", "finish >> " + f18.f377870s);
            com.tencent.mm.plugin.sns.statistics.i0 i0Var = com.tencent.mm.plugin.sns.statistics.j0.f164861a;
            java.lang.String thumbSize = java.lang.String.valueOf(com.tencent.mm.vfs.w6.k(sb9));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMediaThumbSize", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
            kotlin.jvm.internal.o.g(thumbSize, "thumbSize");
            dx1.g.f244489a.i("SnsPublishProcess", "thumbSizeList", thumbSize);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMediaThumbSize", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
            com.tencent.mm.plugin.sns.model.l4.Fj().w3(this.f251166d, this.f251163a);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addSightObjectByPath", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
            return this;
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMag.BackgroundVideoFinishUploader", "parse postinfo error");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addSightObjectByPath", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
            return null;
        }
    }

    public final boolean c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("commit", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = this.f251164b;
        kotlin.jvm.internal.o.d(timeLineObject);
        r45.q1 q1Var = timeLineObject.actionInfo;
        r45.kj4 kj4Var = this.f251165c;
        kotlin.jvm.internal.o.d(kj4Var);
        java.util.Iterator it = kj4Var.f378745h.iterator();
        java.lang.String str = null;
        while (true) {
            int i17 = 1;
            if (!it.hasNext()) {
                break;
            }
            r45.ec4 ec4Var = (r45.ec4) it.next();
            com.tencent.mm.plugin.sns.storage.l2 n17 = com.tencent.mm.plugin.sns.model.l4.Hj().n1(ec4Var.f373266d);
            try {
                com.tencent.mm.protobuf.f parseFrom = new r45.mj4().parseFrom(n17.h());
                kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MediaUploadInfo");
                r45.mj4 mj4Var = (r45.mj4) parseFrom;
                com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject2 = this.f251164b;
                kotlin.jvm.internal.o.d(timeLineObject2);
                if (timeLineObject2.AppInfo != null) {
                    com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject3 = this.f251164b;
                    kotlin.jvm.internal.o.d(timeLineObject3);
                    mj4Var.f380580x = timeLineObject3.AppInfo.f390846d;
                }
                if ((q1Var != null ? q1Var.f383556m : null) != null && !com.tencent.mm.sdk.platformtools.t8.K0(q1Var.f383556m.f380054d)) {
                    mj4Var.f380580x = q1Var.f383556m.f380054d;
                }
                com.tencent.mm.protobuf.f parseFrom2 = new r45.vh4().parseFrom(this.f251167e);
                if (parseFrom2 != null) {
                    ((r45.vh4) parseFrom2).f388236f = 0;
                }
                kotlin.jvm.internal.o.e(parseFrom2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MMSightExtInfo");
                mj4Var.B = (r45.vh4) parseFrom2;
                com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject4 = this.f251164b;
                kotlin.jvm.internal.o.d(timeLineObject4);
                int i18 = timeLineObject4.ContentObj.f369837e;
                mj4Var.f380581y = i18;
                if (i18 == 1 || i18 == 15) {
                    if (com.tencent.mm.sdk.platformtools.t8.K0(mj4Var.f380580x)) {
                        r45.vh4 vh4Var = mj4Var.B;
                        if (vh4Var != null && mj4Var.f380581y == 15) {
                            if (!vh4Var.f388235e) {
                                i17 = 2;
                            }
                            mj4Var.C = i17;
                        }
                    } else {
                        mj4Var.C = 5;
                    }
                }
                n17.m(mj4Var.toByteArray());
                com.tencent.mm.plugin.sns.model.l4.Hj().Y2(ec4Var.f373266d, n17);
                str = mj4Var.f380579w;
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("MicroMag.BackgroundVideoFinishUploader", "parseFrom MediaUploadInfo error in NetSceneSnsUpload");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commit", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
                return false;
            }
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f251166d);
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f251163a;
        kotlin.jvm.internal.o.d(snsInfo);
        com.tencent.mars.xlog.Log.i("MicroMag.BackgroundVideoFinishUploader", "commit sns info ret %d, typeFlag %d sightMd5 %s", valueOf, java.lang.Integer.valueOf(snsInfo.getTypeFlag()), str);
        if (this.f251166d > 0) {
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = this.f251163a;
            kotlin.jvm.internal.o.d(snsInfo2);
            if (snsInfo2.getTypeFlag() == 15) {
                java.lang.String j17 = com.tencent.mm.plugin.sns.storage.w2.j("sns_table_", this.f251166d);
                com.tencent.mm.sdk.platformtools.r2 r2Var = com.tencent.mm.plugin.sns.model.y6.f164773a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("postSnsVideo", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
                com.tencent.mm.plugin.sns.model.y6.x(j17, str, 0);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("postSnsVideo", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearFakeVideo", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
        com.tencent.mars.xlog.Log.i("MicroMag.BackgroundVideoFinishUploader", "clearFakeVideo: " + this.f251168f);
        if (this.f251168f.length() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearFakeVideo", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
        } else {
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), kotlinx.coroutines.q1.f310570c, null, new ec4.i(this, null), 2, null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearFakeVideo", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
        }
        com.tencent.mm.plugin.sns.model.l4.Nj().d();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commit", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
        return true;
    }

    public final ec4.j d(int i17, byte[] extInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLocalSnsInfoId", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
        kotlin.jvm.internal.o.g(extInfo, "extInfo");
        com.tencent.mars.xlog.Log.i("MicroMag.BackgroundVideoFinishUploader", "setLocalSnsInfoId >> snsLocalId: " + i17);
        this.f251168f = "";
        com.tencent.mm.plugin.sns.storage.SnsInfo i18 = com.tencent.mm.plugin.sns.model.l4.Fj().i1(i17);
        this.f251163a = i18;
        ec4.j jVar = null;
        this.f251164b = i18 != null ? i18.getTimeLine() : null;
        this.f251166d = i17;
        this.f251167e = extInfo;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f251163a;
        r45.kj4 postInfo = snsInfo != null ? snsInfo.getPostInfo() : null;
        this.f251165c = postInfo;
        if (this.f251163a != null && this.f251164b != null && postInfo != null) {
            jVar = this;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLocalSnsInfoId", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFinishUploader");
        return jVar;
    }
}
