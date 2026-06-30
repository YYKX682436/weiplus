package e04;

/* loaded from: classes13.dex */
public abstract class v3 {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.Boolean f246138a;

    public static java.lang.String a(java.lang.String str) {
        try {
            return com.tencent.mm.sdk.platformtools.t8.K0(str) ? str : str.replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll("\"", "&quot;");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScannerUtil", e17, "escapeHtml exception", new java.lang.Object[0]);
            return str;
        }
    }

    public static boolean b(int i17) {
        return i17 == 1 || i17 == 8 || i17 == 4;
    }

    public static boolean c() {
        java.lang.String[] split;
        int b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableNewOCRTranslation", 0);
        java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("PicTranslationSupportUserLanguage");
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Boolean.valueOf(b17 == 1);
        objArr[1] = d17;
        objArr[2] = com.tencent.mm.sdk.platformtools.m2.d();
        com.tencent.mars.xlog.Log.i("MicroMsg.ScannerUtil", "enable %s, support lang %s, current lang %s", objArr);
        return b17 == 1 && !com.tencent.mm.sdk.platformtools.t8.K0(d17) && (split = d17.split(";")) != null && java.util.Arrays.asList(split).contains(com.tencent.mm.sdk.platformtools.m2.d());
    }

    public static boolean d(java.util.ArrayList arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ScannerUtil", "list == null || list.size() == 0");
            return false;
        }
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            e04.u3 u3Var = (e04.u3) arrayList.get(i17);
            if (u3Var != null) {
                if (((du1.l) i95.n0.c(du1.l.class)) != null ? lu1.a0.B(u3Var.f246132b) : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void e(android.os.Bundle bundle, com.tencent.qbar.WxQBarPoint wxQBarPoint, float[] fArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScannerUtil", "normalizeRect");
        if (wxQBarPoint == null || fArr == null || fArr.length != 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScannerUtil", "normalizeRect fail");
            bundle.putParcelable("result_normalize_rect", new com.tencent.mm.plugin.scanner.CodePointRect(0.0f, 0.0f, 1.0f, 1.0f));
            return;
        }
        float f17 = fArr[0];
        float f18 = fArr[2];
        float f19 = fArr[1];
        int i17 = (int) (f18 - f17);
        int i18 = (int) (fArr[3] - f19);
        if (i17 <= 0 || i18 <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScannerUtil", "normalizeRect fail with args error");
            bundle.putParcelable("result_normalize_rect", new com.tencent.mm.plugin.scanner.CodePointRect(0.0f, 0.0f, 1.0f, 1.0f));
            return;
        }
        float min = java.lang.Math.min(wxQBarPoint.f215232x2, wxQBarPoint.f215233x3);
        float min2 = java.lang.Math.min(wxQBarPoint.f215234y0, wxQBarPoint.f215237y3);
        float max = java.lang.Math.max(wxQBarPoint.f215230x0, wxQBarPoint.f215231x1);
        float max2 = java.lang.Math.max(wxQBarPoint.f215235y1, wxQBarPoint.f215236y2);
        float f27 = i17;
        float f28 = i18;
        bundle.putInt("result_image_width", i17);
        bundle.putInt("result_image_height", i18);
        bundle.putParcelable("result_normalize_rect", new com.tencent.mm.plugin.scanner.CodePointRect((min - f17) / f27, (min2 - f19) / f28, (max - f17) / f27, (max2 - f19) / f28));
    }

    public static e04.u3 f(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            e04.u3 u3Var = new e04.u3();
            u3Var.f246131a = jSONObject.optString("card_tp_id");
            u3Var.f246132b = jSONObject.optInt("card_type");
            u3Var.f246133c = jSONObject.optString("card_ext");
            return u3Var;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScannerUtil", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    public static java.util.ArrayList g(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            org.json.JSONArray optJSONArray = new org.json.JSONObject(str).optJSONArray("card_list");
            if (optJSONArray != null && optJSONArray.length() != 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                    org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
                    e04.u3 u3Var = new e04.u3();
                    u3Var.f246131a = optJSONObject.optString("card_tp_id");
                    u3Var.f246132b = optJSONObject.optInt("card_type");
                    u3Var.f246133c = optJSONObject.optString("card_ext");
                    arrayList.add(u3Var);
                }
                return arrayList;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.ScannerUtil", "parseCardListItemArray cardItemListJson is null");
            return null;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScannerUtil", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    public static void h() {
        boolean z17 = false;
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_scan_code_multi_code_enable, 0);
        if (Ni == 0) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        } else {
            z17 = true;
        }
        f246138a = java.lang.Boolean.valueOf(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.ScannerUtil", "updateEnableMultiCode clicfg_scan_code_multi_code_enable config: %d, enable: %b", java.lang.Integer.valueOf(Ni), f246138a);
    }
}
