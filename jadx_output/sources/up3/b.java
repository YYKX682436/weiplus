package up3;

/* loaded from: classes12.dex */
public abstract class b {
    public static java.lang.String a(java.lang.String str) {
        if (android.text.TextUtils.equals(str, "armeabi") || android.text.TextUtils.equals(str, "armeabi-v7a")) {
            return "arm";
        }
        if (android.text.TextUtils.equals(str, "arm64-v8a")) {
            return "arm64";
        }
        if (android.text.TextUtils.equals(str, "mips")) {
            return "mips";
        }
        if (android.text.TextUtils.equals(str, "mips64")) {
            return "mips64";
        }
        if (android.text.TextUtils.equals(str, "x86")) {
            return "x86";
        }
        if (android.text.TextUtils.equals(str, "x86_64")) {
            return "x86_64";
        }
        throw new java.lang.IllegalArgumentException("unknown abi: " + str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.io.BufferedInputStream, java.io.Closeable, java.io.InputStream] */
    public static void b(com.tencent.mm.vfs.r6 r6Var, com.tencent.mm.vfs.r6 r6Var2, com.tencent.mm.vfs.t6 t6Var, java.lang.String str) {
        java.util.zip.ZipOutputStream zipOutputStream = null;
        try {
            java.util.zip.ZipOutputStream zipOutputStream2 = new java.util.zip.ZipOutputStream(new java.io.BufferedOutputStream(com.tencent.mm.vfs.w6.H(r6Var2)));
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                if (r6Var.y()) {
                    com.tencent.mm.vfs.r6[] H = t6Var != null ? r6Var.H(t6Var) : r6Var.G();
                    if (H != null) {
                        arrayList.addAll(java.util.Arrays.asList(H));
                    }
                } else {
                    arrayList.add(r6Var);
                }
                while (!arrayList.isEmpty()) {
                    com.tencent.mm.vfs.r6 r6Var3 = (com.tencent.mm.vfs.r6) arrayList.remove(0);
                    java.lang.String substring = r6Var3.o().substring(r6Var.o().length());
                    if (substring.startsWith("/")) {
                        substring = substring.substring(1);
                    }
                    if (substring.isEmpty()) {
                        substring = r6Var3.getName();
                    }
                    if (r6Var3.y() && !substring.endsWith("/")) {
                        substring = substring + "/";
                    }
                    java.util.zip.ZipEntry zipEntry = new java.util.zip.ZipEntry(substring);
                    zipEntry.setMethod(8);
                    try {
                        zipOutputStream2.putNextEntry(zipEntry);
                        if (r6Var3.y()) {
                            com.tencent.mm.vfs.r6[] H2 = t6Var != null ? r6Var3.H(t6Var) : r6Var3.G();
                            if (H2 != null) {
                                arrayList.addAll(java.util.Arrays.asList(H2));
                            }
                        } else {
                            byte[] bArr = new byte[4096];
                            try {
                                ?? bufferedInputStream = new java.io.BufferedInputStream(com.tencent.mm.vfs.w6.C(r6Var3));
                                while (true) {
                                    try {
                                        int read = bufferedInputStream.read(bArr);
                                        if (read <= 0) {
                                            break;
                                        } else {
                                            zipOutputStream2.write(bArr, 0, read);
                                        }
                                    } catch (java.lang.Throwable th6) {
                                        th = th6;
                                        zipOutputStream = bufferedInputStream;
                                        zipOutputStream2.flush();
                                        s46.d.a(zipOutputStream);
                                        throw th;
                                    }
                                }
                                zipOutputStream2.flush();
                                s46.d.a(bufferedInputStream);
                            } catch (java.lang.Throwable th7) {
                                th = th7;
                            }
                        }
                    } finally {
                        zipOutputStream2.closeEntry();
                    }
                }
                if (!android.text.TextUtils.isEmpty(str)) {
                    zipOutputStream2.setComment(str);
                }
                s46.d.a(zipOutputStream2);
            } catch (java.lang.Throwable th8) {
                th = th8;
                zipOutputStream = zipOutputStream2;
                s46.d.a(zipOutputStream);
                throw th;
            }
        } catch (java.lang.Throwable th9) {
            th = th9;
        }
    }

    public static com.tencent.mm.vfs.r6 c(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(new com.tencent.mm.vfs.r6(com.tencent.mm.sdk.platformtools.x2.f193071a.getExternalCacheDir(), tp3.b.a("¢´½¾\u0098¤¨£¤")), str + str2);
        r6Var.s().J();
        if (r6Var.k()) {
            return r6Var;
        }
        throw new java.io.IOException("cannot createNewFile:" + r6Var.o());
    }

    public static int d(java.lang.String str) {
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        android.app.ActivityManager activityManager = (android.app.ActivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
            for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (android.text.TextUtils.equals(runningAppProcessInfo.processName, str)) {
                    return runningAppProcessInfo.pid;
                }
            }
        }
        for (com.tencent.mm.vfs.r6 r6Var : new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a("/proc")).G()) {
            if (android.text.TextUtils.isDigitsOnly(r6Var.getName()) && r6Var.h()) {
                com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(r6Var, "cmdline");
                if (r6Var2.h()) {
                    java.io.BufferedReader bufferedReader = null;
                    try {
                        java.io.BufferedReader bufferedReader2 = new java.io.BufferedReader(new com.tencent.mm.vfs.z6(r6Var2));
                        try {
                            if (str.equals(bufferedReader2.readLine().trim())) {
                                try {
                                    int parseInt = java.lang.Integer.parseInt(r6Var.getName().trim(), 10);
                                    s46.d.a(bufferedReader2);
                                    return parseInt;
                                } catch (java.lang.Throwable unused) {
                                    s46.d.a(bufferedReader2);
                                    return 0;
                                }
                            }
                            s46.d.a(bufferedReader2);
                        } catch (java.lang.Throwable unused2) {
                            bufferedReader = bufferedReader2;
                            s46.d.a(bufferedReader);
                        }
                    } catch (java.lang.Throwable unused3) {
                    }
                } else {
                    continue;
                }
            }
        }
        return 0;
    }

    public static com.tencent.mm.vfs.r6 e() {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationInfo().sourceDir);
        k(r6Var);
        return r6Var;
    }

    public static com.tencent.mm.vfs.r6 f() {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationInfo().sourceDir);
        for (java.lang.String str : android.os.Build.SUPPORTED_ABIS) {
            com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(r6Var.s(), "lib/".concat(a(str)));
            if (r6Var2.h()) {
                return r6Var2;
            }
        }
        throw new java.io.IOException("cannot find readable lib dir.");
    }

    public static com.tencent.mm.vfs.r6 g() {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationInfo().sourceDir);
        for (java.lang.String str : android.os.Build.SUPPORTED_ABIS) {
            com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(r6Var.s(), "oat/" + a(str) + "/base.odex");
            if (r6Var2.h()) {
                return r6Var2;
            }
        }
        throw new java.io.IOException("cannot find readable base odex path.");
    }

    public static com.tencent.mm.vfs.r6 h() {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationInfo().sourceDir);
        for (java.lang.String str : android.os.Build.SUPPORTED_ABIS) {
            com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(r6Var.s(), "oat/" + a(str) + "/base.vdex");
            if (r6Var2.h()) {
                return r6Var2;
            }
        }
        throw new java.io.IOException("cannot find readable base vdex path.");
    }

    public static com.tencent.mm.vfs.r6 i(java.lang.String str) {
        int d17 = d(str);
        if (d17 == 0) {
            throw new java.io.IOException("cannot find process: " + str);
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6("/proc/" + d17 + "/maps");
        k(r6Var);
        return r6Var;
    }

    public static com.tencent.mm.vfs.r6 j(java.lang.String str) {
        int d17 = d(str);
        if (d17 == 0) {
            throw new java.io.IOException("cannot find process: " + str);
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6("/proc/" + d17 + "/smaps");
        k(r6Var);
        return r6Var;
    }

    public static com.tencent.mm.vfs.r6 k(com.tencent.mm.vfs.r6 r6Var) {
        if (r6Var.h()) {
            return r6Var;
        }
        throw new java.io.IOException("cannot read file: " + r6Var.o());
    }
}
