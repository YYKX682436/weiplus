package vz2;

/* loaded from: classes14.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static com.tencent.mm.autogen.mmdata.rpt.FaceFlashLogOpenStruct f441658a = null;

    /* renamed from: b, reason: collision with root package name */
    public static long f441659b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static com.tencent.mm.autogen.mmdata.rpt.FaceFlashLogPayStruct f441660c = null;

    /* renamed from: d, reason: collision with root package name */
    public static com.tencent.mm.autogen.mmdata.rpt.FaceDetectInterfaceCalledResultStruct f441661d = null;

    /* renamed from: e, reason: collision with root package name */
    public static org.json.JSONArray f441662e = null;

    /* renamed from: f, reason: collision with root package name */
    public static org.json.JSONArray f441663f = null;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f441664g = "";

    public static void a(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerReport", "doReport14560 success:%s", java.lang.Boolean.valueOf(z17));
        d().f56166h = z17 ? 1L : 0L;
        d().f56167i = java.lang.System.currentTimeMillis() - d().f56162d;
        d().f56172n = java.lang.System.currentTimeMillis();
        d().k();
        f441661d = null;
    }

    public static com.tencent.mm.autogen.mmdata.rpt.FaceFlashLogOpenStruct b() {
        if (f441658a == null) {
            com.tencent.mm.autogen.mmdata.rpt.FaceFlashLogOpenStruct faceFlashLogOpenStruct = new com.tencent.mm.autogen.mmdata.rpt.FaceFlashLogOpenStruct();
            f441658a = faceFlashLogOpenStruct;
            faceFlashLogOpenStruct.f56191p = f441659b;
            f441658a.C = com.tencent.mm.ui.bk.A() ? 2 : 1;
        }
        return f441658a;
    }

    public static com.tencent.mm.autogen.mmdata.rpt.FaceFlashLogPayStruct c() {
        if (f441660c == null) {
            f441660c = new com.tencent.mm.autogen.mmdata.rpt.FaceFlashLogPayStruct();
        }
        return f441660c;
    }

    public static com.tencent.mm.autogen.mmdata.rpt.FaceDetectInterfaceCalledResultStruct d() {
        if (f441661d == null) {
            f441661d = new com.tencent.mm.autogen.mmdata.rpt.FaceDetectInterfaceCalledResultStruct();
        }
        return f441661d;
    }

    public static void e(int i17, java.lang.String str) {
        com.tencent.mm.autogen.mmdata.rpt.FaceFlashCommonReportStruct faceFlashCommonReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FaceFlashCommonReportStruct();
        faceFlashCommonReportStruct.f56175d = 2;
        faceFlashCommonReportStruct.f56176e = 0;
        faceFlashCommonReportStruct.f56177f = i17;
        faceFlashCommonReportStruct.f56178g = faceFlashCommonReportStruct.b("ErrorMsg", str, true);
        faceFlashCommonReportStruct.k();
    }

    public static void f(int i17) {
        com.tencent.mm.autogen.mmdata.rpt.FaceFlashLogOpenStruct b17 = b();
        b17.f56179d = i17;
        org.json.JSONArray jSONArray = f441663f;
        if (jSONArray != null) {
            b17.f56189n = b17.b("AndroidStateRecord", jSONArray.toString().replace(',', ';'), true);
        }
        org.json.JSONArray jSONArray2 = f441662e;
        if (jSONArray2 != null) {
            b17.A = b17.b("SdkStatusStr", jSONArray2.toString().replace(',', ';'), true);
        }
        b17.f56188m = b17.b("StateRecord", f441664g, true);
        if (!android.text.TextUtils.isEmpty(f441664g)) {
            try {
                if (f441664g.split("-").length > 0) {
                    b17.f56181f = java.lang.Integer.parseInt(r5[r5.length - 1]);
                }
            } catch (java.lang.Exception unused) {
            }
        }
        f441659b = f441658a.f56191p;
        b17.k();
        f441658a = null;
        f441664g = "";
        f441663f = null;
        f441662e = null;
    }

    public static void g(java.lang.String str) {
        b().f56199x = java.lang.System.currentTimeMillis();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            f(jSONObject.optInt("err_code", jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE, 0)));
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FaceFlashManagerError", e17, "parse face fail result error.%s", str);
        }
    }

    public static void h(int i17) {
        com.tencent.mm.autogen.mmdata.rpt.FaceFlashLogPayStruct c17 = c();
        c17.f56202d = i17;
        org.json.JSONArray jSONArray = f441663f;
        if (jSONArray != null) {
            c17.f56213o = c17.b("AndroidStateRecord", jSONArray.toString().replace(',', ';'), true);
        }
        c17.f56212n = c17.b("StateRecord", f441664g, true);
        if (!android.text.TextUtils.isEmpty(f441664g)) {
            try {
                if (f441664g.split("-").length > 0) {
                    c17.f56204f = java.lang.Integer.parseInt(r4[r4.length - 1]);
                }
            } catch (java.lang.Exception unused) {
            }
        }
        c17.k();
        f441660c = null;
        f441664g = "";
        f441663f = null;
    }

    public static void i(int i17, int i18, java.lang.String str) {
        com.tencent.mm.autogen.mmdata.rpt.FaceFlashCommonReportStruct faceFlashCommonReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FaceFlashCommonReportStruct();
        faceFlashCommonReportStruct.f56175d = 1;
        faceFlashCommonReportStruct.f56176e = i17;
        faceFlashCommonReportStruct.f56177f = i18;
        faceFlashCommonReportStruct.f56178g = faceFlashCommonReportStruct.b("ErrorMsg", str, true);
        faceFlashCommonReportStruct.k();
    }

    public static void j(java.lang.String str) {
        k(str, 0);
    }

    public static synchronized void k(java.lang.String str, java.lang.Object obj) {
        synchronized (vz2.c.class) {
            if (f441663f == null) {
                f441663f = new org.json.JSONArray();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerReport", "updateFaceFlashState key:%s value:%s", str, obj);
            if (f441663f.toString().length() <= 1000) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put(str, obj);
                } catch (org.json.JSONException unused) {
                }
                f441663f.put(jSONObject);
            }
        }
    }

    public static void l(java.lang.String str) {
        org.json.JSONArray jSONArray = f441663f;
        if (jSONArray == null || !jSONArray.toString().contains(str)) {
            j(str);
        }
    }

    public static void m(int i17) {
        if (android.text.TextUtils.isEmpty(f441664g)) {
            f441664g += java.lang.String.valueOf(i17);
            return;
        }
        f441664g += "-" + i17;
    }
}
