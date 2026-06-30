package dp4;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final dp4.b f242262a = new dp4.b();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f242263b = lp0.b.e() + "imageEnhancementSceneFilterSettings.json";

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f242264c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f242265d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final float f242266e = 0.45f;

    /* renamed from: f, reason: collision with root package name */
    public static final float f242267f = 0.1f;

    /* renamed from: g, reason: collision with root package name */
    public static final float f242268g = 0.1f;

    /* renamed from: h, reason: collision with root package name */
    public static final float f242269h = 0.2f;

    /* renamed from: i, reason: collision with root package name */
    public static final float f242270i = 0.4f;

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f242271j;

    static {
        kz5.c1.k(new jz5.l(tq5.c.SkinSmooth, 0), new jz5.l(tq5.c.EyeBright, 1), new jz5.l(tq5.c.SkinBright, 2), new jz5.l(tq5.c.EyeMorph, 3), new jz5.l(tq5.c.FaceMorph, 4));
        f242271j = new float[]{0.45f, 0.4f, 0.2f, 0.1f, 0.1f};
    }

    public final void a() {
        boolean z17 = com.tencent.mm.sdk.platformtools.o4.M("FINDER_CONFIG_USER_KEY").getInt("USERINFO_FINDER_SHOW_IMAGE_ENHANCEMENT_SETTING_INT_SYNC", 0) == 1;
        java.lang.String str = f242263b;
        if (z17) {
            d();
            java.util.HashMap infoMap = f242265d;
            kotlin.jvm.internal.o.g(infoMap, "infoMap");
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            for (java.util.Map.Entry entry : infoMap.entrySet()) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, ((java.lang.Number) entry.getKey()).intValue());
                java.util.List<tq5.e> filtersInfo = (java.util.List) entry.getValue();
                kotlin.jvm.internal.o.g(filtersInfo, "filtersInfo");
                org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                for (tq5.e info : filtersInfo) {
                    kotlin.jvm.internal.o.g(info, "info");
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("type", info.f421251a.ordinal());
                    jSONObject2.put("filterWeight", java.lang.Float.valueOf(info.f421252b));
                    jSONObject2.put("filterPath", info.f421253c);
                    jSONObject2.put("builtinLutFilterType", info.f421254d.ordinal());
                    org.json.JSONArray jSONArray3 = new org.json.JSONArray();
                    float[] filterWeights = info.f421255e;
                    kotlin.jvm.internal.o.f(filterWeights, "filterWeights");
                    for (float f17 : filterWeights) {
                        jSONArray3.put(java.lang.Float.valueOf(f17));
                    }
                    jSONObject2.put("filterWeights", jSONArray3);
                    jSONArray2.put(jSONObject2);
                }
                jSONObject.put("filters", jSONArray2);
                jSONArray.put(jSONObject);
            }
            java.lang.String jSONArray4 = jSONArray.toString();
            kotlin.jvm.internal.o.f(jSONArray4, "toString(...)");
            byte[] bytes = jSONArray4.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            com.tencent.mm.vfs.w6.S(str, bytes, 0, bytes.length);
        }
        java.lang.String M = com.tencent.mm.vfs.w6.M(str);
        so4.g gVar = so4.g.f410776a;
        kotlin.jvm.internal.o.d(M);
        so4.a aVar = so4.g.f410780e;
        if (aVar == null || aVar.a() <= 0) {
            return;
        }
        uq5.p pVar = aVar.f410766a;
        if (pVar != null) {
            com.tencent.mm.xeffect.effect.VLogEffectJNI.INSTANCE.setConfigJson$renderlib_release(pVar.f430269c, M);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LocalEffectManager", "setImageEnhancementSceneFilterSettingsByJson:".concat(M));
        com.tencent.mars.xlog.Log.i("MicroMsg.LocalEffectManager", "setImageEnhancementSceneFilterSettingsByJson, ret:true, effectId:" + aVar.a());
    }

    public final java.lang.String b(int i17) {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (i17 == 0) {
            java.lang.String string = context.getString(com.tencent.mm.R.string.k7j);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            return string;
        }
        if (i17 == 1) {
            java.lang.String string2 = context.getString(com.tencent.mm.R.string.k7i);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            return string2;
        }
        if (i17 == 2) {
            java.lang.String string3 = context.getString(com.tencent.mm.R.string.k7f);
            kotlin.jvm.internal.o.f(string3, "getString(...)");
            return string3;
        }
        if (i17 == 3) {
            java.lang.String string4 = context.getString(com.tencent.mm.R.string.k7k);
            kotlin.jvm.internal.o.f(string4, "getString(...)");
            return string4;
        }
        if (i17 == 4) {
            java.lang.String string5 = context.getString(com.tencent.mm.R.string.k7e);
            kotlin.jvm.internal.o.f(string5, "getString(...)");
            return string5;
        }
        if (i17 == 5) {
            java.lang.String string6 = context.getString(com.tencent.mm.R.string.k7m);
            kotlin.jvm.internal.o.f(string6, "getString(...)");
            return string6;
        }
        if (i17 == 6) {
            java.lang.String string7 = context.getString(com.tencent.mm.R.string.k7o);
            kotlin.jvm.internal.o.f(string7, "getString(...)");
            return string7;
        }
        if (i17 == 7) {
            java.lang.String string8 = context.getString(com.tencent.mm.R.string.k7n);
            kotlin.jvm.internal.o.f(string8, "getString(...)");
            return string8;
        }
        if (i17 == 8) {
            java.lang.String string9 = context.getString(com.tencent.mm.R.string.k7c);
            kotlin.jvm.internal.o.f(string9, "getString(...)");
            return string9;
        }
        if (i17 == 9) {
            java.lang.String string10 = context.getString(com.tencent.mm.R.string.k7g);
            kotlin.jvm.internal.o.f(string10, "getString(...)");
            return string10;
        }
        if (i17 == 10) {
            java.lang.String string11 = context.getString(com.tencent.mm.R.string.k7l);
            kotlin.jvm.internal.o.f(string11, "getString(...)");
            return string11;
        }
        if (i17 == 11) {
            java.lang.String string12 = context.getString(com.tencent.mm.R.string.k7d);
            kotlin.jvm.internal.o.f(string12, "getString(...)");
            return string12;
        }
        if (i17 != 12) {
            return "Unknown type";
        }
        java.lang.String string13 = context.getString(com.tencent.mm.R.string.k7h);
        kotlin.jvm.internal.o.f(string13, "getString(...)");
        return string13;
    }

    public final java.util.HashMap c(org.json.JSONArray json) {
        tq5.d dVar;
        tq5.b bVar;
        kotlin.jvm.internal.o.g(json, "json");
        java.util.HashMap hashMap = new java.util.HashMap();
        int length = json.length();
        int i17 = 0;
        int i18 = 0;
        while (i18 < length) {
            org.json.JSONObject jSONObject = json.getJSONObject(i18);
            int optInt = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, -1);
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("filters");
            if (optInt >= 0 && optJSONArray != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int length2 = optJSONArray.length();
                int i19 = i17;
                while (i19 < length2) {
                    org.json.JSONObject jSONObject2 = optJSONArray.getJSONObject(i19);
                    kotlin.jvm.internal.o.f(jSONObject2, "getJSONObject(...)");
                    tq5.e eVar = new tq5.e();
                    int optInt2 = jSONObject2.optInt("type", i17);
                    tq5.d[] values = tq5.d.values();
                    int length3 = values.length;
                    int i27 = i17;
                    while (true) {
                        if (i27 >= length3) {
                            dVar = tq5.d.Unknown;
                            break;
                        }
                        dVar = values[i27];
                        if (dVar.ordinal() == optInt2) {
                            break;
                        }
                        i27++;
                    }
                    eVar.f421251a = dVar;
                    eVar.f421252b = (float) jSONObject2.optDouble("filterWeight", 0.0d);
                    eVar.f421253c = jSONObject2.optString("filterPath");
                    int optInt3 = jSONObject2.optInt("builtinLutFilterType", 0);
                    tq5.b[] values2 = tq5.b.values();
                    int length4 = values2.length;
                    int i28 = 0;
                    while (true) {
                        if (i28 >= length4) {
                            bVar = tq5.b.Unknown;
                            break;
                        }
                        bVar = values2[i28];
                        if (bVar.ordinal() == optInt3) {
                            break;
                        }
                        i28++;
                    }
                    eVar.f421254d = bVar;
                    org.json.JSONArray optJSONArray2 = jSONObject2.optJSONArray("filterWeights");
                    if (optJSONArray2 != null) {
                        eVar.f421255e = new float[optJSONArray2.length()];
                        int length5 = optJSONArray2.length();
                        for (int i29 = 0; i29 < length5; i29++) {
                            eVar.f421255e[i29] = (float) optJSONArray2.getDouble(i29);
                        }
                    }
                    arrayList.add(eVar);
                    i19++;
                    i17 = 0;
                }
                hashMap.put(java.lang.Integer.valueOf(optInt), arrayList);
            }
            i18++;
            i17 = 0;
        }
        return hashMap;
    }

    public final void d() {
        java.lang.Object obj;
        java.util.List list = (java.util.List) f242265d.get(1);
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((tq5.e) obj).f421251a == tq5.d.FACE_BEAUTY) {
                        break;
                    }
                }
            }
            tq5.e eVar = (tq5.e) obj;
            if (eVar != null) {
                float[] filterWeights = eVar.f421255e;
                int length = filterWeights.length;
                float[] fArr = f242271j;
                if (length == fArr.length) {
                    kotlin.jvm.internal.o.f(filterWeights, "filterWeights");
                    kz5.v.m(filterWeights, fArr, 0, 0, 0, 14, null);
                } else {
                    float[] fArr2 = new float[fArr.length];
                    eVar.f421255e = fArr2;
                    kz5.v.m(fArr, fArr2, 0, 0, 0, 14, null);
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageEnhancementFilterSettingLogic", "loadFaceBeautySettings, skinSmooth:" + f242266e + ", skinBright:" + f242269h + ", faceMorph:" + f242268g + ", eyeBright:" + f242270i + ", eyeMorph:" + f242267f);
    }
}
