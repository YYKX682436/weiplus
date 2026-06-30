package com.tencent.mm.plugin.finder.webview;

/* loaded from: classes8.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.webview.FinderWebViewHelper f136935d;

    public x(com.tencent.mm.plugin.finder.webview.FinderWebViewHelper finderWebViewHelper) {
        this.f136935d = finderWebViewHelper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f136935d.onError();
    }
}
