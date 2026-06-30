package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public final class c0 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f184971d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f184972e;

    public c0(nw4.k kVar, nw4.y2 y2Var) {
        this.f184971d = kVar;
        this.f184972e = y2Var;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (com.tencent.mm.plugin.webview.ui.tools.jsapi.d0.f185041e == i17) {
            nw4.y2 y2Var = this.f184972e;
            nw4.k kVar = this.f184971d;
            if (i18 == 0) {
                nw4.g gVar = kVar.f340863d;
                java.lang.String str = y2Var.f341013c;
                com.tencent.mm.plugin.webview.ui.tools.jsapi.d0 d0Var = com.tencent.mm.plugin.webview.ui.tools.jsapi.d0.f185040d;
                gVar.e(str, "createAvatar:cancel", null);
                return;
            }
            if (intent == null) {
                nw4.g gVar2 = kVar.f340863d;
                java.lang.String str2 = y2Var.f341013c;
                com.tencent.mm.plugin.webview.ui.tools.jsapi.d0 d0Var2 = com.tencent.mm.plugin.webview.ui.tools.jsapi.d0.f185040d;
                gVar2.e(str2, "createAvatar:fail", null);
                return;
            }
            int intExtra = intent.getIntExtra(dm.i4.COL_ID, -1);
            java.lang.String stringExtra = intent.getStringExtra("desc");
            if (stringExtra == null) {
                stringExtra = "";
            }
            java.lang.String stringExtra2 = intent.getStringExtra("nickname");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            java.lang.String stringExtra3 = intent.getStringExtra("avatarurl");
            java.lang.String str3 = stringExtra3 != null ? stringExtra3 : "";
            if (stringExtra2.length() > 0) {
                if (str3.length() > 0) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put(dm.i4.COL_ID, intExtra);
                    jSONObject.put("nickname", stringExtra2);
                    jSONObject.put("url", str3);
                    jSONObject.put("desc", stringExtra);
                    java.util.Map e17 = kz5.b1.e(new jz5.l("avatarInfo", jSONObject));
                    nw4.g gVar3 = kVar.f340863d;
                    java.lang.String str4 = y2Var.f341013c;
                    com.tencent.mm.plugin.webview.ui.tools.jsapi.d0 d0Var3 = com.tencent.mm.plugin.webview.ui.tools.jsapi.d0.f185040d;
                    gVar3.e(str4, "createAvatar:ok", e17);
                    return;
                }
            }
            nw4.g gVar4 = kVar.f340863d;
            java.lang.String str5 = y2Var.f341013c;
            com.tencent.mm.plugin.webview.ui.tools.jsapi.d0 d0Var4 = com.tencent.mm.plugin.webview.ui.tools.jsapi.d0.f185040d;
            gVar4.e(str5, "createAvatar:fail", null);
        }
    }
}
