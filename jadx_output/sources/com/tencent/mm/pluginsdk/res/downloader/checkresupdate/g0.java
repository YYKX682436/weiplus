package com.tencent.mm.pluginsdk.res.downloader.checkresupdate;

/* loaded from: classes12.dex */
public final class g0 extends com.tencent.mm.pluginsdk.res.downloader.model.m {
    public g0(com.tencent.mm.pluginsdk.res.downloader.checkresupdate.a aVar) {
        super(aVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean interrupted;
        com.tencent.mm.pluginsdk.res.downloader.model.k kVar = this.f189688d;
        com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdate.DecryptTask", "%s: decryptTask, entered", ((com.tencent.mm.pluginsdk.res.downloader.checkresupdate.a) kVar).f189532a);
        com.tencent.mm.pluginsdk.res.downloader.checkresupdate.a aVar = (com.tencent.mm.pluginsdk.res.downloader.checkresupdate.a) kVar;
        int i17 = aVar.f189533b;
        int i18 = aVar.f189534c;
        int i19 = aVar.f189535d;
        if (i17 == 70) {
            return;
        }
        try {
            java.lang.String e17 = com.tencent.mm.pluginsdk.res.downloader.checkresupdate.i0.e((com.tencent.mm.pluginsdk.res.downloader.checkresupdate.a) kVar);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(e17)) {
                com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p.c().h(i17, i18, e17, i19, ((com.tencent.mm.pluginsdk.res.downloader.checkresupdate.a) kVar).f189543l);
                if (interrupted) {
                    return;
                } else {
                    return;
                }
            }
            o35.a.a(((com.tencent.mm.pluginsdk.res.downloader.checkresupdate.a) kVar).f189537f + ".decrypted");
            o35.a.a(((com.tencent.mm.pluginsdk.res.downloader.checkresupdate.a) kVar).f189537f + ".decompressed");
            if (java.lang.Thread.interrupted()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdate.DecryptTask", "%s: decrypting and interrupted", ((com.tencent.mm.pluginsdk.res.downloader.checkresupdate.a) kVar).f189532a);
                o35.a.a(((com.tencent.mm.pluginsdk.res.downloader.checkresupdate.a) kVar).f189537f);
                o35.a.a(((com.tencent.mm.pluginsdk.res.downloader.checkresupdate.a) kVar).f189537f + ".decrypted");
                o35.a.a(((com.tencent.mm.pluginsdk.res.downloader.checkresupdate.a) kVar).f189537f + ".decompressed");
            }
            com.tencent.mm.pluginsdk.res.downloader.model.j0.f189679a.f189685d.post(new com.tencent.mm.pluginsdk.res.downloader.checkresupdate.f0(this, (com.tencent.mm.pluginsdk.res.downloader.checkresupdate.a) kVar));
        } finally {
            if (java.lang.Thread.interrupted()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdate.DecryptTask", "%s: decrypting and interrupted", ((com.tencent.mm.pluginsdk.res.downloader.checkresupdate.a) kVar).f189532a);
                o35.a.a(((com.tencent.mm.pluginsdk.res.downloader.checkresupdate.a) kVar).f189537f);
                o35.a.a(((com.tencent.mm.pluginsdk.res.downloader.checkresupdate.a) kVar).f189537f + ".decrypted");
                o35.a.a(((com.tencent.mm.pluginsdk.res.downloader.checkresupdate.a) kVar).f189537f + ".decompressed");
            }
        }
    }
}
