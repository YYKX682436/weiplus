package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class h1 implements android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.e0 f182216a;

    public h1(com.tencent.mm.plugin.webview.luggage.e0 e0Var) {
        this.f182216a = e0Var;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean z17) {
        this.f182216a.f406655i.c(new com.tencent.mm.plugin.webview.luggage.g1(this, z17));
    }
}
