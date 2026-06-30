package com.tencent.mm.ui.mmfb.sdk;

/* loaded from: classes13.dex */
public class r extends com.tencent.xweb.h1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f209222a = true;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.mmfb.sdk.s f209223b;

    public r(com.tencent.mm.ui.mmfb.sdk.s sVar, com.tencent.mm.ui.mmfb.sdk.p pVar) {
        this.f209223b = sVar;
    }

    @Override // com.tencent.xweb.h1
    public boolean B(com.tencent.xweb.WebView webView, java.lang.String str) {
        android.os.Bundle bundle;
        boolean startsWith = str.startsWith("fbconnect://success");
        com.tencent.mm.ui.mmfb.sdk.s sVar = this.f209223b;
        if (startsWith) {
            try {
                java.net.URL url = new java.net.URL(str.replace("fbconnect", "http"));
                bundle = com.tencent.mm.ui.mmfb.sdk.o.a(url.getQuery());
                bundle.putAll(com.tencent.mm.ui.mmfb.sdk.o.a(url.getRef()));
            } catch (java.net.MalformedURLException unused) {
                bundle = new android.os.Bundle();
            }
            java.lang.String string = bundle.getString("error");
            if (string == null) {
                string = bundle.getString("error_type");
            }
            if (string == null) {
                sVar.f209226e.b(bundle);
            } else if (string.equals("access_denied") || string.equals("OAuthAccessDeniedException")) {
                sVar.f209226e.onCancel();
            } else {
                sVar.f209226e.d(new com.tencent.mm.ui.mmfb.sdk.n(string));
            }
            sVar.dismiss();
            return true;
        }
        if (str.startsWith("fbconnect://cancel")) {
            sVar.f209226e.onCancel();
            try {
                sVar.dismiss();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FbDialog", e17, "", new java.lang.Object[0]);
            }
            return true;
        }
        if (str.contains("touch")) {
            return false;
        }
        android.content.Context context = sVar.getContext();
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/mmfb/sdk/FbDialog$FbWebViewClient", "shouldOverrideUrlLoading", "(Lcom/tencent/xweb/WebView;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/ui/mmfb/sdk/FbDialog$FbWebViewClient", "shouldOverrideUrlLoading", "(Lcom/tencent/xweb/WebView;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }

    @Override // com.tencent.xweb.h1
    public void n(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.mm.ui.mmfb.sdk.s sVar = this.f209223b;
        this.f209222a = false;
        try {
            sVar.f209227f.dismiss();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FbDialog", e17, "", new java.lang.Object[0]);
        }
        sVar.f209230i.setBackgroundColor(0);
        sVar.f209229h.setVisibility(0);
        sVar.f209228g.setVisibility(0);
    }

    @Override // com.tencent.xweb.h1
    public void o(com.tencent.xweb.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        com.tencent.mm.ui.mmfb.sdk.s sVar = this.f209223b;
        try {
            sVar.f209227f.show();
            sVar.f209227f.setOnDismissListener(new com.tencent.mm.ui.mmfb.sdk.q(this));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FbDialog", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.xweb.h1
    public void p(com.tencent.xweb.WebView webView, int i17, java.lang.String str, java.lang.String str2) {
        this.f209222a = false;
        com.tencent.mm.ui.mmfb.sdk.s sVar = this.f209223b;
        sVar.f209226e.c(new com.tencent.mm.ui.mmfb.sdk.h(str, i17, str2));
        try {
            sVar.dismiss();
            sVar.f209227f.dismiss();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FbDialog", e17, "", new java.lang.Object[0]);
        }
    }
}
