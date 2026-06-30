package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class xb implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186663a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186664b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f186665c;

    public xb(nw4.k kVar, nw4.y2 y2Var, java.util.HashMap hashMap) {
        this.f186663a = kVar;
        this.f186664b = y2Var;
        this.f186665c = hashMap;
    }

    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        java.lang.String.valueOf(intent);
        if (i17 == -1 && intent != null) {
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.zb.f186713d.e(intent);
            return;
        }
        nw4.g gVar = this.f186663a.f340863d;
        nw4.y2 y2Var = this.f186664b;
        gVar.e(y2Var.f341013c, y2Var.f341019i + ":fail RESULT NOT OK", this.f186665c);
    }
}
