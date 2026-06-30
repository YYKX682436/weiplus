package com.tencent.mm.pluginsdk.res.downloader.checkresupdate;

/* loaded from: classes7.dex */
public final class u extends com.tencent.mm.pluginsdk.res.downloader.model.x {
    public u(com.tencent.mm.pluginsdk.res.downloader.checkresupdate.t tVar) {
        super(tVar);
    }

    @Override // com.tencent.mm.pluginsdk.res.downloader.model.x, com.tencent.mm.pluginsdk.res.downloader.model.i
    public boolean b(long j17) {
        return super.b(j17);
    }

    @Override // com.tencent.mm.pluginsdk.res.downloader.model.x
    public com.tencent.mm.pluginsdk.res.downloader.model.v g(com.tencent.mm.pluginsdk.res.downloader.model.t tVar) {
        com.tencent.mm.pluginsdk.res.downloader.checkresupdate.t tVar2 = (com.tencent.mm.pluginsdk.res.downloader.checkresupdate.t) this.f189688d;
        tVar2.getClass();
        java.lang.String b17 = tVar2.b();
        java.lang.String str = tVar2.f189636m;
        if (tVar2.f189638o) {
            java.lang.String p17 = com.tencent.mm.vfs.w6.p(tVar2.b());
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (p17 == null) {
                p17 = "";
            }
            if (p17.equals(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateNetworkRequestHandler", "file already cached and valid, send complete status");
                return new com.tencent.mm.pluginsdk.res.downloader.model.v(tVar2, 2, o35.a.g(b17), (java.lang.String) null);
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.M0(((com.tencent.mm.pluginsdk.res.downloader.checkresupdate.t) this.f189688d).f189637n) && o35.a.k(((com.tencent.mm.pluginsdk.res.downloader.checkresupdate.t) this.f189688d).b(), ((com.tencent.mm.pluginsdk.res.downloader.checkresupdate.t) this.f189688d).f189637n)) {
            java.lang.String p18 = com.tencent.mm.vfs.w6.p(((com.tencent.mm.pluginsdk.res.downloader.checkresupdate.t) this.f189688d).b());
            if ((p18 != null ? p18 : "").equals(((com.tencent.mm.pluginsdk.res.downloader.checkresupdate.t) this.f189688d).f189636m)) {
                com.tencent.mm.pluginsdk.res.downloader.model.k kVar = this.f189688d;
                return new com.tencent.mm.pluginsdk.res.downloader.model.v((com.tencent.mm.pluginsdk.res.downloader.model.u) kVar, 2, o35.a.g(((com.tencent.mm.pluginsdk.res.downloader.checkresupdate.t) kVar).b()), (java.lang.String) null);
            }
        }
        com.tencent.mm.pluginsdk.res.downloader.model.v g17 = super.g(tVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateNetworkRequestHandler", "%s: network get over, received response = " + g17, tVar2.f189712a);
        if (g17 == null) {
            return new com.tencent.mm.pluginsdk.res.downloader.model.v("CheckResUpdate", f(), a(), e(), 0L, "", 3, new n35.e());
        }
        if (g17.f189729g == 2) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(((com.tencent.mm.pluginsdk.res.downloader.checkresupdate.t) this.f189688d).f189636m) || !((com.tencent.mm.pluginsdk.res.downloader.checkresupdate.t) this.f189688d).f189636m.equals(com.tencent.mm.vfs.w6.p(e()))) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateNetworkRequestHandler", "%s: file invalid, md5 not match", tVar2.f189712a);
                return new com.tencent.mm.pluginsdk.res.downloader.model.v("CheckResUpdate", f(), a(), e(), g17.f189726d, g17.f189727e, 3, new n35.c());
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateNetworkRequestHandler", "%s: file valid, md5 ok", tVar2.f189712a);
        }
        return g17;
    }

    @Override // com.tencent.mm.pluginsdk.res.downloader.model.i
    public java.lang.String getGroupId() {
        return "CheckResUpdate";
    }

    @Override // com.tencent.mm.pluginsdk.res.downloader.model.x, com.tencent.mm.pluginsdk.res.downloader.model.i
    public boolean retry() {
        boolean retry = super.retry();
        com.tencent.mm.pluginsdk.res.downloader.model.k kVar = this.f189688d;
        if (retry) {
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(((com.tencent.mm.pluginsdk.res.downloader.checkresupdate.t) kVar).f189635l, 12L);
            return true;
        }
        com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(((com.tencent.mm.pluginsdk.res.downloader.checkresupdate.t) kVar).f189635l, 27L);
        return false;
    }
}
