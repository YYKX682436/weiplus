package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class y3 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182522d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f182523e;

    public y3(com.tencent.mm.plugin.webview.luggage.jsapi.w3 w3Var, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        this.f182522d = str;
        this.f182523e = q5Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).aj(this.f182522d);
        this.f182523e.a("cancel", null);
    }
}
