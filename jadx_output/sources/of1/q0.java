package of1;

/* loaded from: classes8.dex */
public final class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f344990d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.permission.w f344991e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ of1.v0 f344992f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nw4.n f344993g;

    public q0(android.os.Bundle bundle, com.tencent.mm.plugin.webview.permission.w wVar, of1.v0 v0Var, nw4.n nVar) {
        this.f344990d = bundle;
        this.f344991e = wVar;
        this.f344992f = v0Var;
        this.f344993g = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0029  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r7 = this;
            of1.v0 r0 = r7.f344992f
            android.os.Bundle r1 = r7.f344990d
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L12
            java.lang.String r4 = "jsapi_preverify_fun_list"
            boolean r4 = r1.containsKey(r4)     // Catch: java.lang.Exception -> L39
            if (r4 != r2) goto L12
            r4 = r2
            goto L13
        L12:
            r4 = r3
        L13:
            com.tencent.mm.plugin.webview.permission.w r5 = r7.f344991e
            if (r4 == 0) goto L1e
            if (r5 != 0) goto L1a
            goto L1e
        L1a:
            r5.i(r1)     // Catch: java.lang.Exception -> L39
            goto L33
        L1e:
            java.lang.String r1 = r0.D1()     // Catch: java.lang.Exception -> L39
            java.lang.String r4 = "has JSAPI_CONTROL_BYTES wvPerm %b"
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L39
            if (r5 == 0) goto L29
            goto L2a
        L29:
            r2 = r3
        L2a:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Exception -> L39
            r6[r3] = r2     // Catch: java.lang.Exception -> L39
            com.tencent.mars.xlog.Log.e(r1, r4, r6)     // Catch: java.lang.Exception -> L39
        L33:
            nw4.n r1 = r7.f344993g     // Catch: java.lang.Exception -> L39
            r1.q()     // Catch: java.lang.Exception -> L39
            goto L50
        L39:
            r1 = move-exception
            java.lang.String r0 = r0.D1()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "stubCallback.callback(AC_ON_UPDATE_JSAPI_CONTROL_BYTES), exception:"
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.mars.xlog.Log.e(r0, r1)
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: of1.q0.run():void");
    }
}
