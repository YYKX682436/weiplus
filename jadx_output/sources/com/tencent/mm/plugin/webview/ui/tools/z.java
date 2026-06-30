package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.f0 f187710d;

    public z(com.tencent.mm.plugin.webview.ui.tools.f0 f0Var) {
        this.f187710d = f0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.f0 f0Var = this.f187710d;
        com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI openFileChooserUI = f0Var.f184166f;
        if (openFileChooserUI.f183625e == 7 && openFileChooserUI.f183626f == 2) {
            db5.e1.E(openFileChooserUI, openFileChooserUI.getString(com.tencent.mm.R.string.l6e), f0Var.f184166f.getString(com.tencent.mm.R.string.f490573yv), f0Var.f184166f.getString(com.tencent.mm.R.string.f490455vj), false, new com.tencent.mm.plugin.webview.ui.tools.y(this));
            return;
        }
        dp.a.makeText(openFileChooserUI, openFileChooserUI.getString(com.tencent.mm.R.string.k76), 0).show();
        f0Var.f184166f.setResult(1);
        f0Var.f184166f.finish();
    }
}
