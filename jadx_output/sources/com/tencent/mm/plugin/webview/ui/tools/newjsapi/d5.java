package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class d5 implements com.tencent.mm.ui.widget.dialog.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186034a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186035b;

    public d5(nw4.k kVar, nw4.y2 y2Var) {
        this.f186034a = kVar;
        this.f186035b = y2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.b1
    public final void a() {
        nw4.g gVar = this.f186034a.f340863d;
        nw4.y2 y2Var = this.f186035b;
        gVar.e(y2Var.f341013c, y2Var.f341019i + ":canceled", null);
    }
}
