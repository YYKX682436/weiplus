package com.tencent.mm.pluginsdk.res.downloader.model;

/* loaded from: classes7.dex */
public final class s implements com.tencent.mm.pluginsdk.res.downloader.model.g {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f189706a;

    /* renamed from: b, reason: collision with root package name */
    public final android.util.SparseArray f189707b = new android.util.SparseArray();

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f189708c = new java.lang.Object();

    public s(com.tencent.mm.sdk.platformtools.n3 n3Var) {
        this.f189706a = n3Var;
    }

    @Override // com.tencent.mm.pluginsdk.res.downloader.model.g
    public void a(java.lang.String str, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.NetworkEventDispatcher", "dispatchRetry, urlKey = %s, max = %d, count = %d", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.tencent.mm.pluginsdk.res.downloader.model.l0 l0Var = com.tencent.mm.pluginsdk.res.downloader.model.j0.f189679a;
        com.tencent.mm.pluginsdk.res.downloader.model.n0 e17 = l0Var.e(str);
        if (e17 != null) {
            e17.field_maxRetryTimes = i17;
            e17.field_retryTimes = i18;
            l0Var.g(e17, true);
        }
    }

    @Override // com.tencent.mm.pluginsdk.res.downloader.model.g
    public void b(com.tencent.mm.pluginsdk.res.downloader.model.i iVar, com.tencent.mm.pluginsdk.res.downloader.model.v vVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.NetworkEventDispatcher", "dispatchResponse, response = " + vVar);
        int i17 = vVar.f189729g;
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f189706a;
        java.lang.String str = vVar.f189723a;
        if (i17 == 2) {
            com.tencent.mm.pluginsdk.res.downloader.model.l0 l0Var = com.tencent.mm.pluginsdk.res.downloader.model.j0.f189679a;
            com.tencent.mm.pluginsdk.res.downloader.model.n0 e17 = l0Var.e(str);
            if (e17 != null) {
                e17.field_status = 2;
                l0Var.g(e17, true);
            }
            iVar.getGroupId();
            java.util.List d17 = d(iVar.getGroupId());
            if (com.tencent.mm.sdk.platformtools.t8.L0(d17)) {
                return;
            }
            d17.size();
            n3Var.post(new com.tencent.mm.pluginsdk.res.downloader.model.q(this, d17, vVar, ((com.tencent.mm.pluginsdk.res.downloader.model.x) iVar).f()));
            return;
        }
        if (i17 == 3) {
            com.tencent.mm.pluginsdk.res.downloader.model.l0 l0Var2 = com.tencent.mm.pluginsdk.res.downloader.model.j0.f189679a;
            com.tencent.mm.pluginsdk.res.downloader.model.n0 e18 = l0Var2.e(str);
            if (e18 != null) {
                e18.field_status = 3;
                l0Var2.g(e18, true);
            }
            java.util.List d18 = d(iVar.getGroupId());
            if (com.tencent.mm.sdk.platformtools.t8.L0(d18)) {
                return;
            }
            n3Var.post(new com.tencent.mm.pluginsdk.res.downloader.model.p(this, d18, vVar, ((com.tencent.mm.pluginsdk.res.downloader.model.x) iVar).f()));
            return;
        }
        if (i17 != 4) {
            return;
        }
        com.tencent.mm.pluginsdk.res.downloader.model.l0 l0Var3 = com.tencent.mm.pluginsdk.res.downloader.model.j0.f189679a;
        com.tencent.mm.pluginsdk.res.downloader.model.n0 e19 = l0Var3.e(str);
        if (e19 != null) {
            e19.field_status = 4;
            l0Var3.g(e19, true);
        }
        java.util.List d19 = d(iVar.getGroupId());
        if (com.tencent.mm.sdk.platformtools.t8.L0(d19)) {
            return;
        }
        n3Var.post(new com.tencent.mm.pluginsdk.res.downloader.model.r(this, d19, vVar, ((com.tencent.mm.pluginsdk.res.downloader.model.x) iVar).f()));
    }

    @Override // com.tencent.mm.pluginsdk.res.downloader.model.g
    public void c(java.lang.String str, long j17) {
        com.tencent.mm.pluginsdk.res.downloader.model.l0 l0Var = com.tencent.mm.pluginsdk.res.downloader.model.j0.f189679a;
        com.tencent.mm.pluginsdk.res.downloader.model.n0 e17 = l0Var.e(str);
        if (e17 != null) {
            e17.field_contentLength = j17;
            l0Var.g(e17, true);
        }
    }

    public final java.util.List d(java.lang.String str) {
        java.util.List list;
        int hashCode = str.hashCode();
        synchronized (this.f189708c) {
            list = (java.util.List) this.f189707b.get(hashCode);
        }
        return list;
    }
}
