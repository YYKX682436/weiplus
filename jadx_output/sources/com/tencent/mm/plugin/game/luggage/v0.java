package com.tencent.mm.plugin.game.luggage;

/* loaded from: classes8.dex */
public abstract class v0 {
    public static void a(sd.o0 o0Var, java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mm.ipcinvoker.w0.c(true, new com.tencent.mm.plugin.game.luggage.t0(o0Var, str));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(sd.o0 r4, java.lang.String r5, boolean r6) {
        /*
            com.tencent.mm.game.report.api.GameWebPerformanceInfo r0 = com.tencent.mm.game.report.api.GameWebPerformanceInfo.b(r5)
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "MicroMsg.LuggageGetA8KeyUtil"
            java.lang.String r3 = "getA8Key begin, time: %d"
            com.tencent.mars.xlog.Log.i(r2, r3, r1)
            long r1 = java.lang.System.currentTimeMillis()
            r0.G = r1
            com.tencent.mm.plugin.webview.permission.d r1 = new com.tencent.mm.plugin.webview.permission.d
            r2 = 0
            r1.<init>(r2)
            com.tencent.mm.plugin.game.luggage.r0 r2 = new com.tencent.mm.plugin.game.luggage.r0
            r2.<init>(r0, r4)
            monitor-enter(r1)
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L44
            r0 = -1
            r3 = 0
            r1.t(r5, r3, r0, r2)     // Catch: java.lang.Throwable -> L41
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L44
            monitor-exit(r1)
            if (r6 == 0) goto L40
            int r4 = r4.hashCode()
            java.util.concurrent.ConcurrentHashMap r5 = com.tencent.mm.plugin.webview.permission.l.f183427a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5.put(r4, r1)
        L40:
            return
        L41:
            r4 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L44
            throw r4     // Catch: java.lang.Throwable -> L44
        L44:
            r4 = move-exception
            monitor-exit(r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.luggage.v0.b(sd.o0, java.lang.String, boolean):void");
    }
}
