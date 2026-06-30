package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class b6 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.n0 f184955d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184956e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f184957f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184958g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f184959h;

    public b6(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, com.tencent.mm.plugin.webview.model.n0 n0Var, java.lang.String str, nw4.y2 y2Var, java.lang.String str2) {
        this.f184959h = c1Var;
        this.f184955d = n0Var;
        this.f184956e = str;
        this.f184957f = y2Var;
        this.f184958g = str2;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.webview.modeltools.z.bj().i(this.f184955d);
        com.tencent.mm.plugin.webview.modeltools.z.bj().f(this.f184956e);
        this.f184959h.i5(this.f184957f, this.f184958g + ":fail", null);
    }
}
