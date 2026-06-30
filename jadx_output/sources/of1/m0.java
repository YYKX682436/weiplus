package of1;

/* loaded from: classes7.dex */
public final class m0 extends com.tencent.mm.plugin.webview.core.f3 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ of1.v0 f344974b;

    public m0(of1.v0 v0Var) {
        this.f344974b = v0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        r1 = r0.f345027f2;
        kotlin.jvm.internal.o.d(r1);
        r0.s0(r1);
     */
    @Override // com.tencent.mm.plugin.webview.core.f3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e() {
        /*
            r8 = this;
            of1.v0 r0 = r8.f344974b
            com.tencent.mm.plugin.webview.stub.v0 r1 = r0.e0()     // Catch: java.lang.Exception -> L67
            of1.u0 r2 = r0.f345029h2
            com.tencent.mm.plugin.webview.ui.tools.widget.t3 r3 = new com.tencent.mm.plugin.webview.ui.tools.widget.t3     // Catch: java.lang.Exception -> L67
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference     // Catch: java.lang.Exception -> L67
            r4.<init>(r2)     // Catch: java.lang.Exception -> L67
            r3.<init>(r4)     // Catch: java.lang.Exception -> L67
            int r4 = r0.U()     // Catch: java.lang.Exception -> L67
            r1.rg(r3, r4)     // Catch: java.lang.Exception -> L67
            com.tencent.mm.plugin.webview.stub.v0 r1 = r0.e0()     // Catch: java.lang.Exception -> L67
            android.os.Bundle r3 = new android.os.Bundle     // Catch: java.lang.Exception -> L67
            r4 = 1
            r3.<init>(r4)     // Catch: java.lang.Exception -> L67
            android.os.Bundle r5 = new android.os.Bundle     // Catch: java.lang.Exception -> L67
            r5.<init>(r4)     // Catch: java.lang.Exception -> L67
            java.lang.String r6 = "key_webview_container_env"
            java.lang.String r7 = "miniProgram"
            r5.putString(r6, r7)     // Catch: java.lang.Exception -> L67
            java.lang.String r6 = "jsapiargs"
            r3.putBundle(r6, r5)     // Catch: java.lang.Exception -> L67
            int r5 = r0.U()     // Catch: java.lang.Exception -> L67
            r6 = 20
            r1.ng(r6, r3, r5)     // Catch: java.lang.Exception -> L67
            nw4.n r1 = r0.g0()     // Catch: java.lang.Exception -> L67
            com.tencent.mm.plugin.webview.ui.tools.widget.t3 r3 = new com.tencent.mm.plugin.webview.ui.tools.widget.t3     // Catch: java.lang.Exception -> L67
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference     // Catch: java.lang.Exception -> L67
            r5.<init>(r2)     // Catch: java.lang.Exception -> L67
            r3.<init>(r5)     // Catch: java.lang.Exception -> L67
            r1.f340900n = r3     // Catch: java.lang.Exception -> L67
            java.lang.String r1 = r0.f345027f2     // Catch: java.lang.Exception -> L67
            if (r1 == 0) goto L59
            boolean r1 = r26.n0.N(r1)     // Catch: java.lang.Exception -> L67
            if (r1 == 0) goto L58
            goto L59
        L58:
            r4 = 0
        L59:
            if (r4 != 0) goto L63
            java.lang.String r1 = r0.f345027f2     // Catch: java.lang.Exception -> L67
            kotlin.jvm.internal.o.d(r1)     // Catch: java.lang.Exception -> L67
            r0.s0(r1)     // Catch: java.lang.Exception -> L67
        L63:
            of1.v0.B1(r0)     // Catch: java.lang.Exception -> L67
            goto L7d
        L67:
            r1 = move-exception
            java.lang.String r2 = r0.D1()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "onBinded exception:"
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.tencent.mars.xlog.Log.e(r2, r1)
        L7d:
            of1.m r1 = r0.X1
            if (r1 == 0) goto L88
            com.tencent.mm.plugin.webview.stub.v0 r0 = r0.e0()
            r1.f344882f = r0
            return
        L88:
            java.lang.String r0 = "viewScanHelper"
            kotlin.jvm.internal.o.o(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: of1.m0.e():void");
    }

    @Override // com.tencent.mm.plugin.webview.core.f3
    public void k(int i17, java.lang.String reqUrl, r45.s83 response) {
        kotlin.jvm.internal.o.g(reqUrl, "reqUrl");
        kotlin.jvm.internal.o.g(response, "response");
        java.lang.String str = response.f385545d;
        of1.v0 v0Var = this.f344974b;
        v0Var.f345026e2 = str;
        of1.m mVar = v0Var.X1;
        if (mVar != null) {
            mVar.f344883g = v0Var.R;
        } else {
            kotlin.jvm.internal.o.o("viewScanHelper");
            throw null;
        }
    }
}
