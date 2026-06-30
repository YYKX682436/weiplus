package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f184608d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.CircleToSearchWebViewUI.AnonymousClass1 f184609e;

    public s0(com.tencent.mm.plugin.webview.ui.tools.fts.CircleToSearchWebViewUI.AnonymousClass1 anonymousClass1, java.util.Map map) {
        this.f184609e = anonymousClass1;
        this.f184608d = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.fts.CircleToSearchWebViewUI.this.f183844p0.i0("onCircleToSearchEvent", this.f184608d, null);
    }
}
