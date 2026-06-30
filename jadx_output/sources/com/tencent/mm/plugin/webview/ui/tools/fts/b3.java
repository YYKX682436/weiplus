package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public final class b3 implements z21.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.j3 f184354a;

    public b3(com.tencent.mm.plugin.webview.ui.tools.fts.j3 j3Var) {
        this.f184354a = j3Var;
    }

    @Override // z21.b
    public void a(java.lang.String[] lst, java.util.List voiceIdSet) {
        kotlin.jvm.internal.o.g(lst, "lst");
        kotlin.jvm.internal.o.g(voiceIdSet, "voiceIdSet");
        if (lst.length <= 0 || lj.f.f(lst[0])) {
            return;
        }
        java.lang.String str = lst[0];
        com.tencent.mm.plugin.webview.ui.tools.fts.j3 j3Var = this.f184354a;
        j3Var.getClass();
        kotlin.jvm.internal.o.g(str, "<set-?>");
        j3Var.D = str;
        com.tencent.mm.plugin.webview.ui.tools.fts.j3.a(j3Var);
        com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI baseSearchWebViewUI = (com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI) j3Var.f184452b.get();
        if (baseSearchWebViewUI != null) {
            baseSearchWebViewUI.da(j3Var.D);
        }
    }

    @Override // z21.b
    public void b(java.util.List keywords) {
        kotlin.jvm.internal.o.g(keywords, "keywords");
    }

    @Override // z21.b
    public void c() {
    }

    @Override // z21.b
    public void d(int i17) {
        com.tencent.mm.plugin.webview.ui.tools.fts.j3 j3Var = this.f184354a;
        com.tencent.mm.plugin.webview.ui.tools.fts.j3.a(j3Var);
        com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI baseSearchWebViewUI = (com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI) j3Var.f184452b.get();
        if (baseSearchWebViewUI != null) {
            baseSearchWebViewUI.da(j3Var.D);
        }
        j3Var.getClass();
        j3Var.D = "";
    }

    @Override // z21.b
    public void e(int i17, int i18, int i19, long j17) {
        com.tencent.mm.plugin.webview.ui.tools.fts.j3.a(this.f184354a);
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.webview.ui.tools.fts.a3(i17, i18, i19, this.f184354a));
    }

    @Override // z21.b
    public void f(java.lang.String str, boolean z17) {
    }

    @Override // z21.b
    public void g() {
        com.tencent.mm.plugin.webview.ui.tools.fts.j3 j3Var = this.f184354a;
        com.tencent.mm.plugin.webview.ui.tools.fts.w2 w2Var = j3Var.f184453c;
        com.tencent.mm.sdk.platformtools.b4 b4Var = j3Var.F;
        if (b4Var != null) {
            b4Var.d();
        }
    }
}
