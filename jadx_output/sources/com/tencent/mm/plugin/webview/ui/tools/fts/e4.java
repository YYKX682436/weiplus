package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class e4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f184399d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSearchTabWebViewUI f184400e;

    public e4(com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSearchTabWebViewUI mMFTSSearchTabWebViewUI, android.os.Bundle bundle) {
        this.f184400e = mMFTSSearchTabWebViewUI;
        this.f184399d = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.Bundle bundle = this.f184399d;
        bundle.putString("fts_key_data", "configNavBar");
        this.f184400e.R7(154, bundle);
    }
}
