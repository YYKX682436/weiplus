package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class u6 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.n0 f185437d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185438e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185439f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185440g;

    public u6(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, com.tencent.mm.plugin.webview.model.n0 n0Var, java.lang.String str, nw4.y2 y2Var) {
        this.f185440g = c1Var;
        this.f185437d = n0Var;
        this.f185438e = str;
        this.f185439f = y2Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.webview.modeltools.z.bj().i(this.f185437d);
        com.tencent.mm.plugin.webview.modeltools.z.bj().f(this.f185438e);
        this.f185440g.i5(this.f185439f, "uploadVoice:fail", null);
    }
}
