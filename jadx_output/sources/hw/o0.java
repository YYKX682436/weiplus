package hw;

/* loaded from: classes7.dex */
public abstract class o0 extends i95.w {

    /* renamed from: e, reason: collision with root package name */
    public hw.c0 f285409e;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.feature.brandecs.flutter.magicbrush.biz.MagicEcsTLBaseFeatureService$preCleanFileEvent$1 f285417p;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f285408d = jz5.h.b(new hw.j0(this));

    /* renamed from: f, reason: collision with root package name */
    public long f285410f = -1;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f285411g = jz5.h.b(new hw.l0(this));

    /* renamed from: h, reason: collision with root package name */
    public boolean f285412h = true;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Runnable f285413i = new hw.h0(this);

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f285414m = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Runnable f285415n = new hw.f0(this);

    /* renamed from: o, reason: collision with root package name */
    public final hw.g0 f285416o = new hw.g0(this);

    /* JADX WARN: Type inference failed for: r1v1, types: [com.tencent.mm.feature.brandecs.flutter.magicbrush.biz.MagicEcsTLBaseFeatureService$preCleanFileEvent$1] */
    public o0() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f285417p = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BeforeAggressiveCleanCacheEvent>(a0Var) { // from class: com.tencent.mm.feature.brandecs.flutter.magicbrush.biz.MagicEcsTLBaseFeatureService$preCleanFileEvent$1
            {
                this.__eventId = 1489935310;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.BeforeAggressiveCleanCacheEvent beforeAggressiveCleanCacheEvent) {
                com.tencent.mm.autogen.events.BeforeAggressiveCleanCacheEvent event = beforeAggressiveCleanCacheEvent;
                kotlin.jvm.internal.o.g(event, "event");
                ((ku5.t0) ku5.t0.f312615d).B(new hw.k0(event, hw.o0.this));
                return false;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String ij() {
        return "MicroMsg.MagicEcsTLBaseFeatureService." + Ni();
    }

    public static final boolean wi(hw.o0 o0Var) {
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M(o0Var.Vi());
        int o17 = M.o("crashCount", 0);
        long q17 = M.q("lastCrashTimeStamp", -1L);
        int o18 = M.o("lastCrashVersion", -1);
        com.tencent.mars.xlog.Log.i(o0Var.ij(), "hy: stability log: crashCount: " + o17 + ", lastCrashTimeStamp: " + q17 + ", lastCrashVersion: " + o18);
        jz5.g gVar = o0Var.f285411g;
        boolean z17 = q17 != -1 && (android.os.SystemClock.elapsedRealtime() - q17) / ((long) 1000) > ((hw.e0) ((jz5.n) gVar).getValue()).f285372c;
        boolean z18 = (o18 == -1 || o18 == o45.wf.f343029g) ? false : true;
        if (!z17 && !z18) {
            return o17 < ((hw.e0) ((jz5.n) gVar).getValue()).f285371b;
        }
        com.tencent.mars.xlog.Log.i(o0Var.ij(), "hy: recover status because shouldRecoverForTimeout " + z17 + ", shouldRecoverForVersion " + z18);
        com.tencent.mm.sdk.platformtools.o4 M2 = com.tencent.mm.sdk.platformtools.o4.M(o0Var.Vi());
        M2.A("crashCount", 0);
        M2.B("lastCrashTimeStamp", -1L);
        M2.A("lastCrashVersion", -1);
        return true;
    }

    public final synchronized boolean Bi(int i17) {
        if (!((java.lang.Boolean) ((jz5.n) this.f285408d).getValue()).booleanValue()) {
            com.tencent.mars.xlog.Log.e(ij(), "create not open!");
            return false;
        }
        this.f285414m.removeCallbacksAndMessages(null);
        if (this.f285412h && !gw.k.f276128a.contains(java.lang.Integer.valueOf(i17))) {
            com.tencent.mars.xlog.Log.i(ij(), "canDestroy set to false, scene: " + i17);
            this.f285412h = false;
        }
        if (this.f285412h) {
            java.lang.Runnable task = this.f285413i;
            kotlin.jvm.internal.o.g(task, "task");
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.f285414m;
            n3Var.removeCallbacksAndMessages(null);
            n3Var.postDelayed(task, 60000L);
        }
        if (this.f285409e != null) {
            com.tencent.mars.xlog.Log.e(ij(), "has created, skip biz create, scene: " + i17);
            return false;
        }
        com.tencent.mars.xlog.Log.i(ij(), "createBrandServiceBiz scene:" + i17);
        this.f285409e = Di(i17);
        return true;
    }

    public abstract hw.c0 Di(int i17);

    public synchronized void K6(int i17) {
        if (this.f285409e == null) {
            com.tencent.mars.xlog.Log.i(ij(), "destroyBrandServiceBiz hasDestroy");
            return;
        }
        this.f285410f = -1L;
        com.tencent.mars.xlog.Log.i(ij(), "destroyBrandServiceBiz " + i17);
        hw.c0 c0Var = this.f285409e;
        if (c0Var != null) {
            c0Var.destroy();
        }
        this.f285409e = null;
        this.f285412h = true;
    }

    public abstract java.lang.String Ni();

    public abstract java.lang.String Ri();

    public abstract dq0.a0 Ui();

    public final java.lang.String Vi() {
        return "MagicBrushBrandStability_" + Ni();
    }

    public abstract boolean Zi();

    public abstract boolean aj();

    public synchronized void bj(java.lang.String eventName) {
        java.lang.String gVar;
        kotlin.jvm.internal.o.g(eventName, "eventName");
        if (!((java.lang.Boolean) ((jz5.n) this.f285408d).getValue()).booleanValue()) {
            com.tencent.mars.xlog.Log.e(ij(), "dispatch event not open!");
            return;
        }
        com.tencent.mars.xlog.Log.i(ij(), "notifyStateChange ".concat(eventName));
        if (kotlin.jvm.internal.o.b(eventName, "brandServiceBoxClick")) {
            cl0.g gVar2 = new cl0.g();
            gVar2.h("eventName", eventName);
            gVar2.p(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, java.lang.System.currentTimeMillis());
            gVar = gVar2.toString();
        } else {
            cl0.g gVar3 = new cl0.g();
            gVar3.h("eventName", eventName);
            gVar = gVar3.toString();
        }
        kotlin.jvm.internal.o.d(gVar);
        ij();
        hw.i0 i0Var = new hw.i0(this, gVar);
        if (kotlin.jvm.internal.o.b(eventName, "brandServiceBoxClick")) {
            Bi(7);
            dq0.a0 Ui = Ui();
            synchronized (Ui) {
                if (Ui.f242292h) {
                    i0Var.run();
                } else {
                    Ui.f242293i.add(i0Var);
                }
            }
        } else {
            i0Var.run();
        }
    }

    public abstract void cj();

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055 A[Catch: all -> 0x00dc, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:10:0x0013, B:12:0x0017, B:15:0x0027, B:17:0x0031, B:20:0x004b, B:22:0x0055, B:24:0x0064, B:26:0x0068, B:27:0x0070, B:29:0x0074, B:30:0x0077, B:32:0x0084, B:33:0x008e, B:37:0x0093, B:38:0x00db), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093 A[Catch: all -> 0x00dc, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:10:0x0013, B:12:0x0017, B:15:0x0027, B:17:0x0031, B:20:0x004b, B:22:0x0055, B:24:0x0064, B:26:0x0068, B:27:0x0070, B:29:0x0074, B:30:0x0077, B:32:0x0084, B:33:0x008e, B:37:0x0093, B:38:0x00db), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void fj() {
        /*
            r8 = this;
            java.lang.String r0 = "has crashed for "
            monitor-enter(r8)
            hw.c0 r1 = r8.f285409e     // Catch: java.lang.Throwable -> Ldc
            if (r1 != 0) goto L13
            java.lang.String r0 = r8.ij()     // Catch: java.lang.Throwable -> Ldc
            java.lang.String r1 = "service already destroyed"
            com.tencent.mars.xlog.Log.w(r0, r1)     // Catch: java.lang.Throwable -> Ldc
            monitor-exit(r8)
            return
        L13:
            boolean r1 = com.tencent.mm.storage.c2.f193805c     // Catch: java.lang.Throwable -> Ldc
            if (r1 != 0) goto L27
            java.lang.String r0 = r8.ij()     // Catch: java.lang.Throwable -> Ldc
            java.lang.String r1 = "recreateBrandServiceBiz but not inBox, just destroy"
            com.tencent.mars.xlog.Log.w(r0, r1)     // Catch: java.lang.Throwable -> Ldc
            r0 = 3
            r8.K6(r0)     // Catch: java.lang.Throwable -> Ldc
            monitor-exit(r8)
            return
        L27:
            long r1 = r8.f285410f     // Catch: java.lang.Throwable -> Ldc
            r3 = -1
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L4a
            boolean r3 = com.tencent.mm.sdk.platformtools.t8.f192989a     // Catch: java.lang.Throwable -> Ldc
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> Ldc
            long r6 = r6 - r1
            jz5.g r1 = r8.f285411g     // Catch: java.lang.Throwable -> Ldc
            jz5.n r1 = (jz5.n) r1     // Catch: java.lang.Throwable -> Ldc
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> Ldc
            hw.e0 r1 = (hw.e0) r1     // Catch: java.lang.Throwable -> Ldc
            long r1 = r1.f285370a     // Catch: java.lang.Throwable -> Ldc
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 >= 0) goto L4a
            r1 = r4
            goto L4b
        L4a:
            r1 = r5
        L4b:
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.f192989a     // Catch: java.lang.Throwable -> Ldc
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> Ldc
            r8.f285410f = r2     // Catch: java.lang.Throwable -> Ldc
            if (r1 != 0) goto L93
            java.lang.String r0 = r8.ij()     // Catch: java.lang.Throwable -> Ldc
            java.lang.String r1 = "start recreation"
            com.tencent.mars.xlog.Log.i(r0, r1)     // Catch: java.lang.Throwable -> Ldc
            hw.c0 r0 = r8.f285409e     // Catch: java.lang.Throwable -> Ldc
            r1 = 0
            if (r0 == 0) goto L6f
            java.lang.ref.WeakReference r0 = r0.f285364z     // Catch: java.lang.Throwable -> Ldc
            if (r0 == 0) goto L6f
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> Ldc
            android.app.Activity r0 = (android.app.Activity) r0     // Catch: java.lang.Throwable -> Ldc
            goto L70
        L6f:
            r0 = r1
        L70:
            hw.c0 r2 = r8.f285409e     // Catch: java.lang.Throwable -> Ldc
            if (r2 == 0) goto L77
            r2.destroy()     // Catch: java.lang.Throwable -> Ldc
        L77:
            r8.f285409e = r1     // Catch: java.lang.Throwable -> Ldc
            r8.f285412h = r4     // Catch: java.lang.Throwable -> Ldc
            r1 = 9
            r8.Bi(r1)     // Catch: java.lang.Throwable -> Ldc
            hw.c0 r1 = r8.f285409e     // Catch: java.lang.Throwable -> Ldc
            if (r1 == 0) goto L8e
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> Ldc
            r2.<init>(r0)     // Catch: java.lang.Throwable -> Ldc
            r1.f285364z = r2     // Catch: java.lang.Throwable -> Ldc
            r1.m1()     // Catch: java.lang.Throwable -> Ldc
        L8e:
            r8.cj()     // Catch: java.lang.Throwable -> Ldc
            monitor-exit(r8)
            return
        L93:
            java.lang.String r1 = r8.Vi()     // Catch: java.lang.Throwable -> Ldc
            com.tencent.mm.sdk.platformtools.o4 r1 = com.tencent.mm.sdk.platformtools.o4.M(r1)     // Catch: java.lang.Throwable -> Ldc
            java.lang.String r2 = "crashCount"
            int r2 = r1.o(r2, r5)     // Catch: java.lang.Throwable -> Ldc
            java.lang.String r3 = r8.ij()     // Catch: java.lang.Throwable -> Ldc
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ldc
            r5.<init>(r0)     // Catch: java.lang.Throwable -> Ldc
            r5.append(r2)     // Catch: java.lang.Throwable -> Ldc
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> Ldc
            com.tencent.mars.xlog.Log.i(r3, r0)     // Catch: java.lang.Throwable -> Ldc
            java.lang.String r0 = "crashCount"
            int r2 = r2 + r4
            r1.A(r0, r2)     // Catch: java.lang.Throwable -> Ldc
            java.lang.String r0 = "lastCrashVersion"
            int r2 = o45.wf.f343029g     // Catch: java.lang.Throwable -> Ldc
            r1.A(r0, r2)     // Catch: java.lang.Throwable -> Ldc
            java.lang.String r0 = "lastCrashTimeStamp"
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> Ldc
            r1.B(r0, r2)     // Catch: java.lang.Throwable -> Ldc
            java.lang.String r0 = r8.ij()     // Catch: java.lang.Throwable -> Ldc
            java.lang.String r1 = "reach currentRecreationCount, maybe appbrand1 incurable crash, no longer do recreation"
            com.tencent.mars.xlog.Log.e(r0, r1)     // Catch: java.lang.Throwable -> Ldc
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Ldc
            java.lang.String r1 = "MagicBrandRecreationOutOfLimit"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Ldc
            throw r0     // Catch: java.lang.Throwable -> Ldc
        Ldc:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hw.o0.fj():void");
    }

    public abstract boolean hj();

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountInitialized(context);
        com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE.addLifecycleCallback(this.f285416o);
        alive();
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountReleased(context);
        hw.c0 c0Var = this.f285409e;
        if (c0Var != null) {
            c0Var.destroy();
        }
        this.f285409e = null;
        this.f285412h = true;
        com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE.removeLifecycleCallback(this.f285416o);
        dead();
    }
}
