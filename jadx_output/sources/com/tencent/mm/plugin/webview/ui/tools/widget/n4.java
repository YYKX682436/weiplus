package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class n4 implements com.tencent.xweb.g1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.o4 f187445a;

    public n4(com.tencent.mm.plugin.webview.ui.tools.widget.o4 o4Var) {
        this.f187445a = o4Var;
    }

    @Override // com.tencent.xweb.g1
    public boolean a(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, boolean z17, android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        boolean z18 = i18 > 0;
        com.tencent.mm.plugin.webview.ui.tools.widget.o4 o4Var = this.f187445a;
        o4Var.C = z18;
        o4Var.B = !z18;
        return true;
    }

    @Override // com.tencent.xweb.g1
    public void b(int i17) {
        this.f187445a.m(i17);
    }

    @Override // com.tencent.xweb.g1
    public void d(int i17, int i18, int i19, int i27, android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
    }

    @Override // com.tencent.xweb.g1
    public void e(int i17, int i18, boolean z17, boolean z18, android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        this.f187445a.D = z18;
    }
}
