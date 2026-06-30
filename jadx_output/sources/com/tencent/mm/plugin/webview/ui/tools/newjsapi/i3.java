package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class i3 implements c00.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186246a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186247b;

    public i3(nw4.k kVar, nw4.y2 y2Var) {
        this.f186246a = kVar;
        this.f186247b = y2Var;
    }

    @Override // c00.n3
    public void a() {
        nw4.g gVar = this.f186246a.f340863d;
        nw4.y2 y2Var = this.f186247b;
        gVar.e(y2Var.f341013c, y2Var.f341019i + ":fail", null);
    }

    @Override // c00.n3
    public void b(org.json.JSONObject jSONObject) {
        nw4.g gVar = this.f186246a.f340863d;
        nw4.y2 y2Var = this.f186247b;
        gVar.e(y2Var.f341013c, y2Var.f341019i + ":ok", com.tencent.mm.plugin.webview.ui.tools.newjsapi.j3.f186269d.e(jSONObject));
    }

    @Override // c00.n3
    public void c(c00.x2 event) {
        kotlin.jvm.internal.o.g(event, "event");
    }

    @Override // c00.n3
    public void d(org.json.JSONObject jSONObject) {
        nw4.g gVar = this.f186246a.f340863d;
        nw4.y2 y2Var = this.f186247b;
        gVar.e(y2Var.f341013c, y2Var.f341019i + ":fail", com.tencent.mm.plugin.webview.ui.tools.newjsapi.j3.f186269d.e(jSONObject));
    }

    @Override // c00.n3
    public void onCancel() {
        nw4.g gVar = this.f186246a.f340863d;
        nw4.y2 y2Var = this.f186247b;
        gVar.e(y2Var.f341013c, y2Var.f341019i + ":cancel", null);
    }
}
