package vp4;

/* loaded from: classes10.dex */
public final class s {

    /* renamed from: a */
    public static final vp4.s f439074a = new vp4.s();

    public static boolean b(vp4.s sVar, boolean z17, java.lang.String thumbPath, int i17, java.lang.String inputVideoPath, java.lang.String outputVideoPath, boolean z18, boolean z19, boolean z27, ct0.b bVar, boolean z28, int i18, java.lang.Object obj) {
        ct0.b bVar2 = (i18 & 256) != 0 ? null : bVar;
        boolean z29 = (i18 & 512) != 0 ? false : z28;
        sVar.getClass();
        kotlin.jvm.internal.o.g(thumbPath, "thumbPath");
        kotlin.jvm.internal.o.g(inputVideoPath, "inputVideoPath");
        kotlin.jvm.internal.o.g(outputVideoPath, "outputVideoPath");
        if (!z29) {
            boolean C = dw3.c0.f244182a.C(outputVideoPath, thumbPath, ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Di() ? i17 : -1);
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoExportUtil", "dealAfterRemuxSuccess >> saveResult: " + C);
            if (!C) {
                return false;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoExportUtil", "dealAfterRemuxSuccess >> video thumbPath " + thumbPath + ", videoPath: " + outputVideoPath);
        if (com.tencent.mm.vfs.w6.j(outputVideoPath)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoExportUtil", "dealAfterRemuxSuccess >> info:" + dw3.e0.f244202a.a(outputVideoPath));
            boolean z37 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            com.tencent.mm.plugin.sight.base.SightVideoJNI.optimizeMP4VFS(outputVideoPath);
            com.tencent.mars.xlog.Log.i("MicroMsg.RemuxFileUtil", "time cost: " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            dw3.c0.f244182a.v(z17, inputVideoPath, outputVideoPath, z18, z19, z27);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.VideoExportUtil", "dealAfterRemuxSuccess >> videoPath: " + outputVideoPath + " is no exist");
        }
        sVar.g(bVar2);
        if (!z29) {
            nu3.m.f340229a.m(outputVideoPath);
        }
        return true;
    }

    public static /* synthetic */ com.tencent.mm.plugin.vlog.model.n d(vp4.s sVar, r45.h70 h70Var, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider, int i17, st3.r rVar, int i18, int i19, yz5.p pVar, java.lang.String str, yz5.l lVar, int i27, java.lang.Object obj) {
        return sVar.c(h70Var, recordConfigProvider, i17, rVar, i18, i19, pVar, (i27 & 128) != 0 ? "" : str, (i27 & 256) != 0 ? null : lVar);
    }

    public static void e(vp4.s sVar, st3.r rVar, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider, java.lang.String str, int i17, java.lang.Object obj) {
        int i18;
        java.lang.String str2 = (i17 & 4) != 0 ? "" : str;
        sVar.getClass();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.idkeyStat(985L, 154L, 1L, false);
        int i19 = 0;
        if (str2.length() > 0) {
            zp4.e.f474954a.e(str2, true);
        } else {
            nu3.m.f340229a.s(0);
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoExportUtil", "start forceRemux");
        java.lang.String str3 = recordConfigProvider.B + "_tmp";
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = recordConfigProvider.f155676n;
        if (videoTransPara.f71206v == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoExportUtil", "ABA: Using Min Max QP Limitation: [%d], [%d] ", java.lang.Integer.valueOf(videoTransPara.D), java.lang.Integer.valueOf(recordConfigProvider.f155676n.E));
            com.tencent.mm.modelcontrol.VideoTransPara videoTransPara2 = recordConfigProvider.f155676n;
            int i27 = videoTransPara2.D;
            i18 = videoTransPara2.E;
            i19 = i27;
        } else {
            i18 = 51;
        }
        int i28 = rVar.f412578f;
        jz5.l lVar = (i28 == 90 || i28 == 270) ? new jz5.l(java.lang.Integer.valueOf(rVar.f412573a), java.lang.Integer.valueOf(rVar.f412574b)) : new jz5.l(java.lang.Integer.valueOf(rVar.f412574b), java.lang.Integer.valueOf(rVar.f412573a));
        int intValue = ((java.lang.Number) lVar.f302833d).intValue();
        int intValue2 = ((java.lang.Number) lVar.f302834e).intValue();
        java.lang.String str4 = recordConfigProvider.B;
        int i29 = rVar.f412575c;
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara3 = recordConfigProvider.f155676n;
        int remuxingVFS = com.tencent.mm.plugin.sight.base.SightVideoJNI.remuxingVFS(str4, str3, intValue2, intValue, i29, videoTransPara3.f71202r, 8, videoTransPara3.f71201q, 25.0f, rVar.f412577e, null, 0, false, i19, i18);
        com.tencent.mm.vfs.w6.c(str3, recordConfigProvider.B);
        com.tencent.mm.vfs.w6.h(str3);
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoExportUtil", "minQP :" + i19 + "  maxQP :" + i18 + "  duration:" + remuxingVFS + " cost:" + elapsedRealtime2);
        g0Var.idkeyStat(985L, 155L, elapsedRealtime2, false);
    }

    public final rp4.a a(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider, st3.s editConfig, st3.r encode, ct0.b bVar, boolean z17, boolean z18) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        kotlin.jvm.internal.o.g(editConfig, "editConfig");
        kotlin.jvm.internal.o.g(encode, "encode");
        rp4.a aVar = new rp4.a();
        int i17 = configProvider.F;
        float f17 = 1.0f;
        if (i17 == 1) {
            f17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Di(e42.d0.clicfg_c2c_generate_multiple_kbps, 1.0f);
        } else if (i17 == 2) {
            f17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Di(e42.d0.clicfg_sns_generate_multiple_kbps, 1.0f);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ABAParamsUtil", "final kbps: " + f17 + "  " + (encode.f412575c * f17));
        aVar.f398602e = encode.f412574b;
        aVar.f398601d = encode.f412573a;
        aVar.f398603f = (int) (((float) encode.f412575c) * f17);
        aVar.f398604g = encode.f412577e;
        aVar.f398605h = encode.f412578f;
        if (aVar.f398598a == null) {
            aVar.f398598a = new com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate();
        }
        com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate adaptiveAdjustBitrate = aVar.f398598a;
        if (adaptiveAdjustBitrate != null) {
            adaptiveAdjustBitrate.c();
        }
        boolean z19 = configProvider.M.getBoolean("key_use_aba_change_resolution", true);
        if (configProvider.f155679q == 3 || !z19) {
            aVar.f398600c = true;
        }
        if (bVar == null || (str = bVar.f222204a) == null) {
            str = "";
        }
        aVar.f398608k = str;
        if (z17 || z18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoExportUtil", "createABAParameter exportHevcHard:" + z17 + ", exportHevcSoft:" + z18);
            com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = configProvider.f155676n;
            if (videoTransPara != null) {
                videoTransPara.A = z18 ? 1 : 2;
            }
        }
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara2 = configProvider.f155676n;
        kotlin.jvm.internal.o.d(videoTransPara2);
        if (aVar.f398598a == null) {
            aVar.f398598a = new com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ABAParamsUtil", "Scene: [%d], ABASwitch: [%d] ceilingVideoBR:[%d]", java.lang.Integer.valueOf(videoTransPara2.G), java.lang.Integer.valueOf(videoTransPara2.f71205u), java.lang.Integer.valueOf(videoTransPara2.f71209y));
        com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate adaptiveAdjustBitrate2 = aVar.f398598a;
        if (adaptiveAdjustBitrate2 != null) {
            adaptiveAdjustBitrate2.f162362a = aVar.f398602e;
        }
        if (adaptiveAdjustBitrate2 != null) {
            adaptiveAdjustBitrate2.f162363b = aVar.f398601d;
        }
        if (adaptiveAdjustBitrate2 != null) {
            adaptiveAdjustBitrate2.f162364c = aVar.f398603f;
        }
        if (adaptiveAdjustBitrate2 != null) {
            adaptiveAdjustBitrate2.f162365d = editConfig.f412592f;
        }
        if (adaptiveAdjustBitrate2 != null) {
            adaptiveAdjustBitrate2.f162366e = editConfig.f412593g;
        }
        if (adaptiveAdjustBitrate2 != null) {
            adaptiveAdjustBitrate2.f162367f = videoTransPara2.G;
        }
        if (adaptiveAdjustBitrate2 != null) {
            adaptiveAdjustBitrate2.f162368g = videoTransPara2.f71205u;
        }
        if (adaptiveAdjustBitrate2 != null) {
            adaptiveAdjustBitrate2.f162369h = videoTransPara2.f71206v;
        }
        if (adaptiveAdjustBitrate2 != null) {
            adaptiveAdjustBitrate2.f162370i = videoTransPara2.f71207w;
        }
        if (adaptiveAdjustBitrate2 != null) {
            adaptiveAdjustBitrate2.f162371j = videoTransPara2.f71208x;
        }
        if (adaptiveAdjustBitrate2 != null) {
            adaptiveAdjustBitrate2.f162372k = videoTransPara2.f71209y;
        }
        if (adaptiveAdjustBitrate2 != null) {
            adaptiveAdjustBitrate2.f162373l = videoTransPara2.f71210z;
        }
        if (adaptiveAdjustBitrate2 != null) {
            adaptiveAdjustBitrate2.f162375n = videoTransPara2.B;
        }
        if (adaptiveAdjustBitrate2 != null) {
            adaptiveAdjustBitrate2.f162374m = videoTransPara2.A;
        }
        if (adaptiveAdjustBitrate2 != null) {
            adaptiveAdjustBitrate2.f162376o = videoTransPara2.C;
        }
        if (adaptiveAdjustBitrate2 != null) {
            adaptiveAdjustBitrate2.f162377p = videoTransPara2.D;
        }
        if (adaptiveAdjustBitrate2 != null) {
            adaptiveAdjustBitrate2.f162378q = videoTransPara2.E;
        }
        if (adaptiveAdjustBitrate2 != null) {
            adaptiveAdjustBitrate2.f162379r = videoTransPara2.F;
        }
        if (adaptiveAdjustBitrate2 != null) {
            adaptiveAdjustBitrate2.f162380s = videoTransPara2.P;
        }
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008e, code lost:
    
        if (r1 != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ab, code lost:
    
        r1 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a9, code lost:
    
        r1 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0099, code lost:
    
        if (r1 != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ba, code lost:
    
        r1 = 9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b8, code lost:
    
        r1 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a7, code lost:
    
        if ((r21.length() == 0) != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b6, code lost:
    
        if ((r21.length() == 0) != false) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.mm.plugin.vlog.model.n c(r45.h70 r14, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r15, int r16, st3.r r17, int r18, int r19, yz5.p r20, java.lang.String r21, yz5.l r22) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vp4.s.c(r45.h70, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider, int, st3.r, int, int, yz5.p, java.lang.String, yz5.l):com.tencent.mm.plugin.vlog.model.n");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x05ac A[LOOP:2: B:104:0x05a6->B:106:0x05ac, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04d3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[LOOP:4: B:144:0x04b0->B:155:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0335 A[LOOP:5: B:161:0x0273->B:174:0x0335, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x032c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r45.h70 f(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r29, st3.s r30, rp4.x r31, boolean r32, boolean r33, java.lang.String r34, int r35) {
        /*
            Method dump skipped, instructions count: 1516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vp4.s.f(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider, st3.s, rp4.x, boolean, boolean, java.lang.String, int):r45.h70");
    }

    public final void g(ct0.b bVar) {
        if (bVar != null) {
            ut3.f fVar = ut3.f.f431176c;
            fVar.f431178b.putBoolean("key_is_capture_video", bVar.f222206c);
            android.os.Bundle bundle = fVar.f431178b;
            java.util.ArrayList arrayList = bVar.f222214k;
            bundle.putBoolean("key_is_photo_video", !(arrayList == null || arrayList.isEmpty()));
            java.util.ArrayList arrayList2 = bVar.f222214k;
            if (!(arrayList2 == null || arrayList2.isEmpty())) {
                fVar.f431178b.putStringArrayList("key_src_list", bVar.f222214k);
                return;
            }
            java.util.ArrayList<java.lang.String> arrayList3 = new java.util.ArrayList<>();
            arrayList3.add(bVar.f222204a);
            fVar.f431178b.putStringArrayList("key_src_list", arrayList3);
        }
    }
}
