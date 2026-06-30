package fy;

/* loaded from: classes4.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final fy.h f267169d = new fy.h();

    public h() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Iterable iterable;
        java.lang.String str;
        org.json.JSONObject param = (org.json.JSONObject) obj;
        yz5.l onComplete = (yz5.l) obj2;
        kotlin.jvm.internal.o.g(param, "param");
        kotlin.jvm.internal.o.g(onComplete, "onComplete");
        try {
            org.json.JSONArray jSONArray = param.getJSONArray("chat_id_list");
            e06.k m17 = e06.p.m(0, jSONArray.length());
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m17, 10));
            java.util.Iterator it = m17.iterator();
            while (((e06.j) it).hasNext()) {
                arrayList.add(jSONArray.getString(((kz5.x0) it).b()));
            }
            iterable = kz5.n0.K0(arrayList, 6);
        } catch (java.lang.Exception unused) {
            iterable = kz5.p0.f313996d;
        }
        try {
            str = param.getString("display_scene");
        } catch (java.lang.Exception unused2) {
            str = "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FunctionCall", "display_contact_list invoke chatIdList " + iterable + " displayScene " + str);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(ya.b.SUCCESS, true);
        java.util.List i17 = kz5.c0.i("send_message", "voice_call", "video_call");
        kotlin.jvm.internal.o.d(str);
        if (str.length() == 0) {
            jSONObject.put(ya.b.SUCCESS, false);
            jSONObject.put("error_message", "display_scene is required");
            jSONObject.put("displayed_contacts", new org.json.JSONArray());
            onComplete.invoke(jSONObject);
        } else if (i17.contains(str)) {
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            vg3.x3 x3Var = (vg3.x3) gm0.j1.s(vg3.x3.class);
            java.util.Iterator it6 = iterable.iterator();
            while (it6.hasNext()) {
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) x3Var).Bi().n((java.lang.String) it6.next(), true);
                if (n17 != null && n17.r2()) {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("chat_id", n17.d1());
                    jSONObject2.put("nickname", n17.P0());
                    jSONObject2.put("remark", n17.w0());
                    jSONArray2.put(jSONObject2);
                }
            }
            jSONObject.put("displayed_contacts", jSONArray2);
            jSONObject.put(ya.b.SUCCESS, true);
            onComplete.invoke(jSONObject);
        } else {
            java.lang.Object message = "invalid display_scene: " + str + ", must be one of " + i17;
            kotlin.jvm.internal.o.g(message, "message");
            jSONObject.put(ya.b.SUCCESS, false);
            jSONObject.put("error_message", message);
            jSONObject.put("displayed_contacts", new org.json.JSONArray());
            onComplete.invoke(jSONObject);
        }
        return jz5.f0.f302826a;
    }
}
