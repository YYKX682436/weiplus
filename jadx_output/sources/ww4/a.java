package ww4;

/* loaded from: classes8.dex */
public final class a implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ww4.b f450388d;

    public a(ww4.b bVar) {
        this.f450388d = bVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewFtsQuickHelper", "user click search!");
        ww4.b bVar = this.f450388d;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = bVar.f450389a;
        boolean j17 = webViewUI.f183866w2.j();
        su4.j2 j2Var = new su4.j2();
        j2Var.f412938a = bVar.f450390b;
        j2Var.f412943f = true;
        j2Var.f412940c = 0;
        j2Var.f412939b = j17 ? 135 : 137;
        j2Var.A = true;
        j2Var.f412945h = true;
        j2Var.f412948k = true;
        j2Var.I = true;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("url", webViewUI.x7());
        jSONArray.put(jSONObject2);
        jSONObject.put("doc_list", jSONArray);
        j2Var.f412937J = jSONObject.toString();
        java.lang.String encode = java.net.URLEncoder.encode(webViewUI.x7(), com.tencent.mapsdk.internal.rv.f51270c);
        com.tencent.mm.plugin.webview.model.u5.b(encode, 10, webViewUI.getMMTitle().toString(), webViewUI.f183818g);
        str = "";
        if (j17) {
            com.tencent.mm.plugin.webview.ui.tools.jd w76 = webViewUI.w7();
            java.util.Map extParams = j2Var.f412944g;
            kotlin.jvm.internal.o.f(extParams, "extParams");
            java.lang.String str2 = w76 != null ? w76.f184871a : null;
            if (str2 == null) {
                str2 = "";
            }
            extParams.put("userName", str2);
            cl0.g gVar = new cl0.g();
            java.lang.String str3 = w76 != null ? w76.f184871a : null;
            if (str3 == null) {
                str3 = "";
            }
            gVar.h("bizUserName", str3);
            java.lang.String str4 = w76 != null ? w76.f184872b : null;
            if (str4 == null) {
                str4 = "";
            }
            gVar.h("bizNickName", str4);
            gVar.h("pageUrl", encode);
            java.lang.CharSequence mMTitle = webViewUI.getMMTitle();
            if (mMTitle == null) {
                mMTitle = "";
            }
            gVar.h("page_title", mMTitle);
            j2Var.K = gVar.toString();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Mp, userName = ");
            java.lang.String str5 = w76 != null ? w76.f184871a : null;
            if (str5 == null) {
                str5 = "";
            }
            sb6.append(str5);
            sb6.append(", bizUserName = ");
            java.lang.String str6 = w76 != null ? w76.f184871a : null;
            if (str6 == null) {
                str6 = "";
            }
            sb6.append(str6);
            sb6.append(", bizNickName = ");
            java.lang.String str7 = w76 != null ? w76.f184872b : null;
            sb6.append(str7 != null ? str7 : "");
            sb6.append(", pageUrl = ");
            sb6.append(encode);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewFtsQuickHelper", sb6.toString());
        } else {
            cl0.g gVar2 = new cl0.g();
            gVar2.h("pageUrl", encode);
            java.lang.CharSequence mMTitle2 = webViewUI.getMMTitle();
            java.lang.CharSequence charSequence = str;
            if (mMTitle2 != null) {
                charSequence = mMTitle2;
            }
            gVar2.h("page_title", charSequence);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewFtsQuickHelper", "not Mp, pageTitle = " + ((java.lang.Object) webViewUI.getMMTitle()) + ", pageUrl = " + encode);
            j2Var.K = gVar2.toString();
        }
        ((com.tencent.mm.plugin.websearch.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
        return false;
    }
}
