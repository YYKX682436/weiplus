package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class t4 implements com.tencent.mm.ui.widget.snackbar.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186537a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186538b;

    public t4(nw4.k kVar, nw4.y2 y2Var) {
        this.f186537a = kVar;
        this.f186538b = y2Var;
    }

    @Override // com.tencent.mm.ui.widget.snackbar.h
    public void a() {
    }

    @Override // com.tencent.mm.ui.widget.snackbar.h
    public void onHide() {
        nw4.g gVar = this.f186537a.f340863d;
        nw4.y2 y2Var = this.f186538b;
        gVar.e(y2Var.f341013c, y2Var.f341019i + ":ok", null);
    }

    @Override // com.tencent.mm.ui.widget.snackbar.h
    public void onShow() {
    }
}
