package com.tencent.mm.pluginsdk.model;

/* loaded from: classes10.dex */
public final class f3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.pluginsdk.model.f3 f189302a = new com.tencent.mm.pluginsdk.model.f3();

    public static final int b(java.lang.String inputPath, java.lang.String outputPath, com.tencent.mm.modelcontrol.VideoTransPara videoParam, boolean z17, d11.n nVar) {
        kotlin.jvm.internal.o.g(inputPath, "inputPath");
        kotlin.jvm.internal.o.g(outputPath, "outputPath");
        kotlin.jvm.internal.o.g(videoParam, "videoParam");
        return c(inputPath, outputPath, videoParam, z17, false, 0L, nVar, null).f38257a;
    }

    public static final c35.p c(java.lang.String inputPath, java.lang.String outputPath, com.tencent.mm.modelcontrol.VideoTransPara videoParam, boolean z17, boolean z18, long j17, d11.n nVar, java.lang.String str) {
        com.tencent.mm.plugin.sight.base.b d17;
        kotlin.jvm.internal.o.g(inputPath, "inputPath");
        kotlin.jvm.internal.o.g(outputPath, "outputPath");
        kotlin.jvm.internal.o.g(videoParam, "videoParam");
        c35.p pVar = new c35.p();
        pVar.f38257a = -1;
        jo4.l lVar = (jo4.l) t21.f.a();
        lVar.f300921b = nVar;
        int mp4RotateVFS = com.tencent.mm.plugin.sight.base.SightVideoJNI.getMp4RotateVFS(inputPath);
        int i17 = videoParam.G;
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = new com.tencent.mm.modelcontrol.VideoTransPara(videoParam);
        int i18 = (mp4RotateVFS == 0 || mp4RotateVFS == 180) ? videoTransPara.f71191d : videoTransPara.f71192e;
        int i19 = (mp4RotateVFS == 0 || mp4RotateVFS == 180) ? videoTransPara.f71192e : videoTransPara.f71191d;
        videoTransPara.f71191d = i18;
        videoTransPara.f71192e = i19;
        t21.c cVar = new t21.c(videoTransPara);
        cVar.f414712f = false;
        if (videoTransPara.A == 1) {
            cVar.f414710d = true;
            cVar.f414711e = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.ImportVideoTransfer", "outputHevc, force soft encode");
        }
        com.tencent.mm.plugin.sight.base.b d18 = com.tencent.mm.plugin.sight.base.e.d(inputPath, true);
        if (cVar.f414710d) {
            java.lang.Object valueOf = i17 == 9 ? java.lang.Long.valueOf(com.tencent.wcdb.core.Database.DictDefaultMatchValue) : java.lang.Integer.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_c2c_hevc_soft_encode_duration_limit, com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL));
            int i27 = d18 != null ? d18.f162382a : 0;
            com.tencent.mars.xlog.Log.i("MicroMsg.ImportVideoTransfer", "c2c export hevc, soft encode duration limit:" + valueOf + ", videoDuration:" + i27 + ", scene = " + i17);
            if (kz5.n0.O(e06.p.m(1, i27), valueOf)) {
                cVar.f414710d = false;
                cVar.f414711e = false;
            } else {
                cVar.f414711e = true;
            }
        } else {
            boolean z19 = !f189302a.a();
            cVar.f414711e = z19;
            if (!z19) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ImportVideoTransfer", "report avc hard encode");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(106L, 52L, 1L, false);
            }
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImportVideoTransfer", "forceSoftEncode");
            cVar.f414711e = true;
        }
        if (z18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImportVideoTransfer", "forceSoftDecode");
            cVar.f414717k = true;
        }
        cVar.f414714h = videoTransPara.H;
        cVar.f414715i = videoTransPara.I;
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_vc_video_parallel_mux_enable_c2c, false);
        if ((d18 != null ? d18.f162382a : 0) > 20000 && fj6 && com.tencent.mm.sdk.platformtools.z.f193115k) {
            t21.x1 x1Var = cVar.f414713g;
            x1Var.f415061a = true;
            x1Var.f415062b = 2;
        }
        boolean z27 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_enable_c2c_soft_encode_vcodec2_faster_preset, 1) == 1;
        bm5.o1 o1Var = bm5.o1.f22719a;
        int g17 = o1Var.g(bm5.h0.RepairerConfig_Media_ImportVideoHEVC_ABR_Int, 0);
        float Di = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Di(e42.c0.clicfg_c2c_soft_vcodec2_faster_preset_bitrate_ratio, 1.3f);
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_enable_c2c_soft_encode_vcodec2_crf_preset, 14);
        float e17 = o1Var.e(bm5.h0.RepairerConfig_Media_ImportVideoBRRatio_Float, 0.0f);
        int g18 = o1Var.g(bm5.h0.RepairerConfig_Media_ImportVideoHEVC_CRF_Int, 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImportVideoTransfer", "enableFastPreset:" + z27 + ", fastPresetBitrateRatio:" + Di + ", repairerVideoBRRatio:" + e17 + " constQualityMode:" + Ni + " repairerHEVCCRFMode:" + g18);
        if (videoTransPara.G == 9 && cVar.f414710d && cVar.f414711e) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImportVideoTransfer", "compress stocking video, use hevc preset " + videoTransPara.P);
            int i28 = videoTransPara.P;
            if (i28 == 5) {
                cVar.f414716j = new t21.d2(i28, 0.0f, 0, 0, 0, 30, null);
            } else if (i28 == 12 || i28 == 18) {
                float f17 = videoTransPara.M;
                int i29 = videoTransPara.N;
                int i37 = videoTransPara.Q;
                cVar.f414716j = new t21.d2(i28, f17, i29, i37, i37 > 0 ? 3 : 0);
                if (g18 > 0) {
                    cVar.f414716j = new t21.d2(g18, f17, i29, i37, i37 > 0 ? 3 : 0);
                }
            }
        } else {
            if ((z27 || g17 > 0) && cVar.f414710d && cVar.f414711e) {
                cVar.f414716j = new t21.d2(16, 0.0f, 0, 0, 0, 30, null);
                if (g17 > 0) {
                    cVar.f414716j = new t21.d2(g17, 0.0f, 0, 0, 0, 30, null);
                }
                cVar.f414707a.f71194g = (int) (videoParam.f71194g * Di);
            }
            if ((Ni > 0 || g18 > 0) && cVar.f414710d && cVar.f414711e) {
                float f18 = videoTransPara.M;
                int i38 = videoTransPara.N;
                int i39 = videoTransPara.Q;
                cVar.f414716j = new t21.d2(Ni, f18, i38, i39, i39 > 0 ? 3 : 0);
                if (g18 > 0) {
                    cVar.f414716j = new t21.d2(g18, f18, i38, i39, i39 > 0 ? 3 : 0);
                }
            }
        }
        if (e17 > 0.0f && cVar.f414710d && cVar.f414711e) {
            cVar.f414707a.f71194g = (int) (videoParam.f71194g * e17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImportVideoTransfer", "transferVideo softEncode:" + cVar.f414711e + " outputHevc:" + cVar.f414710d + " parallelParam :" + cVar.f414713g + " videoParam.videoBitrate:" + cVar.f414707a.f71194g);
        java.lang.Object obj = new java.lang.Object();
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        f65.y0.f260019a.f(str, cVar.f414710d ? 2 : 1, cVar.f414711e ? 1 : 2);
        boolean b17 = lVar.b(inputPath, outputPath, cVar, new com.tencent.mm.pluginsdk.model.e3(c0Var, pVar, str, obj));
        c0Var.f310112d = b17;
        if (!b17) {
            pVar.f38257a = -1;
            return pVar;
        }
        synchronized (obj) {
            try {
                obj.wait(j17);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ImportVideoTransfer", e18, "", new java.lang.Object[0]);
            }
        }
        int i47 = (!c0Var.f310112d || (d17 = com.tencent.mm.plugin.sight.base.e.d(outputPath, true)) == null) ? -1 : d17.f162382a;
        if (i47 > 0) {
            pVar.f38258b = 0;
            pVar.f38257a = com.tencent.mm.sdk.platformtools.t8.V1(i47);
        }
        return pVar;
    }

    public final boolean a() {
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_c2c_remuxing_avc_use_hard_encode, 0) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImportVideoTransfer", "expt enableAvcHard:%s", java.lang.Boolean.valueOf(z17));
        int g17 = bm5.o1.f22719a.g(bm5.h0.RepairerConfig_Media_AvcEncodeHard_Int, 0);
        if (g17 == 0) {
            return z17;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImportVideoTransfer", "debug repairerConfig:" + g17);
        return g17 == 1;
    }
}
