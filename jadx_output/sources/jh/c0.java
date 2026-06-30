package jh;

/* loaded from: classes13.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f299673a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashSet f299674b;

    /* renamed from: c, reason: collision with root package name */
    public jh.d0 f299675c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f299676d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f299677e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f299678f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f299679g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f299680h;

    /* renamed from: i, reason: collision with root package name */
    public final jh.f0 f299681i;

    /* renamed from: j, reason: collision with root package name */
    public final long f299682j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f299683k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f299684l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f299685m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f299686n;

    /* renamed from: o, reason: collision with root package name */
    public final jh.g0 f299687o;

    public c0(android.content.Context context, jh.g0 g0Var) {
        java.lang.String str;
        java.util.HashSet hashSet = new java.util.HashSet();
        this.f299674b = hashSet;
        this.f299675c = jh.d0.Quicken;
        this.f299676d = false;
        this.f299677e = false;
        this.f299678f = true;
        this.f299679g = false;
        this.f299680h = true;
        this.f299681i = jh.f0.WhileScreenOff;
        this.f299682j = 3000L;
        this.f299683k = false;
        this.f299684l = false;
        this.f299685m = null;
        this.f299686n = false;
        this.f299673a = context;
        this.f299687o = g0Var;
        hashSet.add(context.getApplicationInfo().nativeLibraryDir);
        hashSet.add(jh.g0.b());
        hashSet.add(jh.g0.a(context));
        synchronized (jh.a.class) {
            if (jh.a.f299667a == null) {
                jh.a.f299667a = jh.a.a(context, android.os.Process.myPid());
            }
            str = jh.a.f299667a;
        }
        this.f299679g = context.getPackageName().equalsIgnoreCase(str);
    }

    public void a() {
        java.lang.String str;
        if (this.f299686n) {
            return;
        }
        this.f299686n = true;
        jh.g0 g0Var = this.f299687o;
        g0Var.getClass();
        android.content.Context context = this.f299673a;
        synchronized (jh.a.class) {
            if (jh.a.f299667a == null) {
                jh.a.f299667a = jh.a.a(context, android.os.Process.myPid());
            }
            str = jh.a.f299667a;
        }
        if (str != null && str.endsWith(":backtrace__")) {
            oj.j.c("Matrix.Backtrace", "Isolate process does not need any configuration.", new java.lang.Object[0]);
            return;
        }
        if (!jh.g0.f299704g) {
            jh.g0.d();
            jh.g0.f299704g = true;
        }
        com.tencent.matrix.xlog.XLogNative.a(this.f299685m);
        com.tencent.matrix.backtrace.WeChatBacktraceNative.enableLogger(this.f299683k);
        oj.j.c("Matrix.Backtrace", toString(), new java.lang.Object[0]);
        jh.d0 d0Var = this.f299675c;
        jh.d0 d0Var2 = jh.d0.Fp;
        if (d0Var == d0Var2 || d0Var == jh.d0.Dwarf) {
            com.tencent.matrix.backtrace.WeChatBacktraceNative.setBacktraceMode(d0Var.f299695d);
        }
        jh.d0 d0Var3 = this.f299675c;
        jh.d0 d0Var4 = jh.d0.Quicken;
        if (d0Var3 == d0Var4 || d0Var3 == jh.d0.FpUntilQuickenWarmedUp || d0Var3 == jh.d0.DwarfUntilQuickenWarmedUp || this.f299677e) {
            java.lang.String b17 = jh.a0.b(this);
            oj.j.c("Matrix.Backtrace", "Set saving path: %s", b17);
            new java.io.File(b17).mkdirs();
            java.lang.String str2 = java.io.File.separator;
            if (!b17.endsWith(str2)) {
                b17 = b17 + str2;
            }
            g0Var.f299708d.f299726b = b17;
            com.tencent.matrix.backtrace.WeChatBacktraceNative.setSavingPath(b17);
            if (this.f299679g) {
                android.content.Context context2 = this.f299673a;
                java.io.File l17 = jh.a0.l(context2);
                if (this.f299678f && l17.exists()) {
                    java.lang.String h17 = jh.a0.h(l17, 4096);
                    if (h17 == null) {
                        this.f299676d = true;
                    } else if (!h17.split("\n")[0].equalsIgnoreCase(context2.getApplicationInfo().nativeLibraryDir)) {
                        oj.j.c("Matrix.Backtrace", "Apk updated, remove warmed-up file.", new java.lang.Object[0]);
                        this.f299676d = true;
                    }
                }
                if (this.f299676d) {
                    l17.delete();
                    jh.a0.j(context2).delete();
                }
            }
            jh.m mVar = g0Var.f299708d;
            synchronized (mVar.f299731g) {
                boolean[] zArr = mVar.f299731g;
                if (!zArr[0]) {
                    zArr[0] = true;
                    mVar.f299730f = this;
                    mVar.f299725a = this.f299680h;
                    mVar.f299728d = new jh.k("WeChatBacktraceTask");
                    mVar.f299729e = new jh.t(mVar, this.f299673a, this.f299681i, this.f299682j);
                    if (this.f299679g) {
                        android.content.Context context3 = this.f299673a;
                        if (!jh.a0.l(context3).exists()) {
                            oj.j.c("Matrix.WarmUpDelegate", "Has not been warmed up", new java.lang.Object[0]);
                            jh.t tVar = mVar.f299729e;
                            tVar.f299755f.post(new jh.q(tVar, jh.s.WarmUp));
                        }
                        if (jh.a0.g(context3)) {
                            oj.j.c("Matrix.WarmUpDelegate", "Need clean up", new java.lang.Object[0]);
                            jh.t tVar2 = mVar.f299729e;
                            tVar2.f299755f.post(new jh.q(tVar2, jh.s.CleanUp));
                        }
                        if (jh.a0.i(context3)) {
                            oj.j.c("Matrix.WarmUpDelegate", "Should schedule disk usage task.", new java.lang.Object[0]);
                            jh.t tVar3 = mVar.f299729e;
                            tVar3.f299755f.post(new jh.q(tVar3, jh.s.DiskUsage));
                        }
                    }
                }
            }
            boolean exists = jh.a0.l(this.f299673a).exists();
            jh.d0 d0Var5 = this.f299675c;
            if (d0Var5 == d0Var4 || !this.f299677e) {
                if (!exists) {
                    if (d0Var5 != jh.d0.FpUntilQuickenWarmedUp) {
                        if (d0Var5 == jh.d0.DwarfUntilQuickenWarmedUp) {
                            d0Var2 = jh.d0.Dwarf;
                        }
                    }
                    com.tencent.matrix.backtrace.WeChatBacktraceNative.setBacktraceMode(d0Var2.f299695d);
                }
                d0Var2 = d0Var4;
                com.tencent.matrix.backtrace.WeChatBacktraceNative.setBacktraceMode(d0Var2.f299695d);
            }
            oj.j.c("Matrix.Backtrace", "Has warmed up: %s", java.lang.Boolean.valueOf(exists));
            com.tencent.matrix.backtrace.WeChatBacktraceNative.setWarmedUp(exists);
            if (!g0Var.f299710f) {
                g0Var.f299710f = false;
                g0Var.f299709e.postDelayed(new jh.b0(g0Var), 21600000L);
            }
            if (!this.f299679g) {
                jh.m mVar2 = g0Var.f299708d;
                jh.d0 d0Var6 = this.f299675c;
                synchronized (mVar2) {
                    if (!jh.a0.l(this.f299673a).exists()) {
                        if (mVar2.f299727c == null) {
                            mVar2.f299727c = new jh.l(d0Var6);
                            oj.j.c("Matrix.WarmUpDelegate", "Register warm-up receiver.", new java.lang.Object[0]);
                            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                            intentFilter.addAction("action.backtrace.warmed-up");
                            if (android.os.Build.VERSION.SDK_INT < 33 || this.f299673a.getApplicationInfo().targetSdkVersion < 34) {
                                this.f299673a.registerReceiver(mVar2.f299727c, intentFilter, this.f299673a.getPackageName() + ".backtrace.warmed_up", null);
                            } else {
                                this.f299673a.registerReceiver(mVar2.f299727c, intentFilter, this.f299673a.getPackageName() + ".backtrace.warmed_up", null, 4);
                            }
                        }
                    }
                }
            }
        }
        g0Var.f299706b = true;
    }

    public java.lang.String toString() {
        return "\nWeChat backtrace configurations: \n>>> Backtrace Mode: " + this.f299675c + "\n>>> Quicken always on: " + this.f299677e + "\n>>> Saving Path: " + jh.a0.b(this) + "\n>>> Custom Library Loader: false\n>>> Directories to Warm-up: " + this.f299674b.toString() + "\n>>> Is Warm-up Process: " + this.f299679g + "\n>>> Warm-up Timing: " + this.f299681i + "\n>>> Warm-up Delay: " + this.f299682j + "ms\n>>> Warm-up in isolate process: " + this.f299680h + "\n>>> Enable logger: " + this.f299683k + "\n>>> Enable Isolate Process logger: " + this.f299684l + "\n>>> Path of XLog: " + this.f299685m + "\n>>> Cool-down: " + this.f299676d + "\n>>> Cool-down if Apk Updated: " + this.f299678f + "\n";
    }
}
