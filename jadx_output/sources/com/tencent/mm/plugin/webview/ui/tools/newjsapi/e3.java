package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes4.dex */
public final class e3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f186050d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186051e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186052f;

    public e3(android.app.Activity activity, nw4.k kVar, nw4.y2 y2Var) {
        this.f186050d = activity;
        this.f186051e = kVar;
        this.f186052f = y2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.ga.L(this.f186050d);
        nw4.g gVar = this.f186051e.f340863d;
        nw4.y2 y2Var = this.f186052f;
        gVar.e(y2Var.f341013c, y2Var.f341019i + ":ok", null);
    }
}
