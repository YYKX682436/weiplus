package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class g6 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.n0 f185133d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185134e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185135f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185136g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185137h;

    public g6(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, com.tencent.mm.plugin.webview.model.n0 n0Var, java.lang.String str, nw4.y2 y2Var, java.lang.String str2) {
        this.f185137h = c1Var;
        this.f185133d = n0Var;
        this.f185134e = str;
        this.f185135f = y2Var;
        this.f185136g = str2;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.webview.modeltools.z.bj().i(this.f185133d);
        com.tencent.mm.plugin.webview.modeltools.z.bj().f(this.f185134e);
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185137h;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.F3(c1Var);
        c1Var.i5(this.f185135f, this.f185136g + ":cancel", null);
    }
}
