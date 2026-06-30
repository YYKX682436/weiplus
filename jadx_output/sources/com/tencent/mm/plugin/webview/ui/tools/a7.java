package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class a7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f183897d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.audio.AddItemToPlayLaterIPCTask$Result f183898e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.lp0 f183899f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.c6 f183900g;

    public a7(com.tencent.mm.plugin.webview.ui.tools.c6 c6Var, com.tencent.mm.ui.widget.dialog.u3 u3Var, com.tencent.mm.plugin.webview.ui.tools.audio.AddItemToPlayLaterIPCTask$Result addItemToPlayLaterIPCTask$Result, bw5.lp0 lp0Var) {
        this.f183900g = c6Var;
        this.f183897d = u3Var;
        this.f183898e = addItemToPlayLaterIPCTask$Result;
        this.f183899f = lp0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f183897d.dismiss();
        com.tencent.mm.plugin.webview.ui.tools.audio.AddItemToPlayLaterIPCTask$Result addItemToPlayLaterIPCTask$Result = this.f183898e;
        if (addItemToPlayLaterIPCTask$Result == null || !addItemToPlayLaterIPCTask$Result.f183916d) {
            return;
        }
        com.tencent.mm.plugin.webview.ui.tools.c6 c6Var = this.f183900g;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI c17 = c6Var.c();
        bw5.lp0 lp0Var = this.f183899f;
        if (c17 == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.webview.ui.tools.e7(c6Var, c17, lp0Var));
    }
}
