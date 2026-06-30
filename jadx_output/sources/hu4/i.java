package hu4;

/* loaded from: classes9.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static long f285230a = -1;

    public static hu4.l a() {
        java.lang.Object l17;
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        if (c17 != null && (l17 = c17.l(339969, null)) != null) {
            hu4.l lVar = new hu4.l();
            lVar.a(hu4.j.h((java.lang.String) l17));
            return lVar;
        }
        return new hu4.l();
    }

    public static r45.p55 b() {
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        if (c17 == null) {
            return null;
        }
        java.lang.String str = (java.lang.String) c17.l(339989, null);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        try {
            return (r45.p55) new r45.p55().parseFrom(android.util.Base64.decode(str, 2));
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GestureGuardInfoManager", e17, "", new java.lang.Object[0]);
            return null;
        } catch (java.lang.IllegalArgumentException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GestureGuardInfoManager", e18, "", new java.lang.Object[0]);
            return null;
        }
    }

    public static r45.q55 c() {
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        if (c17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GestureGuardInfoManager", "configstg is null");
            return null;
        }
        java.lang.String str = (java.lang.String) c17.l(339990, null);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        try {
            return (r45.q55) new r45.q55().parseFrom(android.util.Base64.decode(str, 2));
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GestureGuardInfoManager", e17, "", new java.lang.Object[0]);
            return null;
        } catch (java.lang.IllegalArgumentException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GestureGuardInfoManager", e18, "", new java.lang.Object[0]);
            return null;
        }
    }

    public static int d() {
        java.lang.Object l17;
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        if (c17 == null || (l17 = c17.l(339972, null)) == null) {
            return -1;
        }
        return ((java.lang.Integer) l17).intValue();
    }

    public static void e() {
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        if (c17 != null) {
            c17.w(339969, null);
            c17.i(true);
        }
    }

    public static void f() {
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        if (c17 != null) {
            c17.w(339971, null);
            c17.i(true);
        }
    }

    public static void g() {
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        if (c17 != null) {
            c17.w(339972, null);
            c17.i(true);
        }
    }

    public static void h(long j17, long j18) {
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        if (c17 != null) {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeLong(j17);
                dataOutputStream.writeLong(j18);
                dataOutputStream.close();
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TimeInfo", e17, "", new java.lang.Object[0]);
            }
            c17.w(339969, hu4.j.a(byteArrayOutputStream.toByteArray()));
            c17.i(true);
        }
    }

    public static void i(long j17, long j18) {
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        if (c17 != null) {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeLong(j17);
                dataOutputStream.writeLong(j18);
                dataOutputStream.close();
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TimeInfo", e17, "", new java.lang.Object[0]);
            }
            c17.w(339971, hu4.j.a(byteArrayOutputStream.toByteArray()));
            c17.i(true);
        }
    }

    public static void j(r45.p55 p55Var) {
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        if (c17 != null) {
            try {
                c17.w(339989, android.util.Base64.encodeToString(p55Var.toByteArray(), 2));
                c17.i(true);
                hu4.j.g();
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GestureGuardInfoManager", e17, "", new java.lang.Object[0]);
            }
        }
    }
}
