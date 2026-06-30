package tj1;

/* loaded from: classes7.dex */
public final class h implements defpackage.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f419695a;

    public h(com.tencent.mm.plugin.appbrand.e9 e9Var) {
        this.f419695a = e9Var;
    }

    public void a(android.os.Bundle bundle) {
        int i17;
        kotlin.jvm.internal.o.g(bundle, "bundle");
        java.lang.String translateLanguage = bundle.getString("newLanguageCode");
        java.lang.String string = bundle.getString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, "");
        boolean z17 = false;
        try {
            kotlin.jvm.internal.o.d(string);
            i17 = java.lang.Integer.parseInt(string);
        } catch (java.lang.NumberFormatException unused) {
            i17 = 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTranslateLogicWC", "sessionId:" + string + " newLanguageCode: " + translateLanguage + " type:" + i17);
        if (translateLanguage != null) {
            if (translateLanguage.length() > 0) {
                z17 = true;
            }
        }
        if (z17) {
            tj1.p pVar = new tj1.p();
            com.tencent.mm.plugin.appbrand.e9 service = this.f419695a;
            kotlin.jvm.internal.o.g(service, "service");
            kotlin.jvm.internal.o.g(translateLanguage, "translateLanguage");
            java.util.HashMap hashMap = new java.util.HashMap(1);
            hashMap.put("translateLanguage", translateLanguage);
            hashMap.put("type", java.lang.Integer.valueOf(i17));
            pVar.t(hashMap);
            pVar.u(service);
            pVar.m();
        }
    }
}
