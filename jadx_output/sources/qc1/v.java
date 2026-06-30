package qc1;

/* loaded from: classes7.dex */
public class v extends qc1.a {
    public static final int CTRL_INDEX = 1;
    public static final java.lang.String NAME = "showKeyboard";

    public void H(com.tencent.mm.plugin.appbrand.widget.input.q0 q0Var) {
    }

    public com.tencent.mm.plugin.appbrand.widget.input.q0 I(java.lang.ref.WeakReference weakReference, java.lang.String str, int i17) {
        return new qc1.t(this, weakReference, i17, str);
    }

    public final void J(int i17, int i18, com.tencent.mm.plugin.appbrand.page.v5 v5Var) {
        try {
            int e17 = ik1.w.e(i18);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("inputId", i17);
                try {
                    jSONObject.put("height", e17);
                    v5Var.g("onKeyboardShow", jSONObject.toString());
                    v5Var.t2(e17);
                } catch (org.json.JSONException e18) {
                    throw new cl0.f(e18);
                }
            } catch (org.json.JSONException e19) {
                throw new cl0.f(e19);
            }
        } catch (cl0.f e27) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiShowKeyboard", "", e27.getMessage());
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public void A(com.tencent.mm.plugin.appbrand.page.v5 v5Var, org.json.JSONObject jSONObject, int i17) {
        int optInt;
        int optInt2 = jSONObject.optInt("cursor", -2);
        if (jSONObject.has("selectionStart") || jSONObject.has("selectionEnd")) {
            optInt2 = jSONObject.optInt("selectionStart", -2);
            optInt = jSONObject.optInt("selectionEnd", -2);
        } else {
            optInt = optInt2;
        }
        try {
            int i18 = jSONObject.getInt("inputId");
            if (!(this instanceof qc1.i)) {
                com.tencent.mm.sdk.platformtools.u3.h(new qc1.o(this, v5Var, i18, optInt2, optInt, i17));
                return;
            }
        } catch (org.json.JSONException unused) {
        }
        pl1.f fVar = new pl1.f();
        if (M(fVar, jSONObject, v5Var, i17)) {
            if (!jSONObject.has("inputId")) {
                int hashCode = (v5Var.hashCode() + "#" + java.lang.System.currentTimeMillis() + "#" + java.lang.System.nanoTime()).hashCode();
                fVar.Q = hashCode;
                J(hashCode, 0, v5Var);
            }
            ik1.h0.b(new qc1.p(this, v5Var, optInt2, optInt, c75.c.e(jSONObject, com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA), fVar, i17));
        }
    }

    public final void L(com.tencent.mm.plugin.appbrand.page.v5 v5Var, int i17) {
        com.tencent.mm.plugin.appbrand.wxassistant.q2 q2Var;
        if (v5Var == null || (q2Var = (com.tencent.mm.plugin.appbrand.wxassistant.q2) v5Var.t3().K1(com.tencent.mm.plugin.appbrand.wxassistant.q2.class)) == null || !q2Var.g4()) {
            return;
        }
        J(i17, i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 240), v5Var);
    }

    public boolean M(pl1.f fVar, org.json.JSONObject jSONObject, com.tencent.mm.plugin.appbrand.page.v5 v5Var, int i17) {
        org.json.JSONObject optJSONObject;
        if (!G(fVar, jSONObject, v5Var, i17)) {
            return false;
        }
        fVar.P = jSONObject.optInt("parentId");
        fVar.Q = jSONObject.optInt("inputId");
        fVar.f356588b = java.lang.Integer.valueOf(java.lang.Math.max(0, fVar.f356588b.intValue()));
        java.lang.Integer num = fVar.f356589c;
        fVar.f356589c = java.lang.Integer.valueOf(num == null ? 0 : java.lang.Math.max(0, num.intValue()));
        fVar.R = jSONObject.optString("type", com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT);
        if (!com.tencent.mm.plugin.appbrand.widget.input.r1.f91642e.contains(fVar.R)) {
            v5Var.a(i17, o("fail:unsupported input type"));
            return false;
        }
        if (fVar.B == null) {
            fVar.B = java.lang.Boolean.TRUE;
        }
        fVar.S = jSONObject.optBoolean("password");
        fVar.F = java.lang.Boolean.valueOf(jSONObject.optBoolean("password"));
        if (jSONObject.has("showCoverView")) {
            fVar.G = java.lang.Boolean.valueOf(jSONObject.optBoolean("showCoverView", false));
        }
        com.tencent.mm.plugin.appbrand.widget.input.h6.c(jSONObject, fVar);
        com.tencent.mm.plugin.appbrand.widget.input.l4.c(jSONObject, fVar);
        if ((!(this instanceof qc1.i)) && (optJSONObject = jSONObject.optJSONObject("dropdown")) != null) {
            pl1.a aVar = new pl1.a();
            optJSONObject.optInt("marginLeft");
            optJSONObject.optInt("marginRight");
            aVar.f356575a = optJSONObject.optString("width");
            org.json.JSONArray optJSONArray = optJSONObject.optJSONArray("options");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                aVar.f356576b = new java.util.ArrayList();
                for (int i18 = 0; i18 < optJSONArray.length(); i18++) {
                    org.json.JSONObject optJSONObject2 = optJSONArray.optJSONObject(i18);
                    if (optJSONObject2 != null) {
                        java.lang.String optString = optJSONObject2.optString(dm.i4.COL_ID);
                        java.lang.String optString2 = optJSONObject2.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                        java.lang.String optString3 = optJSONObject2.optString("content");
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString) && !com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
                            pl1.b bVar = new pl1.b();
                            bVar.f356577a = optString;
                            bVar.f356578b = optString2;
                            bVar.f356579c = optString3;
                            aVar.f356576b.add(bVar);
                        }
                    }
                }
                fVar.V = aVar;
            }
        }
        return true;
    }
}
