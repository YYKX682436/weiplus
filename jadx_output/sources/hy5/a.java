package hy5;

/* loaded from: classes11.dex */
public class a implements hy5.b {
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    @Override // hy5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a() {
        /*
            r4 = this;
            android.content.Context r0 = ky5.b.a()
            android.net.ConnectivityManager r1 = ky5.a.f313634a
            if (r1 != 0) goto L12
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            ky5.a.f313634a = r0
        L12:
            android.net.ConnectivityManager r0 = ky5.a.f313634a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L19
            goto L27
        L19:
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            if (r0 == 0) goto L27
            boolean r0 = r0.isConnected()     // Catch: java.lang.Exception -> L27
            if (r0 == 0) goto L27
            r0 = r1
            goto L28
        L27:
            r0 = r2
        L28:
            java.lang.String r3 = "Tinker.PatchRequestCallback"
            if (r0 != 0) goto L32
            java.lang.String r0 = "TinkerBootsRequestCallback: beforePatchRequest return false, not connect to internet"
            com.tencent.mars.xlog.Log.i(r3, r0)
            return r2
        L32:
            java.util.concurrent.ConcurrentLinkedQueue r0 = ak0.n.f5541a
            ak0.o.b()
            android.content.Context r0 = ak0.o.a()
            boolean r0 = com.tencent.tinker.lib.service.TinkerPatchService.a(r0)
            if (r0 == 0) goto L47
            java.lang.String r0 = "TinkerBootsRequestCallback: beforePatchRequest return false, tinker service is running"
            com.tencent.mars.xlog.Log.i(r3, r0)
            return r2
        L47:
            boolean r0 = com.tencent.mm.sdk.platformtools.x2.n()
            if (r0 != 0) goto L53
            java.lang.String r0 = "TinkerBootsRequestCallback: beforePatchRequest return false, only request on the main process"
            com.tencent.mars.xlog.Log.i(r3, r0)
            return r2
        L53:
            int r0 = ky5.c.f313636a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: hy5.a.a():boolean");
    }

    @Override // hy5.b
    public void b(java.util.Map map) {
    }

    @Override // hy5.b
    public void c() {
    }
}
