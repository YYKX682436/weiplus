package uc1;

/* loaded from: classes13.dex */
public abstract class b extends com.tencent.mm.plugin.appbrand.jsapi.f {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        char c17;
        java.lang.String k17 = k();
        java.util.Map map = vc1.d3.f434954a;
        if (com.tencent.mm.sdk.platformtools.t8.K0(k17)) {
            return;
        }
        k17.getClass();
        int i18 = 0;
        switch (k17.hashCode()) {
            case -1949215789:
                if (k17.equals(uc1.e2.NAME)) {
                    c17 = 0;
                    break;
                }
                c17 = 65535;
                break;
            case -384482333:
                if (k17.equals(uc1.i1.NAME)) {
                    c17 = 1;
                    break;
                }
                c17 = 65535;
                break;
            case 1282356792:
                if (k17.equals(uc1.p1.NAME)) {
                    c17 = 2;
                    break;
                }
                c17 = 65535;
                break;
            default:
                c17 = 65535;
                break;
        }
        switch (c17) {
            case 0:
                i18 = 3;
                break;
            case 1:
                break;
            case 2:
                i18 = 6;
                break;
            default:
                java.util.HashMap hashMap = (java.util.HashMap) vc1.d3.f434954a;
                if (!hashMap.containsKey(k17)) {
                    i18 = -1;
                    break;
                } else {
                    i18 = 0 + (((java.lang.Integer) hashMap.get(k17)).intValue() * 5) + 20;
                    break;
                }
        }
        if (i18 == -1) {
            com.tencent.mars.xlog.Log.e("Luggage.MapReporter", "key is -1, may be err");
        } else {
            vc1.d3.a(i18);
        }
    }

    public void C(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, java.lang.String str, boolean z17, boolean z18) {
        char c17;
        int i18;
        lVar.a(i17, str);
        java.lang.String k17 = k();
        java.util.Map map = vc1.d3.f434954a;
        if (com.tencent.mm.sdk.platformtools.t8.K0(k17)) {
            return;
        }
        k17.getClass();
        int hashCode = k17.hashCode();
        if (hashCode == -1949215789) {
            if (k17.equals(uc1.e2.NAME)) {
                c17 = 0;
            }
            c17 = 65535;
        } else if (hashCode != -384482333) {
            if (hashCode == 1282356792 && k17.equals(uc1.p1.NAME)) {
                c17 = 2;
            }
            c17 = 65535;
        } else {
            if (k17.equals(uc1.i1.NAME)) {
                c17 = 1;
            }
            c17 = 65535;
        }
        if (c17 == 0) {
            i18 = z17 ? 4 : 5;
        } else if (c17 == 1) {
            i18 = z17 ? 1 : 2;
        } else if (c17 != 2) {
            java.util.HashMap hashMap = (java.util.HashMap) vc1.d3.f434954a;
            if (hashMap.containsKey(k17)) {
                int intValue = (((java.lang.Integer) hashMap.get(k17)).intValue() * 5) + 20;
                if (z18) {
                    r0 = z17 ? 3 : 4;
                } else if (!z17) {
                    r0 = 2;
                }
                i18 = intValue + r0;
            } else {
                i18 = -1;
            }
        } else {
            i18 = z17 ? 7 : 8;
        }
        if (i18 == -1) {
            com.tencent.mars.xlog.Log.e("Luggage.MapReporter", "key is -1, may be err");
        } else {
            vc1.d3.a(i18);
        }
    }

    public vc1.q2 D(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        org.json.JSONObject jSONObject3;
        org.json.JSONObject jSONObject4;
        int parseColor;
        int parseColor2;
        org.json.JSONObject jSONObject5;
        int parseColor3;
        int parseColor4;
        int parseColor5;
        org.json.JSONObject jSONObject6;
        vc1.q2 q2Var = new vc1.q2();
        if (jSONObject2.has("joinCluster")) {
            q2Var.f435130a = jSONObject2.optBoolean("joinCluster", false);
        }
        if (jSONObject2.has("clusterId")) {
            q2Var.f435131b = jSONObject2.optInt("clusterId", -1);
        }
        if (jSONObject2.has("latitude") && jSONObject2.has("longitude")) {
            double F = com.tencent.mm.sdk.platformtools.t8.F(jSONObject2.optString("latitude"), 0.0d);
            double F2 = com.tencent.mm.sdk.platformtools.t8.F(jSONObject2.optString("longitude"), 0.0d);
            q2Var.f435132c = F;
            q2Var.f435133d = F2;
        }
        java.lang.String optString = jSONObject2.optString("iconPath");
        float h17 = ik1.w.h(jSONObject2, "width", 0.0f);
        float h18 = ik1.w.h(jSONObject2, "height", 0.0f);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString) && lVar.q(o91.e.class) != null) {
            q2Var.f435134e = ((o91.e) lVar.q(o91.e.class)).T0(lVar, optString);
            q2Var.f435138i = h17;
            q2Var.f435139j = h18;
        }
        q2Var.f435135f = (float) jSONObject2.optDouble(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION, 0.0d);
        q2Var.f435136g = (float) jSONObject2.optDouble("alpha", 1.0d);
        q2Var.f435137h = jSONObject2.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        q2Var.f435145p = jSONObject2.optString("ariaLabel");
        q2Var.f435146q = jSONObject2.optString("collision", "");
        q2Var.f435147r = jSONObject2.optString("collisionRelation", "alone");
        if (jSONObject2.has("anchor")) {
            try {
                jSONObject3 = new org.json.JSONObject(jSONObject2.optString("anchor"));
            } catch (org.json.JSONException unused) {
                jSONObject3 = null;
            }
            if (jSONObject3 != null) {
                float optDouble = (float) jSONObject3.optDouble("x", 0.5d);
                float optDouble2 = (float) jSONObject3.optDouble("y", 1.0d);
                q2Var.f435140k = optDouble;
                q2Var.f435141l = optDouble2;
            } else {
                q2Var.f435140k = 0.5f;
                q2Var.f435141l = 1.0f;
            }
        }
        q2Var.f435142m = jSONObject2.optInt("zIndex", 0);
        java.lang.String optString2 = jSONObject2.optString("label");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
            try {
                jSONObject4 = new org.json.JSONObject(optString2);
            } catch (org.json.JSONException unused2) {
                jSONObject4 = null;
            }
            if (jSONObject4 != null) {
                java.lang.String optString3 = jSONObject4.optString("content");
                try {
                    parseColor = ik1.w.l(jSONObject4.optString("color", "#000000"));
                } catch (java.lang.Exception unused3) {
                    parseColor = android.graphics.Color.parseColor("#000000");
                }
                int optInt = jSONObject4.optInt("fontSize", 12);
                int j17 = ik1.w.j(jSONObject4, "anchorX", ik1.w.j(jSONObject4, "x", 0));
                int j18 = ik1.w.j(jSONObject4, "anchorY", ik1.w.j(jSONObject4, "y", 0));
                int j19 = ik1.w.j(jSONObject4, "borderRadius", 0);
                int j27 = ik1.w.j(jSONObject4, "borderWidth", 0);
                int a17 = ik1.w.a(jSONObject4.optString("borderColor"));
                try {
                    parseColor2 = ik1.w.l(jSONObject4.optString("bgColor", ""));
                } catch (java.lang.Exception unused4) {
                    parseColor2 = android.graphics.Color.parseColor("#000000");
                }
                int j28 = ik1.w.j(jSONObject4, "padding", 0);
                java.lang.String optString4 = jSONObject4.optString("textAlign", "");
                int j29 = ik1.w.j(jSONObject4, "width", -1);
                int j37 = ik1.w.j(jSONObject4, "height", -1);
                java.lang.String optString5 = jSONObject4.optString("collision", "");
                vc1.p2 p2Var = new vc1.p2(optString3, parseColor, optInt, j17, j18, parseColor2, j19, j27, a17, optString4, j28);
                q2Var.f435149t = p2Var;
                p2Var.f435124m = j29;
                p2Var.f435123l = j37;
                p2Var.f435125n = optString5;
            }
        }
        java.lang.String optString6 = jSONObject2.optString("callout");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString6)) {
            try {
                jSONObject5 = new org.json.JSONObject(optString6);
            } catch (org.json.JSONException unused5) {
                jSONObject5 = null;
            }
            if (jSONObject5 != null) {
                java.lang.String optString7 = jSONObject5.optString("content");
                try {
                    parseColor3 = ik1.w.l(jSONObject5.optString("color", "#000000"));
                } catch (java.lang.Exception unused6) {
                    parseColor3 = android.graphics.Color.parseColor("#000000");
                }
                int optInt2 = jSONObject5.optInt("fontSize", 12);
                int j38 = ik1.w.j(jSONObject5, "borderRadius", 0);
                int j39 = ik1.w.j(jSONObject5, "borderWidth", 0);
                int a18 = ik1.w.a(jSONObject5.optString("borderColor"));
                try {
                    parseColor4 = ik1.w.l(jSONObject5.optString("bgColor", "#000000"));
                } catch (java.lang.Exception unused7) {
                    parseColor4 = android.graphics.Color.parseColor("#000000");
                }
                int j47 = ik1.w.j(jSONObject5, "padding", 0);
                try {
                    parseColor5 = ik1.w.l(jSONObject5.optString("shadowColor", "#000000"));
                } catch (java.lang.Exception unused8) {
                    parseColor5 = android.graphics.Color.parseColor("#000000");
                }
                q2Var.f435148s = new vc1.o2(optString7, parseColor3, optInt2, j38, parseColor4, j39, a18, j47, parseColor5, (!jSONObject5.has("shadowColor") || com.tencent.mm.sdk.platformtools.t8.K0(jSONObject5.optString("shadowColor", ""))) ? 0 : jSONObject5.optInt("shadowOpacity"), ik1.w.j(jSONObject5, "shadowOffsetX", 0), ik1.w.j(jSONObject5, "shadowOffsetY", 0), ik1.w.j(jSONObject5, "shadowBlurRadius", 0), jSONObject5.optInt("display", 0), jSONObject5.optString("textAlign", ""), ik1.w.j(jSONObject5, "anchorX", 0), ik1.w.j(jSONObject5, "anchorY", 0));
            }
        }
        java.lang.String optString8 = jSONObject2.optString("customCallout");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString8)) {
            try {
                jSONObject6 = new org.json.JSONObject(optString8);
            } catch (org.json.JSONException unused9) {
                jSONObject6 = null;
            }
            if (jSONObject6 != null) {
                int optInt3 = jSONObject6.optInt("viewId", 0);
                int optInt4 = jSONObject6.optInt("display", 0);
                boolean optBoolean = jSONObject.optBoolean("independent", false);
                int j48 = ik1.w.j(jSONObject6, "anchorX", 0);
                int j49 = ik1.w.j(jSONObject6, "anchorY", 0);
                com.tencent.mm.plugin.appbrand.jsapi.t Q = ((gb1.k) lVar.q(gb1.k.class)).Q(lVar, jSONObject);
                if (Q == null || Q.M(optBoolean) == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.BaseMapJsApi", "componentView or CustomViewContainer is null");
                } else {
                    android.view.View o17 = ((com.tencent.mm.plugin.appbrand.page.ia) Q.M(optBoolean)).o(optInt3);
                    java.lang.Object[] objArr = new java.lang.Object[2];
                    objArr[0] = java.lang.Integer.valueOf(optInt3);
                    objArr[1] = java.lang.Boolean.valueOf(o17 != null);
                    com.tencent.mars.xlog.Log.i("MicroMsg.BaseMapJsApi", "viewId:%d view is %b", objArr);
                    if (o17 != null) {
                        vc1.o2 o2Var = new vc1.o2();
                        q2Var.f435148s = o2Var;
                        o2Var.f435051r = o17;
                        o2Var.f435047n = optInt4;
                        o2Var.f435049p = j48;
                        o2Var.f435050q = j49;
                    }
                }
            }
        }
        java.lang.String optString9 = jSONObject2.optString("buildingId");
        java.lang.String optString10 = jSONObject2.optString("floorName");
        q2Var.f435143n = optString9;
        q2Var.f435144o = optString10;
        return q2Var;
    }

    public vc1.a3 E(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject) {
        if (lVar instanceof com.tencent.mm.plugin.appbrand.jsapi.t) {
            return vc1.h3.b(lVar.getAppId(), vc1.e3.b(lVar, jSONObject));
        }
        if (lVar.q(gb1.k.class) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BaseMapJsApi", "name:%s IComponentConverter is null, return", k());
            return null;
        }
        com.tencent.mm.plugin.appbrand.jsapi.t Q = ((gb1.k) lVar.q(gb1.k.class)).Q(lVar, jSONObject);
        if (Q != null) {
            return vc1.h3.b(Q.getAppId(), vc1.e3.b(Q, jSONObject));
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.BaseMapJsApi", "name:%s is not componentView", k());
        return null;
    }
}
