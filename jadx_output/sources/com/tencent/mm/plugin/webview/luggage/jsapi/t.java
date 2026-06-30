package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class t implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd.b f182458d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.u f182459e;

    public t(com.tencent.mm.plugin.webview.luggage.jsapi.u uVar, sd.b bVar) {
        this.f182459e = uVar;
        this.f182458d = bVar;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == (this.f182459e.hashCode() & 65535)) {
            java.util.HashMap hashMap = new java.util.HashMap();
            if (intent != null) {
                java.lang.String stringExtra = intent.getStringExtra("card_list");
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (stringExtra == null) {
                    stringExtra = "";
                }
                hashMap.put("card_list", stringExtra);
            }
            sd.b bVar = this.f182458d;
            if (i18 == -1) {
                bVar.d(hashMap);
                return;
            }
            if ((intent != null ? intent.getIntExtra("result_code", 2) : 2) == 2) {
                bVar.b("fail", hashMap);
            } else {
                bVar.b("cancel", hashMap);
            }
        }
    }
}
