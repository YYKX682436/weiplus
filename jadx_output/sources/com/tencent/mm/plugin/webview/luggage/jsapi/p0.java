package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class p0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.n0 f182426d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182427e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f182428f;

    public p0(com.tencent.mm.plugin.webview.luggage.jsapi.q0 q0Var, com.tencent.mm.plugin.webview.model.n0 n0Var, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        this.f182426d = n0Var;
        this.f182427e = str;
        this.f182428f = q5Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.webview.modeltools.z.bj().i(this.f182426d);
        com.tencent.mm.plugin.webview.modeltools.z.bj().e(this.f182427e);
        this.f182428f.a("downloadImage:fail", null);
    }
}
