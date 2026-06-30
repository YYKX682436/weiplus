package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class s3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.t3 f184614d;

    public s3(com.tencent.mm.plugin.webview.ui.tools.fts.t3 t3Var) {
        this.f184614d = t3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.fts.t3 t3Var = this.f184614d;
        t3Var.f184625e.F4.getFtsEditText().o(t3Var.f184625e.F4.getFtsEditText().getRecommendSearchHint(), null, tj5.o.SetText);
        t3Var.f184625e.F4.getFtsEditText().d();
        t3Var.f184625e.F4.getFtsEditText().h();
    }
}
