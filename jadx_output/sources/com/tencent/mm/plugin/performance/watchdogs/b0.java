package com.tencent.mm.plugin.performance.watchdogs;

/* loaded from: classes12.dex */
public class b0 implements android.app.Application.ActivityLifecycleCallbacks, java.lang.Runnable, ob0.b3, ki.a {
    public static final com.tencent.mm.plugin.performance.watchdogs.b0 B = new com.tencent.mm.plugin.performance.watchdogs.b0();
    public long A;

    /* renamed from: d, reason: collision with root package name */
    public int f153012d;

    /* renamed from: e, reason: collision with root package name */
    public int f153013e;

    /* renamed from: g, reason: collision with root package name */
    public volatile java.lang.String f153015g;

    /* renamed from: r, reason: collision with root package name */
    public long f153023r;

    /* renamed from: s, reason: collision with root package name */
    public long f153024s;

    /* renamed from: t, reason: collision with root package name */
    public long f153025t;

    /* renamed from: x, reason: collision with root package name */
    public ob0.w2 f153029x;

    /* renamed from: f, reason: collision with root package name */
    public int f153014f = 0;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Set f153016h = new java.util.HashSet();

    /* renamed from: i, reason: collision with root package name */
    public boolean f153017i = true;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f153018m = true;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f153019n = false;

    /* renamed from: o, reason: collision with root package name */
    public final android.app.ActivityManager f153020o = (android.app.ActivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);

    /* renamed from: p, reason: collision with root package name */
    public long f153021p = 524288000;

    /* renamed from: q, reason: collision with root package name */
    public long f153022q = 1258291;

    /* renamed from: u, reason: collision with root package name */
    public boolean f153026u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f153027v = false;

    /* renamed from: w, reason: collision with root package name */
    public long f153028w = 0;

    /* renamed from: y, reason: collision with root package name */
    public int f153030y = 0;

    /* renamed from: z, reason: collision with root package name */
    public long f153031z = 0;

    public b0() {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (z65.c.a()) {
                com.tencent.mm.sdk.platformtools.o4.M("diagnostic_storage").G("KEY_ENABLE_HOOK_TOAST", true);
            }
        }
        com.tencent.matrix.lifecycle.owners.f0.f52742x.a(new com.tencent.mm.plugin.performance.watchdogs.c0(this));
        com.tencent.mm.matrix.dice.c.f68706f.c(new com.tencent.mm.plugin.performance.watchdogs.d0(this));
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MMTrimMemoryEvent>(this, a0Var) { // from class: com.tencent.mm.plugin.performance.watchdogs.MemoryWatchDog$3
            {
                this.__eventId = 708811463;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public /* bridge */ /* synthetic */ boolean callback(com.tencent.mm.autogen.events.MMTrimMemoryEvent mMTrimMemoryEvent) {
                return false;
            }
        }.alive();
        if (com.tencent.mm.sdk.platformtools.z.f193115k) {
            return;
        }
        sp3.d.c();
    }

    @Override // ki.a
    public void a(int i17) {
    }

    @Override // ki.a
    public void b() {
        ((ku5.t0) ku5.t0.f312615d).r(new com.tencent.mm.plugin.performance.watchdogs.i0(this), "backgroundTrim");
    }

    public final boolean c(ob0.s3 s3Var) {
        boolean z17;
        com.tencent.mm.booter.s b17 = com.tencent.mm.booter.s.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        if (b17 != null && com.tencent.mm.sdk.platformtools.t8.m1(b17.a(".com.tencent.mm.debug.disable_memory_hook"), false)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MemoryWatchDog", "disabled by assist");
            return false;
        }
        try {
            z17 = ih.a.f(e42.d0.clicfg_memory_hook_auto_trigger_sos, false);
        } catch (java.lang.Throwable unused) {
            z17 = false;
        }
        if (z17) {
            return false;
        }
        return this.f153026u || s3Var.f343956m > 2147483648L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0ac6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0b46  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0ac9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(boolean r68) {
        /*
            Method dump skipped, instructions count: 2891
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.performance.watchdogs.b0.d(boolean):void");
    }

    public final void e(ob0.s3 s3Var) {
        java.lang.System.currentTimeMillis();
        for (android.app.ActivityManager.RunningServiceInfo runningServiceInfo : this.f153020o.getRunningServices(Integer.MAX_VALUE)) {
            if (runningServiceInfo.uid == android.os.Process.myUid() && runningServiceInfo.pid == android.os.Process.myPid()) {
                runningServiceInfo.service.getClassName();
                if (runningServiceInfo.foreground) {
                    ((java.util.ArrayList) s3Var.f343953j).add(runningServiceInfo.service.getClassName());
                }
            }
        }
        java.lang.System.currentTimeMillis();
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x008d, code lost:
    
        throw new java.lang.IllegalStateException("should not be here.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(ob0.s3 r19) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.performance.watchdogs.b0.f(ob0.s3):void");
    }

    public ob0.s3 g() {
        return h(true, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x039b A[Catch: all -> 0x03e3, TryCatch #1 {all -> 0x03e3, blocks: (B:106:0x036a, B:112:0x037f, B:113:0x0392, B:115:0x039b, B:117:0x03ae, B:119:0x03b7, B:120:0x03b9, B:122:0x03cb, B:123:0x03d7, B:124:0x03dd), top: B:105:0x036a }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03b7 A[Catch: all -> 0x03e3, TryCatch #1 {all -> 0x03e3, blocks: (B:106:0x036a, B:112:0x037f, B:113:0x0392, B:115:0x039b, B:117:0x03ae, B:119:0x03b7, B:120:0x03b9, B:122:0x03cb, B:123:0x03d7, B:124:0x03dd), top: B:105:0x036a }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03cb A[Catch: all -> 0x03e3, TryCatch #1 {all -> 0x03e3, blocks: (B:106:0x036a, B:112:0x037f, B:113:0x0392, B:115:0x039b, B:117:0x03ae, B:119:0x03b7, B:120:0x03b9, B:122:0x03cb, B:123:0x03d7, B:124:0x03dd), top: B:105:0x036a }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x024e A[Catch: all -> 0x025d, TryCatch #4 {all -> 0x025d, blocks: (B:68:0x0248, B:70:0x024e, B:74:0x0258), top: B:67:0x0248 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0084 A[Catch: all -> 0x0066, Exception -> 0x0180, TryCatch #0 {Exception -> 0x0180, blocks: (B:208:0x0062, B:7:0x0070, B:9:0x0084, B:10:0x008f, B:12:0x00e3, B:14:0x00e9, B:16:0x00f9, B:22:0x0105, B:23:0x0121, B:29:0x012d, B:194:0x00ef), top: B:207:0x0062 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ob0.s3 h(boolean r22, int r23) {
        /*
            Method dump skipped, instructions count: 1057
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.performance.watchdogs.b0.h(boolean, int):ob0.s3");
    }

    public final void i(ob0.s3 s3Var) {
        java.lang.System.currentTimeMillis();
        android.os.Debug.MemoryInfo memoryInfo = new android.os.Debug.MemoryInfo();
        android.os.Debug.getMemoryInfo(memoryInfo);
        s3Var.f343968y = memoryInfo.getTotalPss();
        s3Var.f343946c = memoryInfo.getMemoryStats();
        try {
            java.lang.Integer num = (java.lang.Integer) oj.c0.a(android.os.Debug.MemoryInfo.class, "dalvikSwappedOut", memoryInfo);
            java.lang.String str = (java.lang.String) s3Var.f343946c.get("summary.java-heap");
            java.util.Objects.requireNonNull(str);
            s3Var.f343946c.put("java-including-swap", java.lang.Integer.toString(java.lang.Integer.parseInt(str) + num.intValue()));
            java.lang.Integer num2 = (java.lang.Integer) oj.c0.a(android.os.Debug.MemoryInfo.class, "nativeSwappedOut", memoryInfo);
            java.lang.String str2 = (java.lang.String) s3Var.f343946c.get("summary.native-heap");
            java.util.Objects.requireNonNull(str2);
            s3Var.f343946c.put("native-including-swap", java.lang.Integer.toString(java.lang.Integer.parseInt(str2) + num2.intValue()));
            java.lang.Integer num3 = (java.lang.Integer) oj.c0.a(android.os.Debug.MemoryInfo.class, "otherSwappedOut", memoryInfo);
            java.lang.String str3 = (java.lang.String) s3Var.f343946c.get("summary.private-other");
            java.util.Objects.requireNonNull(str3);
            s3Var.f343946c.put("native-including-swap", java.lang.Integer.toString(java.lang.Integer.parseInt(str3) + num3.intValue()));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MemoryWatchDog", e17, "", new java.lang.Object[0]);
        }
        int[] iArr = {android.os.Process.myPid()};
        android.app.ActivityManager activityManager = this.f153020o;
        android.os.Debug.MemoryInfo[] processMemoryInfo = activityManager.getProcessMemoryInfo(iArr);
        if (processMemoryInfo != null && processMemoryInfo.length == 1) {
            android.os.Debug.MemoryInfo memoryInfo2 = processMemoryInfo[0];
            s3Var.f343969z = memoryInfo2.getTotalPss();
            s3Var.f343946c.put("summary.graphics", memoryInfo2.getMemoryStat("summary.graphics"));
            s3Var.f343947d = memoryInfo2.getMemoryStats();
        }
        java.lang.System.currentTimeMillis();
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            java.lang.System.currentTimeMillis();
            java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i17 = 0; i17 < runningAppProcesses.size(); i17++) {
                android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo = runningAppProcesses.get(i17);
                java.lang.String str4 = com.tencent.mm.sdk.platformtools.a9.f192463a;
                com.tencent.mm.sdk.platformtools.z8 z8Var = yp5.a.f464409a;
                if (android.os.Process.myUid() == runningAppProcessInfo.uid && !android.text.TextUtils.isEmpty(runningAppProcessInfo.processName) && runningAppProcessInfo.processName.startsWith("com.tencent.mm")) {
                    ob0.s3 s3Var2 = new ob0.s3();
                    s3Var2.f343944a = runningAppProcesses.get(i17).pid;
                    s3Var2.f343945b = runningAppProcesses.get(i17).processName;
                    arrayList.add(s3Var2);
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MemoryWatchDog", "info with uid [%s] & process name [%s] is not current app [%s][%s]", java.lang.Integer.valueOf(runningAppProcesses.get(i17).uid), runningAppProcesses.get(i17).processName, java.lang.Integer.valueOf(android.os.Process.myUid()), "com.tencent.mm");
                }
            }
            int size = arrayList.size();
            ob0.s3[] s3VarArr = new ob0.s3[size];
            arrayList.toArray(s3VarArr);
            int[] iArr2 = new int[size];
            for (int i18 = 0; i18 < size; i18++) {
                iArr2[i18] = s3VarArr[i18].f343944a;
            }
            android.os.Debug.MemoryInfo[] processMemoryInfo2 = activityManager.getProcessMemoryInfo(iArr2);
            if (processMemoryInfo2 != null) {
                java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                if (com.tencent.mm.sdk.platformtools.s9.f192975c) {
                    iz5.a.a(size, processMemoryInfo2.length);
                }
                int i19 = 0;
                for (int i27 = 0; i27 < java.lang.Math.min(processMemoryInfo2.length, size); i27++) {
                    processMemoryInfo2[i27].getTotalPss();
                    s3VarArr[i27].f343968y = processMemoryInfo2[i27].getTotalPss();
                    i19 += s3VarArr[i27].f343968y;
                }
                s3Var.A = i19;
                s3Var.C = s3VarArr;
                s3Var.B = com.tencent.xweb.a3.h();
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.MemoryWatchDog", "pidMemInfoArray2 == null");
            }
            java.lang.System.currentTimeMillis();
        }
    }

    public final void j(ob0.s3 s3Var) {
        ob0.w2 w2Var = this.f153029x;
        if (w2Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MemoryWatchDog", "mAppbrandExtraMemoryInfo == null");
            return;
        }
        s3Var.E = w2Var.extra();
        s3Var.F = this.f153029x.d();
        s3Var.G = this.f153029x.b();
        s3Var.H = this.f153029x.c();
        s3Var.I = this.f153029x.a();
    }

    public final java.lang.String k() {
        java.lang.String readLine;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(24);
        sb6.append("/proc/");
        sb6.append(android.os.Process.myPid());
        sb6.append("/status");
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.FileReader(new java.io.File(sb6.toString())));
            do {
                try {
                    readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.MemoryWatchDog", "[getVmSize] Wrong!");
                        bufferedReader.close();
                        return "";
                    }
                } finally {
                }
            } while (!readLine.startsWith("VmSize"));
            bufferedReader.close();
            return readLine;
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public void l(boolean z17) {
        this.f153018m = z17;
        if (!z17) {
            this.f153023r = java.lang.System.currentTimeMillis();
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - this.f153025t > 300000) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MemoryWatchDog", "onAppForeground: forward check");
            this.f153025t = currentTimeMillis;
            ((ku5.t0) ku5.t0.f312615d).A("MicroMsg.MemoryWatchDog");
            ((ku5.t0) ku5.t0.f312615d).l(this, 300000L, "MicroMsg.MemoryWatchDog");
        }
    }

    public final void m(ob0.s3 s3Var, boolean z17) {
        com.tencent.mm.autogen.events.MMTrimMemoryEvent mMTrimMemoryEvent = new com.tencent.mm.autogen.events.MMTrimMemoryEvent();
        am.lj ljVar = mMTrimMemoryEvent.f54488g;
        ljVar.getClass();
        int i17 = s3Var.f343948e;
        ljVar.getClass();
        ljVar.getClass();
        ljVar.getClass();
        ljVar.getClass();
        if (z17) {
            ljVar.getClass();
            com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) s3Var.f343946c.get("summary.graphics"), 0);
            ljVar.getClass();
            com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) s3Var.f343946c.get("summary.native-heap"), 0);
            ljVar.getClass();
            ljVar.getClass();
        }
        mMTrimMemoryEvent.e();
    }

    public void n(ob0.w2 factory) {
        this.f153029x = factory;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.matrix.monitor.l0.f68782a;
        kotlin.jvm.internal.o.g(factory, "factory");
        java.lang.String tag = factory.getTag();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = com.tencent.mm.matrix.monitor.l0.f68782a;
        if (concurrentHashMap2.contains(tag)) {
            throw new java.lang.RuntimeException("Tag of ExtraInfoFactory conflict");
        }
        kotlin.jvm.internal.o.d(tag);
        concurrentHashMap2.put(tag, factory);
    }

    public final void o(ob0.s3 s3Var, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MemoryWatchDog", "check triggerMemoryHook");
        if (this.f153027v) {
            long j17 = s3Var.f343957n;
            if (j17 > this.f153021p || s3Var.f343968y > this.f153022q) {
                long j18 = j17 + com.tencent.tmassistantsdk.downloadservice.DownloadHelper.SAVE_LENGTH;
                this.f153021p = j18;
                if (this.f153022q < 2097152) {
                    this.f153022q = s3Var.f343968y + 102400;
                } else {
                    this.f153022q = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.MemoryWatchDog", "trigger report, next threshold : native %s pss %s, isFg=%s, fgSvs=%s, bgDur=%s", java.lang.Long.valueOf(j18), java.lang.Long.valueOf(this.f153022q), java.lang.Boolean.valueOf(s3Var.f343951h), java.util.Arrays.toString(((java.util.ArrayList) s3Var.f343953j).toArray()), java.lang.Long.valueOf(s3Var.f343966w));
                if (i17 != 3) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MemoryWatchDog", "not SOURCE_AUTO_CHECK, dumpForegroundService");
                    e(s3Var);
                }
                ((vp3.c) tp3.a.INSTANCE.a(vp3.c.class)).s(false);
                return;
            }
            return;
        }
        if ((s3Var.f343957n > 209715200 || s3Var.f343968y > 1048576) && android.os.Build.VERSION.SDK_INT >= 26) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MemoryWatchDog", "trigger hook");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("<cmd><diagnostic><MemoryHook enable='1' source='auto' process='");
            sb6.append(com.tencent.mm.sdk.platformtools.x2.n() ? "mm" : com.tencent.mm.sdk.platformtools.x2.j() ? "appbrand" : com.tencent.mm.sdk.platformtools.x2.s() ? "tools" : com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_ALL);
            sb6.append("' duration='24' hook='.*com\\.tencent\\.mm.*\\.so$;.*libhwui\\.so$;.*libEGL\\.so$;.*libGLES.*\\.so$;.*libstagefright_foundation\\.so$;.*libstagefright\\.so$;.*libandroidfw\\.so$' stack='1' min='0' max='0' force='1' enableExpt='0' sampling='1' mmap='0'/></diagnostic></cmd>");
            tp3.a.INSTANCE.d(sb6.toString());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey(1571, 1, 1);
            com.tencent.mars.smc.IDKey iDKey2 = new com.tencent.mars.smc.IDKey(1571, com.tencent.mm.sdk.platformtools.x2.n() ? 30 : com.tencent.mm.sdk.platformtools.x2.j() ? 31 : (com.tencent.mm.sdk.platformtools.x2.s() || com.tencent.mm.sdk.platformtools.x2.r()) ? 32 : -1, 1);
            arrayList.add(iDKey);
            arrayList.add(iDKey2);
            jx3.f.INSTANCE.b(arrayList, false);
            this.f153027v = true;
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (z65.c.a()) {
                if (com.tencent.mm.sdk.platformtools.o4.M("diagnostic_storage").i("KEY_ENABLE_HOOK_TOAST", true)) {
                    ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.performance.watchdogs.g0(this));
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MemoryWatchDog", "skip toast");
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        if (com.tencent.mm.sdk.platformtools.x2.j() || com.tencent.mm.sdk.platformtools.x2.s()) {
            java.lang.String str = activity.toString() + ":" + activity.hashCode();
            java.util.Set set = this.f153016h;
            ((java.util.HashSet) set).add(str);
            com.tencent.mars.xlog.Log.i("MicroMsg.MemoryWatchDog", "onActivityCreated: %s, mActivities.size = %s", str, java.lang.Integer.valueOf(((java.util.HashSet) set).size()));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        if (com.tencent.mm.sdk.platformtools.x2.j() || com.tencent.mm.sdk.platformtools.x2.s()) {
            java.lang.String str = activity.toString() + ":" + activity.hashCode();
            java.util.Set set = this.f153016h;
            ((java.util.HashSet) set).remove(str);
            com.tencent.mars.xlog.Log.i("MicroMsg.MemoryWatchDog", "onActivityDestroyed: %s, mActivities.size = %s", str, java.lang.Integer.valueOf(((java.util.HashSet) set).size()));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        this.f153015g = activity.getClass().getSimpleName();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        this.f153015g = activity.getClass().getSimpleName();
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        boolean z17 = uptimeMillis - this.A > 2000;
        this.A = uptimeMillis;
        if (z17) {
            ((ku5.t0) ku5.t0.f312615d).k(new com.tencent.mm.plugin.performance.watchdogs.f0(this, 1), 2000L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        boolean z17 = uptimeMillis - this.A > 2000;
        this.A = uptimeMillis;
        if (z17) {
            ((ku5.t0) ku5.t0.f312615d).k(new com.tencent.mm.plugin.performance.watchdogs.f0(this, 2), 2000L);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        d(false);
        this.f153025t = java.lang.System.currentTimeMillis();
        ((ku5.t0) ku5.t0.f312615d).l(this, this.f153018m ? 300000L : 1800000L, "MicroMsg.MemoryWatchDog");
    }
}
