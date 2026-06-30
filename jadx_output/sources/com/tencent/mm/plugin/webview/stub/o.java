package com.tencent.mm.plugin.webview.stub;

/* loaded from: classes.dex */
public class o implements com.tencent.mm.plugin.webview.stub.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.stub.WebViewStubProxyUI f183557d;

    public o(com.tencent.mm.plugin.webview.stub.WebViewStubProxyUI webViewStubProxyUI) {
        this.f183557d = webViewStubProxyUI;
    }

    @Override // com.tencent.mm.plugin.webview.stub.z0
    public void Ae(android.os.Bundle bundle) {
        this.f183557d.f183470e.Ae(bundle);
    }

    @Override // com.tencent.mm.plugin.webview.stub.z0
    public boolean Cg(com.tencent.mm.plugin.webview.stub.h hVar) {
        this.f183557d.f183470e.Cg(hVar);
        return false;
    }

    @Override // com.tencent.mm.plugin.webview.stub.z0
    public void D3(java.lang.String str, java.lang.String str2) {
        this.f183557d.f183470e.D3(str, str2);
    }

    @Override // com.tencent.mm.plugin.webview.stub.z0
    public java.lang.String E6() {
        return this.f183557d.f183470e.E6();
    }

    @Override // com.tencent.mm.plugin.webview.stub.z0
    public android.os.Bundle H6(java.lang.String str, java.lang.String str2) {
        return this.f183557d.f183470e.H6(str, str2);
    }

    @Override // com.tencent.mm.plugin.webview.stub.z0
    public void Ic(java.lang.String str, java.lang.String str2) {
        this.f183557d.f183470e.Ic(str, str2);
    }

    @Override // com.tencent.mm.plugin.webview.stub.z0
    public java.lang.String Ni() {
        return this.f183557d.f183470e.Ni();
    }

    @Override // com.tencent.mm.plugin.webview.stub.z0
    public void V1() {
        com.tencent.mm.plugin.webview.stub.z0 z0Var = this.f183557d.f183470e;
        if (z0Var == null) {
            return;
        }
        z0Var.V1();
    }

    @Override // com.tencent.mm.plugin.webview.stub.z0
    public void W1(java.lang.String str) {
        this.f183557d.f183470e.W1(str);
    }

    @Override // com.tencent.mm.plugin.webview.stub.z0
    public int X1() {
        return this.f183557d.f183470e.X1();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if (r3[0].equals("startMonitoringBeacons") != false) goto L10;
     */
    @Override // com.tencent.mm.plugin.webview.stub.z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean aj(java.lang.String r10, java.lang.String r11, android.os.Bundle r12, boolean r13) {
        /*
            r9 = this;
            java.lang.String r0 = "MicroMsg.callbackerWrapper"
            java.lang.String r1 = "onHandleEnd in callbackerWrapper"
            com.tencent.mars.xlog.Log.i(r0, r1)
            com.tencent.mm.plugin.webview.stub.WebViewStubProxyUI r0 = r9.f183557d
            r1 = 1
            r0.f183474i = r1
            r0.getClass()
            r2 = 0
            if (r11 == 0) goto L27
            java.lang.String r3 = ":"
            java.lang.String[] r3 = r11.split(r3)
            int r4 = r3.length
            if (r4 <= 0) goto L27
            r3 = r3[r2]
            java.lang.String r4 = "startMonitoringBeacons"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L27
            goto L28
        L27:
            r1 = r2
        L28:
            r0.f183469d = r1
            com.tencent.mm.plugin.webview.stub.n r1 = new com.tencent.mm.plugin.webview.stub.n
            r3 = r1
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            r0.runOnUiThread(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.stub.o.aj(java.lang.String, java.lang.String, android.os.Bundle, boolean):boolean");
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return null;
    }

    @Override // com.tencent.mm.plugin.webview.stub.z0
    public void b(android.os.Bundle bundle) {
        this.f183557d.f183470e.b(bundle);
    }

    @Override // com.tencent.mm.plugin.webview.stub.z0
    public boolean callback(int i17, android.os.Bundle bundle) {
        this.f183557d.f183470e.callback(i17, bundle);
        return false;
    }

    @Override // com.tencent.mm.plugin.webview.stub.z0
    public void d5(boolean z17) {
        this.f183557d.f183470e.d5(z17);
    }

    @Override // com.tencent.mm.plugin.webview.stub.z0
    public void ec() {
        this.f183557d.f183470e.ec();
    }

    @Override // com.tencent.mm.plugin.webview.stub.z0
    public java.lang.String getCurrentUrl() {
        return this.f183557d.f183470e.getCurrentUrl();
    }

    @Override // com.tencent.mm.plugin.webview.stub.z0
    public android.os.Bundle i(int i17, android.os.Bundle bundle) {
        com.tencent.mm.plugin.webview.stub.z0 z0Var = this.f183557d.f183470e;
        if (z0Var != null) {
            return z0Var.i(i17, bundle);
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.callbackerWrapper", "invokeAsResult callbacker is null");
        return new android.os.Bundle();
    }

    @Override // com.tencent.mm.plugin.webview.stub.z0
    public void t3(java.lang.String str, java.lang.String str2, int i17, int i18) {
    }

    @Override // com.tencent.mm.plugin.webview.stub.z0
    public void te(int i17, android.os.Bundle bundle) {
        this.f183557d.f183470e.te(i17, bundle);
    }

    @Override // com.tencent.mm.plugin.webview.stub.z0
    public boolean v3(int i17) {
        this.f183557d.f183470e.v3(i17);
        return false;
    }

    @Override // com.tencent.mm.plugin.webview.stub.z0
    public java.lang.String za() {
        return this.f183557d.f183470e.za();
    }
}
