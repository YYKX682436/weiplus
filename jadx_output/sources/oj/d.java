package oj;

/* loaded from: classes12.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static oj.c f345683a;

    /* renamed from: b, reason: collision with root package name */
    public static long f345684b;

    /* renamed from: c, reason: collision with root package name */
    public static long f345685c;

    /* renamed from: d, reason: collision with root package name */
    public static int f345686d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.io.FileFilter f345687e = new oj.b();

    /* JADX WARN: Removed duplicated region for block: B:19:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0164 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static double a() {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oj.d.a():double");
    }

    public static android.os.Debug.MemoryInfo b(android.content.Context context) {
        try {
            android.os.Debug.MemoryInfo[] processMemoryInfo = ((android.app.ActivityManager) context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getProcessMemoryInfo(new int[]{android.os.Process.myPid()});
            if (processMemoryInfo.length > 0) {
                return processMemoryInfo[0];
            }
            return null;
        } catch (java.lang.Exception e17) {
            oj.j.c("Matrix.DeviceUtil", "getProcessMemoryInfo fail, error: %s", e17.toString());
            return null;
        }
    }

    public static int c(java.lang.String str) {
        java.io.FileInputStream fileInputStream;
        java.io.FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new java.io.FileInputStream(str);
            } catch (java.lang.Throwable th6) {
                th = th6;
            }
        } catch (java.io.IOException e17) {
            e = e17;
        }
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(fileInputStream, com.tencent.mapsdk.internal.rv.f51270c));
            java.lang.String readLine = bufferedReader.readLine();
            bufferedReader.close();
            if (readLine != null && readLine.matches("0-[\\d]+$")) {
                int parseInt = java.lang.Integer.parseInt(readLine.substring(2)) + 1;
                try {
                    fileInputStream.close();
                } catch (java.io.IOException e18) {
                    oj.j.c("Matrix.DeviceUtil", "[getCoresFromFile] error! %s", e18.toString());
                }
                return parseInt;
            }
            try {
                fileInputStream.close();
            } catch (java.io.IOException e19) {
                oj.j.c("Matrix.DeviceUtil", "[getCoresFromFile] error! %s", e19.toString());
            }
            return 0;
        } catch (java.io.IOException e27) {
            e = e27;
            fileInputStream2 = fileInputStream;
            oj.j.c("Matrix.DeviceUtil", "[getCoresFromFile] error! %s", e.toString());
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (java.io.IOException e28) {
                    oj.j.c("Matrix.DeviceUtil", "[getCoresFromFile] error! %s", e28.toString());
                }
            }
            return 0;
        } catch (java.lang.Throwable th7) {
            th = th7;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (java.io.IOException e29) {
                    oj.j.c("Matrix.DeviceUtil", "[getCoresFromFile] error! %s", e29.toString());
                }
            }
            throw th;
        }
    }

    public static org.json.JSONObject d(org.json.JSONObject jSONObject, android.app.Application application) {
        try {
            jSONObject.put("machine", e(application));
            jSONObject.put("cpu_app", a());
            jSONObject.put("mem", g(application));
            android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
            ((android.app.ActivityManager) application.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getMemoryInfo(memoryInfo);
            jSONObject.put("mem_free", memoryInfo.availMem / 1024);
        } catch (org.json.JSONException e17) {
            oj.j.b("Matrix.DeviceUtil", "[JSONException for stack, error: %s", e17);
        }
        return jSONObject;
    }

    public static oj.c e(android.content.Context context) {
        int i17;
        oj.c cVar = f345683a;
        if (cVar != null) {
            return cVar;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long g17 = g(context);
        try {
            i17 = c("/sys/devices/system/cpu/possible");
            if (i17 == 0) {
                i17 = c("/sys/devices/system/cpu/present");
            }
        } catch (java.lang.Exception unused) {
        }
        if (i17 == 0) {
            java.io.File[] listFiles = new java.io.File("/sys/devices/system/cpu/").listFiles(f345687e);
            i17 = listFiles == null ? 0 : listFiles.length;
        }
        if (i17 == 0) {
            i17 = 1;
        }
        oj.j.c("Matrix.DeviceUtil", "[getLevel] totalMemory:%s coresNum:%s", java.lang.Long.valueOf(g17), java.lang.Integer.valueOf(i17));
        if (g17 >= 8589934592L) {
            f345683a = oj.c.BEST;
        } else if (g17 >= 6442450944L) {
            f345683a = oj.c.HIGH;
        } else {
            oj.c cVar2 = oj.c.MIDDLE;
            if (g17 >= 4294967296L) {
                f345683a = cVar2;
            } else if (g17 >= 2147483648L) {
                if (i17 >= 4) {
                    f345683a = cVar2;
                } else if (i17 > 0) {
                    f345683a = oj.c.LOW;
                }
            } else if (g17 >= 0) {
                f345683a = oj.c.BAD;
            } else {
                f345683a = oj.c.UN_KNOW;
            }
        }
        oj.j.c("Matrix.DeviceUtil", "getLevel, cost:" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ", level:" + f345683a, new java.lang.Object[0]);
        return f345683a;
    }

    public static java.lang.String f(java.lang.String str) {
        java.io.FileInputStream fileInputStream;
        java.lang.Throwable th6;
        java.io.File file = new java.io.File(str);
        java.io.BufferedReader bufferedReader = null;
        try {
            fileInputStream = new java.io.FileInputStream(file);
        } catch (java.lang.Throwable th7) {
            fileInputStream = null;
            th6 = th7;
        }
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            try {
                java.io.BufferedReader bufferedReader2 = new java.io.BufferedReader(new java.io.InputStreamReader(fileInputStream, com.tencent.mapsdk.internal.rv.f51270c));
                while (true) {
                    try {
                        java.lang.String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            bufferedReader2.close();
                            java.lang.String sb7 = sb6.toString();
                            fileInputStream.close();
                            return sb7;
                        }
                        sb6.append(readLine);
                        sb6.append('\n');
                    } catch (java.lang.Throwable th8) {
                        th = th8;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        throw th;
                    }
                }
            } catch (java.lang.Throwable th9) {
                th = th9;
            }
        } catch (java.lang.Throwable th10) {
            th6 = th10;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            throw th6;
        }
    }

    public static long g(android.content.Context context) {
        long j17 = f345684b;
        if (0 != j17) {
            return j17;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
        android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        activityManager.getMemoryInfo(memoryInfo);
        f345684b = memoryInfo.totalMem;
        f345685c = memoryInfo.threshold;
        long maxMemory = java.lang.Runtime.getRuntime().maxMemory();
        if (maxMemory == com.tencent.wcdb.core.Database.DictDefaultMatchValue) {
            f345686d = activityManager.getMemoryClass();
        } else {
            f345686d = (int) (maxMemory / 1048576);
        }
        oj.j.c("Matrix.DeviceUtil", "getTotalMemory cost:" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ", total_mem:" + f345684b + ", LowMemoryThresold:" + f345685c + ", Memory Class:" + f345686d, new java.lang.Object[0]);
        return f345684b;
    }

    public static boolean h() {
        java.lang.String str = android.os.Build.CPU_ABI;
        return "arm64-v8a".equalsIgnoreCase(str) || "x86_64".equalsIgnoreCase(str) || "mips64".equalsIgnoreCase(str);
    }
}
