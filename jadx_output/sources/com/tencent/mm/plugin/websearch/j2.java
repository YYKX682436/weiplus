package com.tencent.mm.plugin.websearch;

/* loaded from: classes.dex */
public abstract class j2 {
    public static final void a(su4.j2 params, int i17, android.os.Bundle bundle) {
        boolean z17;
        boolean z18;
        kotlin.jvm.internal.o.g(params, "params");
        if (i17 <= 0) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TagSearchNewStyleApplier", "applyNewStyleParams: tagSearchStyle=" + i17);
        params.f412946i = false;
        if (i17 == 2) {
            params.B = true;
            params.C = true;
        }
        int i18 = j62.e.g().i("clicfg_android_global_search_use_ai_search_input", 0, true, true);
        java.util.Map extParams = params.f412944g;
        kotlin.jvm.internal.o.f(extParams, "extParams");
        extParams.put("webSearchStyle", java.lang.String.valueOf(i18));
        if (i18 > 0) {
            try {
                org.json.JSONArray jSONArray = !com.tencent.mm.sdk.platformtools.t8.K0(params.f412962y) ? new org.json.JSONArray(params.f412962y) : new org.json.JSONArray();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("key", "webSearchStyle");
                jSONObject.put("uintValue", i18);
                jSONArray.put(jSONObject);
                params.f412962y = jSONArray.toString();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TagSearchNewStyleApplier", e17, "append webSearchStyle to extReqParamsStr", new java.lang.Object[0]);
            }
        }
        java.lang.String string = bundle != null ? bundle.getString("tagJump_webviewJson") : null;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            params.f412955r = string;
        }
        java.lang.String string2 = bundle != null ? bundle.getString("tagJump_jumpQuery") : null;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
            params.f412963z = string2;
            java.util.Map extParams2 = params.f412944g;
            kotlin.jvm.internal.o.f(extParams2, "extParams");
            kotlin.jvm.internal.o.d(string2);
            extParams2.put("displayQuery", string2);
        }
        java.util.Map extParams3 = params.f412944g;
        kotlin.jvm.internal.o.f(extParams3, "extParams");
        extParams3.put("parentSearchID", "163::::");
        boolean z19 = bundle != null ? bundle.getBoolean("tagJump_isNewWebSearchStyle", false) : false;
        if (i18 > 0) {
            try {
                tg0.i1 i1Var = (tg0.i1) i95.n0.c(tg0.i1.class);
                if (i1Var == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.TagSearchNewStyleApplier", "applyFTSConfigParams: IFTSGlobalSearchInputConfigProvider not available");
                } else {
                    if (!z19) {
                        java.lang.String wi6 = ((s50.i0) i1Var).wi();
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(wi6)) {
                            java.util.Map extParams4 = params.f412944g;
                            kotlin.jvm.internal.o.f(extParams4, "extParams");
                            kotlin.jvm.internal.o.d(wi6);
                            extParams4.put("checkboxes", wi6);
                        }
                    }
                    try {
                        z17 = new g23.h().f267919c;
                    } catch (java.lang.Exception e18) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.ConfigProvider", e18, "isHideNavBar error", new java.lang.Object[0]);
                        z17 = false;
                    }
                    try {
                        z18 = new g23.h().f267918b;
                    } catch (java.lang.Exception e19) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.ConfigProvider", e19, "isHideSearchBar error", new java.lang.Object[0]);
                        z18 = false;
                    }
                    if (z17 || z18) {
                        java.util.Map extParams5 = params.f412944g;
                        kotlin.jvm.internal.o.f(extParams5, "extParams");
                        java.lang.String str = "1";
                        extParams5.put("hideSearchBar", z18 ? "1" : "0");
                        java.util.Map extParams6 = params.f412944g;
                        kotlin.jvm.internal.o.f(extParams6, "extParams");
                        if (!z17) {
                            str = "0";
                        }
                        extParams6.put("hideNavBar", str);
                        params.f412946i = z18;
                        params.f412947j = z17;
                    }
                }
            } catch (java.lang.Exception e27) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TagSearchNewStyleApplier", e27, "applyFTSConfigParams: error", new java.lang.Object[0]);
            }
        }
        params.f412960w = true;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("applyNewStyleParams done: webSearchStyle=");
        sb6.append(i18);
        sb6.append(", isNewWebSearchStyle=");
        sb6.append(z19);
        sb6.append(", halfScreen=");
        sb6.append(params.B);
        sb6.append(", allowSwitchToFullScreen=");
        sb6.append(params.C);
        sb6.append(", hasWebviewJson=");
        sb6.append(!com.tencent.mm.sdk.platformtools.t8.K0(string));
        sb6.append(", hasJumpQuery=");
        sb6.append(!com.tencent.mm.sdk.platformtools.t8.K0(string2));
        com.tencent.mars.xlog.Log.i("MicroMsg.TagSearchNewStyleApplier", sb6.toString());
    }
}
