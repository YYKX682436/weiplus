package v10;

/* loaded from: classes9.dex */
public final class b extends t10.c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String name) {
        super(name);
        kotlin.jvm.internal.o.g(name, "name");
    }

    @Override // t10.c
    public boolean a(pq.a context, bw5.x7 jumpInfo) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        if (jumpInfo.d() == null) {
            return false;
        }
        java.lang.String appid = jumpInfo.d().getAppid();
        return !(appid == null || appid.length() == 0);
    }

    @Override // t10.c
    public void b(pq.a context, bw5.x7 jumpInfo, t10.d callback) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (jumpInfo.d() == null) {
            callback.c("jumpInfo.liteAppInfo is null");
            return;
        }
        bw5.q7 d17 = jumpInfo.d();
        java.lang.String appid = d17.getAppid();
        if (appid == null || appid.length() == 0) {
            callback.c("jumpInfo.liteAppInfo.appid is null");
            return;
        }
        android.content.Context c17 = context.c();
        if (c17 == null) {
            callback.c("context.context is null");
            return;
        }
        boolean[] zArr = d17.f31987o;
        java.lang.String str = zArr[3] ? d17.f31981f : "";
        bw5.d8 b17 = context.f357552b.b();
        java.lang.String str2 = b17.f26375f[1] ? b17.f26373d : "";
        if (!(str2 == null || str2.length() == 0)) {
            q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
            java.lang.String str3 = zArr[3] ? d17.f31981f : "";
            bw5.d8 b18 = context.f357552b.b();
            java.lang.String str4 = b18.f26375f[1] ? b18.f26373d : "";
            com.tencent.mm.feature.lite.i iVar = (com.tencent.mm.feature.lite.i) g0Var;
            iVar.getClass();
            try {
                org.json.JSONObject Tj = iVar.Tj(str3);
                org.json.JSONObject Tj2 = iVar.Tj(str4);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                java.util.Iterator<java.lang.String> keys = Tj.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    jSONObject.put(next, Tj.get(next));
                }
                java.util.Iterator<java.lang.String> keys2 = Tj2.keys();
                while (keys2.hasNext()) {
                    java.lang.String next2 = keys2.next();
                    jSONObject.put(next2, Tj2.get(next2));
                }
                str = jSONObject.toString();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppFeatureService", "processQuery fail: " + e17.getMessage());
                str = "";
            }
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            bw5.q7 d18 = jumpInfo.d();
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(d18.f31987o[8] ? d18.f31986n : "");
            b00.p0 p0Var = b00.p0.f16747a;
            if (!K0) {
                bw5.q7 d19 = jumpInfo.d();
                jSONObject2 = p0Var.f(jSONObject2, new org.json.JSONObject(d19.f31987o[8] ? d19.f31986n : ""));
            }
            if (context.d() != null) {
                org.json.JSONObject d27 = context.d();
                kotlin.jvm.internal.o.d(d27);
                jSONObject2 = p0Var.f(jSONObject2, d27);
            }
            if (context.f357552b.b() != null) {
                bw5.d8 b19 = context.f357552b.b();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(b19.f26375f[2] ? b19.f26374e : "")) {
                    bw5.d8 b27 = context.f357552b.b();
                    jSONObject2 = p0Var.f(jSONObject2, new org.json.JSONObject(b27.f26375f[2] ? b27.f26374e : ""));
                }
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("ECS_O.Router.LiteApp", e18, "nativeExtraData parse error", new java.lang.Object[0]);
        }
        com.tencent.mars.xlog.Log.i("ECS_O.Router.LiteApp", "[LiteAppRouter] extraParamInfo: " + jSONObject2);
        com.tencent.mars.xlog.Log.i("ECS_O.Router.LiteApp", "jumpLiteApp appid:" + d17.getAppid() + " path:" + d17.getPath() + " query:" + str + ", nativeExtraData:" + jSONObject2);
        z20.e eVar = z20.e.f469543e;
        z20.b bVar = new z20.b();
        bVar.f469537a = eVar;
        bw5.q9 q9Var = new bw5.q9();
        q9Var.f31999d = "ecso_open";
        q9Var.f32013u[1] = true;
        q9Var.c(java.lang.System.currentTimeMillis());
        q9Var.b(2);
        bVar.f469538b = q9Var;
        bVar.f(java.lang.String.valueOf(context.f357555e));
        bVar.c("open_lite_app");
        bVar.e(kz5.c1.k(new jz5.l("appId", d17.getAppid()), new jz5.l(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, d17.getPath()), new jz5.l("query", str)));
        bVar.a();
        com.tencent.liteapp.storage.LiteAppReferrerInfo liteAppReferrerInfo = new com.tencent.liteapp.storage.LiteAppReferrerInfo();
        liteAppReferrerInfo.scene = com.tencent.liteapp.gen.LiteAppOpenScene.ECS;
        liteAppReferrerInfo.extraData = jSONObject2;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", d17.getAppid());
        bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, d17.getPath());
        bundle.putString("query", str);
        bundle.putParcelable("liteappReferrerInfo", liteAppReferrerInfo);
        bundle.putLong("timeout", 30000L);
        bundle.putBoolean("withDownloadLoading", true);
        bundle.putBoolean(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_TRANSPARENT, d17.f31985m);
        if (d17.f31983h == 2) {
            bw5.p7 p7Var = zArr[6] ? d17.f31984i : new bw5.p7();
            com.tencent.mm.plugin.lite.api.LiteAppHalfScreenConfig liteAppHalfScreenConfig = new com.tencent.mm.plugin.lite.api.LiteAppHalfScreenConfig();
            liteAppHalfScreenConfig.f143417n = p7Var.f31482e;
            liteAppHalfScreenConfig.f143411e = p7Var.f31481d / 100.0d;
            liteAppHalfScreenConfig.f143415i = p7Var.f31484g;
            liteAppHalfScreenConfig.f143414h = p7Var.f31483f;
            bundle.putParcelable("halfScreenConfig", liteAppHalfScreenConfig);
        }
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).jk(c17, bundle, true, false, new com.tencent.mm.plugin.lite.s(), new v10.a(d17, c17));
        callback.d(null);
    }

    @Override // t10.c
    public void c(pq.a context, bw5.x7 jumpInfo, bw5.l8 l8Var, t10.d callback) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        kotlin.jvm.internal.o.g(callback, "callback");
        callback.c("handlePreload not impl");
    }
}
