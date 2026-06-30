package ik2;

/* loaded from: classes14.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ik2.c f291858a = new ik2.c();

    public final java.util.ArrayList a(java.lang.String str) {
        org.json.JSONArray jSONArray;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.e("Finder.FinderLiveFrameSetLayoutParam", "paramJson is empty");
            return arrayList;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveFrameSetLayoutParam", "parseFrameSetParam:%s", str);
        try {
            jSONArray = new org.json.JSONArray(str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.FinderLiveFrameSetLayoutParam", e17, "parseFrameSetParam", new java.lang.Object[0]);
        }
        if (jSONArray.length() == 0) {
            return arrayList;
        }
        int length = jSONArray.length();
        for (int i17 = 0; i17 < length; i17++) {
            org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
            ik2.d dVar = new ik2.d();
            dVar.f291859a = jSONObject.getString(dm.i4.COL_ID);
            dVar.f291860b = jSONObject.getString("parentId");
            dVar.f291861c = jSONObject.optInt("portrait", 0) == 1;
            dVar.f291862d = jSONObject.optInt("landscape", 0) == 1;
            dVar.f291863e = jSONObject.optInt("clearScreen", 0) == 1;
            dVar.f291864f = (int) java.lang.Math.pow(2.0d, jSONObject.optInt("bit", 0));
            dVar.f291865g = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, jSONObject.optInt("marginTop", 0));
            dVar.f291866h = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, jSONObject.optInt("marginLeft", 0));
            dVar.f291867i = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, jSONObject.optInt("marginRight", 0));
            dVar.f291868j = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, jSONObject.optInt("marginBottom", 0));
            int optInt = jSONObject.optInt("width", 0);
            int optInt2 = jSONObject.optInt("height", 0);
            if (optInt >= 0) {
                dVar.f291869k = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, optInt);
            } else {
                dVar.f291869k = optInt;
            }
            if (optInt2 >= 0) {
                dVar.f291870l = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, optInt2);
            } else {
                dVar.f291870l = optInt2;
            }
            dVar.f291871m = jSONObject.optInt("alignParentTop", 0) == 1;
            dVar.f291872n = jSONObject.optInt("alignParentLeft", 0) == 1;
            dVar.f291873o = jSONObject.optInt("alignParentRight", 0) == 1;
            dVar.f291874p = jSONObject.optInt("alignParentBottom", 0) == 1;
            dVar.f291875q = jSONObject.optInt("alignParentStart", 0) == 1;
            dVar.f291876r = jSONObject.optInt("alignParentEnd", 0) == 1;
            dVar.f291877s = jSONObject.optInt("centerInParent", 0) == 1;
            dVar.f291878t = jSONObject.optInt("centerHorizontal", 0) == 1;
            dVar.f291879u = jSONObject.optInt("centerVertical", 0) == 1;
            jSONObject.optInt("alignWithParentIfMissing", 0);
            java.lang.String optString = jSONObject.optString("alignTop");
            kotlin.jvm.internal.o.f(optString, "optString(...)");
            dVar.f291880v = optString;
            java.lang.String optString2 = jSONObject.optString("alignBottom");
            kotlin.jvm.internal.o.f(optString2, "optString(...)");
            dVar.f291881w = optString2;
            java.lang.String optString3 = jSONObject.optString("alignLeft");
            kotlin.jvm.internal.o.f(optString3, "optString(...)");
            dVar.f291882x = optString3;
            java.lang.String optString4 = jSONObject.optString("alignRight");
            kotlin.jvm.internal.o.f(optString4, "optString(...)");
            dVar.f291883y = optString4;
            java.lang.String optString5 = jSONObject.optString("below");
            kotlin.jvm.internal.o.f(optString5, "optString(...)");
            dVar.f291884z = optString5;
            java.lang.String optString6 = jSONObject.optString("above");
            kotlin.jvm.internal.o.f(optString6, "optString(...)");
            dVar.A = optString6;
            java.lang.String optString7 = jSONObject.optString("toLeftOf");
            kotlin.jvm.internal.o.f(optString7, "optString(...)");
            dVar.B = optString7;
            java.lang.String optString8 = jSONObject.optString("toRightOf");
            kotlin.jvm.internal.o.f(optString8, "optString(...)");
            dVar.C = optString8;
            java.lang.String optString9 = jSONObject.optString("toStartOf");
            kotlin.jvm.internal.o.f(optString9, "optString(...)");
            dVar.D = optString9;
            java.lang.String optString10 = jSONObject.optString("toEndOf");
            kotlin.jvm.internal.o.f(optString10, "optString(...)");
            dVar.E = optString10;
            arrayList.add(dVar);
        }
        return arrayList;
    }
}
