package k91;

/* loaded from: classes7.dex */
public abstract class h5 {
    public static boolean a(k91.v5 v5Var) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(v5Var.field_appId)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaAttrSyncUtils", "invalid appID in contact(%s)", v5Var.field_username);
            return true;
        }
        if (v5Var.w0() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaAttrSyncUtils", "NULL versionInfo(%s) in contact(%s)", v5Var.field_versionInfo, v5Var.field_username);
            return true;
        }
        if (v5Var.u0() == null || android.text.TextUtils.isEmpty(v5Var.u0().f305628c)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaAttrSyncUtils", "invalid appInfo(%s) in contact(%s)", v5Var.field_appInfo, v5Var.field_username);
            return true;
        }
        if (v5Var.w0().f77446f != 0 || v5Var.w0().f77444d > 0) {
            return false;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WxaAttrSyncUtils", "invalid versionInfo(%s) in contact(%s)", v5Var.field_versionInfo, v5Var.field_username);
        return true;
    }

    public static boolean b(k91.v5 v5Var) {
        try {
            long a17 = t81.l.f416365a.a(v5Var.field_username);
            if (a17 <= 0 || a17 < v5Var.field_syncTimeSecond) {
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaAttrSyncUtils", "isContactMarkedAsInvalid (%s) returns true, treated as invalid until %d, attrs lastSyncTimestamp %d", v5Var.field_username, java.lang.Long.valueOf(a17), java.lang.Long.valueOf(v5Var.field_syncTimeSecond));
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WxaAttrSyncUtils", e17, "caught crash", new java.lang.Object[0]);
            return false;
        }
    }
}
