package wr;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f448750a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public boolean f448751b;

    /* renamed from: c, reason: collision with root package name */
    public wr.c f448752c;

    public static final void a(wr.j jVar) {
        if (jVar.f448751b) {
            com.tencent.mars.xlog.Log.i("EmoticonThumbImageMgr", "mgr is busy.");
            return;
        }
        java.util.ArrayList arrayList = jVar.f448750a;
        if (arrayList.isEmpty()) {
            com.tencent.mars.xlog.Log.i("EmoticonThumbImageMgr", "all task finished.");
            return;
        }
        boolean z17 = false;
        java.lang.Object obj = arrayList.get(0);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        wr.c cVar = (wr.c) obj;
        arrayList.remove(0);
        jVar.f448751b = true;
        jVar.f448752c = cVar;
        java.lang.String str = cVar.f448733a;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.api.IEmojiInfo iEmojiInfo = cVar.f448734b;
            if (com.tencent.mm.sdk.platformtools.t8.D0(str, iEmojiInfo.getMd5())) {
                java.lang.String d17 = jVar.d(iEmojiInfo);
                if (d17 != null) {
                    if (d17.length() > 0) {
                        pm0.v.X(new wr.e(jVar, d17));
                        return;
                    }
                }
                wr.k e17 = jVar.e(iEmojiInfo);
                if (!(e17.f448753a.length() > 0)) {
                    com.tencent.mars.xlog.Log.i("EmoticonThumbImageMgr", "no thumb url available. start download origin emoticon. md5: " + str);
                    jVar.c(iEmojiInfo);
                    return;
                }
                com.tencent.mm.feature.emoji.api.t6 t6Var = (com.tencent.mm.feature.emoji.api.t6) i95.n0.c(com.tencent.mm.feature.emoji.api.t6.class);
                java.lang.String md52 = iEmojiInfo.getMd5();
                kotlin.jvm.internal.o.f(md52, "getMd5(...)");
                java.lang.String Ui = ((com.tencent.mm.feature.emoji.r4) t6Var).Ui(md52, e17.f448753a);
                if (com.tencent.mm.vfs.w6.j(Ui)) {
                    com.tencent.mars.xlog.Log.i("EmoticonThumbImageMgr", "get existing external downloaded thumb path. md5: " + iEmojiInfo.getMd5());
                    pm0.v.X(new wr.e(jVar, Ui));
                    return;
                }
                wr.b bVar = new wr.b(cVar.f448733a, e17.f448753a, e17.f448754b, Ui, new wr.i(cVar, jVar, Ui, e17));
                java.lang.String str2 = bVar.f448729b;
                boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str2);
                java.lang.String str3 = bVar.f448731d;
                if (!K0 && !com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                    z17 = true;
                }
                if (!z17) {
                    com.tencent.mars.xlog.Log.w("EmoticonThumbImageCdnDownloader", "invalid download task. md5: " + bVar.f448728a);
                    bVar.a();
                    return;
                }
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.tencent.mars.cdn.CdnManager.C2CDownloadRequest c2CDownloadRequest = new com.tencent.mars.cdn.CdnManager.C2CDownloadRequest();
                c2CDownloadRequest.queueTimeoutSeconds = 60;
                c2CDownloadRequest.transforTimeoutSeconds = 60;
                c2CDownloadRequest.taskStartTime = currentTimeMillis;
                c2CDownloadRequest.fileKey = bVar.b();
                c2CDownloadRequest.url = str2;
                c2CDownloadRequest.setSavePath(str3);
                com.tencent.mars.cdn.CdnManager cdnManager = (com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getContext().getManager(com.tencent.mars.cdn.CdnManager.class);
                if ((cdnManager != null ? cdnManager.startHttpsDownload(c2CDownloadRequest, new wr.a(bVar)) : com.tencent.mm.hardcoder.HardCoderJNI.CLIENT_DISCONNECT) != 0) {
                    bVar.a();
                    return;
                }
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("EmoticonThumbImageMgr", "try get thumb for empty or invalid md5");
        jVar.b();
    }

    public final void b() {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(96L, 61L, 1L, false);
        pm0.v.X(new wr.d(this));
    }

    public final void c(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        boolean z17 = true;
        if (com.tencent.mm.sdk.platformtools.t8.K0(iEmojiInfo.l0()) && ((com.tencent.mm.sdk.platformtools.t8.K0(iEmojiInfo.J1()) || com.tencent.mm.sdk.platformtools.t8.K0(iEmojiInfo.getAesKey())) && ((com.tencent.mm.sdk.platformtools.t8.K0(iEmojiInfo.Z()) || com.tencent.mm.sdk.platformtools.t8.K0(iEmojiInfo.getAesKey())) && (com.tencent.mm.sdk.platformtools.t8.K0(iEmojiInfo.x0()) || com.tencent.mm.sdk.platformtools.t8.K0(iEmojiInfo.getAuthKey()))))) {
            z17 = false;
        }
        if (z17) {
            ((com.tencent.mm.feature.emoji.r4) ((com.tencent.mm.feature.emoji.api.t6) i95.n0.c(com.tencent.mm.feature.emoji.api.t6.class))).Ni(iEmojiInfo, new wr.g(iEmojiInfo, this));
        } else {
            java.lang.String md52 = iEmojiInfo.getMd5();
            if (md52 == null) {
                md52 = "";
            }
            com.tencent.mars.xlog.Log.e("EmoticonThumbImageMgr", "emojiInfo can not cdn download. return for safety. md5:".concat(md52));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(96L, 60L, 1L, false);
            b();
        }
    }

    public final java.lang.String d(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        java.lang.String h07 = iEmojiInfo.h0();
        if (com.tencent.mm.vfs.w6.j(h07)) {
            com.tencent.mars.xlog.Log.i("EmoticonThumbImageMgr", "get existing cover path. md5: " + iEmojiInfo.getMd5());
            return h07;
        }
        com.tencent.mm.feature.emoji.api.t6 t6Var = (com.tencent.mm.feature.emoji.api.t6) i95.n0.c(com.tencent.mm.feature.emoji.api.t6.class);
        java.lang.String md52 = iEmojiInfo.getMd5();
        kotlin.jvm.internal.o.f(md52, "getMd5(...)");
        java.lang.String Ri = ((com.tencent.mm.feature.emoji.r4) t6Var).Ri(md52);
        if (com.tencent.mm.vfs.w6.j(Ri)) {
            com.tencent.mars.xlog.Log.i("EmoticonThumbImageMgr", "get existing external generated thumb path. md5: " + iEmojiInfo.getMd5());
            return Ri;
        }
        com.tencent.mm.feature.emoji.api.t6 t6Var2 = (com.tencent.mm.feature.emoji.api.t6) i95.n0.c(com.tencent.mm.feature.emoji.api.t6.class);
        java.lang.String md53 = iEmojiInfo.getMd5();
        kotlin.jvm.internal.o.f(md53, "getMd5(...)");
        ((com.tencent.mm.feature.emoji.r4) t6Var2).getClass();
        java.lang.String str = n22.m.g() + md53 + "_thumb";
        if (!com.tencent.mm.vfs.w6.j(str)) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("EmoticonThumbImageMgr", "get existing external generated thumb path. md5: " + iEmojiInfo.getMd5());
        return str;
    }

    public final wr.k e(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        wr.k kVar = new wr.k();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(iEmojiInfo.l())) {
            com.tencent.mars.xlog.Log.i("EmoticonThumbImageMgr", "get store thumb url. md5: " + iEmojiInfo.getMd5());
            java.lang.String l17 = iEmojiInfo.l();
            kotlin.jvm.internal.o.f(l17, "getThumbUrl(...)");
            kVar.f448753a = l17;
            return kVar;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(iEmojiInfo.G1())) {
            com.tencent.mars.xlog.Log.i("EmoticonThumbImageMgr", "get generated thumb url. md5: " + iEmojiInfo.getMd5());
            java.lang.String G1 = iEmojiInfo.G1();
            kotlin.jvm.internal.o.f(G1, "getGeneratedBusinessThumbUrl(...)");
            kVar.f448753a = G1;
            java.lang.String aesKey = iEmojiInfo.getAesKey();
            kotlin.jvm.internal.o.f(aesKey, "getAesKey(...)");
            kVar.f448754b = aesKey;
        }
        return kVar;
    }
}
