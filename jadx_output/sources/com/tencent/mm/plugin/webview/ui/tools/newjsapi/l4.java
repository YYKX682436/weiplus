package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class l4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186334e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f186335f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f186336g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f186337h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186338i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186339m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f186340n;

    public l4(nw4.k kVar, java.lang.String str, int i17, int i18, int i19, nw4.y2 y2Var, java.lang.String str2, boolean z17) {
        this.f186333d = kVar;
        this.f186334e = str;
        this.f186335f = i17;
        this.f186336g = i18;
        this.f186337h = i19;
        this.f186338i = y2Var;
        this.f186339m = str2;
        this.f186340n = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nw4.k kVar = this.f186333d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(kVar.f340860a, 1, true);
        nw4.k kVar2 = this.f186333d;
        k0Var.f211872n = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.f4(kVar2);
        k0Var.f211881s = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.j4(this.f186335f, this.f186336g, kVar2, this.f186337h, this.f186338i, this.f186339m, this.f186340n);
        k0Var.q(this.f186334e, 17);
        k0Var.f211854d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.k4(kVar, this.f186338i);
        k0Var.v();
    }
}
