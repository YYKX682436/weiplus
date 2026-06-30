package rl;

/* loaded from: classes7.dex */
public abstract class a {
    public static java.lang.String a(java.lang.String str) {
        com.tencent.mm.vfs.r6 d17 = d();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(rl.d.a("" + str.hashCode()));
        sb6.append("_convert.pcm");
        java.lang.String l17 = com.tencent.mm.vfs.e8.l(sb6.toString(), false, true);
        com.tencent.mm.vfs.z7 z7Var = d17.f213166d;
        if (l17 != null && !l17.isEmpty()) {
            java.lang.String str2 = z7Var.f213279f;
            z7Var = new com.tencent.mm.vfs.z7(z7Var.f213277d, z7Var.f213278e, str2 + '/' + l17, z7Var.f213280g, z7Var.f213281h);
        }
        return z7Var.toString();
    }

    public static com.tencent.mm.vfs.r6 b(java.lang.String str) {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
        if (!r6Var.m()) {
            try {
                r6Var.k();
            } catch (java.lang.Exception e17) {
                int i17 = rl.b.f397143a;
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mix.FileUtil", e17, "createNewFile", new java.lang.Object[0]);
            }
        }
        return r6Var;
    }

    public static java.lang.String c(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(d().u() + "/" + str);
        if (!r6Var.m()) {
            r6Var.J();
        }
        java.lang.Object[] objArr = {r6Var.u(), str};
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.FileUtil", "path:%s, appId:%s", objArr);
        java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, true);
        com.tencent.mm.vfs.z7 z7Var = r6Var.f213166d;
        if (l17 != null && !l17.isEmpty()) {
            java.lang.String str3 = z7Var.f213279f;
            z7Var = new com.tencent.mm.vfs.z7(z7Var.f213277d, z7Var.f213278e, str3 + '/' + l17, z7Var.f213280g, z7Var.f213281h);
        }
        return z7Var.toString();
    }

    public static com.tencent.mm.vfs.r6 d() {
        com.tencent.mm.vfs.r6 j17 = com.tencent.mm.vfs.r6.j(com.tencent.mm.sdk.platformtools.x2.f193071a.getExternalCacheDir());
        if (j17 == null) {
            j17 = com.tencent.mm.vfs.r6.j(com.tencent.mm.sdk.platformtools.x2.f193071a.getCacheDir());
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(j17, "MixAudio");
        r6Var.J();
        return r6Var;
    }

    public static long e(java.lang.String str) {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
        if (r6Var.m()) {
            return r6Var.C();
        }
        return 0L;
    }

    public static java.lang.String f(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.vfs.r6 d17 = d();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(rl.d.a("" + str2.hashCode()));
        sb6.append("_cache.pcm");
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(d17.u() + "/" + str);
        if (!r6Var.m()) {
            r6Var.J();
        }
        java.lang.Object[] objArr = {r6Var.u(), str};
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.FileUtil", "path:%s, appId:%s", objArr);
        java.lang.String l17 = com.tencent.mm.vfs.e8.l(sb7, false, true);
        com.tencent.mm.vfs.z7 z7Var = r6Var.f213166d;
        if (l17 != null && !l17.isEmpty()) {
            java.lang.String str3 = z7Var.f213279f;
            z7Var = new com.tencent.mm.vfs.z7(z7Var.f213277d, z7Var.f213278e, str3 + '/' + l17, z7Var.f213280g, z7Var.f213281h);
        }
        return z7Var.toString();
    }
}
