package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f184372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI f184373e;

    public d(com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI baseSOSWebViewUI, java.util.Map map) {
        this.f184373e = baseSOSWebViewUI;
        this.f184372d = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI baseSOSWebViewUI = this.f184373e;
        if (baseSOSWebViewUI.s9() != null) {
            baseSOSWebViewUI.s9().h0(this.f184372d);
        }
    }
}
