package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class gh extends com.tencent.mm.ui.widget.dialog.g2 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.xh f118445e;

    public gh(com.tencent.mm.plugin.finder.live.widget.xh xhVar) {
        this.f118445e = xhVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.g2
    public android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return this.f118445e;
    }

    @Override // com.tencent.mm.ui.widget.dialog.g2
    public void f() {
        com.tencent.mm.plugin.finder.live.widget.xh.c(this.f118445e);
    }

    @Override // com.tencent.mm.ui.widget.dialog.g2
    public void g() {
        android.view.Window b17;
        com.tencent.mm.ui.widget.dialog.y1 y1Var = this.f211798d;
        if (y1Var != null && (b17 = y1Var.b()) != null) {
            b17.setSoftInputMode(50);
        }
        java.util.Set set = com.tencent.mm.plugin.finder.live.widget.xh.H;
        com.tencent.mm.plugin.finder.live.widget.xh xhVar = this.f118445e;
        xhVar.getClass();
        mm2.c1 c1Var = (mm2.c1) dk2.ef.f233372a.i(mm2.c1.class);
        if (c1Var != null) {
            c1Var.N1 = true;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", true);
        com.tencent.mm.plugin.finder.live.plugin.l basePlugin = xhVar.getBasePlugin();
        if (basePlugin != null) {
            basePlugin.R0().statusChange(qo0.b.Z2, bundle);
        }
    }
}
