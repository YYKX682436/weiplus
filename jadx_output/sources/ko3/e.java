package ko3;

/* loaded from: classes13.dex */
public final class e implements ko3.q {

    /* renamed from: i, reason: collision with root package name */
    public static final ko3.b f309940i;

    /* renamed from: a, reason: collision with root package name */
    public long f309941a;

    /* renamed from: b, reason: collision with root package name */
    public long f309942b;

    /* renamed from: c, reason: collision with root package name */
    public long f309943c;

    /* renamed from: d, reason: collision with root package name */
    public long f309944d;

    /* renamed from: e, reason: collision with root package name */
    public long f309945e;

    /* renamed from: f, reason: collision with root package name */
    public int f309946f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f309947g = false;

    /* renamed from: h, reason: collision with root package name */
    public long f309948h = 0;

    static {
        ko3.b bVar = new ko3.b(null);
        f309940i = bVar;
        bVar.add("");
        bVar.add(":tools");
        bVar.add(":appbrand0");
        bVar.add(":appbrand1");
        bVar.add(":appbrand2");
        bVar.add(":appbrand3");
        bVar.add(":appbrand4");
    }

    public e(ko3.a aVar) {
        java.io.DataInputStream dataInputStream;
        this.f309941a = 0L;
        this.f309942b = 0L;
        this.f309943c = 0L;
        this.f309944d = 0L;
        this.f309945e = 0L;
        synchronized (this) {
            try {
                dataInputStream = new java.io.DataInputStream(new java.io.BufferedInputStream(new java.io.FileInputStream(new java.io.File(com.tencent.mm.sdk.platformtools.x2.f193071a.getCacheDir(), ko3.e0.b("ã\u0082ç\u0083ÜºÈ\u00adÜò\u0090ù\u0097")))));
                try {
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    try {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MircoMsg.AEDHLP", th, "[tomys] failure to load rec.", new java.lang.Object[0]);
                        this.f309941a = 0L;
                        this.f309942b = 0L;
                        this.f309943c = 0L;
                        this.f309944d = java.lang.System.currentTimeMillis();
                        this.f309945e = 0L;
                        e();
                    } finally {
                        com.tencent.mm.sdk.platformtools.t8.v1(dataInputStream);
                    }
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                dataInputStream = null;
            }
            if (dataInputStream.readInt() != -606158847) {
                throw new java.lang.IllegalStateException("bad magic.");
            }
            this.f309941a = dataInputStream.readLong();
            this.f309942b = dataInputStream.readLong();
            this.f309943c = dataInputStream.readLong();
            this.f309944d = dataInputStream.readLong();
            long readLong = dataInputStream.readLong();
            if (readLong > 0 && this.f309945e <= 0) {
                this.f309945e = readLong;
            }
        }
    }

    public static java.lang.String a(java.lang.String str, java.lang.String str2) {
        return j62.e.g().a(str, str2, false, true);
    }

    public static java.lang.String b(int i17) {
        java.io.BufferedReader bufferedReader;
        java.lang.String readLine;
        android.app.ActivityManager activityManager = (android.app.ActivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (activityManager == null) {
            return "";
        }
        try {
            java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == i17) {
                        return runningAppProcessInfo.processName;
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MircoMsg.AEDHLP", th6, "[tomys] failure on step1.", new java.lang.Object[0]);
        }
        try {
            java.util.List<android.app.ActivityManager.RunningServiceInfo> runningServices = activityManager.getRunningServices(16384);
            if (runningServices != null) {
                for (android.app.ActivityManager.RunningServiceInfo runningServiceInfo : runningServices) {
                    if (runningServiceInfo.pid == i17) {
                        return runningServiceInfo.process;
                    }
                }
            }
        } catch (java.lang.Throwable th7) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MircoMsg.AEDHLP", th7, "[tomys] failure on step2.", new java.lang.Object[0]);
        }
        java.io.BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new java.io.BufferedReader(new java.io.FileReader(java.lang.String.format(java.util.Locale.ENGLISH, ko3.e0.b("Ãì\u009cî\u0081âÍè\u008c£À\u00adÉ¥Ì¢Ç"), java.lang.Integer.valueOf(i17))));
            try {
                readLine = bufferedReader.readLine();
            } catch (java.lang.Throwable th8) {
                th = th8;
                bufferedReader2 = bufferedReader;
                try {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MircoMsg.AEDHLP", th, "[tomys] failure on step3.", new java.lang.Object[0]);
                    return "";
                } finally {
                    com.tencent.mm.sdk.platformtools.t8.v1(bufferedReader2);
                }
            }
        } catch (java.lang.Throwable th9) {
            th = th9;
        }
        if (readLine == null) {
            com.tencent.mm.sdk.platformtools.t8.v1(bufferedReader);
            return "";
        }
        java.lang.String trim = readLine.trim();
        com.tencent.mm.sdk.platformtools.t8.v1(bufferedReader);
        return trim;
    }

    public final synchronized void c(java.lang.Throwable th6) {
        java.io.PrintWriter printWriter;
        if (th6 == null) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - this.f309943c > 86400000) {
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            try {
                printWriter = new java.io.PrintWriter(stringWriter);
                try {
                    th6.printStackTrace(printWriter);
                } catch (java.lang.Throwable unused) {
                }
            } catch (java.lang.Throwable unused2) {
                printWriter = null;
            }
            com.tencent.mm.sdk.platformtools.t8.v1(printWriter);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.i("Normsg_AED_Errors", "error:" + stringWriter.toString(), null);
            this.f309943c = currentTimeMillis;
            e();
        }
    }

    public final synchronized void d() {
        if (!this.f309947g) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - this.f309948h < 2000) {
                return;
            }
            this.f309948h = currentTimeMillis;
            this.f309947g = true;
            w04.l.INSTANCE.Nf(-2147483647);
        }
    }

    public final synchronized void e() {
        java.io.DataOutputStream dataOutputStream = null;
        try {
            java.io.DataOutputStream dataOutputStream2 = new java.io.DataOutputStream(new java.io.BufferedOutputStream(new java.io.FileOutputStream(new java.io.File(com.tencent.mm.sdk.platformtools.x2.f193071a.getCacheDir(), ko3.e0.b("ã\u0082ç\u0083ÜºÈ\u00adÜò\u0090ù\u0097")))));
            try {
                dataOutputStream2.writeInt(-606158847);
                dataOutputStream2.writeLong(this.f309941a);
                dataOutputStream2.writeLong(this.f309942b);
                dataOutputStream2.writeLong(this.f309943c);
                dataOutputStream2.writeLong(this.f309944d);
                dataOutputStream2.writeLong(this.f309945e);
                com.tencent.mm.sdk.platformtools.t8.v1(dataOutputStream2);
            } catch (java.lang.Throwable th6) {
                th = th6;
                dataOutputStream = dataOutputStream2;
                try {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MircoMsg.AEDHLP", th, "[tomys] failure to save rec.", new java.lang.Object[0]);
                } finally {
                    com.tencent.mm.sdk.platformtools.t8.v1(dataOutputStream);
                }
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }
}
