package k91;

/* loaded from: classes4.dex */
public final class a4 extends k91.j4 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f305537f = {l75.n0.getCreateSQLs(k91.v5.E1, "WxaAttrAvailableBackupTable")};

    /* renamed from: e, reason: collision with root package name */
    public final l75.k0 f305538e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(l75.k0 db6) {
        super(db6, "WxaAttrAvailableBackupTable", null);
        kotlin.jvm.internal.o.g(db6, "db");
        this.f305538e = db6;
    }

    public final boolean C1(java.lang.String str, int i17) {
        if (str == null || str.length() == 0) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WxaAttrAvailableBackupStorage", "removeForAppIdAndVersionLessThan(appId:" + str + ", version:" + i17 + ')');
        try {
            k91.v5 k17 = k1(str, "versionInfo");
            if (k17 != null && k17.w0().f77444d < i17) {
                delete(k17, false, new java.lang.String[0]);
                return true;
            }
        } catch (java.lang.Exception unused) {
            if (Integer.MAX_VALUE == i17) {
                k91.v5 v5Var = new k91.v5();
                v5Var.field_appId = str;
                return super.delete(v5Var, "appId");
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean z1(k91.v5 v5Var) {
        java.lang.String obj;
        com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo w07;
        if (v5Var == null) {
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("WxaAttrAvailableBackupStorage.insertOrUpdate(");
        sb6.append(v5Var.field_username);
        sb6.append('|');
        sb6.append(v5Var.field_appId);
        sb6.append('|');
        com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo w08 = v5Var.w0();
        sb6.append(w08 != null ? w08.f77444d : -1);
        sb6.append(')');
        java.lang.String sb7 = sb6.toString();
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(n1(v5Var.field_username, "appId") != null ? updateNotify(v5Var, false, dm.i4.COL_USERNAME) : insertNotify(v5Var, false));
        if (valueOf.booleanValue() && (w07 = v5Var.w0()) != null) {
            C1(v5Var.field_appId, w07.f77444d);
        }
        if (valueOf instanceof cf.h) {
            obj = ((cf.h) valueOf).I();
        } else {
            obj = valueOf.toString();
            if (obj == null) {
                obj = "";
            }
        }
        boolean a17 = com.tencent.mm.plugin.appbrand.utils.d5.a();
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
        if (elapsedRealtime2 <= 32 || !a17) {
            com.tencent.mars.xlog.Log.i("Luggage.Utils.Profile", "runProfiled:log:" + sb7 + " cost " + elapsedRealtime2 + " ms result:" + obj + " isMainThread: " + a17 + ' ');
        } else {
            com.tencent.mars.xlog.Log.w("Luggage.Utils.Profile", "block main thread and skip " + ((int) (elapsedRealtime2 / 16)) + " frames! runProfiled:log:" + sb7 + " cost " + elapsedRealtime2 + " ms result:" + obj + " isMainThread: " + a17 + ' ');
        }
        return valueOf.booleanValue();
    }
}
