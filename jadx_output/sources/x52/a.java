package x52;

/* loaded from: classes15.dex */
public abstract class a {
    public static java.lang.String a() {
        int h17 = b52.b.h();
        if (h17 == 0) {
            return "-1";
        }
        java.lang.String c17 = c52.c.c("mmkv_async_biz_dao" + h17);
        if (c17 == null || c17.isEmpty()) {
            return null;
        }
        return c17;
    }

    public static void b(java.lang.String str) {
        int h17 = b52.b.h();
        if (h17 == 0) {
            return;
        }
        if (str == null) {
            str = "";
        }
        try {
            c52.c.e("mmkv_async_biz_dao" + h17, str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.AsyncBizDao", e17, "AsyncBizDao._write crash: %s", e17.getMessage());
        }
    }

    public static void c(r45.hb hbVar) {
        int h17 = b52.b.h();
        if (h17 == 0) {
            return;
        }
        try {
            byte[] byteArray = hbVar.toByteArray();
            if (byteArray == null) {
                try {
                    byteArray = new byte[0];
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.AsyncBizDao", e17, "AsyncBizDao._writeBizId crash: %s", e17.getMessage());
                    return;
                }
            }
            c52.c.d("mmkv_async_bizid_sid" + h17, byteArray);
        } catch (java.io.IOException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.AsyncBizDao", e18, "AsyncBizDao, putBizIdOfCloudConfig, crash: %s", e18.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List d() {
        /*
            int r0 = b52.b.h()
            r1 = 0
            if (r0 != 0) goto L9
        L7:
            r2 = r1
            goto L3c
        L9:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "mmkv_async_bizid_sid"
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            byte[] r0 = c52.c.a(r0)
            if (r0 == 0) goto L7
            int r2 = r0.length
            if (r2 > 0) goto L22
            goto L7
        L22:
            r45.hb r2 = new r45.hb
            r2.<init>()
            r2.parseFrom(r0)     // Catch: java.io.IOException -> L2b
            goto L3c
        L2b:
            r0 = move-exception
            java.lang.String r2 = r0.getMessage()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "HABBYGE-MALI.AsyncBizDao"
            java.lang.String r4 = "AsyncBizDao, _readBizId, crash: %s"
            com.tencent.mars.xlog.Log.printErrStackTrace(r3, r0, r4, r2)
            goto L7
        L3c:
            if (r2 != 0) goto L3f
            goto L41
        L3f:
            java.util.LinkedList r1 = r2.f375995d
        L41:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x52.a.d():java.util.List");
    }
}
