package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes7.dex */
public final class s implements db5.s4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o25.y1 f187527a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f187528b;

    public s(o25.y1 y1Var, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f187527a = y1Var;
        this.f187528b = k0Var;
    }

    @Override // db5.s4
    public final void a(android.view.MenuItem menuItem, int i17) {
        if (menuItem instanceof db5.h4) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f187528b;
            kotlin.jvm.internal.o.d(k0Var);
            ((com.tencent.mm.pluginsdk.forward.m) this.f187527a).cj(k0Var, (db5.h4) menuItem, 3);
        }
    }
}
