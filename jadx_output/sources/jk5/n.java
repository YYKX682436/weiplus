package jk5;

/* loaded from: classes13.dex */
public class n extends com.tencent.xweb.h1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f300179a = true;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jk5.o f300180b;

    public n(jk5.o oVar, jk5.k kVar) {
        this.f300180b = oVar;
    }

    @Override // com.tencent.xweb.h1
    public boolean B(com.tencent.xweb.WebView webView, java.lang.String str) {
        android.os.Bundle bundle;
        boolean startsWith = str.startsWith("wechatapp://sign-in-twitter.wechatapp.com/");
        jk5.o oVar = this.f300180b;
        if (!startsWith) {
            android.content.Context context = oVar.getContext();
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/twitter/TwitterDialog$TwitterWebViewClient", "shouldOverrideUrlLoading", "(Lcom/tencent/xweb/WebView;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/ui/twitter/TwitterDialog$TwitterWebViewClient", "shouldOverrideUrlLoading", "(Lcom/tencent/xweb/WebView;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
        try {
            java.net.URL url = new java.net.URL(str.replace("wechatapp", "http"));
            bundle = C(url.getQuery());
            bundle.putAll(C(url.getRef()));
        } catch (java.net.MalformedURLException unused) {
            bundle = new android.os.Bundle();
        }
        if (bundle.getString("denied") == null) {
            jk5.j jVar = (jk5.j) oVar.f300183e;
            jVar.getClass();
            gm0.j1.e().j(new jk5.i(jVar, bundle));
        } else {
            ((jk5.j) oVar.f300183e).c();
        }
        oVar.dismiss();
        return true;
    }

    public android.os.Bundle C(java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        if (str != null) {
            for (java.lang.String str2 : str.split("&")) {
                java.lang.String[] split = str2.split("=");
                bundle.putString(java.net.URLDecoder.decode(split[0]), java.net.URLDecoder.decode(split[1]));
            }
        }
        return bundle;
    }

    @Override // com.tencent.xweb.h1
    public void n(com.tencent.xweb.WebView webView, java.lang.String str) {
        jk5.o oVar = this.f300180b;
        this.f300179a = false;
        try {
            oVar.f300184f.dismiss();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TwitterDialog", e17, "", new java.lang.Object[0]);
        }
        oVar.f300187i.setBackgroundColor(0);
        oVar.f300186h.setVisibility(0);
        oVar.f300185g.setVisibility(0);
    }

    @Override // com.tencent.xweb.h1
    public void o(com.tencent.xweb.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        jk5.o oVar = this.f300180b;
        try {
            oVar.f300184f.show();
            oVar.f300184f.setOnDismissListener(new jk5.m(this));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TwitterDialog", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.xweb.h1
    public void p(com.tencent.xweb.WebView webView, int i17, java.lang.String str, java.lang.String str2) {
        this.f300179a = false;
        jk5.o oVar = this.f300180b;
        jk5.l lVar = oVar.f300183e;
        new com.tencent.mm.ui.mmfb.sdk.h(str, i17, str2);
        jk5.j jVar = (jk5.j) lVar;
        jVar.d(false);
        jVar.a(jk5.c.Failed);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(583L, 2L, 1L, false);
        try {
            oVar.dismiss();
            oVar.f300184f.dismiss();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TwitterDialog", e17, "", new java.lang.Object[0]);
        }
    }
}
