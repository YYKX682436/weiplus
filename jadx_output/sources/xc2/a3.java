package xc2;

/* loaded from: classes2.dex */
public final class a3 extends xc2.b1 {
    @Override // xc2.j
    public org.json.JSONObject n(xc2.p0 infoEx) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            com.tencent.mm.protocal.protobuf.NativeInfo native_info = infoEx.f453234a.getNative_info();
            if (native_info == null || (str = native_info.getNecessary_params()) == null) {
                str = "";
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(str);
            java.lang.Object obj = null;
            try {
                boolean z17 = true;
                if (!jSONObject2.has("topic_id")) {
                    z17 = false;
                }
                if (z17) {
                    obj = jSONObject2.getString("topic_id");
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeGetString", "", e17);
            }
            if (obj == null) {
                obj = 0L;
            }
            jSONObject.put("music_profile_id", obj);
        } catch (org.json.JSONException unused) {
        }
        return jSONObject;
    }

    @Override // xc2.j
    public java.lang.String o() {
        return "link_music_profile";
    }
}
