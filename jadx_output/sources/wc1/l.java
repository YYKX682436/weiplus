package wc1;

/* loaded from: classes7.dex */
public final class l extends com.tencent.mm.plugin.appbrand.jsapi.a1 implements wc1.s {
    public static final int CTRL_INDEX = 467;
    public static final java.lang.String NAME = "batchCreateLoadSubPackageTask";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.a1
    public java.lang.String z(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject data) {
        java.util.LinkedList linkedList;
        com.tencent.mm.plugin.appbrand.jsruntime.f0 f0Var;
        java.lang.Object obj;
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.y env = (com.tencent.mm.plugin.appbrand.y) lVar;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        org.json.JSONArray optJSONArray = data.optJSONArray("moduleNameList");
        if (optJSONArray != null) {
            linkedList = new java.util.LinkedList();
            cf.f.b(optJSONArray, new wc1.k(linkedList));
        } else {
            linkedList = null;
        }
        if (linkedList == null || linkedList.isEmpty()) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            java.lang.String u17 = u(str2, jSONObject);
            kotlin.jvm.internal.o.f(u17, "makeReturnJson(...)");
            return u17;
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime = env.getRuntime();
        ph1.h hVar = runtime != null ? runtime.R : null;
        if (hVar == null) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            java.lang.String u18 = u(str2, jSONObject2);
            kotlin.jvm.internal.o.f(u18, "makeReturnJson(...)");
            return u18;
        }
        if (!hVar.e()) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (!kotlin.jvm.internal.o.b((java.lang.String) obj, com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.MAIN_MODULE_NAME)) {
                    break;
                }
            }
            if (obj != null) {
                str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
                str2 = str != null ? str : "";
                java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                try {
                    jSONObject3.put("errno", 101);
                } catch (java.lang.Exception e19) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
                }
                java.lang.String u19 = u(str2, jSONObject3);
                kotlin.jvm.internal.o.f(u19, "makeReturnJson(...)");
                return u19;
            }
        }
        ph1.b b17 = hVar.b();
        kotlin.jvm.internal.o.f(b17, "createBatchLoadModuleTransaction(...)");
        int[] iArr = new int[linkedList.size()];
        boolean[] zArr = new boolean[1];
        wc1.b bVar = new wc1.b();
        int i17 = 0;
        for (java.lang.Object obj2 : linkedList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.lang.String str6 = (java.lang.String) obj2;
            int g17 = wc1.s.g();
            iArr[i17] = g17;
            b17.a(str6, new wc1.g(bVar, zArr, env, g17, str6), new wc1.h(env, g17, str6), false);
            i17 = i18;
        }
        b17.commit();
        if (zArr[0]) {
            java.lang.String o17 = o("fail");
            kotlin.jvm.internal.o.d(o17);
            return o17;
        }
        java.util.Map e27 = kz5.b1.e(new jz5.l("loadTaskIdList", iArr));
        java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (!(e27 instanceof java.util.HashMap)) {
            e27 = new java.util.HashMap(e27);
        }
        e27.put("errno", 0);
        java.lang.String t17 = t("ok", e27);
        com.tencent.mm.plugin.appbrand.jsruntime.t f147808e = env.getF147808e();
        if (f147808e == null || (f0Var = (com.tencent.mm.plugin.appbrand.jsruntime.f0) f147808e.h0(com.tencent.mm.plugin.appbrand.jsruntime.f0.class)) == null) {
            env.getAsyncHandler().post(new wc1.j(bVar));
        } else {
            f0Var.post(new wc1.i(bVar));
        }
        kotlin.jvm.internal.o.d(t17);
        return t17;
    }
}
