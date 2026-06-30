package com.tencent.mm.pluginsdk.res.downloader.model;

/* loaded from: classes12.dex */
public class h0 implements java.lang.Runnable {
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r6 = this;
            gm0.m r0 = gm0.j1.b()
            boolean r0 = r0.m()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L18
            gm0.j1.b()
            boolean r0 = gm0.m.r()
            if (r0 == 0) goto L16
            goto L18
        L16:
            r0 = r1
            goto L19
        L18:
            r0 = r2
        L19:
            if (r0 != 0) goto L1c
            return
        L1c:
            int r0 = wo.p1.a()
            if (r0 == 0) goto L26
            if (r0 == r1) goto L27
            r1 = 2
            goto L27
        L26:
            r1 = r2
        L27:
            if (r1 != 0) goto L2a
            return
        L2a:
            long r0 = com.tencent.mm.sdk.platformtools.t8.i1()
            gm0.b0 r2 = gm0.j1.u()
            com.tencent.mm.storage.n3 r2 = r2.c()
            com.tencent.mm.storage.u3 r3 = com.tencent.mm.storage.u3.USERINFO_RES_DOWNLOADER_CHECK_RESUME_INTERVAL_LONG
            r4 = 0
            java.lang.Object r2 = r2.m(r3, r4)
            java.lang.Long r2 = (java.lang.Long) r2
            r4 = 0
            long r4 = com.tencent.mm.sdk.platformtools.t8.k1(r2, r4)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L70
            r4 = 7200(0x1c20, double:3.5573E-320)
            long r0 = r0 + r4
            gm0.b0 r2 = gm0.j1.u()
            com.tencent.mm.storage.n3 r2 = r2.c()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.x(r3, r0)
            java.lang.String r0 = "MicroMsg.PostTaskCheckResume"
            java.lang.String r1 = "doCheckResume"
            com.tencent.mars.xlog.Log.i(r0, r1)
            com.tencent.mm.pluginsdk.res.downloader.model.l0 r0 = com.tencent.mm.pluginsdk.res.downloader.model.j0.f189679a
            com.tencent.mm.sdk.platformtools.n3 r0 = r0.b()
            com.tencent.mm.pluginsdk.res.downloader.model.g0 r1 = new com.tencent.mm.pluginsdk.res.downloader.model.g0
            r1.<init>(r6)
            r0.postToWorker(r1)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.res.downloader.model.h0.run():void");
    }
}
