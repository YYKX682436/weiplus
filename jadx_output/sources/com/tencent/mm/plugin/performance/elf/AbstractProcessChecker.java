package com.tencent.mm.plugin.performance.elf;

/* loaded from: classes12.dex */
public abstract class AbstractProcessChecker extends android.content.BroadcastReceiver {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f152956j = 0;

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f152957a;

    /* renamed from: b, reason: collision with root package name */
    public final xp3.c f152958b;

    /* renamed from: c, reason: collision with root package name */
    public int f152959c;

    /* renamed from: d, reason: collision with root package name */
    public long f152960d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f152961e;

    /* renamed from: f, reason: collision with root package name */
    public int f152962f;

    /* renamed from: g, reason: collision with root package name */
    public long f152963g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f152964h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f152965i;

    public AbstractProcessChecker() {
        xp3.c cVar = new xp3.c(this, null);
        this.f152958b = cVar;
        this.f152959c = 0;
        this.f152960d = 0L;
        this.f152961e = null;
        this.f152962f = 0;
        this.f152963g = 0L;
        this.f152964h = null;
        this.f152965i = true;
        ((android.app.Application) com.tencent.mm.sdk.platformtools.x2.f193071a).registerActivityLifecycleCallbacks(cVar);
        if (com.tencent.mm.plugin.performance.elf.ElfCallUpReceiver.f152966a > 0) {
            k(android.os.Process.myPid(), com.tencent.mm.plugin.performance.elf.ElfCallUpReceiver.f152966a);
        } else {
            com.tencent.mars.xlog.Log.w(e(), "not processElf call up!");
        }
    }

    public static long b() {
        try {
            java.lang.String d17 = d(java.lang.String.format("/proc/%s/schedstat", java.lang.Integer.valueOf(android.os.Process.myPid())));
            if (d17 == null) {
                return -1L;
            }
            return com.tencent.mm.sdk.platformtools.t8.E1(d17.replaceAll("\n", "").split(" ")[2]);
        } catch (java.lang.Exception unused) {
            return -2L;
        }
    }

    public static java.lang.String d(java.lang.String str) {
        java.lang.Throwable th6;
        java.io.InputStream inputStream;
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        java.io.BufferedReader bufferedReader = null;
        try {
            inputStream = com.tencent.mm.vfs.w6.D(a17, com.tencent.mm.vfs.a3.f212781a.m(a17, null));
        } catch (java.lang.Throwable th7) {
            th6 = th7;
            inputStream = null;
        }
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            try {
                java.io.BufferedReader bufferedReader2 = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream));
                while (true) {
                    try {
                        java.lang.String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            break;
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
                bufferedReader2.close();
                java.lang.String sb7 = sb6.toString();
                if (inputStream != null) {
                    inputStream.close();
                }
                return sb7;
            } catch (java.lang.Throwable th9) {
                th = th9;
            }
        } catch (java.lang.Throwable th10) {
            th6 = th10;
            if (inputStream != null) {
                inputStream.close();
            }
            throw th6;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        r5 = r1[12];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long f() {
        /*
            java.lang.String r0 = "\\d+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            int r1 = android.os.Process.myPid()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "/proc/%s/status"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r2 = 0
            java.lang.String r1 = d(r1)     // Catch: java.lang.Exception -> L3e
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Exception -> L3e
            java.lang.String r3 = "\n"
            java.lang.String[] r1 = r1.split(r3)     // Catch: java.lang.Exception -> L3e
            int r3 = r1.length     // Catch: java.lang.Exception -> L3e
            r4 = r2
        L29:
            if (r4 >= r3) goto L39
            r5 = r1[r4]     // Catch: java.lang.Exception -> L3e
            java.lang.String r6 = "VmSize"
            boolean r6 = r5.startsWith(r6)     // Catch: java.lang.Exception -> L3e
            if (r6 == 0) goto L36
            goto L40
        L36:
            int r4 = r4 + 1
            goto L29
        L39:
            r3 = 12
            r5 = r1[r3]     // Catch: java.lang.Exception -> L3e
            goto L40
        L3e:
            java.lang.String r5 = ""
        L40:
            java.util.regex.Matcher r0 = r0.matcher(r5)
            boolean r1 = r0.find()
            if (r1 == 0) goto L57
            java.lang.String r0 = r0.group()
            int r0 = com.tencent.mm.sdk.platformtools.t8.D1(r0, r2)
            long r0 = (long) r0
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            return r0
        L57:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.performance.elf.AbstractProcessChecker.f():long");
    }

    public abstract long a();

    public java.lang.String c() {
        long nativeHeapAllocatedSize = android.os.Debug.getNativeHeapAllocatedSize();
        if (nativeHeapAllocatedSize == 0) {
            nativeHeapAllocatedSize = android.os.Debug.getNativeHeapSize() - android.os.Debug.getNativeHeapFreeSize();
        }
        return java.lang.String.format("ProcessEfl found exception!kill process[%s] %s %s %s", java.lang.Integer.valueOf(android.os.Process.myPid()), java.lang.Long.valueOf(f()), java.lang.Long.valueOf(nativeHeapAllocatedSize), java.lang.Long.valueOf(java.lang.Runtime.getRuntime().totalMemory()));
    }

    public java.lang.String e() {
        return "AbstractProcessChecker";
    }

    public abstract boolean g();

    public boolean h() {
        android.app.ActivityManager activityManager = (android.app.ActivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (activityManager == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AbstractProcessChecker", "[isHighPriorityProcess] mActivityManager is null.");
            return false;
        }
        java.util.List<android.app.ActivityManager.RunningServiceInfo> runningServices = activityManager.getRunningServices(50);
        if (runningServices != null) {
            for (android.app.ActivityManager.RunningServiceInfo runningServiceInfo : runningServices) {
                if (runningServiceInfo.foreground) {
                    com.tencent.mars.xlog.Log.i(e(), "foreground service:%s process:%s ", runningServiceInfo.service, runningServiceInfo.process);
                    return true;
                }
            }
        }
        return false;
    }

    public void i() {
        if (this.f152965i || this.f152958b.f455921f) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AbstractProcessChecker", "pass this kill! app is on foreground!");
            jx3.f.INSTANCE.idkeyStat(959L, 6L, 1L, true);
            o(false);
            return;
        }
        try {
            pb0.g.b(new yz5.p() { // from class: xp3.a$$a
                @Override // yz5.p
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    java.lang.String str = (java.lang.String) obj;
                    pb0.a aVar = (pb0.a) obj2;
                    com.tencent.mm.plugin.performance.elf.AbstractProcessChecker abstractProcessChecker = com.tencent.mm.plugin.performance.elf.AbstractProcessChecker.this;
                    abstractProcessChecker.f152959c += aVar.size();
                    abstractProcessChecker.f152960d += aVar.a();
                    if (abstractProcessChecker.f152961e == null) {
                        abstractProcessChecker.f152961e = str;
                        abstractProcessChecker.f152962f = aVar.size();
                        abstractProcessChecker.f152963g = aVar.a();
                    }
                    com.tencent.mars.xlog.Log.i("DUMP_BITMAP.kill", "count: %s, sum byte count: %s, %s\n trace: %s", java.lang.Integer.valueOf(aVar.size()), java.lang.Long.valueOf(aVar.a()), aVar, str);
                    return null;
                }
            });
            long freeMemory = java.lang.Runtime.getRuntime().totalMemory() - java.lang.Runtime.getRuntime().freeMemory();
            long nativeHeapAllocatedSize = android.os.Debug.getNativeHeapAllocatedSize();
            if (nativeHeapAllocatedSize == 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AbstractProcessChecker", "fallback getting native heap");
                nativeHeapAllocatedSize = android.os.Debug.getNativeHeapSize() - android.os.Debug.getNativeHeapFreeSize();
            }
            lr0.b.f320626d.a(true, 400, new yz5.l() { // from class: xp3.a$$b
                @Override // yz5.l
                public final java.lang.Object invoke(java.lang.Object obj) {
                    int i17 = com.tencent.mm.plugin.performance.elf.AbstractProcessChecker.f152956j;
                    com.tencent.mm.plugin.performance.elf.AbstractProcessChecker abstractProcessChecker = com.tencent.mm.plugin.performance.elf.AbstractProcessChecker.this;
                    abstractProcessChecker.getClass();
                    abstractProcessChecker.f152964h = (java.lang.String) obj;
                    return null;
                }
            });
            xp3.j.a(freeMemory, nativeHeapAllocatedSize, this.f152959c, this.f152960d, this.f152961e, this.f152962f, this.f152963g, this.f152964h);
            com.tencent.mars.xlog.Log.i("DUMP_BITMAP.kill", "total bitmap count = %s, size = %s", java.lang.Integer.valueOf(this.f152959c), java.lang.Long.valueOf(this.f152960d));
            if (!ih.a.f(e42.d0.clicfg_matrix_memory_trigger_mem_hook_enable, true)) {
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            }
            vp3.c cVar = (vp3.c) tp3.a.INSTANCE.a(vp3.c.class);
            if (cVar.f438973g.e()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.triggers.MemoryHook", "MemoryHookTrigger: ");
                cVar.y(400);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AbstractProcessChecker", th6, "", new java.lang.Object[0]);
        }
        o(true);
        com.tencent.mars.xlog.Log.e("MicroMsg.AbstractProcessChecker", "[MAPPINGS]");
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.FileReader("/proc/" + android.os.Process.myPid() + "/maps"), 1024);
            while (true) {
                try {
                    java.lang.String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    } else {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AbstractProcessChecker", readLine);
                    }
                } finally {
                }
            }
            bufferedReader.close();
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AbstractProcessChecker", e17, "Cannot print maps file.", new java.lang.Object[0]);
        }
        com.tencent.mars.xlog.Log.appenderFlush();
        throw new java.lang.RuntimeException(c());
    }

    public void j(boolean z17) {
        this.f152965i = z17;
    }

    public void k(int i17, int i18) {
    }

    public abstract boolean l(long j17, long j18);

    public abstract void m();

    public abstract void n();

    public final void o(boolean z17) {
        com.tencent.mm.plugin.performance.elf.ElfCheckResponse elfCheckResponse = new com.tencent.mm.plugin.performance.elf.ElfCheckResponse(g(), a(), z17, !(this instanceof com.tencent.mm.plugin.performance.elf.ToolProcessChecker), bm5.f1.a(), com.tencent.mm.plugin.performance.elf.ElfCallUpReceiver.class.getName(), 1000L);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("processId", android.os.Process.myPid());
        elfCheckResponse.f152976o = bundle;
        android.content.Intent intent = new android.content.Intent("ACTION_ELF_CHECK_RESPONSE");
        intent.putExtra("MicroMsg.ElfCheckResponse", elfCheckResponse);
        com.tencent.mm.sdk.platformtools.x2.f193071a.sendBroadcast(intent);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        if ("ACTION_ELF_CHECK".equals(intent.getAction())) {
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.f152957a;
            if (n3Var == null || n3Var.isQuit()) {
                this.f152957a = new com.tencent.mm.sdk.platformtools.n3("ProcessChecker");
            }
            this.f152957a.post(new xp3.b(this, intent));
            return;
        }
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            m();
        } else if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
            n();
        }
    }
}
