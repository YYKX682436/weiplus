package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.e0 f182625d;

    public u0(com.tencent.mm.plugin.webview.luggage.e0 e0Var) {
        this.f182625d = e0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f182625d.f182180p.evaluateJavascript("javascript:(function(){return window.getComputedStyle(document.body,null).backgroundColor})()", new com.tencent.mm.plugin.webview.luggage.t0(this));
    }
}
