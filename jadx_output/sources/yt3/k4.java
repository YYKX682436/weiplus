package yt3;

/* loaded from: classes10.dex */
public final class k4 extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt3.r4 f465514d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ st3.s f465515e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ st3.r f465516f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ lt3.f0 f465517g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f465518h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f465519i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(yt3.r4 r4Var, st3.s sVar, st3.r rVar, lt3.f0 f0Var, kotlin.jvm.internal.f0 f0Var2, long j17) {
        super(4);
        this.f465514d = r4Var;
        this.f465515e = sVar;
        this.f465516f = rVar;
        this.f465517g = f0Var;
        this.f465518h = f0Var2;
        this.f465519i = j17;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        java.lang.String str;
        st3.s sVar;
        java.lang.String mixVideoPath = (java.lang.String) obj;
        java.lang.String mixThumbPath = (java.lang.String) obj2;
        boolean booleanValue = ((java.lang.Boolean) obj3).booleanValue();
        ((java.lang.Number) obj4).intValue();
        kotlin.jvm.internal.o.g(mixVideoPath, "mixVideoPath");
        kotlin.jvm.internal.o.g(mixThumbPath, "mixThumbPath");
        com.tencent.mars.xlog.Log.i("MicroMsg.RemuxPlugin", "mixVideoPath: " + mixVideoPath + " ,mixThumbPath: " + mixThumbPath + " ,ret: " + booleanValue);
        yt3.r4 r4Var = this.f465514d;
        yz5.q qVar = r4Var.f465653n;
        if (qVar != null) {
            qVar.invoke(mixVideoPath, mixThumbPath, java.lang.Boolean.valueOf(booleanValue));
        }
        lt3.v vVar = lt3.v.f321277a;
        com.tencent.mars.xlog.Log.i("MicroMsg.mix_background.VideoMixHandler", "VideoMixHandler resumeBgMix!");
        lt3.v.f321279c = false;
        lt3.v.f321282f = null;
        vVar.b();
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_remux_fail_use_x264, true);
        android.content.Context context = r4Var.f465646d;
        st3.s sVar2 = this.f465515e;
        st3.r rVar = this.f465516f;
        if (booleanValue || !fj6) {
            if (android.text.TextUtils.isEmpty(mixVideoPath)) {
                nu3.m.f340229a.n(1003);
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                android.app.Activity activity = (android.app.Activity) context;
                activity.setResult(1003);
                activity.finish();
            } else {
                dw3.d0 a17 = dw3.e0.f244202a.a(mixVideoPath);
                com.tencent.mars.xlog.Log.i("MicroMsg.RemuxPlugin", "videoInfo : " + a17);
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = r4Var.f465649g;
                if (recordConfigProvider != null && recordConfigProvider.F == 2) {
                    if (a17 != null) {
                        a17.f244198i = this.f465517g.f321230s;
                    }
                    long k17 = com.tencent.mm.vfs.w6.k(mixVideoPath);
                    float f17 = 1024;
                    float f18 = ((((float) k17) * 1.0f) / f17) / f17;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fileSize : ");
                    sb6.append(f18);
                    sb6.append(" M fileLength: ");
                    sb6.append(k17);
                    sb6.append(" Byte   duration:");
                    sb6.append(a17 != null ? java.lang.Integer.valueOf(a17.f244192c) : null);
                    com.tencent.mars.xlog.Log.i("MicroMsg.RemuxPlugin", sb6.toString());
                    if (a17 != null) {
                        boolean z17 = wo.v1.f447829i.f447697k == 1;
                        boolean z18 = com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("MMSightCheckSendVideoBitrate"), 0) == 1;
                        float L = com.tencent.mm.sdk.platformtools.t8.L(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("MMSightCheckSendVideoBitrateLimit"), 1.3f);
                        if (rVar != null && rVar.f412585m == 2) {
                            L = 2.0f;
                        }
                        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
                        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(z18);
                        java.lang.Float valueOf3 = java.lang.Float.valueOf(L);
                        int i17 = a17.f244194e;
                        str = mixThumbPath;
                        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(i17);
                        sVar = sVar2;
                        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider2 = r4Var.f465649g;
                        kotlin.jvm.internal.o.d(recordConfigProvider2);
                        com.tencent.mars.xlog.Log.i("MicroMsg.RemuxPlugin", "deviceConfigCheckBitrate: %s, serverConfigCheckBitrate: %s, bitrateLimitRatio: %s, actualBR %s, targetBR: %s", valueOf, valueOf2, valueOf3, valueOf4, java.lang.Integer.valueOf(recordConfigProvider2.f155676n.f71194g));
                        boolean z19 = z17 || z18;
                        int i18 = a17.f244198i;
                        if (i18 == 0) {
                            if (z19) {
                                float f19 = i17;
                                kotlin.jvm.internal.o.d(r4Var.f465649g);
                                if (f19 >= r6.f155676n.f71194g * L) {
                                    r4Var.g(rVar);
                                }
                            }
                        } else if (i18 > 0 && z19) {
                            float f27 = i17;
                            kotlin.jvm.internal.o.d(r4Var.f465649g);
                            if (f27 >= r6.f155676n.f71194g * 2.0f) {
                                r4Var.g(rVar);
                            }
                        }
                    } else {
                        str = mixThumbPath;
                        sVar = sVar2;
                    }
                    nu3.m.f340229a.s(0);
                } else {
                    str = mixThumbPath;
                    sVar = sVar2;
                }
                kotlin.jvm.internal.f0 f0Var = this.f465518h;
                if (f0Var.f310116d != 0) {
                    com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().stopPerformance(com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcEncodeVideoEnable(), f0Var.f310116d);
                    com.tencent.mars.xlog.Log.i("MicroMsg.RemuxPlugin", "hardcoder summerPerformance stopPerformance %s", java.lang.Integer.valueOf(f0Var.f310116d));
                    f0Var.f310116d = 0;
                }
                r4Var.k(mixVideoPath);
                yt3.r4.b(r4Var);
                if (a17 != null) {
                    int i19 = rVar.f412585m;
                    int i27 = a17.f244194e;
                    if (i19 > 0) {
                        double d17 = i27;
                        kotlin.jvm.internal.o.d(r4Var.f465649g);
                        if (d17 >= r4.f155676n.f71194g * 1.1d) {
                            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider3 = r4Var.f465649g;
                            kotlin.jvm.internal.o.d(recordConfigProvider3);
                            int i28 = recordConfigProvider3.f155676n.f71194g;
                        }
                    }
                    java.lang.Integer valueOf5 = java.lang.Integer.valueOf(rVar.f412585m);
                    java.lang.Integer valueOf6 = java.lang.Integer.valueOf(i27);
                    com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider4 = r4Var.f465649g;
                    kotlin.jvm.internal.o.d(recordConfigProvider4);
                    com.tencent.mars.xlog.Log.i("MicroMsg.RemuxPlugin", "steve: qpswitch:%d , actualBR : %d, targetBR: %d, tuneRatio:[%d]", valueOf5, valueOf6, java.lang.Integer.valueOf(recordConfigProvider4.f155676n.f71194g), null);
                }
                dw3.c0 c0Var = dw3.c0.f244182a;
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider5 = r4Var.f465649g;
                ct0.b bVar = r4Var.f465648f;
                boolean z27 = bVar != null ? bVar.f222206c : false;
                boolean z28 = rVar.f412582j;
                com.tencent.mars.xlog.Log.i("MicroMsg.MediaFileUtil", "configProvider : " + recordConfigProvider5 + "  isCaptureMedia:" + z27 + "   change:" + z28);
                if (recordConfigProvider5 != null) {
                    boolean z29 = recordConfigProvider5.f155687y;
                    java.lang.String inputVideoPath = recordConfigProvider5.A;
                    kotlin.jvm.internal.o.f(inputVideoPath, "inputVideoPath");
                    java.lang.String outputVideoPath = recordConfigProvider5.B;
                    kotlin.jvm.internal.o.f(outputVideoPath, "outputVideoPath");
                    c0Var.v(z29, inputVideoPath, outputVideoPath, recordConfigProvider5.f155688z, z27, z28);
                }
                int i29 = rVar.f412585m;
                if (i29 > 0) {
                    com.tencent.mm.plugin.sight.base.SightVideoJNI.addReportMetadata(mixVideoPath, null, 0, i29);
                }
                nu3.i iVar = nu3.i.f340218a;
                iVar.n("KEY_REMUX_VIDEO_COST_MS_INT", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f465519i));
                nu3.m mVar = nu3.m.f340229a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                com.tencent.mars.xlog.Log.i("MicroMsg.VideoWidgetReporter", "setMuxEndTimeStamp >> " + elapsedRealtime);
                nu3.m.f340230b.Q = elapsedRealtime;
                ct0.b bVar2 = r4Var.f465648f;
                if (bVar2 != null) {
                    ut3.f fVar = ut3.f.f431176c;
                    fVar.f431178b.putBoolean("key_is_capture_video", bVar2.f222206c);
                    java.util.ArrayList arrayList = bVar2.f222214k;
                    boolean z37 = arrayList == null || arrayList.isEmpty();
                    android.os.Bundle bundle = fVar.f431178b;
                    bundle.putBoolean("key_is_photo_video", !z37);
                    java.util.ArrayList arrayList2 = bVar2.f222214k;
                    if (arrayList2 == null || arrayList2.isEmpty()) {
                        java.util.ArrayList<java.lang.String> arrayList3 = new java.util.ArrayList<>();
                        arrayList3.add(bVar2.f222204a);
                        bundle.putStringArrayList("key_src_list", arrayList3);
                    } else {
                        bundle.putStringArrayList("key_src_list", bVar2.f222214k);
                    }
                }
                mVar.m(mixVideoPath);
                mVar.n(0);
                java.lang.Boolean valueOf7 = java.lang.Boolean.valueOf(booleanValue);
                st3.s sVar3 = sVar;
                r4Var.f(new com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel(valueOf7, mixVideoPath, str, java.lang.Long.valueOf(sVar3.f412593g - sVar3.f412592f), java.lang.Boolean.FALSE, iVar.l()));
            }
        } else if (r4Var.f465656q >= 1 || !com.tencent.mm.sdk.platformtools.o4.L().getBoolean("mediacodec_create_error", false)) {
            nu3.m.f340229a.n(1002);
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            android.app.Activity activity2 = (android.app.Activity) context;
            activity2.setResult(1002);
            activity2.finish();
        } else {
            r4Var.f465656q++;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(985L, 146L, 1L, false);
            com.tencent.mars.xlog.Log.i("MicroMsg.RemuxPlugin", "markReserveEncoder");
            r4Var.i(r4Var.e(sVar2, r4Var.f465652m), sVar2, rVar);
        }
        return jz5.f0.f302826a;
    }
}
