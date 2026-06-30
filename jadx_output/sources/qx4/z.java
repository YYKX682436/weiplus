package qx4;

/* loaded from: classes.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f367475d;

    public z(java.lang.String str) {
        this.f367475d = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003c  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r5 = this;
            java.lang.String r0 = r5.f367475d
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r2 = "setPreGetParams: %s"
            java.lang.String r3 = "MicroMsg.WebSearch.SosUtil"
            com.tencent.mars.xlog.Log.i(r3, r2, r1)
            r1 = 0
            if (r0 == 0) goto L22
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L17
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L17
            goto L23
        L17:
            r0 = move-exception
            java.lang.String r2 = "setPreGetParams err"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            com.tencent.mars.xlog.Log.e(r3, r2, r0)
        L22:
            r2 = r1
        L23:
            if (r2 == 0) goto L2c
            java.lang.String r0 = "extReqParams"
            java.lang.String r0 = r2.optString(r0)
            goto L2e
        L2c:
            java.lang.String r0 = ""
        L2e:
            java.lang.Class<su4.x0> r2 = su4.x0.class
            i95.m r2 = i95.n0.c(r2)
            su4.x0 r2 = (su4.x0) r2
            com.tencent.mm.plugin.websearch.w1 r2 = (com.tencent.mm.plugin.websearch.w1) r2
            com.tencent.mm.sdk.platformtools.o4 r3 = r2.f181702q
            if (r3 != 0) goto L45
            java.lang.String r3 = "WebSearchLogic"
            r4 = 2
            com.tencent.mm.sdk.platformtools.o4 r1 = com.tencent.mm.sdk.platformtools.o4.N(r3, r4, r1)
            r2.f181702q = r1
        L45:
            com.tencent.mm.sdk.platformtools.o4 r1 = r2.f181702q
            java.lang.String r2 = "websearch_preget_extReqParams"
            r1.D(r2, r0)
            r0 = 0
            int r0 = com.tencent.mm.plugin.websearch.l2.a(r0)
            java.lang.String r2 = "websearch_preget_version"
            r1.A(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qx4.z.run():void");
    }
}
