package td1;

/* loaded from: classes14.dex */
public final class q extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 854;
    public static final java.lang.String NAME = "operateRecentUsageList";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        boolean z17;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        if (c0Var == null || jSONObject == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.operateRecentUsageList", "data = " + jSONObject);
        td1.l lVar2 = td1.l.f417608e;
        java.util.HashMap i18 = kz5.c1.i(new jz5.l(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE, 1));
        int optInt = jSONObject.optInt("actionType", -1);
        td1.k[] values = td1.k.values();
        int length = values.length;
        int i19 = 0;
        while (true) {
            if (i19 >= length) {
                z17 = true;
                break;
            }
            if (values[i19].f417607d == optInt) {
                z17 = false;
                break;
            }
            i19++;
        }
        if (z17) {
            C("fail:illegal actionType", ":" + optInt);
            c0Var.a(i17, p("fail:illegal actionType", i18));
            return;
        }
        java.lang.String optString = jSONObject.optString(dm.i4.COL_USERNAME, "");
        if (optString == null || r26.n0.N(optString)) {
            C("fail:username is empty", "");
            c0Var.a(i17, p("fail:username is empty", i18));
            return;
        }
        java.lang.String optString2 = jSONObject.optString("appId", "");
        if (optString2 == null || r26.n0.N(optString2)) {
            C("fail:appId is empty", "");
            c0Var.a(i17, p("fail:appId is empty", i18));
            return;
        }
        int optInt2 = jSONObject.optInt("versionType", -1);
        if (optInt2 == -1) {
            C("fail:versionType is empty", "");
            c0Var.a(i17, p("fail:versionType is empty", i18));
            return;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.w9.f193053a;
        td1.k.f417605e.getClass();
        for (td1.k kVar : td1.k.values()) {
            if (kVar.f417607d == optInt) {
                kotlin.jvm.internal.o.d(optString);
                kotlin.jvm.internal.o.d(optString2);
                com.tencent.mm.ipcinvoker.d0.d(str, new com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiOperateRecentUsageList$Companion$Parameter(kVar, optString, optString2, optInt2), td1.o.class, new td1.p(c0Var, i17, this));
                return;
            }
        }
        throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
    }

    public final java.lang.String C(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.w("MicroMsg.operateRecentUsageList", str + str2);
        return str;
    }
}
