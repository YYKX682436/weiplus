package vf0;

@j95.b
/* loaded from: classes10.dex */
public class s1 extends i95.w implements wf0.o1 {
    public int Ai(int i17, java.lang.String str) {
        int i18 = d11.s.f225670x;
        int i19 = 1;
        if (i17 != 0 && ((i17 == 1 || i17 == 2) && d11.s.Di(3) && (!com.tencent.mm.vfs.w6.j(str) || t21.u2.b(str)))) {
            i19 = 2;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreVideoControl", "check story video format[%d]", java.lang.Integer.valueOf(i19));
        return i19;
    }

    public com.tencent.mm.modelcontrol.VideoTransPara Bi() {
        return d11.s.fj().ij();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.modelcontrol.VideoTransPara Di() {
        /*
            r23 = this;
            d11.s r0 = d11.s.fj()
            r0.getClass()
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.f192989a
            long r1 = android.os.SystemClock.elapsedRealtime()
            d11.v[] r3 = r0.f225688w
            if (r3 != 0) goto L19
            java.lang.String r3 = "NearbyRecordVideoConfig"
            d11.v[] r3 = r0.tj(r3)
            r0.f225688w = r3
        L19:
            d11.v[] r3 = r0.f225688w
            java.lang.String r4 = "MicroMsg.SubCoreVideoControl"
            if (r3 == 0) goto L3f
            r3 = 0
            r5 = r3
        L21:
            d11.v[] r6 = r0.f225688w
            int r7 = r6.length
            if (r5 >= r7) goto L3f
            r6 = r6[r5]
            if (r6 == 0) goto L3c
            boolean r7 = r6.c()
            if (r7 == 0) goto L3c
            java.lang.String r5 = "is busy time, try to get nearby record config."
            com.tencent.mars.xlog.Log.i(r4, r5)
            com.tencent.mm.modelcontrol.VideoTransPara r3 = r6.b(r3)
            boolean r5 = r6.f225698f
            goto L41
        L3c:
            int r5 = r5 + 1
            goto L21
        L3f:
            r5 = 1
            r3 = 0
        L41:
            if (r3 != 0) goto L47
            com.tencent.mm.modelcontrol.VideoTransPara r3 = r0.Zi()
        L47:
            r6 = 44100(0xac44, float:6.1797E-41)
            r3.f71199o = r6
            r6 = 10
            r3.f71197m = r6
            r7 = 288(0x120, float:4.04E-43)
            r3.f71204t = r7
            r7 = 2
            r0.aj(r3, r7)
            int r0 = r3.f71195h
            if (r0 > 0) goto L5e
            r3.f71195h = r6
        L5e:
            if (r5 != 0) goto L6d
            com.tencent.mm.plugin.report.service.g0 r7 = com.tencent.mm.plugin.report.service.g0.INSTANCE
            r8 = 422(0x1a6, double:2.085E-321)
            r10 = 31
            r12 = 1
            r14 = 0
            r7.idkeyStat(r8, r10, r12, r14)
            goto L7a
        L6d:
            com.tencent.mm.plugin.report.service.g0 r15 = com.tencent.mm.plugin.report.service.g0.INSTANCE
            r16 = 422(0x1a6, double:2.085E-321)
            r18 = 32
            r20 = 1
            r22 = 0
            r15.idkeyStat(r16, r18, r20, r22)
        L7a:
            int r0 = r3.f71194g
            int r0 = r0 / 1000
            r5 = 544(0x220, float:7.62E-43)
            r6 = 800(0x320, float:1.121E-42)
            r7 = 350(0x15e, float:4.9E-43)
            r8 = 1200(0x4b0, float:1.682E-42)
            r9 = 1600(0x640, float:2.242E-42)
            int[] r5 = new int[]{r7, r5, r6, r8, r9}
            r6 = 33
            r7 = 38
            java.lang.Object r0 = jx3.f.y(r0, r5, r6, r7)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = com.tencent.mm.sdk.platformtools.t8.q1(r0)
            com.tencent.mm.plugin.report.service.g0 r5 = com.tencent.mm.plugin.report.service.g0.INSTANCE
            r6 = 422(0x1a6, double:2.085E-321)
            long r8 = (long) r0
            r10 = 1
            r12 = 0
            r5.idkeyStat(r6, r8, r10, r12)
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r5 = r5 - r1
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r3, r0}
            java.lang.String r1 = "get nearby record para cost %d. %s rpt %d"
            com.tencent.mars.xlog.Log.i(r4, r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: vf0.s1.Di():com.tencent.mm.modelcontrol.VideoTransPara");
    }

    public com.tencent.mm.modelcontrol.VideoTransPara Ni() {
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara;
        d11.s fj6 = d11.s.fj();
        fj6.getClass();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        boolean z18 = true;
        if (fj6.f225681p == null) {
            ((ee0.f4) ((fe0.c4) i95.n0.c(fe0.c4.class))).getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableSnsLivePhotoImproveQuality", "com.tencent.mm.feature.sns.SnsConfigService");
            boolean a17 = pc4.f.f353435a.a();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableSnsLivePhotoImproveQuality", "com.tencent.mm.feature.sns.SnsConfigService");
            if (a17) {
                ((ee0.f4) ((fe0.c4) i95.n0.c(fe0.c4.class))).getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("snsAlbumLivePhotoImproveParams", "com.tencent.mm.feature.sns.SnsConfigService");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsLivePhotoImproveEditParams", "com.tencent.mm.plugin.sns.ui.improve.config.SnsVideoConfig");
                java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_sns_livephoto_video_improve_album_param, "", true);
                kotlin.jvm.internal.o.f(Zi, "getExpt(...)");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsLivePhotoImproveEditParams", "com.tencent.mm.plugin.sns.ui.improve.config.SnsVideoConfig");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("snsAlbumLivePhotoImproveParams", "com.tencent.mm.feature.sns.SnsConfigService");
                com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreVideoControl", "getSnsAlbumLivePhotoPara go to get improveExptParams: %s", Zi);
                fj6.f225681p = fj6.uj(Zi);
            } else {
                fj6.f225681p = fj6.tj("SnsAlbumLivePhotoConfig");
            }
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(fj6.f225681p == null);
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreVideoControl", "getSnsAlbumLivePhotoPara is null:[%b]", objArr);
        }
        if (fj6.f225681p != null) {
            int i17 = 0;
            while (true) {
                d11.v[] vVarArr = fj6.f225681p;
                if (i17 >= vVarArr.length) {
                    break;
                }
                d11.v vVar = vVarArr[i17];
                if (vVar != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreVideoControl", "getSnsAlbumLivePhotoPara >> index:%d content:%s", java.lang.Integer.valueOf(i17), vVar.toString());
                }
                if (vVar != null && vVar.c()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreVideoControl", "getSnsAlbumLivePhotoPara >> index:%d,it busy time, try to get sns album config.", java.lang.Integer.valueOf(i17));
                    videoTransPara = vVar.b(0);
                    z18 = vVar.f225698f;
                    break;
                }
                i17++;
            }
        }
        videoTransPara = null;
        if (videoTransPara == null) {
            videoTransPara = fj6.Zi();
        }
        videoTransPara.f71199o = 44100;
        videoTransPara.f71197m = 10;
        videoTransPara.f71204t = 288;
        videoTransPara.f71195h = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_album_sight_max_timelength, 300);
        fj6.aj(videoTransPara, 2);
        if (z18) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(422L, 22L, 1L, false);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(422L, 21L, 1L, false);
        }
        int q17 = com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) jx3.f.y(videoTransPara.f71194g / 1000, new int[]{com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_INT_AUDIO_STREAM_TYPE, 544, 800, 1200, 1600}, 23, 28));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(422L, q17, 1L, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreVideoControl", "getSnsAlbumLivePhotoPara cost %d. %s rpt %d ", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), videoTransPara, java.lang.Integer.valueOf(q17));
        return videoTransPara;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(3:59|60|(2:62|(8:64|4|5|6|(6:(1:9)|10|(4:12|(3:16|(6:19|(3:23|(2:25|(3:28|29|30)(1:27))|32)|33|34|31|17)|35)|14|15)|36|37|(3:39|40|(2:42|43)(2:45|(4:47|(1:49)(1:52)|50|51)(2:53|54))))|56|40|(0)(0))))|3|4|5|6|(0)|56|40|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ef, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f0, code lost:
    
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaCodecUtil", r0, "isSupportHevcEnc error", new java.lang.Object[0]);
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean wi(int r18) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vf0.s1.wi(int):boolean");
    }
}
