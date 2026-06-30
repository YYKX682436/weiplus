package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.f0 f184113d;

    public e0(com.tencent.mm.plugin.webview.ui.tools.f0 f0Var) {
        this.f184113d = f0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.f0 f0Var = this.f184113d;
        f0Var.f184166f.setResult(1);
        f0Var.f184166f.finish();
    }
}
