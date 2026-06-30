package com.tencent.mm.plugin.performance.elf;

/* loaded from: classes12.dex */
public class MainProcessChecker extends com.tencent.mm.plugin.performance.elf.AbstractProcessChecker {
    public static final long[] F = {0, 86400000};
    public static java.lang.String G = "";
    public long B;

    /* renamed from: v, reason: collision with root package name */
    public long f152988v;

    /* renamed from: w, reason: collision with root package name */
    public long f152989w;

    /* renamed from: x, reason: collision with root package name */
    public long f152990x;

    /* renamed from: y, reason: collision with root package name */
    public long f152991y;

    /* renamed from: z, reason: collision with root package name */
    public long f152992z;

    /* renamed from: k, reason: collision with root package name */
    public long f152977k = 1048576;

    /* renamed from: l, reason: collision with root package name */
    public long f152978l = androidx.camera.core.RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS;

    /* renamed from: m, reason: collision with root package name */
    public final long f152979m = 734003200;

    /* renamed from: n, reason: collision with root package name */
    public long f152980n = 734003200;

    /* renamed from: o, reason: collision with root package name */
    public final int f152981o = 92;

    /* renamed from: p, reason: collision with root package name */
    public float f152982p = 92 * 0.01f;

    /* renamed from: q, reason: collision with root package name */
    public final int f152983q = 85;

    /* renamed from: r, reason: collision with root package name */
    public float f152984r = 85 * 0.01f;

    /* renamed from: s, reason: collision with root package name */
    public boolean f152985s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f152986t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f152987u = false;
    public int A = 1;
    public final java.lang.StringBuilder C = new java.lang.StringBuilder();
    public boolean D = false;
    public long E = 0;

    @Override // com.tencent.mm.plugin.performance.elf.AbstractProcessChecker
    public long a() {
        return this.B;
    }

    @Override // com.tencent.mm.plugin.performance.elf.AbstractProcessChecker
    public java.lang.String c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(this.C);
        sb6.append(super.c());
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.ThreadGroup threadGroup = android.os.Looper.getMainLooper().getThread().getThreadGroup();
        java.lang.Thread[] threadArr = new java.lang.Thread[threadGroup.activeCount() * 2];
        int enumerate = threadGroup.enumerate(threadArr);
        int i17 = 0;
        for (int i18 = 0; i18 < enumerate; i18++) {
            java.lang.String name = threadArr[i18].getName();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(name)) {
                java.lang.String replaceAll = name.replaceAll("-?[0-9]\\d*", "?");
                if (hashMap.containsKey(replaceAll)) {
                    hashMap.put(replaceAll, java.lang.Integer.valueOf(((java.lang.Integer) hashMap.get(replaceAll)).intValue() + 1));
                } else {
                    hashMap.put(replaceAll, 1);
                }
                i17++;
            }
        }
        if (i17 >= 300) {
            sb6.append("threadCount:");
            sb6.append(i17);
            sb6.append("\n");
            sb6.append(hashMap.toString());
            sb6.append("\n");
            jx3.f.INSTANCE.idkeyStat(959L, 8L, 1L, true);
        }
        return sb6.toString();
    }

    @Override // com.tencent.mm.plugin.performance.elf.AbstractProcessChecker
    public java.lang.String e() {
        return "MicroMsg.MainProcessChecker";
    }

    @Override // com.tencent.mm.plugin.performance.elf.AbstractProcessChecker
    public boolean g() {
        return this.f152985s;
    }

    @Override // com.tencent.mm.plugin.performance.elf.AbstractProcessChecker
    public void j(boolean z17) {
        this.f152965i = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.MainProcessChecker", "[onAppForeground] isForeground:%s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            return;
        }
        this.E = android.os.SystemClock.uptimeMillis();
    }

    @Override // com.tencent.mm.plugin.performance.elf.AbstractProcessChecker
    public void k(int i17, int i18) {
        com.tencent.mars.xlog.Log.w(e(), "[onCallUp] %s -> %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            jx3.f.INSTANCE.idkeyStat(959L, 1L, 1L, true);
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.f152957a;
            if (n3Var == null || n3Var.isQuit()) {
                this.f152957a = new com.tencent.mm.sdk.platformtools.n3("ProcessChecker");
            }
            this.f152957a.postDelayed(new xp3.h(this), 30000L);
        }
    }

    @Override // com.tencent.mm.plugin.performance.elf.AbstractProcessChecker
    public boolean l(long j17, long j18) {
        xp3.c cVar = this.f152958b;
        this.f152985s = true;
        com.tencent.mars.xlog.Log.i(e(), "[onCheck] processId:%s loopCheckTime:%sms isForeground:%s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Boolean.valueOf(this.f152965i));
        boolean z17 = false;
        try {
            if (!this.f152985s) {
                this.A |= 0;
            } else if (!d95.f.f227669o) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(cVar.f455919d)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.MainProcessChecker", "it's never start activity! just return.");
                    this.A |= 2;
                } else if (this.f152965i) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.MainProcessChecker", "isForeground true! just return.");
                    this.A |= 4;
                } else {
                    if (android.os.SystemClock.uptimeMillis() - this.E >= j18) {
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        java.util.Calendar calendar = java.util.Calendar.getInstance();
                        calendar.set(11, 0);
                        calendar.set(13, 0);
                        calendar.set(12, 0);
                        calendar.set(14, 0);
                        long timeInMillis = currentTimeMillis - calendar.getTimeInMillis();
                        xp3.o oVar = xp3.o.f455931c;
                        long[] jArr = F;
                        long j19 = jArr[0];
                        if (j19 <= timeInMillis && timeInMillis <= jArr[1]) {
                            if (this.f152987u) {
                                if (!(!this.f152965i && G.equalsIgnoreCase(cVar.f455919d))) {
                                    com.tencent.mars.xlog.Log.w("MicroMsg.MainProcessChecker", "it cares if it whether LauncherUI to back but it's not, just return.");
                                    this.A |= 16;
                                }
                            }
                            if (h()) {
                                this.A |= 32;
                            } else {
                                if (this.f152986t) {
                                    long j27 = this.f152988v;
                                    long j28 = com.tencent.mm.sdk.platformtools.j8.f192784o;
                                    if (j28 > j27) {
                                        j27 = j28;
                                    }
                                    long b17 = com.tencent.mm.sdk.platformtools.j8.b(this.f152989w);
                                    long j29 = this.f152990x;
                                    long j37 = com.tencent.mm.sdk.platformtools.j8.f192786q;
                                    if (j37 > j29) {
                                        j29 = j37;
                                    }
                                    long b18 = j27 + b17 + j29 + com.tencent.mm.sdk.platformtools.j8.b(this.f152991y);
                                    com.tencent.mars.xlog.Log.i(e(), "[isTraffic] diff:%s byte", java.lang.Long.valueOf(b18));
                                    if (((float) b18) > ((((float) j18) * 1.0f) / 60000.0f) * ((float) this.f152977k)) {
                                        this.A |= 512;
                                        com.tencent.mars.xlog.Log.i(e(), "is over Traffic, just return");
                                    }
                                }
                                if (this.f152986t) {
                                    long b19 = com.tencent.mm.plugin.performance.elf.AbstractProcessChecker.b() - this.f152992z;
                                    com.tencent.mars.xlog.Log.i(e(), "[isCpuBusy] diff:%s Jiffies", java.lang.Long.valueOf(b19));
                                    if (((float) b19) >= ((((float) j18) * 1.0f) / 60000.0f) * ((float) this.f152978l)) {
                                        this.A |= 1024;
                                        com.tencent.mars.xlog.Log.i(e(), "is cpu busy, just return");
                                    }
                                }
                                z17 = p();
                            }
                        } else {
                            com.tencent.mars.xlog.Log.w("MicroMsg.MainProcessChecker", "it's not at workTime[%s-%s], just return.", java.lang.Long.valueOf(j19), java.lang.Long.valueOf(jArr[1]));
                            this.A |= 8;
                        }
                    } else {
                        com.tencent.mars.xlog.Log.w("MicroMsg.MainProcessChecker", "it's not enough loopCheckTime[%s], just return.", java.lang.Long.valueOf(j18));
                        this.A |= 4;
                    }
                }
            }
            return z17;
        } finally {
            s();
            r(false);
            this.A = 1;
        }
    }

    @Override // com.tencent.mm.plugin.performance.elf.AbstractProcessChecker
    public void m() {
        com.tencent.mars.xlog.Log.i(e(), "onScreenOff enable:%s", java.lang.Boolean.valueOf(this.f152985s));
        if (this.f152985s) {
            xp3.o oVar = xp3.o.f455931c;
            if (this.D || h() || com.tencent.mm.plugin.performance.elf.AbstractProcessChecker.f() < 3.99431958528E9d) {
                return;
            }
            ((ku5.t0) ku5.t0.f312615d).l(new xp3.g(this), java.util.concurrent.TimeUnit.MINUTES.toMillis(1L), "TAG_KILLING_DELAY");
        }
    }

    @Override // com.tencent.mm.plugin.performance.elf.AbstractProcessChecker
    public void n() {
        ((ku5.t0) ku5.t0.f312615d).A("TAG_KILLING_DELAY");
    }

    public final boolean p() {
        boolean z17;
        float maxMemory = (((float) java.lang.Runtime.getRuntime().totalMemory()) * 1.0f) / ((float) java.lang.Runtime.getRuntime().maxMemory());
        com.tencent.mars.xlog.Log.i(e(), "[isOverMemory] java[%s:%s]", java.lang.Float.valueOf(maxMemory), java.lang.Float.valueOf(this.f152984r));
        if (maxMemory >= this.f152984r) {
            this.A |= 64;
            z17 = true;
        } else {
            z17 = false;
        }
        if (!this.D) {
            float f17 = (((float) com.tencent.mm.plugin.performance.elf.AbstractProcessChecker.f()) * 1.0f) / 4.2949673E9f;
            com.tencent.mars.xlog.Log.i(e(), "[isOverMemory] vm[%s:%s]", java.lang.Float.valueOf(f17), java.lang.Float.valueOf(this.f152982p));
            if (f17 >= this.f152982p) {
                this.A |= 256;
                z17 = true;
            }
        }
        long nativeHeapAllocatedSize = android.os.Debug.getNativeHeapAllocatedSize();
        if (nativeHeapAllocatedSize <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MainProcessChecker", "fallback: native AllocatedSize = 0");
            nativeHeapAllocatedSize = android.os.Debug.getNativeHeapSize() - android.os.Debug.getNativeHeapFreeSize();
        }
        com.tencent.mars.xlog.Log.w(e(), "[isOverMemory] native[%s:%s]", java.lang.Long.valueOf(nativeHeapAllocatedSize), java.lang.Long.valueOf(this.f152980n));
        if (!(nativeHeapAllocatedSize > this.f152980n)) {
            return z17;
        }
        this.A |= 128;
        return true;
    }

    public final boolean q(int i17, int i18) {
        return (i17 & i18) > 0;
    }

    public final void r(boolean z17) {
        if (com.tencent.mm.sdk.platformtools.x2.n() && this.f152985s) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (z17) {
                com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey();
                iDKey.SetID(959);
                iDKey.SetKey(0);
                iDKey.SetValue(1L);
                arrayList.add(iDKey);
                com.tencent.mars.smc.IDKey iDKey2 = new com.tencent.mars.smc.IDKey();
                iDKey2.SetID(959);
                iDKey2.SetKey(2);
                iDKey2.SetValue(1L);
                arrayList.add(iDKey2);
                if (q(this.A, 64)) {
                    com.tencent.mars.smc.IDKey iDKey3 = new com.tencent.mars.smc.IDKey();
                    iDKey3.SetID(959);
                    iDKey3.SetKey(3);
                    iDKey3.SetValue(1L);
                    arrayList.add(iDKey3);
                }
                if (q(this.A, 256)) {
                    com.tencent.mars.smc.IDKey iDKey4 = new com.tencent.mars.smc.IDKey();
                    iDKey4.SetID(959);
                    iDKey4.SetKey(4);
                    iDKey4.SetValue(1L);
                    arrayList.add(iDKey4);
                }
                if (q(this.A, 128)) {
                    com.tencent.mars.smc.IDKey iDKey5 = new com.tencent.mars.smc.IDKey();
                    iDKey5.SetID(959);
                    iDKey5.SetKey(5);
                    iDKey5.SetValue(1L);
                    arrayList.add(iDKey5);
                }
            } else {
                com.tencent.mars.smc.IDKey iDKey6 = new com.tencent.mars.smc.IDKey();
                iDKey6.SetID(959);
                iDKey6.SetValue(1L);
                arrayList.add(iDKey6);
                if (q(this.A, 8)) {
                    iDKey6.SetKey(100);
                } else if (q(this.A, 16)) {
                    iDKey6.SetKey(101);
                } else if (q(this.A, 32)) {
                    iDKey6.SetKey(102);
                } else if (q(this.A, 512)) {
                    iDKey6.SetKey(103);
                } else if (q(this.A, 1024)) {
                    iDKey6.SetKey(104);
                } else if (q(this.A, 64) || q(this.A, 128) || q(this.A, 256)) {
                    iDKey6.SetKey(105);
                } else {
                    arrayList.remove(iDKey6);
                }
            }
            com.tencent.mars.smc.IDKey iDKey7 = new com.tencent.mars.smc.IDKey();
            iDKey7.SetID(959);
            iDKey7.SetValue(1L);
            arrayList.add(iDKey7);
            if (q(this.A, 4)) {
                iDKey7.SetKey(106);
            } else {
                iDKey7.SetKey(107);
            }
            jx3.f.INSTANCE.b(arrayList, false);
        }
    }

    public final void s() {
        long j17 = com.tencent.mm.sdk.platformtools.j8.f192784o;
        if (j17 <= 0) {
            j17 = 0;
        }
        this.f152988v = j17;
        this.f152989w = com.tencent.mm.sdk.platformtools.j8.b(0L);
        long j18 = com.tencent.mm.sdk.platformtools.j8.f192786q;
        if (j18 <= 0) {
            j18 = 0;
        }
        this.f152990x = j18;
        long j19 = com.tencent.mm.sdk.platformtools.j8.f192787r;
        this.f152991y = j19 > 0 ? j19 : 0L;
        this.f152992z = com.tencent.mm.plugin.performance.elf.AbstractProcessChecker.b();
    }
}
