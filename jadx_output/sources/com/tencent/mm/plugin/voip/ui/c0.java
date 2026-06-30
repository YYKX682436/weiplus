package com.tencent.mm.plugin.voip.ui;

/* loaded from: classes5.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.voip.ui.c0 f176942d = new com.tencent.mm.plugin.voip.ui.c0();

    public c0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        int i18;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_VOIP_FACEBEAUTY_CUSTOM_STRING, ""));
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            kotlin.jvm.internal.o.f(keys, "keys(...)");
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                kotlin.jvm.internal.o.d(next);
                try {
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeGetInt", "", e17);
                }
                if (jSONObject.has(next)) {
                    i18 = jSONObject.getInt(next);
                    arrayList.add(new com.tencent.mm.plugin.voip.ui.a(next, i18));
                }
                i18 = 0;
                arrayList.add(new com.tencent.mm.plugin.voip.ui.a(next, i18));
            }
        } catch (java.lang.Exception unused) {
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new com.tencent.mm.plugin.voip.ui.a("version", vq4.b0.i()));
            com.tencent.mm.plugin.xlabeffect.XEffectConfig n17 = vq4.b0.n();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("skinSmooth", n17.f188599g);
            jSONObject2.put("faceMorph", n17.f188601i);
            jSONObject2.put("skinBright", n17.f188602m);
            jSONObject2.put("eyeBright", n17.f188603n);
            jSONObject2.put("rosy", n17.f188604o);
            jSONObject2.put("eyePouch", n17.f188605p);
            jSONObject2.put("smileFolds", n17.f188606q);
            jSONObject2.put("sharpen", n17.f188607r);
            jSONObject2.put("teethBright", n17.f188608s);
            jSONObject2.put("smallHead", n17.f188609t);
            jSONObject2.put("cheekBone", n17.f188610u);
            jSONObject2.put("lowerJawbone", n17.f188611v);
            jSONObject2.put("wingOfNose", n17.f188612w);
            jSONObject2.put("chinShort", n17.f188613x);
            jSONObject2.put("chinLong", n17.f188614y);
            jSONObject2.put("hairLineHigh", n17.f188615z);
            jSONObject2.put("hairLineLow", n17.A);
            jSONObject2.put("bigEye", n17.B);
            jSONObject2.put("boySlim", n17.C);
            jSONObject2.put("girlSlim", n17.D);
            jSONObject2.put("mouthMorph", n17.E);
            jSONObject2.put("zhaiLian", n17.F);
            jSONObject2.put("contour", n17.G);
            jSONObject2.put("filterRate", n17.H);
            java.util.Iterator<java.lang.String> keys2 = jSONObject2.keys();
            kotlin.jvm.internal.o.f(keys2, "keys(...)");
            while (keys2.hasNext()) {
                java.lang.String next2 = keys2.next();
                kotlin.jvm.internal.o.d(next2);
                try {
                } catch (java.lang.Exception e18) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeGetInt", "", e18);
                }
                if (jSONObject2.has(next2)) {
                    i17 = jSONObject2.getInt(next2);
                    arrayList.add(new com.tencent.mm.plugin.voip.ui.a(next2, i17));
                }
                i17 = 0;
                arrayList.add(new com.tencent.mm.plugin.voip.ui.a(next2, i17));
            }
        }
        return arrayList;
    }
}
