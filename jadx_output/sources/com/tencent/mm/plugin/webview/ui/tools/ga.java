package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class ga implements dx4.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f184761a;

    public ga(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI) {
        this.f184761a = webViewUI;
    }

    @Override // dx4.f
    public int a() {
        com.tencent.mm.plugin.webview.core.e3 e3Var = this.f184761a.L1;
        if (e3Var != null) {
            return e3Var.O().f183390j;
        }
        return 0;
    }

    @Override // dx4.f
    public int b() {
        return this.f184761a.f183829k2;
    }

    @Override // dx4.f
    public int c() {
        return this.f184761a.f183827j2;
    }

    @Override // dx4.f
    public com.tencent.mm.plugin.scanner.MultiCodeMaskView d() {
        return this.f184761a.f183837n;
    }

    @Override // dx4.f
    public android.app.Activity getContext() {
        return this.f184761a;
    }

    @Override // dx4.f
    public com.tencent.mm.plugin.webview.core.r0 getController() {
        return this.f184761a.L1;
    }

    @Override // dx4.f
    public int getWVTopOffset() {
        return this.f184761a.J7();
    }
}
