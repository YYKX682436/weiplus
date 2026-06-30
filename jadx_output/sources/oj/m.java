package oj;

/* loaded from: classes12.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f345708a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f345709b;

    /* renamed from: c, reason: collision with root package name */
    public static final char[] f345710c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.ThreadLocal f345711d = new oj.k();

    static {
        new oj.l();
    }

    public static android.content.Context a() {
        android.app.Application application;
        if (ih.d.c()) {
            return ih.d.d().f291471b;
        }
        synchronized (oj.a.class) {
            application = oj.a.f345665a;
            if (application == null) {
                application = oj.a.a();
                oj.a.f345665a = application;
                if (application == null) {
                    throw new java.lang.IllegalStateException("Please make sure you do not call Applications#context() before or inside Application#attachBaseContext(Context). If you have to, please call Applications#attach(Application) first.");
                }
            }
        }
        return application;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x00a3 -> B:43:0x00a6). Please report as a decompilation issue!!! */
    public static java.lang.String b(android.content.Context context) {
        java.io.FileInputStream fileInputStream;
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo;
        java.lang.String str = f345708a;
        if (str != null) {
            return str;
        }
        int myPid = android.os.Process.myPid();
        java.lang.String str2 = "";
        if (myPid > 0) {
            if (context == null) {
                context = a();
            }
            android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            java.io.FileInputStream fileInputStream2 = null;
            if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                try {
                    java.util.Iterator<android.app.ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                    while (it.hasNext()) {
                        runningAppProcessInfo = it.next();
                        if (runningAppProcessInfo.pid == myPid) {
                            break;
                        }
                    }
                } catch (java.lang.Exception e17) {
                    e17.getMessage();
                }
                runningAppProcessInfo = null;
                if (runningAppProcessInfo != null) {
                    str2 = runningAppProcessInfo.processName;
                }
            }
            byte[] bArr = new byte[128];
            try {
                try {
                    try {
                        fileInputStream = new java.io.FileInputStream("/proc/" + myPid + "/cmdline");
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        fileInputStream = fileInputStream2;
                    }
                } catch (java.lang.Exception e18) {
                    e = e18;
                }
            } catch (java.lang.Exception e19) {
                e19.getMessage();
            }
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    fileInputStream2 = null;
                    int i17 = 0;
                    while (true) {
                        if (i17 >= read) {
                            break;
                        }
                        if (bArr[i17] <= 0) {
                            read = i17;
                            break;
                        }
                        i17++;
                    }
                    java.lang.String str3 = new java.lang.String(bArr, 0, read, java.nio.charset.Charset.forName(com.tencent.mapsdk.internal.rv.f51270c));
                    try {
                        fileInputStream.close();
                    } catch (java.lang.Exception e27) {
                        e27.getMessage();
                    }
                    str2 = str3;
                } else {
                    fileInputStream.close();
                }
            } catch (java.lang.Exception e28) {
                e = e28;
                fileInputStream2 = fileInputStream;
                e.getMessage();
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                f345708a = str2;
                return str2;
            } catch (java.lang.Throwable th7) {
                th = th7;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (java.lang.Exception e29) {
                        e29.getMessage();
                    }
                }
                throw th;
            }
        }
        f345708a = str2;
        return str2;
    }

    public static boolean c(android.content.Context context) {
        java.lang.String packageName = context.getPackageName();
        java.lang.String b17 = b(context);
        if (b17 == null || b17.length() == 0) {
            b17 = "";
        }
        return packageName.equals(b17);
    }

    public static long d(java.lang.String str, long j17) {
        if (str == null) {
            return j17;
        }
        try {
            return str.length() <= 0 ? j17 : java.lang.Long.decode(str).longValue();
        } catch (java.lang.NumberFormatException e17) {
            oj.j.f("Matrix.MatrixUtil", "parseLong error: " + e17.getMessage(), new java.lang.Object[0]);
            return j17;
        }
    }

    public static java.lang.String e(java.lang.Exception exc) {
        java.lang.StackTraceElement[] stackTrace = exc.getStackTrace();
        if (stackTrace == null) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(exc.toString());
        for (int i17 = 2; i17 < stackTrace.length; i17++) {
            sb6.append('[');
            sb6.append(stackTrace[i17].getClassName());
            sb6.append(':');
            sb6.append(stackTrace[i17].getMethodName());
            sb6.append("(" + stackTrace[i17].getLineNumber() + ")]");
            sb6.append("\n");
        }
        return sb6.toString();
    }

    public static void f(java.lang.String str, java.lang.String str2) {
        java.io.BufferedReader bufferedReader = null;
        try {
            java.io.BufferedReader bufferedReader2 = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(new java.io.File(str2)), com.tencent.mapsdk.internal.rv.f51270c));
            while (true) {
                try {
                    java.lang.String readLine = bufferedReader2.readLine();
                    if (readLine == null) {
                        bufferedReader2.close();
                        return;
                    }
                    oj.j.c(str, readLine, new java.lang.Object[0]);
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    bufferedReader = bufferedReader2;
                    try {
                        oj.j.b(str, "printFileByLine failed e : " + th.getMessage(), new java.lang.Object[0]);
                        if (bufferedReader != null) {
                            return;
                        } else {
                            return;
                        }
                    } finally {
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                    }
                }
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }
}
