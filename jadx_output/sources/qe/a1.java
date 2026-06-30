package qe;

/* loaded from: classes7.dex */
public class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.d0 f361916d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qe.d1 f361917e;

    public a1(qe.d1 d1Var, com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var) {
        this.f361917e = d1Var;
        this.f361916d = d0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList<java.lang.String> arrayList;
        java.util.ArrayList<java.lang.String> arrayList2;
        qe.d1 d1Var = this.f361917e;
        com.tencent.mars.xlog.Log.i("Luggage.WcWssNativeInstallHelper", "initConfigWcWss initConfig mContextId:%s", d1Var.f361928a);
        if (d1Var.f361935h == null) {
            com.tencent.mars.xlog.Log.e("Luggage.WcWssNativeInstallHelper", "initConfigWcWss mWcwssNative is null");
            return;
        }
        uh1.a aVar = (uh1.a) this.f361916d.b(uh1.a.class);
        if (aVar == null) {
            com.tencent.mars.xlog.Log.e("Luggage.WcWssNativeInstallHelper", "initConfigWcWss networkConfig is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("Luggage.WcWssNativeInstallHelper", "wcwss mbzType:%s,,websocketTimeoutMS:%d,userAgentString :%s,referer:%s,mode:%d", d1Var.f361934g, java.lang.Integer.valueOf(aVar.f427742f), aVar.B, aVar.D, java.lang.Integer.valueOf(aVar.E));
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
        hashMap.put("referer", aVar.D);
        hashMap.put("User-Agent", aVar.B);
        hashMap.put("bzType", d1Var.f361934g);
        hashMap.put("mode", java.lang.String.valueOf(aVar.E));
        hashMap.put("timeout", java.lang.String.valueOf(aVar.f427742f));
        d1Var.f361935h.initConfig(hashMap);
        int i17 = aVar.E;
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.e("Luggage.WcWssNativeInstallHelper", "initConfigWcWss invalid mode:%d", java.lang.Integer.valueOf(i17));
            return;
        }
        if (i17 == 1) {
            java.util.ArrayList arrayList3 = aVar.f427755v;
            if (arrayList3 == null || arrayList3.size() == 0) {
                com.tencent.mars.xlog.Log.e("Luggage.WcWssNativeInstallHelper", "initConfigWcWss blacklistHeaders is null");
                arrayList2 = null;
            } else {
                arrayList2 = aVar.f427755v;
            }
            d1Var.f361935h.initConfigWhiteBlack(null, arrayList2);
            return;
        }
        if (i17 != 2) {
            com.tencent.mars.xlog.Log.e("Luggage.WcWssNativeInstallHelper", "initConfigWcWss invalid mode:%d", java.lang.Integer.valueOf(i17));
            return;
        }
        java.util.ArrayList arrayList4 = aVar.f427756w;
        if (arrayList4 == null || arrayList4.size() == 0) {
            com.tencent.mars.xlog.Log.e("Luggage.WcWssNativeInstallHelper", "initConfigWcWss whitelistHeaders is null");
            arrayList = null;
        } else {
            arrayList = aVar.f427756w;
        }
        d1Var.f361935h.initConfigWhiteBlack(arrayList, null);
    }
}
