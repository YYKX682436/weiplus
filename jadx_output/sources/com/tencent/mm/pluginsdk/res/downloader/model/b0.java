package com.tencent.mm.pluginsdk.res.downloader.model;

/* loaded from: classes7.dex */
public class b0 extends com.tencent.mm.pluginsdk.res.downloader.model.n {

    /* renamed from: c, reason: collision with root package name */
    public final ku5.f f189665c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.res.downloader.model.g f189666d;

    public b0(java.lang.String str, com.tencent.mm.pluginsdk.res.downloader.model.g gVar) {
        this.f189665c = new com.tencent.mm.pluginsdk.res.downloader.model.j(this, str, 4, 4, new com.tencent.mm.pluginsdk.res.downloader.model.a0());
        this.f189666d = gVar;
    }

    @Override // com.tencent.mm.pluginsdk.res.downloader.model.n
    public ku5.f c() {
        return this.f189665c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0071, code lost:
    
        if (r0 == false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int g(com.tencent.mm.pluginsdk.res.downloader.model.u r8) {
        /*
            r7 = this;
            java.lang.String r0 = r8.f189712a
            boolean r0 = r7.d(r0)
            r1 = 0
            java.lang.String r2 = "MicroMsg.ResDownloader.NetworkWorker"
            java.lang.String r3 = r8.f189712a
            if (r0 != 0) goto L7c
            java.util.Map r0 = r7.f189692b
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L19
            goto L7c
        L19:
            int r0 = wo.p1.a()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            int r5 = r8.f189713b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r6}
            java.lang.String r6 = "currentNetType(%d), requestNetType(%d)"
            com.tencent.mars.xlog.Log.i(r2, r6, r4)
            r4 = 2
            r6 = 1
            if (r0 != 0) goto L35
            goto L3c
        L35:
            if (r4 != r5) goto L38
            goto L3a
        L38:
            if (r0 != r6) goto L3c
        L3a:
            r0 = r6
            goto L3d
        L3c:
            r0 = r1
        L3d:
            if (r0 != 0) goto L4a
            java.lang.Object[] r8 = new java.lang.Object[]{r3}
            java.lang.String r0 = "urlKey = %s, mismatch networkType , skip task"
            com.tencent.mars.xlog.Log.i(r2, r0, r8)
            return r6
        L4a:
            ku5.f r0 = r7.f189665c
            boolean r2 = r0.isShutdown()
            if (r2 != 0) goto L73
            boolean r2 = r0.isTerminated()
            if (r2 != 0) goto L73
            java.util.concurrent.atomic.AtomicInteger r0 = r0.f312574d
            int r0 = r0.get()
            if (r0 >= 0) goto L62
            r2 = r6
            goto L63
        L62:
            r2 = r1
        L63:
            if (r2 != 0) goto L70
            r2 = 1610612736(0x60000000, float:3.689349E19)
            if (r0 >= r2) goto L6b
            r0 = r6
            goto L6c
        L6b:
            r0 = r1
        L6c:
            if (r0 == 0) goto L70
            r0 = r6
            goto L71
        L70:
            r0 = r1
        L71:
            if (r0 == 0) goto L74
        L73:
            r1 = r6
        L74:
            if (r1 == 0) goto L78
            r8 = 4
            return r8
        L78:
            r7.f(r8)
            return r4
        L7c:
            java.lang.Object[] r8 = new java.lang.Object[]{r3}
            java.lang.String r0 = "urlKey = %s is already queueing, skip repeated task"
            com.tencent.mars.xlog.Log.i(r2, r0, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.res.downloader.model.b0.g(com.tencent.mm.pluginsdk.res.downloader.model.u):int");
    }

    @Override // com.tencent.mm.pluginsdk.res.downloader.model.n
    /* renamed from: h */
    public com.tencent.mm.pluginsdk.res.downloader.model.m e(com.tencent.mm.pluginsdk.res.downloader.model.u uVar) {
        com.tencent.mm.pluginsdk.res.downloader.model.x xVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.NetworkWorker", "request.class = ".concat(uVar.getClass().getSimpleName()));
        ((yy.o) ((zy.s) i95.n0.c(zy.s.class))).getClass();
        com.tencent.mm.pluginsdk.res.downloader.model.j0.f189679a.getClass();
        int hashCode = uVar.c().hashCode();
        java.util.Iterator it = com.tencent.mm.pluginsdk.res.downloader.model.m0.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloaderCore", "plugin = %s, groupId = %s", ((com.tencent.mm.pluginsdk.res.downloader.model.o) it.next()).getClass().getSimpleName(), "CheckResUpdate");
            if (-1894509183 == hashCode) {
                if (uVar instanceof com.tencent.mm.pluginsdk.res.downloader.checkresupdate.t) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "return CheckResUpdateNetworkRequestHandler");
                    xVar = new com.tencent.mm.pluginsdk.res.downloader.checkresupdate.u((com.tencent.mm.pluginsdk.res.downloader.checkresupdate.t) uVar);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "get mismatch NetworkRequest type, return null");
                }
            }
        }
        xVar = null;
        if (xVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.NetworkWorker", "get null handler from plugin, use default handler");
            xVar = new com.tencent.mm.pluginsdk.res.downloader.model.y(uVar);
        }
        xVar.f189736g = this.f189666d;
        return xVar;
    }
}
