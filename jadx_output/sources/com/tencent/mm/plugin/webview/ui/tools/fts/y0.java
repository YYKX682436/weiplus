package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.z0 f184728d;

    public y0(com.tencent.mm.plugin.webview.ui.tools.fts.z0 z0Var) {
        this.f184728d = z0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.fts.z0 z0Var = this.f184728d;
        z0Var.f184737f.F4.getFtsEditText().o(z0Var.f184737f.F4.getFtsEditText().getRecommendSearchHint(), null, tj5.o.SetText);
        z0Var.f184737f.F4.getFtsEditText().d();
        z0Var.f184737f.F4.getFtsEditText().h();
    }
}
