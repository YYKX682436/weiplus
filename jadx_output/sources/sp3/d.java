package sp3;

/* loaded from: classes7.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.o4 f411307a = com.tencent.mm.sdk.platformtools.o4.M("diagnostic_storage");

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f411308b = "KEY_USER_MEM_CAP_INT_" + android.os.Build.FINGERPRINT;

    /* renamed from: c, reason: collision with root package name */
    public static int f411309c;

    public static java.lang.String a(java.lang.Object[] objArr) {
        if (objArr == null) {
            return "null";
        }
        int length = objArr.length - 1;
        if (length == -1) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = 0;
        while (true) {
            sb6.append(java.lang.String.valueOf(objArr[i17]));
            if (i17 == length) {
                return sb6.toString();
            }
            sb6.append(";");
            i17++;
        }
    }

    public static void b(com.tencent.mm.vfs.r6 r6Var) {
        com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(com.tencent.mm.sdk.platformtools.x2.f193071a.getExternalCacheDir() + "/Diagnostic");
        com.tencent.mm.vfs.r6 r6Var3 = new com.tencent.mm.vfs.r6(r6Var2, r6Var.getName());
        com.tencent.mars.xlog.Log.i("MicroMsg.performance.Utils", "DevEnv: copy [%s] to sdcard [%s]", r6Var.o(), r6Var3.o());
        if (!r6Var2.m()) {
            r6Var2.J();
        }
        com.tencent.mm.vfs.w6.w(r6Var.o(), r6Var3.o());
    }

    public static boolean c() {
        int o17 = f411307a.o(f411308b, 0);
        f411309c = o17;
        if (o17 == 0 && com.tencent.mm.sdk.platformtools.x2.n()) {
            ((ku5.t0) ku5.t0.f312615d).q(new sp3.c());
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.performance.Utils", "[MEM] detect3GUserSpace = %d", java.lang.Integer.valueOf(f411309c));
        return f411309c == 3;
    }

    public static void d(java.lang.String str, com.tencent.mm.vfs.r6 r6Var) {
        java.io.BufferedReader bufferedReader;
        java.io.IOException e17;
        com.tencent.mars.xlog.Log.i(str, ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> dump file = %s, modified = %s", r6Var.getName(), f(r6Var.B()));
        if (r6Var.m()) {
            java.io.BufferedReader bufferedReader2 = null;
            try {
                bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(com.tencent.mm.vfs.w6.C(r6Var)));
                while (true) {
                    try {
                        try {
                            java.lang.String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            } else {
                                com.tencent.mars.xlog.Log.i(str, readLine);
                            }
                        } catch (java.io.IOException e18) {
                            e17 = e18;
                            com.tencent.mars.xlog.Log.printErrStackTrace(str, e17, "", new java.lang.Object[0]);
                            com.tencent.mm.sdk.platformtools.t8.v1(bufferedReader);
                            r6Var.l();
                            com.tencent.mars.xlog.Log.i(str, "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< dump file = %s, modified = %s", r6Var.getName(), f(r6Var.B()));
                        }
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        bufferedReader2 = bufferedReader;
                        com.tencent.mm.sdk.platformtools.t8.v1(bufferedReader2);
                        r6Var.l();
                        throw th;
                    }
                }
                if (com.tencent.mm.sdk.platformtools.s9.f192974b || z65.c.a()) {
                    b(r6Var);
                } else {
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } catch (java.io.IOException e19) {
                bufferedReader = null;
                e17 = e19;
            } catch (java.lang.Throwable th7) {
                th = th7;
            }
            com.tencent.mm.sdk.platformtools.t8.v1(bufferedReader);
            r6Var.l();
        }
        com.tencent.mars.xlog.Log.i(str, "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< dump file = %s, modified = %s", r6Var.getName(), f(r6Var.B()));
    }

    public static java.lang.String e(java.lang.String str) {
        java.lang.String str2;
        java.nio.charset.Charset charset = r26.c.f368865a;
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
        try {
            com.tencent.mm.vfs.u6 u6Var = new com.tencent.mm.vfs.u6(r6Var);
            try {
                int C = (int) r6Var.C();
                byte[] bArr = new byte[C];
                int i17 = 0;
                while (i17 < C) {
                    int read = u6Var.read(bArr, i17, C - i17);
                    if (read == -1) {
                        break;
                    }
                    i17 += read;
                }
                str2 = new java.lang.String(bArr, charset);
                try {
                    u6Var.close();
                } catch (java.io.IOException e17) {
                    e = e17;
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.performance.Utils", e, "", new java.lang.Object[0]);
                    return str2;
                }
            } finally {
            }
        } catch (java.io.IOException e18) {
            e = e18;
            str2 = null;
        }
        return str2;
    }

    public static java.lang.String f(long j17) {
        return new java.text.SimpleDateFormat("yy-MM-dd HH:mm:ss", java.util.Locale.getDefault()).format(new java.util.Date(j17));
    }
}
