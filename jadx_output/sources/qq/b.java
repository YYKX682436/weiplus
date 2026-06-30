package qq;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final qq.b f365857a = new qq.b();

    public static final r45.fz2 a(qq.b bVar, java.lang.String str) {
        bVar.getClass();
        r45.fz2 fz2Var = new r45.fz2();
        fz2Var.f374741d = new java.util.LinkedList();
        r45.cp5 cp5Var = new r45.cp5();
        cp5Var.f371768d = 1;
        r45.ap5 ap5Var = new r45.ap5();
        cp5Var.f371769e = ap5Var;
        ap5Var.f370176d = new r45.x80();
        r45.ap5 ap5Var2 = cp5Var.f371769e;
        r45.x80 x80Var = ap5Var2 != null ? ap5Var2.f370176d : null;
        if (x80Var != null) {
            x80Var.f389853d = str;
        }
        r45.x80 x80Var2 = ap5Var2 != null ? ap5Var2.f370176d : null;
        if (x80Var2 != null) {
            r45.wm5 wm5Var = new r45.wm5();
            wm5Var.f389290d = 1;
            x80Var2.f389855f = wm5Var;
        }
        r45.ap5 ap5Var3 = cp5Var.f371769e;
        if (ap5Var3 != null) {
            ap5Var3.f370177e = new r45.x80();
        }
        r45.ap5 ap5Var4 = cp5Var.f371769e;
        r45.x80 x80Var3 = ap5Var4 != null ? ap5Var4.f370177e : null;
        if (x80Var3 != null) {
            x80Var3.f389853d = str;
        }
        r45.x80 x80Var4 = ap5Var4 != null ? ap5Var4.f370177e : null;
        if (x80Var4 != null) {
            r45.wm5 wm5Var2 = new r45.wm5();
            wm5Var2.f389290d = 1;
            x80Var4.f389855f = wm5Var2;
        }
        r45.yo5 yo5Var = new r45.yo5();
        cp5Var.f371770f = yo5Var;
        yo5Var.f391261d = new r45.t60();
        r45.yo5 yo5Var2 = cp5Var.f371770f;
        r45.t60 t60Var = yo5Var2 != null ? yo5Var2.f391261d : null;
        if (t60Var != null) {
            t60Var.f386168f = 0;
        }
        java.util.LinkedList linkedList = fz2Var.f374741d;
        if (linkedList != null) {
            linkedList.add(cp5Var);
        }
        return fz2Var;
    }

    public static final r45.fz2 b(qq.b bVar, java.lang.String str) {
        bVar.getClass();
        org.json.JSONArray jSONArray = new org.json.JSONObject(str).getJSONArray("nodes");
        r45.fz2 fz2Var = new r45.fz2();
        fz2Var.f374741d = new java.util.LinkedList();
        int length = jSONArray.length();
        for (int i17 = 0; i17 < length; i17++) {
            org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
            kotlin.jvm.internal.o.d(jSONObject);
            r45.cp5 cp5Var = new r45.cp5();
            cp5Var.f371768d = jSONObject.optInt("style", 1);
            if (jSONObject.has("content")) {
                org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("content");
                kotlin.jvm.internal.o.f(jSONObject2, "getJSONObject(...)");
                r45.ap5 ap5Var = new r45.ap5();
                boolean has = jSONObject2.has("original");
                qq.b bVar2 = f365857a;
                if (has) {
                    org.json.JSONObject jSONObject3 = jSONObject2.getJSONObject("original");
                    kotlin.jvm.internal.o.f(jSONObject3, "getJSONObject(...)");
                    ap5Var.f370176d = bVar2.c(jSONObject3);
                }
                if (jSONObject2.has(com.tencent.tav.core.AssetExtension.SCENE_THUMBNAIL)) {
                    org.json.JSONObject jSONObject4 = jSONObject2.getJSONObject(com.tencent.tav.core.AssetExtension.SCENE_THUMBNAIL);
                    kotlin.jvm.internal.o.f(jSONObject4, "getJSONObject(...)");
                    ap5Var.f370177e = bVar2.c(jSONObject4);
                }
                cp5Var.f371769e = ap5Var;
            }
            if (jSONObject.has("attr")) {
                org.json.JSONObject jSONObject5 = jSONObject.getJSONObject("attr");
                kotlin.jvm.internal.o.f(jSONObject5, "getJSONObject(...)");
                r45.yo5 yo5Var = new r45.yo5();
                if (jSONObject5.has("common")) {
                    org.json.JSONObject jSONObject6 = jSONObject5.getJSONObject("common");
                    kotlin.jvm.internal.o.f(jSONObject6, "getJSONObject(...)");
                    r45.t60 t60Var = new r45.t60();
                    t60Var.f386166d = jSONObject6.optInt("size", 0);
                    t60Var.f386168f = jSONObject6.optInt("line", 0);
                    t60Var.f386169g = jSONObject6.optInt("vertical_align", 0);
                    yo5Var.f391261d = t60Var;
                }
                if (jSONObject5.has("business")) {
                    org.json.JSONObject jSONObject7 = jSONObject5.getJSONObject("business");
                    kotlin.jvm.internal.o.f(jSONObject7, "getJSONObject(...)");
                    r45.lp lpVar = new r45.lp();
                    if (jSONObject7.has("radius")) {
                        lpVar.f379687f = (float) jSONObject7.getDouble("radius");
                    }
                    if (jSONObject7.has("reddot_pendant")) {
                        org.json.JSONObject optJSONObject = jSONObject7.optJSONObject("reddot_pendant");
                        kotlin.jvm.internal.o.f(optJSONObject, "optJSONObject(...)");
                        r45.xm5 xm5Var = new r45.xm5();
                        if (optJSONObject.has("original_position")) {
                            xm5Var.f390242d = optJSONObject.optInt("original_position");
                        }
                        if (optJSONObject.has("thumbnail_position")) {
                            xm5Var.f390243e = optJSONObject.optInt("thumbnail_position");
                        }
                        lpVar.f379689h = xm5Var;
                    }
                    yo5Var.f391262e = lpVar;
                }
                cp5Var.f371770f = yo5Var;
            }
            java.util.LinkedList linkedList = fz2Var.f374741d;
            if (linkedList != null) {
                linkedList.add(cp5Var);
            }
        }
        return fz2Var;
    }

    public final r45.x80 c(org.json.JSONObject jSONObject) {
        r45.x80 x80Var = new r45.x80();
        if (jSONObject.has(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT)) {
            x80Var.f389853d = jSONObject.getString(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT);
        }
        if (jSONObject.has("icon")) {
            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("icon");
            kotlin.jvm.internal.o.f(jSONObject2, "getJSONObject(...)");
            r45.qy3 qy3Var = new r45.qy3();
            if (jSONObject2.has("image_url")) {
                org.json.JSONObject jSONObject3 = jSONObject2.getJSONObject("image_url");
                kotlin.jvm.internal.o.f(jSONObject3, "getJSONObject(...)");
                r45.xy3 xy3Var = new r45.xy3();
                if (jSONObject3.has("light")) {
                    xy3Var.f390593d = jSONObject3.getString("light");
                }
                if (jSONObject3.has("dark")) {
                    xy3Var.f390594e = jSONObject3.getString("dark");
                }
                qy3Var.f384352e = xy3Var;
            }
            x80Var.f389854e = qy3Var;
        }
        if (jSONObject.has("reddot_pendant")) {
            org.json.JSONObject jSONObject4 = jSONObject.getJSONObject("reddot_pendant");
            kotlin.jvm.internal.o.f(jSONObject4, "getJSONObject(...)");
            r45.wm5 wm5Var = new r45.wm5();
            wm5Var.f389290d = jSONObject4.optInt("static_icon", 0);
            x80Var.f389855f = wm5Var;
        }
        return x80Var;
    }
}
