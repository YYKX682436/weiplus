package com.tencent.mm.pluginsdk.model;

/* loaded from: classes10.dex */
public final class x2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.model.z2 f189498a = new com.tencent.mm.pluginsdk.model.z2();

    /* renamed from: b, reason: collision with root package name */
    public d11.n f189499b;

    public final com.tencent.mm.modelcontrol.VideoTransPara a(java.lang.String str, com.tencent.mm.pointers.PInt pInt, com.tencent.mm.pluginsdk.model.z2 z2Var) {
        d11.v[] uj6;
        int b17;
        boolean z17;
        if (d11.s.fj().Ni(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImportFavVideo", "check remuxing, this video had wx meta do not remuxing. %s ", str);
            pInt.value = 1;
            return null;
        }
        com.tencent.mm.modelcontrol.VideoTransPara a17 = com.tencent.mm.modelvideoh265toh264.j.a(str);
        boolean h17 = com.tencent.mm.modelvideoh265toh264.j.h(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImportFavVideo", "check remuxing old para %s", a17);
        d11.s fj6 = d11.s.fj();
        fj6.getClass();
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.tencent.mm.modelcontrol.VideoTransPara Ui = fj6.Ui(a17.f71195h);
        if (com.tencent.mm.sdk.platformtools.t8.K0("")) {
            if (fj6.f225687v == null) {
                fj6.f225687v = fj6.tj("C2CAlbumVideoStepConfig");
            }
            uj6 = fj6.f225687v;
        } else {
            uj6 = fj6.uj("");
        }
        d11.a aVar = fj6.f225672d;
        if (uj6 != null) {
            for (d11.v vVar : uj6) {
                if (vVar != null && vVar.c()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreVideoControl", "it busy time, try to calc c2c album config.");
                    b17 = aVar.b(vVar.f225699g, a17, Ui);
                    z17 = vVar.f225698f;
                    break;
                }
            }
            b17 = 0;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreVideoControl", "it not busy time, try to calc c2c album default config.");
            b17 = aVar.b(null, a17, Ui);
        }
        z17 = true;
        if (b17 <= 0) {
            Ui = fj6.Ui(a17.f71195h);
        } else {
            Ui.f71203s = false;
        }
        fj6.aj(Ui, 1);
        if (z17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(422L, 2L, 1L, false);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(422L, 1L, 1L, false);
        }
        int q17 = com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) jx3.f.y(Ui.f71194g / 1000, new int[]{com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_INT_AUDIO_STREAM_TYPE, 544, 800, 1200, 1600}, 3, 8));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(422L, q17, 1L, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreVideoControl", "get c2c album para cost %d rpt %d. bitrate %d new para %s, original para %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), java.lang.Integer.valueOf(q17), java.lang.Integer.valueOf(b17), Ui, a17);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImportFavVideo", "check remuxing new para %s", Ui);
        int[] c17 = com.tencent.mm.pluginsdk.model.c3.c(str, Ui, z2Var);
        int i17 = c17[0];
        Ui.f71194g = i17;
        Ui.f71191d = c17[1];
        Ui.f71192e = c17[2];
        Ui.M = c17[3] / 100.0f;
        Ui.N = c17[4];
        int i18 = a17.f71194g;
        if (i18 <= 640000 || i17 > i18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImportFavVideo", "new bitrate is bigger than old bitrate %s %s", Ui, a17);
            if (h17) {
                pInt.value = 1;
                return null;
            }
        }
        if (Ui.f71191d > 0 && Ui.f71192e > 0) {
            pInt.value = 0;
            return Ui;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImportFavVideo", "para.width or height is 0:" + Ui.f71191d + ", " + Ui.f71192e);
        pInt.value = -5;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r19, java.lang.String r20, kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.model.x2.b(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r19, java.lang.String r20, kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.model.x2.c(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r34, java.lang.String r35, com.tencent.mm.modelcontrol.VideoTransPara r36, boolean r37, boolean r38, long r39, kotlin.coroutines.Continuation r41) {
        /*
            Method dump skipped, instructions count: 876
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.model.x2.d(java.lang.String, java.lang.String, com.tencent.mm.modelcontrol.VideoTransPara, boolean, boolean, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r22, java.lang.String r23, com.tencent.mm.modelcontrol.VideoTransPara r24, boolean r25, boolean r26, long r27, kotlin.coroutines.Continuation r29) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.model.x2.e(java.lang.String, java.lang.String, com.tencent.mm.modelcontrol.VideoTransPara, boolean, boolean, long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
