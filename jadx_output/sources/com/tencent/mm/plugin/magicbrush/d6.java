package com.tencent.mm.plugin.magicbrush;

@j95.b
/* loaded from: classes7.dex */
public final class d6 extends i95.w implements com.tencent.mm.plugin.magicbrush.e4 {

    /* renamed from: d, reason: collision with root package name */
    public int f147911d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f147912e = new java.util.concurrent.ConcurrentHashMap();

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("MagicBrushGlobalConfigFeatureService", "onAccountReleased");
        super.onAccountReleased(context);
        this.f147912e.clear();
    }

    public jc3.o0 wi(java.lang.String bizName) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        java.lang.String str;
        java.lang.String str2;
        jc3.n0 n0Var;
        org.json.JSONObject jSONObject;
        org.json.JSONArray jSONArray;
        java.lang.String str3;
        java.lang.String str4;
        java.util.HashMap hashMap;
        java.lang.String str5;
        java.lang.String str6;
        org.json.JSONObject jSONObject2;
        java.lang.String str7;
        java.lang.String str8;
        com.tencent.mm.plugin.magicbrush.d6 d6Var = this;
        kotlin.jvm.internal.o.g(bizName, "bizName");
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String lowerCase = bizName.toLowerCase(locale);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        if (d6Var.f147912e.get(lowerCase) != null) {
            java.lang.Object obj = d6Var.f147912e.get(lowerCase);
            kotlin.jvm.internal.o.d(obj);
            return (jc3.o0) obj;
        }
        java.lang.String lowerCase2 = "MagicPermissionConfig".toLowerCase(locale);
        kotlin.jvm.internal.o.f(lowerCase2, "toLowerCase(...)");
        boolean b17 = kotlin.jvm.internal.o.b(lowerCase, lowerCase2);
        jc3.n0 n0Var2 = jc3.o0.f298964i;
        if (b17) {
            d6Var.f147912e.put(lowerCase, n0Var2.a(new java.util.HashMap()));
        } else {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = d6Var.f147912e;
            ((com.tencent.mm.plugin.magicbrush.k7) ((com.tencent.mm.plugin.magicbrush.r4) i95.n0.c(com.tencent.mm.plugin.magicbrush.r4.class))).getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicPermissionConfig", "getBizConfig biz:%s,module:%s,configName:%s", lowerCase, "magicbrush", "config");
            java.util.Locale locale2 = java.util.Locale.getDefault();
            kotlin.jvm.internal.o.f(locale2, "getDefault(...)");
            java.lang.String lowerCase3 = lowerCase.toLowerCase(locale2);
            kotlin.jvm.internal.o.f(lowerCase3, "toLowerCase(...)");
            java.lang.String str9 = "/magicbrush/" + lowerCase3 + "/config.json";
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.magicbrush.s4.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.appbrand.appstorage.u1 b18 = com.tencent.mm.plugin.magicbrush.s4.T9((com.tencent.mm.plugin.magicbrush.s4) c17, "MagicPermissionConfig", null, 2, null).b();
            ik1.b0 b0Var = new ik1.b0();
            com.tencent.mm.plugin.appbrand.appstorage.j1 readFile = b18.readFile("/magicbrush/config.json", b0Var);
            kotlin.jvm.internal.o.f(readFile, "readFile(...)");
            java.util.HashMap hashMap2 = new java.util.HashMap();
            com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var = com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
            java.lang.String str10 = "value";
            java.lang.String str11 = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME;
            java.lang.String str12 = "UTF_8";
            java.lang.String str13 = "arrayOfByteBuffer(...)";
            if (readFile == j1Var) {
                byte[] a17 = ik1.f.a((java.nio.ByteBuffer) b0Var.f291824a);
                kotlin.jvm.internal.o.f(a17, "arrayOfByteBuffer(...)");
                concurrentHashMap = concurrentHashMap2;
                java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
                kotlin.jvm.internal.o.f(UTF_8, "UTF_8");
                n0Var = n0Var2;
                org.json.JSONObject jSONObject3 = new org.json.JSONObject(new java.lang.String(a17, UTF_8));
                org.json.JSONArray names = jSONObject3.names();
                int length = names.length();
                int i17 = 0;
                while (i17 < length) {
                    int i18 = length;
                    java.lang.String optString = names.optString(i17);
                    org.json.JSONArray jSONArray2 = names;
                    org.json.JSONArray optJSONArray = jSONObject3.optJSONArray(optString);
                    if (optJSONArray != null) {
                        jSONObject2 = jSONObject3;
                        java.util.HashMap hashMap3 = new java.util.HashMap();
                        str5 = str12;
                        int length2 = optJSONArray.length();
                        str6 = str13;
                        int i19 = 0;
                        while (i19 < length2) {
                            int i27 = length2;
                            org.json.JSONObject jSONObject4 = optJSONArray.getJSONObject(i19);
                            org.json.JSONArray jSONArray3 = optJSONArray;
                            java.lang.String optString2 = jSONObject4.optString(str11);
                            java.lang.String optString3 = jSONObject4.optString(str10);
                            com.tencent.mars.xlog.Log.i("MicroMsg.MagicPermissionConfig", "global bizName %s module %s name:%s,value:%s", lowerCase, optString, optString2, optString3);
                            kotlin.jvm.internal.o.d(optString2);
                            kotlin.jvm.internal.o.d(optString3);
                            hashMap3.put(optString2, optString3);
                            i19++;
                            length2 = i27;
                            optJSONArray = jSONArray3;
                            str10 = str10;
                            str11 = str11;
                        }
                        str7 = str10;
                        str8 = str11;
                        kotlin.jvm.internal.o.d(optString);
                        hashMap2.put(optString, hashMap3);
                    } else {
                        str5 = str12;
                        str6 = str13;
                        jSONObject2 = jSONObject3;
                        str7 = str10;
                        str8 = str11;
                    }
                    i17++;
                    length = i18;
                    names = jSONArray2;
                    jSONObject3 = jSONObject2;
                    str12 = str5;
                    str13 = str6;
                    str10 = str7;
                    str11 = str8;
                }
                str = str12;
                str2 = str13;
            } else {
                concurrentHashMap = concurrentHashMap2;
                str = "UTF_8";
                str2 = "arrayOfByteBuffer(...)";
                n0Var = n0Var2;
            }
            java.lang.String str14 = str10;
            java.lang.String str15 = str11;
            com.tencent.mm.plugin.appbrand.appstorage.j1 readFile2 = b18.readFile(str9, b0Var);
            kotlin.jvm.internal.o.f(readFile2, "readFile(...)");
            if (readFile2 == j1Var) {
                byte[] a18 = ik1.f.a((java.nio.ByteBuffer) b0Var.f291824a);
                kotlin.jvm.internal.o.f(a18, str2);
                java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
                kotlin.jvm.internal.o.f(charset, str);
                org.json.JSONObject jSONObject5 = new org.json.JSONObject(new java.lang.String(a18, charset));
                org.json.JSONArray names2 = jSONObject5.names();
                int length3 = names2.length();
                int i28 = 0;
                while (i28 < length3) {
                    java.lang.String optString4 = names2.optString(i28);
                    org.json.JSONArray optJSONArray2 = jSONObject5.optJSONArray(optString4);
                    if (optJSONArray2 != null) {
                        java.util.HashMap hashMap4 = new java.util.HashMap();
                        if ((!hashMap2.isEmpty()) && (hashMap = (java.util.HashMap) hashMap2.get(optString4)) != null) {
                            hashMap4 = hashMap;
                        }
                        int length4 = optJSONArray2.length();
                        int i29 = 0;
                        while (i29 < length4) {
                            org.json.JSONObject jSONObject6 = optJSONArray2.getJSONObject(i29);
                            java.lang.String optString5 = jSONObject6.optString(str15);
                            java.lang.String optString6 = jSONObject6.optString(str14);
                            com.tencent.mars.xlog.Log.i("MicroMsg.MagicPermissionConfig", "bizName %s, module %s, name:%s,value:%s", lowerCase, optString4, optString5, optString6);
                            kotlin.jvm.internal.o.d(optString5);
                            kotlin.jvm.internal.o.d(optString6);
                            hashMap4.put(optString5, optString6);
                            i29++;
                            jSONObject5 = jSONObject5;
                            names2 = names2;
                        }
                        jSONObject = jSONObject5;
                        jSONArray = names2;
                        str3 = str14;
                        str4 = str15;
                        kotlin.jvm.internal.o.d(optString4);
                        hashMap2.put(optString4, hashMap4);
                    } else {
                        jSONObject = jSONObject5;
                        jSONArray = names2;
                        str3 = str14;
                        str4 = str15;
                    }
                    i28++;
                    str14 = str3;
                    str15 = str4;
                    jSONObject5 = jSONObject;
                    names2 = jSONArray;
                }
            }
            concurrentHashMap.put(lowerCase, n0Var.a(hashMap2));
            d6Var = this;
        }
        java.lang.Object obj2 = d6Var.f147912e.get(lowerCase);
        kotlin.jvm.internal.o.d(obj2);
        return (jc3.o0) obj2;
    }
}
