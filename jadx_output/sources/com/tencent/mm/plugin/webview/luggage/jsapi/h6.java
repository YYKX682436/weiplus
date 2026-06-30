package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes12.dex */
public class h6 implements com.tencent.mm.plugin.webview.luggage.jsapi.f6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.i6 f182331a;

    public h6(com.tencent.mm.plugin.webview.luggage.jsapi.i6 i6Var) {
        this.f182331a = i6Var;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.f6
    public void a(boolean z17, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.webview.luggage.jsapi.i6 i6Var = this.f182331a;
        sw4.e eVar = i6Var.f182348b;
        if (eVar != null) {
            if (!z17) {
                eVar.f(null);
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("media_id", str);
            bundle.putString("media_url", str2);
            i6Var.f182348b.f(bundle);
        }
    }
}
