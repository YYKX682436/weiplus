package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class t3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f182462d;

    public t3(com.tencent.mm.plugin.webview.luggage.jsapi.v3 v3Var, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        this.f182462d = q5Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        this.f182462d.a("fail_network_not_wifi", null);
    }
}
