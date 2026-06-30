package lx3;

/* loaded from: classes8.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f322081a = bm5.f1.a().replace(":", "").replace(com.tencent.mm.sdk.platformtools.x2.f193072b, "") + "heavy_user_id_mapping.dat";

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Object f322082b = new java.lang.Object();

    public f(lx3.e eVar) {
    }

    public final r45.gw3 a() {
        java.lang.String str;
        byte[] N;
        synchronized (f322082b) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(com.tencent.mm.storage.v3.f196273a);
            str = f322081a;
            sb6.append(str);
            N = com.tencent.mm.vfs.w6.N(sb6.toString(), 0, -1);
        }
        if (N == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.HeavyUserIDMappingStg", "get file content fail, filename" + str);
            return null;
        }
        r45.gw3 gw3Var = new r45.gw3();
        try {
            gw3Var.parseFrom(N);
            com.tencent.mars.xlog.Log.i("MicroMsg.HeavyUserIDMappingStg", "svr_version:" + gw3Var.f375558d + ", ret:" + gw3Var.f375560f + ", size: " + gw3Var.f375559e.size());
            return gw3Var;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.HeavyUserIDMappingStg", th6, "", new java.lang.Object[0]);
            return null;
        }
    }

    public final int b(int i17) {
        r45.gw3 a17 = a();
        if (a17 == null) {
            return 0;
        }
        int i18 = a17.f375558d;
        com.tencent.mars.xlog.Log.i("MicroMsg.HeavyUserIDMappingStg", "version:" + i18);
        return i18;
    }

    public void c(r45.gw3 gw3Var, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.HeavyUserIDMappingStg", "saveIDMapping, channel:" + i17);
        if (gw3Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.HeavyUserIDMappingStg", "HeavyUserRespInfo is null");
            return;
        }
        if (gw3Var.f375560f != 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("heavyUserRespInfo.RespType Unnormal, type:");
            int i18 = gw3Var.f375560f;
            sb6.append(1 == i18 ? "服务器过载" : 2 == i18 ? "服务器没有配置表" : 3 == i18 ? "服务器配置表错误" : "非法的错误类型");
            sb6.append(",version:");
            sb6.append(gw3Var.f375558d);
            com.tencent.mars.xlog.Log.e("MicroMsg.HeavyUserIDMappingStg", sb6.toString());
            return;
        }
        int b17 = b(i17);
        int i19 = gw3Var.f375558d;
        if (b17 == i19) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.HeavyUserIDMappingStg", "version changed, client:" + b(i17) + ", svr:" + i19);
        com.tencent.mars.xlog.Log.i("MicroMsg.HeavyUserIDMappingStg", "svr_version:" + gw3Var.f375558d + ", ret:" + gw3Var.f375560f + ", size: " + gw3Var.f375559e.size());
        try {
            byte[] byteArray = gw3Var.toByteArray();
            synchronized (f322082b) {
                com.tencent.mars.xlog.Log.i("MicroMsg.HeavyUserIDMappingStg", "new version:" + gw3Var.f375558d);
                com.tencent.mm.vfs.w6.a(com.tencent.mm.storage.v3.f196273a + f322081a, byteArray);
            }
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.HeavyUserIDMappingStg", e17, "", new java.lang.Object[0]);
        }
    }
}
