package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes12.dex */
public class w5 implements sw4.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.l6 f182501a;

    public w5(com.tencent.mm.plugin.webview.luggage.jsapi.l6 l6Var) {
        this.f182501a = l6Var;
    }

    @Override // sw4.e
    public void a(android.os.Bundle bundle) {
    }

    @Override // sw4.e
    public void f(android.os.Bundle bundle) {
        com.tencent.mm.plugin.webview.luggage.jsapi.l6 l6Var = this.f182501a;
        if (bundle == null) {
            ((com.tencent.mm.plugin.webview.luggage.jsapi.n5) l6Var.f182391f).a(false, null);
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String string = bundle.getString("media_id");
        java.lang.String string2 = bundle.getString("media_url");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (string == null) {
            string = "";
        }
        hashMap.put("serverId", string);
        if (string2 == null) {
            string2 = "";
        }
        hashMap.put("mediaUrl", string2);
        ((com.tencent.mm.plugin.webview.luggage.jsapi.n5) l6Var.f182391f).a(true, hashMap);
    }
}
