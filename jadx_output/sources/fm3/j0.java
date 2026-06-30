package fm3;

/* loaded from: classes10.dex */
public final class j0 {

    /* renamed from: a */
    public static final fm3.j0 f264078a = new fm3.j0();

    /* renamed from: b */
    public static int f264079b;

    /* renamed from: c */
    public static r45.bt4 f264080c;

    public final long a(fm3.u musicMv) {
        kotlin.jvm.internal.o.g(musicMv, "musicMv");
        return musicMv.f264142v > 0 ? (musicMv.f264143w + c01.id.c()) - musicMv.f264142v : musicMv.f264143w;
    }

    public final fm3.k0 b(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        fm3.f0 f0Var = fm3.f0.f264048a;
        java.util.HashMap hashMap = fm3.f0.f264054g;
        java.util.LinkedList<java.util.Map.Entry> linkedList = new java.util.LinkedList();
        linkedList.addAll(hashMap.entrySet());
        kz5.g0.t(linkedList, fm3.i0.f264076d);
        long j17 = 1;
        long j18 = 1;
        for (java.util.Map.Entry entry : linkedList) {
            if (j17 < ((java.lang.Number) entry.getKey()).intValue()) {
                j17 = ((java.lang.Number) entry.getKey()).intValue();
            }
            if (j18 > ((java.lang.Number) entry.getKey()).intValue()) {
                j18 = ((java.lang.Number) entry.getKey()).intValue();
            }
        }
        return new fm3.k0(j17, j18, ((java.util.Map.Entry) kz5.n0.Z(linkedList)) != null ? ((java.lang.Number) r11.getKey()).intValue() : 0L);
    }

    public final long c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        r45.bt4 bt4Var = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(context, 7, r45.bt4.class);
        if (bt4Var == null) {
            return 0 / 1000;
        }
        if (bt4Var.f371046q <= 0) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            return (android.os.SystemClock.elapsedRealtime() - bt4Var.f371044o) - bt4Var.f371045p;
        }
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - bt4Var.f371046q;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MvReportLogic", "pause music now, pauseTime:" + elapsedRealtime);
        return (android.os.SystemClock.elapsedRealtime() - bt4Var.f371044o) - elapsedRealtime;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00f4, code lost:
    
        if (r1 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0105, code lost:
    
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0103, code lost:
    
        if ((r1.getId() != 0) != false) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.content.Context r16, r45.hf2 r17, fm3.u r18, int r19, long r20) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fm3.j0.d(android.content.Context, r45.hf2, fm3.u, int, long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0193, code lost:
    
        if (r0 == null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01a6, code lost:
    
        if ((r0.getId() != 0) != false) goto L113;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(android.content.Context r17, r45.hf2 r18, fm3.u r19) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fm3.j0.e(android.content.Context, r45.hf2, fm3.u):void");
    }

    public final void f(android.content.Context context, r45.hf2 songInfo, fm3.u musicMv, int i17, int i18, int i19, int i27, int i28, int i29, java.lang.String jumpType, int i37) {
        java.lang.String string;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(songInfo, "songInfo");
        kotlin.jvm.internal.o.g(musicMv, "musicMv");
        kotlin.jvm.internal.o.g(jumpType, "jumpType");
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MvReportLogic", "reportMvInfo, action:" + i17);
        r45.bt4 bt4Var = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(context, 7, r45.bt4.class);
        com.tencent.mm.autogen.mmdata.rpt.MvInfoReportStruct mvInfoReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MvInfoReportStruct();
        if (bt4Var != null) {
            mvInfoReportStruct.f59545d = mvInfoReportStruct.b("ContextId", bt4Var.f371037e, true);
            java.lang.String string2 = songInfo.getString(0);
            mvInfoReportStruct.f59546e = mvInfoReportStruct.b("SongName", string2 != null ? r26.i0.t(string2, ",", " ", false) : null, true);
            java.lang.String string3 = songInfo.getString(5);
            mvInfoReportStruct.f59547f = mvInfoReportStruct.b("SongId", string3 != null ? r26.i0.t(string3, ",", " ", false) : null, true);
            mvInfoReportStruct.f59548g = mvInfoReportStruct.b("WebUrl", songInfo.getString(4), true);
            mvInfoReportStruct.f59549h = mvInfoReportStruct.b("DataUrl", songInfo.getString(2), true);
            java.lang.String string4 = songInfo.getString(1);
            mvInfoReportStruct.f59550i = mvInfoReportStruct.b("Singer", string4 != null ? r26.i0.t(string4, ",", " ", false) : null, true);
            long j17 = i17;
            mvInfoReportStruct.f59551j = j17;
            mvInfoReportStruct.f59552k = mvInfoReportStruct.b("AppId", songInfo.getString(3), true);
            java.lang.String string5 = songInfo.getString(6);
            mvInfoReportStruct.f59553l = string5 == null || string5.length() == 0 ? 2L : 1L;
            mvInfoReportStruct.f59554m = mvInfoReportStruct.b("Sect", songInfo.getString(9), true);
            mvInfoReportStruct.f59555n = mvInfoReportStruct.b("CoverURL", songInfo.getString(8), true);
            mvInfoReportStruct.f59551j = j17;
            mvInfoReportStruct.f59557p = i18;
            mvInfoReportStruct.f59558q = i19;
            r45.if2 if2Var = (r45.if2) songInfo.getCustom(17);
            mvInfoReportStruct.f59559r = mvInfoReportStruct.b("H5URL", (if2Var == null || (string = if2Var.getString(0)) == null) ? "" : r26.i0.t(string, ",", " ", false), true);
            mvInfoReportStruct.f59560s = i27;
            mvInfoReportStruct.f59562u = i29;
            mvInfoReportStruct.f59561t = i28;
            mvInfoReportStruct.f59563v = mvInfoReportStruct.b("JumpType", jumpType, true);
            mvInfoReportStruct.f59564w = i37;
        }
        mvInfoReportStruct.k();
        mvInfoReportStruct.o();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f7, code lost:
    
        if (r11 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0108, code lost:
    
        r6 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0106, code lost:
    
        if ((r11.getId() != 0) != false) goto L83;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(android.content.Context r10, r45.hf2 r11, fm3.u r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fm3.j0.h(android.content.Context, r45.hf2, fm3.u, int, int):void");
    }

    public final void i(android.content.Context context, r45.hf2 songInfo, fm3.u musicMv, int i17, int i18, java.lang.String jumpType) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(songInfo, "songInfo");
        kotlin.jvm.internal.o.g(musicMv, "musicMv");
        kotlin.jvm.internal.o.g(jumpType, "jumpType");
        r45.bt4 bt4Var = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(context, 7, r45.bt4.class);
        f264080c = bt4Var;
        com.tencent.mm.autogen.mmdata.rpt.MvEnterReportStruct mvEnterReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MvEnterReportStruct();
        if (bt4Var != null) {
            mvEnterReportStruct.f59499d = mvEnterReportStruct.b("ContextId", bt4Var.f371037e, true);
            mvEnterReportStruct.f59504i = bt4Var.f371036d;
            mvEnterReportStruct.f59505j = mvEnterReportStruct.b("FromSourceId", bt4Var.f371039g, true);
            bt4Var.f371047r = 0;
            bt4Var.f371048s = 0;
            bt4Var.f371051v = 0L;
            bt4Var.f371049t = 0;
            bt4Var.f371050u = 2;
            if (bt4Var.f371036d == 18) {
                f264079b = 18;
            }
        }
        if (f264079b == 18 && (context instanceof android.app.Activity)) {
            android.content.Intent intent = ((android.app.Activity) context).getIntent();
            mvEnterReportStruct.B = mvEnterReportStruct.b("SceneNote", intent != null ? intent.getStringExtra("key_mv_scene_note") : null, true);
        }
        java.lang.String string = songInfo.getString(0);
        mvEnterReportStruct.f59500e = mvEnterReportStruct.b("SongName", string != null ? r26.i0.t(string, ",", " ", false) : null, true);
        mvEnterReportStruct.f59503h = mvEnterReportStruct.b("AppId", songInfo.getString(3), true);
        mvEnterReportStruct.f59501f = mvEnterReportStruct.b("WebUrl", songInfo.getString(4), true);
        mvEnterReportStruct.f59502g = mvEnterReportStruct.b("DataUrl", songInfo.getString(2), true);
        java.lang.String string2 = songInfo.getString(6);
        mvEnterReportStruct.f59508m = string2 == null || string2.length() == 0 ? 2L : 1L;
        java.lang.Long l17 = musicMv.f264123c;
        mvEnterReportStruct.f59506k = mvEnterReportStruct.b("MvObjectId", pm0.v.u(l17 != null ? l17.longValue() : 0L), true);
        mvEnterReportStruct.f59507l = mvEnterReportStruct.b("MvNonceId", musicMv.f264124d, true);
        java.lang.String string3 = songInfo.getString(5);
        mvEnterReportStruct.f59509n = mvEnterReportStruct.b("SongId", string3 != null ? r26.i0.t(string3, ",", " ", false) : null, true);
        mvEnterReportStruct.f59510o = 1L;
        java.lang.String string4 = songInfo.getString(1);
        mvEnterReportStruct.f59517v = mvEnterReportStruct.b("Singer", string4 != null ? r26.i0.t(string4, ",", " ", false) : null, true);
        mvEnterReportStruct.F = mvEnterReportStruct.b("PlaySameSongSessionId", fm3.z.f264173i, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MvReportLogic", "reportMvMainUIEnter struct.contextId:" + mvEnterReportStruct.f59499d + ", playSameSongSessionId:" + mvEnterReportStruct.F);
        mvEnterReportStruct.k();
        mvEnterReportStruct.o();
    }

    public final void j(android.content.Context context, r45.ss4 ss4Var, int i17, fm3.q qVar, jk4.a aVar, jk4.b bVar) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(context, "context");
        if (ss4Var == null || qVar == null || aVar == null || bVar == null) {
            return;
        }
        long j17 = aVar.f300131a;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        aVar.f300133c = android.os.SystemClock.elapsedRealtime() - j17;
        r45.bt4 bt4Var = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(context, 7, r45.bt4.class);
        com.tencent.mm.autogen.mmdata.rpt.MvVideoEditPlayReportStruct mvVideoEditPlayReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MvVideoEditPlayReportStruct();
        if (bt4Var != null) {
            mvVideoEditPlayReportStruct.f59598e = mvVideoEditPlayReportStruct.b("contextId", bt4Var.f371037e, true);
            mvVideoEditPlayReportStruct.f59597d = bt4Var.f371036d;
        }
        fm3.o oVar = qVar.f264113n;
        boolean b17 = oVar != null ? oVar.b() : false;
        boolean z18 = qVar.f264114o != null;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ss4Var.getCustom(0);
        if (finderObject == null || (str = java.lang.Long.valueOf(finderObject.getId()).toString()) == null) {
            str = "";
        }
        mvVideoEditPlayReportStruct.f59599f = mvVideoEditPlayReportStruct.b("mvObjectId", str, true);
        com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) ss4Var.getCustom(0);
        mvVideoEditPlayReportStruct.f59600g = mvVideoEditPlayReportStruct.b("mvNonceId", finderObject2 != null ? finderObject2.getObjectNonceId() : null, true);
        mvVideoEditPlayReportStruct.f59601h = i17;
        mvVideoEditPlayReportStruct.f59602i = z18 ? 2 : 1;
        mvVideoEditPlayReportStruct.f59603j = b17 ? 1 : 2;
        mvVideoEditPlayReportStruct.f59604k = aVar.f300132b;
        mvVideoEditPlayReportStruct.f59605l = aVar.f300134d;
        mvVideoEditPlayReportStruct.f59606m = aVar.f300140j;
        mvVideoEditPlayReportStruct.f59607n = aVar.f300141k;
        mvVideoEditPlayReportStruct.k();
        aVar.f300131a = android.os.SystemClock.elapsedRealtime();
        bVar.f300142a = 0;
        bVar.f300143b = 0L;
        bVar.f300144c = 0;
        bVar.f300145d = 0;
        mvVideoEditPlayReportStruct.o();
    }

    public final void k(android.content.Context context, r45.hf2 songInfo, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(songInfo, "songInfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MvReportLogic", "reportMvMusicCardAction, action:" + i17);
        r45.bt4 bt4Var = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(context, 7, r45.bt4.class);
        com.tencent.mm.autogen.mmdata.rpt.MvCardActionReportStruct mvCardActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MvCardActionReportStruct();
        if (bt4Var != null) {
            mvCardActionReportStruct.f59450d = mvCardActionReportStruct.b("ContextId", bt4Var.f371037e, true);
            mvCardActionReportStruct.f59457k = bt4Var.f371036d;
            mvCardActionReportStruct.f59458l = mvCardActionReportStruct.b("FromSourceId", bt4Var.f371039g, true);
        }
        java.lang.String string = songInfo.getString(0);
        mvCardActionReportStruct.f59451e = mvCardActionReportStruct.b("SongName", string != null ? r26.i0.t(string, ",", " ", false) : null, true);
        java.lang.String string2 = songInfo.getString(5);
        mvCardActionReportStruct.f59452f = mvCardActionReportStruct.b("SongId", string2 != null ? r26.i0.t(string2, ",", " ", false) : null, true);
        mvCardActionReportStruct.f59453g = mvCardActionReportStruct.b("WebUrl", songInfo.getString(4), true);
        mvCardActionReportStruct.f59454h = mvCardActionReportStruct.b("DataUrl", songInfo.getString(2), true);
        java.lang.String string3 = songInfo.getString(1);
        mvCardActionReportStruct.f59455i = mvCardActionReportStruct.b("Singer", string3 != null ? r26.i0.t(string3, ",", " ", false) : null, true);
        mvCardActionReportStruct.f59459m = mvCardActionReportStruct.b("AppId", songInfo.getString(3), true);
        mvCardActionReportStruct.f59456j = i17;
        mvCardActionReportStruct.k();
        mvCardActionReportStruct.o();
    }

    public final void l(android.content.Context context, fm3.u musicMv, jk4.e eVar) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(musicMv, "musicMv");
        if (eVar == null) {
            return;
        }
        java.util.HashMap hashMap = eVar.f300154e;
        if (hashMap.isEmpty()) {
            return;
        }
        long j17 = eVar.f300151b;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        eVar.f300152c = android.os.SystemClock.elapsedRealtime() - j17;
        r45.bt4 bt4Var = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(context, 7, r45.bt4.class);
        com.tencent.mm.autogen.mmdata.rpt.MvVideoPlayReportStruct mvVideoPlayReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MvVideoPlayReportStruct();
        if (bt4Var != null) {
            mvVideoPlayReportStruct.f59609e = mvVideoPlayReportStruct.b("contextId", bt4Var.f371037e, true);
            mvVideoPlayReportStruct.f59608d = bt4Var.f371036d;
        }
        mvVideoPlayReportStruct.f59611g = mvVideoPlayReportStruct.b("mvNonceId", musicMv.f264124d, true);
        java.lang.Long l17 = musicMv.f264123c;
        mvVideoPlayReportStruct.f59610f = mvVideoPlayReportStruct.b("mvObjectId", l17 != null ? l17.toString() : null, true);
        mvVideoPlayReportStruct.f59612h = eVar.f300153d;
        mvVideoPlayReportStruct.f59614j = eVar.f300152c;
        java.util.Collection values = hashMap.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            i17 += ((jk4.a) it.next()).f300134d;
        }
        mvVideoPlayReportStruct.f59613i = i17;
        try {
            cl0.g gVar = new cl0.g();
            for (java.util.Map.Entry entry : hashMap.entrySet()) {
                cl0.g gVar2 = new cl0.g();
                gVar2.p("firstFrame", ((jk4.a) entry.getValue()).f300132b);
                gVar2.p("playTime", ((jk4.a) entry.getValue()).f300133c);
                gVar2.o("waitCount", ((jk4.a) entry.getValue()).f300134d);
                gVar2.o("renderTime", ((jk4.a) entry.getValue()).f300137g);
                if (((jk4.a) entry.getValue()).f300141k != 1000) {
                    gVar2.o("errType", ((jk4.a) entry.getValue()).f300140j);
                    gVar2.o("errCode", ((jk4.a) entry.getValue()).f300141k);
                }
                if (((jk4.a) entry.getValue()).f300138h > 0) {
                    gVar2.o("ptsNegative", ((jk4.a) entry.getValue()).f300138h);
                }
                if (((jk4.a) entry.getValue()).f300139i > 0) {
                    gVar2.o("ptsOutOfBound", ((jk4.a) entry.getValue()).f300139i);
                }
                gVar.h(java.lang.String.valueOf(((java.lang.Number) entry.getKey()).intValue()), gVar2);
            }
            java.lang.String gVar3 = gVar.toString();
            kotlin.jvm.internal.o.f(gVar3, "toString(...)");
            str = r26.i0.t(gVar3, ",", ";", false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MV.MvReportInfo", e17, "getJson", new java.lang.Object[0]);
            str = "";
        }
        mvVideoPlayReportStruct.f59615k = mvVideoPlayReportStruct.b("VideoPlayInfo", str, true);
        java.util.Collection values2 = hashMap.values();
        kotlin.jvm.internal.o.f(values2, "<get-values>(...)");
        java.util.Iterator it6 = values2.iterator();
        int i18 = 0;
        while (it6.hasNext()) {
            i18 += ((jk4.a) it6.next()).f300141k != 1000 ? 1 : 0;
        }
        mvVideoPlayReportStruct.f59616l = i18;
        mvVideoPlayReportStruct.k();
        hashMap.clear();
        jk4.b bVar = eVar.f300150a;
        if (bVar != null) {
            bVar.f300142a = 0;
            bVar.f300143b = 0L;
            bVar.f300144c = 0;
            bVar.f300145d = 0;
        }
        mvVideoPlayReportStruct.o();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c3, code lost:
    
        if (r9 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d4, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d2, code lost:
    
        if ((r9.getId() != 0) != false) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(android.content.Context r8, r45.hf2 r9, fm3.u r10, int r11, int r12, java.lang.String r13, int r14) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fm3.j0.m(android.content.Context, r45.hf2, fm3.u, int, int, java.lang.String, int):void");
    }
}
