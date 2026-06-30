package com.tencent.mm.ui;

/* loaded from: classes13.dex */
public abstract class eg {

    /* renamed from: a, reason: collision with root package name */
    public static qb.a f208400a;

    public static int a(int i17) {
        if (f208400a != null && e() && b()) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("@int:taskId", i17);
                rb.a a17 = f208400a.a("compactWindow", "getTaskPosition", jSONObject, null);
                com.tencent.mars.xlog.Log.i("MicroMsg.OPPOUtil", " getTaskPos ret " + a17.f393558a);
                int i18 = a17.f393559b.getInt("int");
                com.tencent.mars.xlog.Log.e("MicroMsg.OPPOUtil", "getTaskPosition" + i18);
                return i18;
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.OPPOUtil", e17.getMessage());
            }
        }
        return -1;
    }

    public static boolean b() {
        qb.b bVar;
        qb.a aVar = f208400a;
        return (aVar == null || (bVar = aVar.f361139b) == null || !bVar.f361142c) ? false : true;
    }

    public static void c(android.content.Context context) {
        if (((e() && com.tencent.mm.ui.bk.Y()) || com.tencent.mm.ui.bk.Z()) && f208400a == null) {
            f208400a = new qb.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
        }
    }

    public static boolean d(int i17) {
        if (f208400a != null && e() && b()) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("@int:taskId", i17);
                rb.a a17 = f208400a.a("compactWindow", "isInCompactWindowMode", jSONObject, null);
                boolean z17 = a17.f393559b.getBoolean(com.tencent.tmassistantsdk.downloadservice.DownloadSetting.TYPE_BOOLEAN);
                com.tencent.mars.xlog.Log.i("MicroMsg.OPPOUtil", " isMagicWindow ret " + a17.f393558a + "isMagicWindow " + z17);
                return z17;
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.OPPOUtil", e17.getMessage());
            }
        }
        return false;
    }

    public static boolean e() {
        return fp.e0.e() || fp.e0.d() || fp.e0.f();
    }

    public static void f(int i17, int i18) {
        if (f208400a != null && e() && b()) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("@int:taskId", i17);
                jSONObject.put("@int:targetPosition", i18);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.OPPOUtil", e17.getMessage());
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.OPPOUtil", " setTaskPos ret " + f208400a.a("compactWindow", "setTaskPosition", jSONObject, null).f393558a);
        }
    }
}
