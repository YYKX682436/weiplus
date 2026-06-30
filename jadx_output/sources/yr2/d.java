package yr2;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final yr2.d f464663a = new yr2.d();

    public final dn.o a(int i17, long j17, java.lang.String originMediaId, java.lang.String mediaId, java.lang.String url, java.lang.String path, int i18, java.lang.String fileFormat, java.lang.String urlToken, java.lang.String str, boolean z17, dn.n videoCallback, int i19, java.lang.String tag, yr2.f fVar, byte[] bArr) {
        r45.vf2 vf2Var;
        r45.vq2 vq2Var;
        kotlin.jvm.internal.o.g(originMediaId, "originMediaId");
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(fileFormat, "fileFormat");
        kotlin.jvm.internal.o.g(urlToken, "urlToken");
        kotlin.jvm.internal.o.g(videoCallback, "videoCallback");
        kotlin.jvm.internal.o.g(tag, "tag");
        boolean X2 = com.tencent.mm.plugin.finder.storage.t70.f127590a.X2();
        cs2.l lVar = new cs2.l(j17, i17);
        lVar.f241802u = pm0.v.u(j17);
        lVar.f241785d = "task_FinderUtil";
        lVar.field_mediaId = mediaId;
        lVar.M1 = url.concat(urlToken);
        lVar.A = 60;
        lVar.B = 60;
        lVar.H1 = 1;
        lVar.Z = 8;
        lVar.X = 0L;
        if (X2) {
            lVar.field_requestVideoFormat = i18;
            lVar.X1 = fileFormat;
        } else {
            lVar.field_requestVideoFormat = i18 <= 0 ? ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).Ai(1, path) : i18;
        }
        lVar.field_fullpath = path;
        lVar.f241809y0 = zy2.u.f477581a;
        lVar.f241806x0 = ((c61.l7) i95.n0.c(c61.l7.class)).ek().f464691h;
        lVar.Y1 = str;
        lVar.f241798q = z17;
        lVar.f241815c2 = videoCallback;
        lVar.T1 = java.lang.String.valueOf(i19);
        lVar.T = 24;
        lVar.B = 86400;
        r45.tq2 tq2Var = (r45.tq2) ((c61.l7) i95.n0.c(c61.l7.class)).ek().f464699p.get(originMediaId);
        boolean z18 = false;
        java.lang.Integer valueOf = (tq2Var == null || (vq2Var = (r45.vq2) tq2Var.getCustom(2)) == null) ? null : java.lang.Integer.valueOf(vq2Var.getInteger(0));
        if (valueOf != null && valueOf.intValue() == 1) {
            z18 = true;
        }
        lVar.U = z18;
        yr2.f fVar2 = fVar;
        if (fVar2 != null) {
            if (!fVar2.f464671c) {
                fVar2 = null;
            }
            if (fVar2 != null) {
                lVar.field_aesKey = fVar2.f464669a;
                lVar.f241788g = fVar2.f464670b;
                lVar.f241799r = fVar2.f464671c;
            }
        }
        jz5.o oVar = (jz5.o) ((c61.l7) i95.n0.c(c61.l7.class)).ek().f464701r.get(originMediaId);
        if (oVar != null && (vf2Var = (r45.vf2) oVar.f302841d) != null) {
            java.lang.String string = vf2Var.getString(15);
            if (string == null) {
                string = "";
            }
            lVar.f241801t = string;
        }
        lVar.V = bArr;
        com.tencent.mars.xlog.Log.i(tag, "createOnlineTask, isHot=" + z17 + " reqFormat=" + i18 + " fileFormat=" + fileFormat + ", isOpenMultiBitRateDownload=" + X2 + ", decodeKey=" + str + ' ' + urlToken + " ediaId=" + mediaId + " url=" + lVar.M1 + " originMediaId:" + originMediaId + " cdn_sharding_download_info:" + valueOf + " reportDetailPacketTransInfo:" + lVar.U + " finderMediaCdnInfo:" + lVar.V);
        com.tencent.mm.autogen.events.FinderCdnTaskEvent finderCdnTaskEvent = new com.tencent.mm.autogen.events.FinderCdnTaskEvent();
        am.na naVar = finderCdnTaskEvent.f54257g;
        naVar.f7414a = 1;
        naVar.f7415b = lVar;
        finderCdnTaskEvent.e();
        return lVar;
    }

    public final cs2.p b(yr2.h detail, long j17, int i17, int i18, dn.k taskCallback, dn.l preloadCallback, java.lang.String tag) {
        r45.vf2 vf2Var;
        r45.vq2 vq2Var;
        kotlin.jvm.internal.o.g(detail, "detail");
        kotlin.jvm.internal.o.g(taskCallback, "taskCallback");
        kotlin.jvm.internal.o.g(preloadCallback, "preloadCallback");
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.b(detail.f464676e, "h265");
        ek4.b a17 = ek4.b.a(detail.f464672a, 0, 0, 0, 0, 0L, null, 0, 127, null);
        mn2.g4 g4Var = detail.f464677f;
        cs2.p pVar = new cs2.p(a17, g4Var);
        cs2.n nVar = detail.f464680i;
        kotlin.jvm.internal.o.g(nVar, "<set-?>");
        pVar.f222095l2 = nVar;
        pVar.f222094k2 = i18;
        pVar.f222089f2 = j17;
        pVar.f241785d = "task_VideoPreloadWorker";
        pVar.f241802u = pm0.v.u(j17);
        pVar.field_mediaId = g4Var.n();
        pVar.M1 = g4Var.getUrl().concat(g4Var.i());
        pVar.field_fullpath = g4Var.getPath();
        pVar.Y1 = g4Var.h();
        r45.mb4 mb4Var = g4Var.f330002e;
        boolean z17 = false;
        pVar.f241798q = mb4Var.getInteger(39) == 1;
        pVar.Y = 2;
        pVar.H1 = 2;
        pVar.Z = 8;
        int i19 = detail.f464673b;
        pVar.V1 = i19;
        pVar.field_preloadRatio = i19;
        pVar.X = 0L;
        pVar.f241809y0 = zy2.u.f477581a;
        pVar.f241806x0 = ((c61.l7) i95.n0.c(c61.l7.class)).ek().f464690g;
        pVar.f241787f = taskCallback;
        pVar.f241796p0 = preloadCallback;
        pVar.field_fileType = 20302;
        long j18 = detail.f464674c;
        pVar.f241805x = j18;
        pVar.field_requestVideoFormat = 0;
        java.lang.String value = detail.f464675d;
        kotlin.jvm.internal.o.g(value, "value");
        pVar.X1 = value;
        pVar.T1 = java.lang.String.valueOf(i17);
        pVar.T = 24;
        java.lang.String string = mb4Var.getString(9);
        r45.tq2 tq2Var = (r45.tq2) ((c61.l7) i95.n0.c(c61.l7.class)).ek().f464699p.get(string);
        java.lang.Integer valueOf = (tq2Var == null || (vq2Var = (r45.vq2) tq2Var.getCustom(2)) == null) ? null : java.lang.Integer.valueOf(vq2Var.getInteger(0));
        if (valueOf != null && valueOf.intValue() == 1) {
            z17 = true;
        }
        pVar.U = z17;
        if (detail.f464679h) {
            pVar.f241799r = true;
            pVar.field_aesKey = mb4Var.getString(54);
            pVar.f241788g = mb4Var.getString(55);
        }
        jz5.o oVar = (jz5.o) ((c61.l7) i95.n0.c(c61.l7.class)).ek().f464701r.get(string);
        if (oVar != null && (vf2Var = (r45.vf2) oVar.f302841d) != null) {
            java.lang.String string2 = vf2Var.getString(15);
            if (string2 == null) {
                string2 = "";
            }
            pVar.f241801t = string2;
        }
        com.tencent.mm.protobuf.g byteString = mb4Var.getByteString(66);
        pVar.V = byteString != null ? byteString.f192156a : null;
        so2.i3 c17 = cu2.x.c(cu2.x.f222449a, g4Var.n(), false, false, false, 14, null);
        if (nVar == cs2.n.f222080e) {
            c17.field_firstStagePreloadSize = j18;
        } else if (nVar == cs2.n.f222081f) {
            c17.field_twoStagePreloadPercent = i19;
        }
        com.tencent.mars.xlog.Log.i(tag, "[createPreloadCDNTask] isHot=" + pVar.f241798q + " mediaId=" + g4Var.n() + " feedId:" + pm0.v.u(pVar.f222089f2) + pVar);
        com.tencent.mm.autogen.events.FinderCdnTaskEvent finderCdnTaskEvent = new com.tencent.mm.autogen.events.FinderCdnTaskEvent();
        am.na naVar = finderCdnTaskEvent.f54257g;
        naVar.f7414a = 1;
        naVar.f7415b = pVar;
        finderCdnTaskEvent.e();
        return pVar;
    }
}
