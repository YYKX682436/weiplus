package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class x6 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.n0 f185535d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185536e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185537f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185538g;

    public x6(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, com.tencent.mm.plugin.webview.model.n0 n0Var, java.lang.String str, nw4.y2 y2Var) {
        this.f185538g = c1Var;
        this.f185535d = n0Var;
        this.f185536e = str;
        this.f185537f = y2Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.webview.modeltools.z.bj().i(this.f185535d);
        com.tencent.mm.plugin.webview.modeltools.z.bj().e(this.f185536e);
        this.f185538g.i5(this.f185537f, "downloadVoice:fail", null);
    }
}
