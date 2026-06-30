package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class j implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182349d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182350e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182351f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f182352g;

    public j(com.tencent.mm.plugin.webview.luggage.jsapi.l lVar, java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        this.f182349d = str;
        this.f182350e = str2;
        this.f182351f = str3;
        this.f182352g = q5Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14217, this.f182349d, 6, this.f182350e, this.f182351f, 3);
        dialogInterface.dismiss();
        this.f182352g.a("network_not_wifi", null);
    }
}
