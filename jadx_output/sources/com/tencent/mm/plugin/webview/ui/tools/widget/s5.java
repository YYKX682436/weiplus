package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes9.dex */
public final class s5 implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.z5 f187535a;

    public s5(com.tencent.mm.plugin.webview.ui.tools.widget.z5 z5Var) {
        this.f187535a = z5Var;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public final void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mm.plugin.webview.ui.tools.widget.z5 z5Var = this.f187535a;
        z5Var.f187631x0 = false;
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.widget.r5(z5Var, oVar));
        if (i17 == 2) {
            cx4.a.c(8);
        } else if (i17 != 0) {
            cx4.a.c(9);
        }
    }
}
