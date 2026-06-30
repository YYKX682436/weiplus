package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes10.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.f0 f183918d;

    public b0(com.tencent.mm.plugin.webview.ui.tools.f0 f0Var) {
        this.f183918d = f0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.f0 f0Var = this.f183918d;
        com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI openFileChooserUI = f0Var.f184166f;
        db5.e1.E(openFileChooserUI, openFileChooserUI.getString(com.tencent.mm.R.string.l6f), f0Var.f184166f.getString(com.tencent.mm.R.string.f490573yv), f0Var.f184166f.getString(com.tencent.mm.R.string.f490455vj), false, new com.tencent.mm.plugin.webview.ui.tools.a0(this));
    }
}
