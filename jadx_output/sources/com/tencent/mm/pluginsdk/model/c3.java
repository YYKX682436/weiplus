package com.tencent.mm.pluginsdk.model;

/* loaded from: classes10.dex */
public class c3 extends java.lang.Thread {

    /* renamed from: v, reason: collision with root package name */
    public static final java.util.HashMap f189249v = new java.util.HashMap();

    /* renamed from: w, reason: collision with root package name */
    public static final java.lang.Object f189250w = new byte[0];

    /* renamed from: x, reason: collision with root package name */
    public static com.tencent.mm.sdk.platformtools.i6 f189251x;

    /* renamed from: y, reason: collision with root package name */
    public static int f189252y;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f189253d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f189254e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Intent f189255f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f189256g;

    /* renamed from: h, reason: collision with root package name */
    public final int f189257h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f189258i;

    /* renamed from: m, reason: collision with root package name */
    public m11.a f189259m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f189260n;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.model.a3 f189265s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f189266t;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.model.z2 f189267u = new com.tencent.mm.pluginsdk.model.z2();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f189261o = new java.util.ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f189262p = new java.util.ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f189263q = new java.util.ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.List f189264r = new java.util.ArrayList();

    public c3(android.content.Context context, java.util.List list, android.content.Intent intent, java.lang.String str, int i17, com.tencent.mm.pluginsdk.model.a3 a3Var, boolean z17) {
        this.f189253d = context;
        this.f189254e = list;
        this.f189255f = intent;
        this.f189265s = a3Var;
        this.f189256g = str;
        this.f189257h = i17;
        this.f189258i = z17;
    }

    public static com.tencent.mm.modelcontrol.VideoTransPara b(java.lang.String str, com.tencent.mm.pointers.PInt pInt, com.tencent.mm.pluginsdk.model.z2 z2Var, java.lang.String str2) {
        com.tencent.mm.modelcontrol.VideoTransPara a17 = com.tencent.mm.modelvideoh265toh264.j.a(str);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(com.tencent.mm.modelvideoh265toh264.j.h(str));
        com.tencent.mm.modelcontrol.VideoTransPara bj6 = d11.s.fj().bj(a17, str2);
        if (bj6 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImportMultiVideo", "get C2C album video para is null. old para %s", a17);
            pInt.value = -5;
            return null;
        }
        int i17 = a17.f71194g;
        int i18 = bj6.f71194g;
        int hj6 = (int) (i18 * ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).hj(new com.tencent.mm.repairer.config.fundation.RepairerConfigVideoCompressTagMaxValue()));
        com.tencent.mars.xlog.Log.i("MicroMsg.ImportMultiVideo", "check remuxing video bitrate, path: %s ,originBitrate: %s, targetBitrate:%s, targetMaxBitrate: %s", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(hj6));
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.fundation.RepairerConfigVideoCompressTag()) == 1 && i17 <= hj6) {
            d11.s.fj().getClass();
            java.lang.String readMetaDataVFS = com.tencent.mm.plugin.sight.base.SightVideoJNI.readMetaDataVFS(str, "wxMeta");
            boolean contains = readMetaDataVFS == null ? false : readMetaDataVFS.contains("WXVer");
            boolean Ni = d11.s.fj().Ni(str);
            boolean Ri = d11.s.fj().Ri(str);
            com.tencent.mars.xlog.Log.i("MicroMsg.ImportMultiVideo", "check remuxing, ffmpegFlag: " + contains + " moovFlag: " + Ni + " iOSFlag:" + Ri);
            if (contains || Ni || Ri) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ImportMultiVideo", "check remuxing, this video had wx meta do not remuxing");
                pInt.value = 1;
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(422L, 51L, 1L, false);
                return null;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImportMultiVideo", "check remuxing targetBitrate: %s, new para %s", java.lang.Integer.valueOf(i18), bj6);
        int[] c17 = c(str, bj6, z2Var);
        bj6.f71194g = c17[0];
        bj6.f71191d = c17[1];
        bj6.f71192e = c17[2];
        bj6.M = c17[3] / 100.0f;
        bj6.N = c17[4];
        if (j62.e.g().c(new com.tencent.mm.repairer.config.fundation.RepairerConfigVideoCompressTag()) != 1) {
            i18 = bj6.f71194g;
        }
        int i19 = a17.f71194g;
        if (i19 > 640000 && i19 >= i18) {
            if (a17.f71195h * 1000 >= ip.a.f293544a.a() * 1000) {
                pInt.value = -6;
                return null;
            }
            if (valueOf.booleanValue()) {
                pInt.value = 0;
            } else {
                boolean is2G = com.tencent.mars.comm.NetStatusUtil.is2G(com.tencent.mm.sdk.platformtools.x2.f193071a);
                pInt.value = com.tencent.mm.plugin.sight.base.SightVideoJNI.shouldRemuxingVFS(str, bj6.f71191d, bj6.f71192e, is2G ? 10485760 : com.tencent.mm.pluginsdk.model.e4.a(), is2G ? 60000.0d : r4.a() * 1000, 1000000);
            }
            return bj6;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImportMultiVideo", "new bitrate(%s|%s) is bigger than old bitrate(%s) %s %s", java.lang.Integer.valueOf(i18), 640000, java.lang.Integer.valueOf(a17.f71194g), bj6, a17);
        if (valueOf.booleanValue()) {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_import_video_enable_hevc_soft, 0) != 1) {
                pInt.value = 0;
                a17.f71191d = c17[1];
                a17.f71192e = c17[2];
                a17.M = c17[3] / 100.0f;
                a17.N = c17[4];
                com.tencent.mars.xlog.Log.i("MicroMsg.ImportMultiVideo", "need compress h265 to h264, use old bitrate: %s", java.lang.Integer.valueOf(a17.f71194g));
                return a17;
            }
        }
        pInt.value = 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImportMultiVideo", "no need compress, send directly: %s", str);
        return null;
    }

    public static int[] c(java.lang.String str, com.tencent.mm.modelcontrol.VideoTransPara videoTransPara, com.tencent.mm.pluginsdk.model.z2 z2Var) {
        int i17;
        if (com.tencent.mm.pluginsdk.model.d3.f189276a.a()) {
            videoTransPara.A = 1;
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_enable_c2c_soft_encode_vcodec2_faster_preset, 1) > 0);
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_enable_c2c_soft_encode_vcodec2_crf_preset, 14);
        int g17 = bm5.o1.f22719a.g(bm5.h0.RepairerConfig_Media_ImportVideoHEVC_CRF_Int, 0);
        if (Ni > 0 || g17 > 0) {
            videoTransPara.P = Ni;
            if (g17 > 0) {
                videoTransPara.P = g17;
            }
        } else if (valueOf.booleanValue()) {
            videoTransPara.P = 16;
        }
        int[] iArr = {0, 0, 0, 0, 0};
        iArr[0] = videoTransPara.f71194g;
        iArr[1] = videoTransPara.f71191d;
        iArr[2] = videoTransPara.f71192e;
        int i18 = videoTransPara.f71205u;
        if ((i18 != 1 && i18 != 2) || ((i17 = videoTransPara.G) != 2 && i17 != 4 && i17 != 1)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImportMultiVideo", "c2c ABA: No use ABA algorithm");
            return iArr;
        }
        com.tencent.mm.plugin.sight.base.a aVar = new com.tencent.mm.plugin.sight.base.a();
        if (d11.a.a()) {
            aVar.f162381a = false;
        }
        com.tencent.mm.plugin.sight.base.ABAPrams b17 = com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate.b(str, videoTransPara.f71192e, videoTransPara.f71191d, videoTransPara.f71193f, videoTransPara.f71194g, 10.0f, 0.0f, videoTransPara.G, videoTransPara.f71207w, videoTransPara.P * 1.0f, videoTransPara.f71209y, videoTransPara.f71210z, videoTransPara.A, videoTransPara.B, videoTransPara.C, false, aVar);
        z2Var.f189509a = b17;
        if (b17 != null) {
            iArr[0] = b17.outputKbps * 1000;
            iArr[3] = b17.crf;
            iArr[4] = b17.vbvBufferSize;
        }
        if (b17 != null && b17.resolutionAdjust > 0) {
            iArr[1] = b17.outputWidth;
            iArr[2] = b17.outputHeight;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImportMultiVideo", "ABA: Adaptive Bitrate Methods:videoBitrate [%d]  targetWidth [%d]  targetHeight [%d] crf[%d] vbvBufferSize[%d]", java.lang.Integer.valueOf(iArr[0]), java.lang.Integer.valueOf(iArr[1]), java.lang.Integer.valueOf(iArr[2]), java.lang.Integer.valueOf(iArr[3]), java.lang.Integer.valueOf(iArr[4]));
        t21.o2.Di().q(z2Var.f189509a);
        return iArr;
    }

    public static void d(java.lang.String str, int[] iArr, int i17, int i18) {
        gp.d dVar;
        try {
            dVar = new gp.d();
            try {
                dVar.setDataSource(str);
                int P = com.tencent.mm.sdk.platformtools.t8.P(dVar.extractMetadata(18), 0);
                int P2 = com.tencent.mm.sdk.platformtools.t8.P(dVar.extractMetadata(19), 0);
                iArr[0] = P;
                iArr[1] = P2;
                for (int i19 = 0; i19 < 3; i19++) {
                    if (P % 2 == 0 && P2 % 2 == 0) {
                        if ((P >= P2 && (P <= i17 || P2 <= i18)) || (P <= P2 && (P <= i18 || P2 <= i17))) {
                            break;
                        }
                        P /= 2;
                        P2 /= 2;
                    }
                    try {
                        dVar.release();
                    } catch (java.io.IOException unused) {
                    }
                    int i27 = iArr[0];
                    if (i27 % 2 != 0) {
                        iArr[0] = i27 + 1;
                    }
                    int i28 = iArr[1];
                    if (i28 % 2 != 0) {
                        iArr[1] = i28 + 1;
                        return;
                    }
                    return;
                }
                iArr[0] = P;
                iArr[1] = P2;
                try {
                    dVar.release();
                } catch (java.io.IOException unused2) {
                }
                int i29 = iArr[0];
                if (i29 % 2 != 0) {
                    iArr[0] = i29 + 1;
                }
                int i37 = iArr[1];
                if (i37 % 2 != 0) {
                    iArr[1] = i37 + 1;
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                try {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ImportMultiVideo", "VFSMediaMetadataRetriever error", th);
                    if (dVar != null) {
                        try {
                            dVar.release();
                        } catch (java.io.IOException unused3) {
                        }
                    }
                    int i38 = iArr[0];
                    if (i38 % 2 != 0) {
                        iArr[0] = i38 + 1;
                    }
                    int i39 = iArr[1];
                    if (i39 % 2 != 0) {
                        iArr[1] = i39 + 1;
                    }
                } finally {
                }
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            dVar = null;
        }
    }

    public static long e(int i17) {
        return i17 != 1 ? 2L : 5L;
    }

    public static void h(boolean z17, java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AtomStatUtil", "report video remuxing but path is null.");
            return;
        }
        try {
            long k17 = com.tencent.mm.vfs.w6.k(str);
            long k18 = com.tencent.mm.vfs.w6.k(str2);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11098, java.lang.Integer.valueOf(com.tencent.liteav.TXLiteAVCode.WARNING_VIRTUAL_BACKGROUND_DEVICE_UNSURPORTED), (z17 ? 1 : 0) + ";" + k17 + ";" + k18 + ";" + ((int) ((100 * k18) / k17)));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AtomStatUtil", e17, "", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.e("MicroMsg.AtomStatUtil", "reportVideoRemuxing error : " + e17.toString());
        }
    }

    public static void j(java.lang.String str, int i17) {
        int i18;
        int i19;
        int i27;
        if (i17 == 1) {
            i18 = 220;
            i19 = 228;
            i27 = 219;
        } else {
            i18 = 234;
            i19 = 242;
            i27 = com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR;
        }
        int k17 = (int) (com.tencent.mm.vfs.w6.k(str) / 1024);
        int[] iArr = {512, 1024, 2048, 5120, 8192, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 15360, 20480};
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        int q17 = com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) jx3.f.y(k17, iArr, i18, i19));
        com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var2.idkeyStat(106L, q17, 1L, false);
        g0Var2.idkeyStat(106L, i27, 1L, false);
    }

    public final java.lang.String a(android.content.Intent intent, java.lang.String str) {
        if (intent == null) {
            return "";
        }
        java.lang.Object a17 = ok5.d.a(intent, "key_quote_extcommon");
        r15.b bVar = new r15.b();
        if (a17 instanceof r15.b) {
            bVar = (r15.b) a17;
        }
        java.lang.String stringExtra = intent.getStringExtra("key_select_media_group_id");
        int intExtra = intent.getIntExtra("key_select_media_group_count", 0);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) && intExtra > 0) {
            r15.d dVar = new r15.d();
            dVar.k(stringExtra);
            dVar.j(intExtra);
            dVar.l(1);
            bVar.o(dVar);
        }
        return bVar.toXml(false, "msg");
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x03d6, code lost:
    
        if (r12 > 1500) goto L138;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x04e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(android.content.Context r36, android.content.Intent r37) {
        /*
            Method dump skipped, instructions count: 1392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.model.c3.f(android.content.Context, android.content.Intent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v7, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(java.lang.String r25, java.lang.String r26, java.lang.String r27, android.content.Intent r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.model.c3.g(java.lang.String, java.lang.String, java.lang.String, android.content.Intent, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x044a  */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Long, com.tencent.mm.storage.f9] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(int r40, java.lang.String r41, java.lang.String r42, int r43, com.tencent.mm.modelcontrol.VideoTransPara r44, android.content.Intent r45) {
        /*
            Method dump skipped, instructions count: 1808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.model.c3.i(int, java.lang.String, java.lang.String, int, com.tencent.mm.modelcontrol.VideoTransPara, android.content.Intent):void");
    }

    public final void k(boolean z17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(106L, this.f189257h == 1 ? z17 ? 217 : 218 : z17 ? 231 : 232, 1L, false);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        android.content.Context context = this.f189253d;
        android.content.Intent intent = this.f189255f;
        java.util.List list = this.f189254e;
        if (list == null || list.size() <= 0) {
            f(context, intent);
        } else {
            for (int i17 = 0; i17 < list.size() && !this.f189266t; i17++) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ImportMultiVideo", "start to import %s", list.get(i17));
                android.content.Intent intent2 = new android.content.Intent();
                intent2.setData(android.net.Uri.parse("file://" + ((java.lang.String) list.get(i17))));
                if (intent != null) {
                    intent2.putExtra("ImportMsgLocalId", intent.getLongExtra("ImportMsgLocalId", -1L));
                    intent2.putExtra("MsgRevokeBatchId", intent.getStringExtra("key_select_revoke_batch_id"));
                    intent2.putExtra("key_select_media_group_id", intent.getStringExtra("key_select_media_group_id"));
                    intent2.putExtra("key_select_media_group_count", intent.getIntExtra("key_select_media_group_count", 0));
                    if (i17 == 0) {
                        java.lang.Object a17 = ok5.d.a(intent, "key_quote_extcommon");
                        if (a17 instanceof r15.b) {
                            ok5.d.b(intent2, "key_quote_extcommon", a17, new ok5.h());
                        }
                    }
                }
                f(context, intent2);
            }
        }
        if (this.f189265s == null || this.f189266t) {
            return;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.pluginsdk.model.y2(this));
    }
}
