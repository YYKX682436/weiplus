package com.tencent.mm.pluginsdk.res.downloader.model;

/* loaded from: classes12.dex */
public class g0 implements java.lang.Runnable {
    public g0(com.tencent.mm.pluginsdk.res.downloader.model.h0 h0Var) {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r5 = this;
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
            java.lang.String r3 = "MicroMsg.PostTaskCheckResume"
            if (r0 != 0) goto L24
            java.lang.String r0 = "try resumeAllAndEvictExpired but account not ready"
            com.tencent.mars.xlog.Log.e(r3, r0)
            return
        L24:
            com.tencent.mm.pluginsdk.res.downloader.model.l0 r0 = com.tencent.mm.pluginsdk.res.downloader.model.j0.f189679a     // Catch: com.tencent.wcdb.database.SQLiteDatabaseCorruptException -> L35 android.database.sqlite.SQLiteDatabaseCorruptException -> L37
            int r4 = wo.p1.a()     // Catch: com.tencent.wcdb.database.SQLiteDatabaseCorruptException -> L35 android.database.sqlite.SQLiteDatabaseCorruptException -> L37
            if (r4 == 0) goto L30
            if (r4 == r1) goto L31
            r1 = 2
            goto L31
        L30:
            r1 = r2
        L31:
            r0.f(r1)     // Catch: com.tencent.wcdb.database.SQLiteDatabaseCorruptException -> L35 android.database.sqlite.SQLiteDatabaseCorruptException -> L37
            goto L40
        L35:
            r0 = move-exception
            goto L38
        L37:
            r0 = move-exception
        L38:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r2 = "resumeAllAndEvictExpired"
            com.tencent.mars.xlog.Log.printErrStackTrace(r3, r0, r2, r1)
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.res.downloader.model.g0.run():void");
    }
}
