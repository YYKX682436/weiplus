package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes15.dex */
public class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.logic.b1 f143890d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.logic.c1 f143891e;

    public a1(com.tencent.mm.plugin.lite.logic.c1 c1Var, com.tencent.mm.plugin.lite.logic.b1 b1Var) {
        this.f143891e = c1Var;
        this.f143890d = b1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008a  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.net.HttpURLConnection] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = com.tencent.mm.plugin.lite.logic.y2.g()
            r0.append(r1)
            com.tencent.mm.plugin.lite.logic.b1 r1 = r5.f143890d
            oq1.q r1 = r1.f143904b
            java.lang.String r1 = r1.f347346a
            r0.append(r1)
            java.lang.String r1 = "_"
            r0.append(r1)
            com.tencent.mm.plugin.lite.logic.b1 r1 = r5.f143890d
            oq1.q r1 = r1.f143904b
            java.lang.String r1 = r1.f347350e
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.mm.plugin.lite.logic.b1 r1 = r5.f143890d
            oq1.q r1 = r1.f143904b
            java.lang.String r1 = r1.f347346a
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            java.lang.String r1 = "MicroMsg.LiteAppDownloadPkg"
            java.lang.String r2 = "startHttpDownload appId:%s, savedFilePath:%s"
            com.tencent.mars.xlog.Log.i(r1, r2, r0)
            r0 = 0
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L6b
            com.tencent.mm.plugin.lite.logic.b1 r3 = r5.f143890d     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L6b
            oq1.q r3 = r3.f143904b     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L6b
            java.lang.String r3 = r3.f347349d     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L6b
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L6b
            java.net.URLConnection r2 = r2.openConnection()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L6b
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L6b
            r2.connect()     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            r2.getResponseCode()     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            ku5.u0 r0 = ku5.t0.f312615d     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            com.tencent.mm.plugin.lite.logic.y0 r3 = new com.tencent.mm.plugin.lite.logic.y0     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            ku5.t0 r0 = (ku5.t0) r0     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            r0.B(r3)     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            r2.disconnect()     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            r2.disconnect()
            return
        L63:
            r0 = move-exception
            goto L88
        L65:
            r0 = move-exception
            goto L6f
        L67:
            r1 = move-exception
            r2 = r0
            r0 = r1
            goto L88
        L6b:
            r2 = move-exception
            r4 = r2
            r2 = r0
            r0 = r4
        L6f:
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L63
            com.tencent.mars.xlog.Log.e(r1, r0)     // Catch: java.lang.Throwable -> L63
            ku5.u0 r0 = ku5.t0.f312615d     // Catch: java.lang.Throwable -> L63
            com.tencent.mm.plugin.lite.logic.z0 r1 = new com.tencent.mm.plugin.lite.logic.z0     // Catch: java.lang.Throwable -> L63
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L63
            ku5.t0 r0 = (ku5.t0) r0     // Catch: java.lang.Throwable -> L63
            r0.B(r1)     // Catch: java.lang.Throwable -> L63
            if (r2 == 0) goto L87
            r2.disconnect()
        L87:
            return
        L88:
            if (r2 == 0) goto L8d
            r2.disconnect()
        L8d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.lite.logic.a1.run():void");
    }
}
