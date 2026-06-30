package yn1;

/* loaded from: classes11.dex */
public final class z0 {

    /* renamed from: c, reason: collision with root package name */
    public static volatile int f463935c;

    /* renamed from: d, reason: collision with root package name */
    public static int f463936d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f463937e;

    /* renamed from: f, reason: collision with root package name */
    public static bw5.q0 f463938f;

    /* renamed from: g, reason: collision with root package name */
    public static bw5.o0 f463939g;

    /* renamed from: h, reason: collision with root package name */
    public static bw5.p0 f463940h;

    /* renamed from: i, reason: collision with root package name */
    public static bw5.aj0 f463941i;

    /* renamed from: k, reason: collision with root package name */
    public static com.tencent.mm.autogen.events.AccountExpiredEvent f463943k;

    /* renamed from: n, reason: collision with root package name */
    public static java.lang.String f463946n;

    /* renamed from: o, reason: collision with root package name */
    public static java.lang.String f463947o;

    /* renamed from: q, reason: collision with root package name */
    public static boolean f463949q;

    /* renamed from: s, reason: collision with root package name */
    public static boolean f463951s;

    /* renamed from: a, reason: collision with root package name */
    public static final yn1.z0 f463933a = new yn1.z0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f463934b = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.Set f463942j = java.util.Collections.synchronizedSet(new java.util.HashSet());

    /* renamed from: l, reason: collision with root package name */
    public static java.lang.String f463944l = "";

    /* renamed from: m, reason: collision with root package name */
    public static bw5.he0 f463945m = bw5.he0.UNKNOW;

    /* renamed from: p, reason: collision with root package name */
    public static final jz5.g f463948p = jz5.h.b(yn1.y0.f463923d);

    /* renamed from: r, reason: collision with root package name */
    public static final kotlinx.coroutines.flow.i2 f463950r = kotlinx.coroutines.flow.r2.b(1, 0, null, 6, null);

    /* renamed from: t, reason: collision with root package name */
    public static final yn1.r0 f463952t = new yn1.r0();

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0070, code lost:
    
        r1 = yn1.z0.f463935c;
        com.tencent.mars.xlog.Log.i("MM.Mig.MigrationGlobalHolder", "!!! Ready to do unInitialize. targetId=" + r1);
        ((ku5.t0) ku5.t0.f312615d).k(new yn1.k0(r1), 15000);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r7 = this;
            java.lang.String r0 = "!!! Ready to do unInitialize. targetId="
            java.lang.String r1 = "[checkIfNeedUnInitialize] activityCount="
            java.lang.String r2 = "MM.Mig.MigrationGlobalHolder"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "[checkIfNeedUnInitialize] activityCount="
            r3.<init>(r4)
            int r4 = yn1.z0.f463936d
            r3.append(r4)
            java.lang.String r4 = ", status="
            r3.append(r4)
            bw5.bj0 r4 = r7.i()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.mars.xlog.Log.i(r2, r3)
            int r2 = yn1.z0.f463936d
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L3d
            bw5.bj0 r2 = r7.i()
            bw5.bj0 r5 = bw5.bj0.NOTIFY_CODE_NONE
            if (r2 == r5) goto L3b
            bw5.bj0 r2 = r7.i()
            bw5.bj0 r5 = bw5.bj0.NOTIFY_CODE_UI_READY
            if (r2 != r5) goto L3d
        L3b:
            r2 = r3
            goto L3e
        L3d:
            r2 = r4
        L3e:
            if (r2 == 0) goto Lb6
            monitor-enter(r7)
            com.tencent.mm.autogen.events.AccountExpiredEvent r2 = yn1.z0.f463943k     // Catch: java.lang.Throwable -> Lb3
            if (r2 == 0) goto L56
            int r5 = yn1.z0.f463936d     // Catch: java.lang.Throwable -> Lb3
            if (r5 != 0) goto L56
            ku5.u0 r0 = ku5.t0.f312615d     // Catch: java.lang.Throwable -> Lb3
            yn1.j0 r1 = new yn1.j0     // Catch: java.lang.Throwable -> Lb3
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lb3
            ku5.t0 r0 = (ku5.t0) r0     // Catch: java.lang.Throwable -> Lb3
            r0.g(r1)     // Catch: java.lang.Throwable -> Lb3
            goto Lb1
        L56:
            yn1.z0 r2 = yn1.z0.f463933a     // Catch: java.lang.Throwable -> Lb3
            int r5 = yn1.z0.f463936d     // Catch: java.lang.Throwable -> Lb3
            if (r5 != 0) goto L6d
            bw5.bj0 r5 = r2.i()     // Catch: java.lang.Throwable -> Lb3
            bw5.bj0 r6 = bw5.bj0.NOTIFY_CODE_NONE     // Catch: java.lang.Throwable -> Lb3
            if (r5 == r6) goto L6e
            bw5.bj0 r5 = r2.i()     // Catch: java.lang.Throwable -> Lb3
            bw5.bj0 r6 = bw5.bj0.NOTIFY_CODE_UI_READY     // Catch: java.lang.Throwable -> Lb3
            if (r5 != r6) goto L6d
            goto L6e
        L6d:
            r3 = r4
        L6e:
            if (r3 == 0) goto L92
            int r1 = yn1.z0.f463935c     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r2 = "MM.Mig.MigrationGlobalHolder"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb3
            r3.<init>(r0)     // Catch: java.lang.Throwable -> Lb3
            r3.append(r1)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> Lb3
            com.tencent.mars.xlog.Log.i(r2, r0)     // Catch: java.lang.Throwable -> Lb3
            ku5.u0 r0 = ku5.t0.f312615d     // Catch: java.lang.Throwable -> Lb3
            yn1.k0 r2 = new yn1.k0     // Catch: java.lang.Throwable -> Lb3
            r2.<init>(r1)     // Catch: java.lang.Throwable -> Lb3
            ku5.t0 r0 = (ku5.t0) r0     // Catch: java.lang.Throwable -> Lb3
            r3 = 15000(0x3a98, double:7.411E-320)
            r0.k(r2, r3)     // Catch: java.lang.Throwable -> Lb3
            goto Lb1
        L92:
            java.lang.String r0 = "MM.Mig.MigrationGlobalHolder"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb3
            r3.<init>(r1)     // Catch: java.lang.Throwable -> Lb3
            int r1 = yn1.z0.f463936d     // Catch: java.lang.Throwable -> Lb3
            r3.append(r1)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r1 = ", status="
            r3.append(r1)     // Catch: java.lang.Throwable -> Lb3
            bw5.bj0 r1 = r2.i()     // Catch: java.lang.Throwable -> Lb3
            r3.append(r1)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> Lb3
            com.tencent.mars.xlog.Log.i(r0, r1)     // Catch: java.lang.Throwable -> Lb3
        Lb1:
            monitor-exit(r7)
            goto Lb6
        Lb3:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yn1.z0.a():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(vn1.m r8, java.lang.String r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yn1.z0.b(vn1.m, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r9, java.lang.String r10, kotlin.coroutines.Continuation r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof yn1.n0
            if (r0 == 0) goto L13
            r0 = r11
            yn1.n0 r0 = (yn1.n0) r0
            int r1 = r0.f463765i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f463765i = r1
            goto L18
        L13:
            yn1.n0 r0 = new yn1.n0
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f463763g
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f463765i
            java.lang.String r3 = "MM.Mig.MigrationGlobalHolder"
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L59
            if (r2 == r6) goto L48
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            kotlin.ResultKt.throwOnFailure(r11)
            goto Lc1
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            java.lang.Object r9 = r0.f463762f
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r0.f463761e
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r2 = r0.f463760d
            yn1.z0 r2 = (yn1.z0) r2
            kotlin.ResultKt.throwOnFailure(r11)
            goto L9b
        L48:
            java.lang.Object r9 = r0.f463762f
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r0.f463761e
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r2 = r0.f463760d
            yn1.z0 r2 = (yn1.z0) r2
            kotlin.ResultKt.throwOnFailure(r11)
            goto L85
        L59:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r2 = "[connectToGroup] networkName="
            r11.<init>(r2)
            r11.append(r9)
            java.lang.String r2 = ", passphrase="
            r11.append(r2)
            r11.append(r10)
            java.lang.String r11 = r11.toString()
            com.tencent.mars.xlog.Log.i(r3, r11)
            r0.f463760d = r8
            r0.f463761e = r9
            r0.f463762f = r10
            r0.f463765i = r6
            java.lang.Object r11 = r8.v(r0)
            if (r11 != r1) goto L84
            return r1
        L84:
            r2 = r8
        L85:
            bp1.d r11 = bp1.e.f23040a
            bp1.f[] r6 = bp1.e.f23041b
            r0.f463760d = r2
            r0.f463761e = r9
            r0.f463762f = r10
            r0.f463765i = r5
            java.lang.Object r11 = r11.a(r6, r0)
            if (r11 != r1) goto L98
            return r1
        L98:
            r7 = r10
            r10 = r9
            r9 = r7
        L9b:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto Lab
            java.lang.String r9 = "[connectToGroup] permission denied"
            com.tencent.mars.xlog.Log.e(r3, r9)
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        Lab:
            gz.m r11 = r2.k()
            r2 = 0
            r0.f463760d = r2
            r0.f463761e = r2
            r0.f463762f = r2
            r0.f463765i = r4
            kp.i1 r11 = (kp.i1) r11
            java.lang.Object r11 = r11.Bi(r10, r9, r0)
            if (r11 != r1) goto Lc1
            return r1
        Lc1:
            gz.a r11 = (gz.a) r11
            boolean r9 = r11.f277639a
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: yn1.z0.c(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(kotlin.coroutines.Continuation r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof yn1.o0
            if (r0 == 0) goto L13
            r0 = r9
            yn1.o0 r0 = (yn1.o0) r0
            int r1 = r0.f463777g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f463777g = r1
            goto L18
        L13:
            yn1.o0 r0 = new yn1.o0
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f463775e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f463777g
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            java.lang.String r7 = "MM.Mig.MigrationGlobalHolder"
            if (r2 == 0) goto L48
            if (r2 == r5) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            kotlin.ResultKt.throwOnFailure(r9)
            goto L8a
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            java.lang.Object r2 = r0.f463774d
            yn1.z0 r2 = (yn1.z0) r2
            kotlin.ResultKt.throwOnFailure(r9)
            goto L6b
        L40:
            java.lang.Object r2 = r0.f463774d
            yn1.z0 r2 = (yn1.z0) r2
            kotlin.ResultKt.throwOnFailure(r9)
            goto L5c
        L48:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.String r9 = "[createGroup]"
            com.tencent.mars.xlog.Log.i(r7, r9)
            r0.f463774d = r8
            r0.f463777g = r5
            java.lang.Object r9 = r8.v(r0)
            if (r9 != r1) goto L5b
            return r1
        L5b:
            r2 = r8
        L5c:
            bp1.d r9 = bp1.e.f23040a
            bp1.f[] r5 = bp1.e.f23041b
            r0.f463774d = r2
            r0.f463777g = r4
            java.lang.Object r9 = r9.a(r5, r0)
            if (r9 != r1) goto L6b
            return r1
        L6b:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L79
            java.lang.String r9 = "[createGroup] permission denied"
            com.tencent.mars.xlog.Log.e(r7, r9)
            return r6
        L79:
            gz.m r9 = r2.k()
            r0.f463774d = r6
            r0.f463777g = r3
            kp.i1 r9 = (kp.i1) r9
            java.lang.Object r9 = r9.Ri(r0)
            if (r9 != r1) goto L8a
            return r1
        L8a:
            gz.b r9 = (gz.b) r9
            boolean r0 = r9.f277642a
            if (r0 == 0) goto Laa
            java.lang.String r0 = r9.f277645d
            if (r0 == 0) goto La4
            java.lang.String r9 = r9.f277646e
            if (r9 == 0) goto La4
            kotlin.jvm.internal.o.d(r0)
            kotlin.jvm.internal.o.d(r9)
            jz5.l r1 = new jz5.l
            r1.<init>(r0, r9)
            return r1
        La4:
            java.lang.String r9 = "[createGroup] failed: networkName or passphrase is null"
            com.tencent.mars.xlog.Log.e(r7, r9)
            return r6
        Laa:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[createGroup] failed: "
            r0.<init>(r1)
            bw5.xf0 r1 = r9.f277643b
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            java.lang.String r9 = r9.f277644c
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            com.tencent.mars.xlog.Log.e(r7, r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: yn1.z0.d(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void e() {
        if (f463934b.compareAndSet(false, true)) {
            fp.d0.n("aff_biz");
            com.tencent.wechat.aff.migration.c.f217388a = yn1.p0.f463787a;
            com.tencent.wechat.aff.migration.d.f217389a = yn1.q0.f463801a;
            i95.n0.c(gz.l.class);
        }
    }

    public final bw5.he0 f() {
        boolean isWifi;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (!r75.d.f393259f) {
            isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(context);
        } else if (r75.d.f393257d == -100) {
            int netType = com.tencent.mars.comm.NetStatusUtil.getNetType(context);
            r75.d.f393257d = netType;
            isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(netType);
        } else {
            ((ku5.t0) ku5.t0.f312615d).h(new r75.c(context), "SystemServiceCallingCache-UpdateNetWorkCache");
            isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(r75.d.f393257d);
        }
        com.tencent.mars.xlog.Log.i("MM.Mig.MigrationGlobalHolder", "getMigrateNetworkStatus, isWifi = " + isWifi);
        if (!isWifi) {
            return bw5.he0.MOBILE;
        }
        java.lang.Object systemService = context.getSystemService("connectivity");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        boolean isActiveNetworkMetered = ((android.net.ConnectivityManager) systemService).isActiveNetworkMetered();
        com.tencent.mars.xlog.Log.i("MM.Mig.MigrationGlobalHolder", "getMigrateNetworkStatus, isExpensive = " + isActiveNetworkMetered);
        return isActiveNetworkMetered ? bw5.he0.EXPENSIVE_WIFI : bw5.he0.FREE_WIFI;
    }

    public final java.lang.String g() {
        java.lang.String str = f463946n;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.o.o("migrationPath");
        throw null;
    }

    public final bw5.l0 h() {
        bw5.p0 p0Var = f463940h;
        if (p0Var == null) {
            kotlin.jvm.internal.o.o("sceneModel");
            throw null;
        }
        bw5.l0 l0Var = p0Var.f31423g[1] ? p0Var.f31420d : bw5.l0.AFFMIG_PHONE;
        kotlin.jvm.internal.o.f(l0Var, "getPeerType(...)");
        return l0Var;
    }

    public final bw5.bj0 i() {
        bw5.q0 q0Var = f463938f;
        if (q0Var == null) {
            kotlin.jvm.internal.o.o("statusModel");
            throw null;
        }
        bw5.bj0 b17 = q0Var.b();
        kotlin.jvm.internal.o.f(b17, "getStatus(...)");
        return b17;
    }

    public final java.lang.String j() {
        java.lang.String str = f463947o;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.o.o(dm.i4.COL_USERNAME);
        throw null;
    }

    public final gz.m k() {
        java.lang.Object value = ((jz5.n) f463948p).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (gz.m) value;
    }

    public final boolean l() {
        bw5.p0 p0Var = f463940h;
        if (p0Var != null) {
            return p0Var.f31421e;
        }
        kotlin.jvm.internal.o.o("sceneModel");
        throw null;
    }

    public final boolean m() {
        if (z65.c.a()) {
            return j62.e.g().c(new com.tencent.mm.repairer.config.migration.RepairerConfigEnableCdnMigration()) > 0;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        boolean i17 = com.tencent.mm.sdk.platformtools.o4.L().i("clicfg_migration_enable_cdn_android_mmkv", false);
        com.tencent.mars.xlog.Log.i("MM.Mig.MigrationGlobalHolder", "isEnableCdnMigrate, enable = " + i17);
        return i17;
    }

    public final boolean n() {
        boolean z17;
        synchronized (this) {
            z17 = f463935c > 0;
        }
        return z17;
    }

    public final boolean o(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        return f463949q && kotlin.jvm.internal.o.b(username, j());
    }

    public final void p() {
        android.os.Looper.getMainLooper().isCurrentThread();
        java.util.Set listenerSet = f463942j;
        kotlin.jvm.internal.o.f(listenerSet, "listenerSet");
        synchronized (listenerSet) {
            kotlin.jvm.internal.o.f(listenerSet, "listenerSet");
            java.util.Iterator it = listenerSet.iterator();
            while (it.hasNext()) {
                ((yn1.m) it.next()).E2();
            }
        }
    }

    public final void q(yn1.m listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        com.tencent.mars.xlog.Log.i("MM.Mig.MigrationGlobalHolder", "[registerListeners] listener=" + listener);
        f463942j.add(listener);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(vn1.m r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yn1.z0.r(vn1.m, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(vn1.m r8, java.lang.String r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yn1.z0.s(vn1.m, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final synchronized void t(int i17) {
        if (f463935c != 0 && i17 >= f463935c) {
            com.tencent.mars.xlog.Log.i("MM.Mig.MigrationGlobalHolder", "[unInitialize] username=" + j() + ", instanceId=" + f463935c + ", targetId=" + i17);
            f463935c = 0;
            f463947o = "";
            f463946n = "";
            f463949q = false;
            f463944l = "";
            yn1.h4.f463691i.a();
            yn1.d0.f463635a.b();
            com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.removeLifecycleCallback(f463952t);
            try {
                ((kp.i1) k()).mj();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MM.Mig.MigrationGlobalHolder", "[unInitialize] removeGroup error: " + e17);
            }
            if (f463937e) {
                com.tencent.mars.xlog.Log.i("MM.Mig.MigrationGlobalHolder", "[unInitialize] uninitialize backup storage");
                f463937e = false;
            }
            com.tencent.wechat.aff.migration.f.f217390b.q();
            if (!((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).Vi()) {
                ((kp.i1) k()).pj();
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MM.Mig.MigrationGlobalHolder", "[unInitialize] instanceId=" + f463935c + ", targetId=" + i17);
    }

    public final boolean u(yn1.m listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        com.tencent.mars.xlog.Log.i("MM.Mig.MigrationGlobalHolder", "[unregisterListener] listener=" + listener);
        return f463942j.remove(listener);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(kotlin.coroutines.Continuation r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof yn1.v0
            if (r0 == 0) goto L13
            r0 = r9
            yn1.v0 r0 = (yn1.v0) r0
            int r1 = r0.f463878f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f463878f = r1
            goto L18
        L13:
            yn1.v0 r0 = new yn1.v0
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f463876d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f463878f
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 1
            java.lang.String r5 = "MM.Mig.MigrationGlobalHolder"
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            kotlin.ResultKt.throwOnFailure(r9)
            goto L51
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L33:
            kotlin.ResultKt.throwOnFailure(r9)
            int r9 = yn1.z0.f463936d
            if (r9 <= 0) goto L3b
            return r3
        L3b:
            java.lang.String r9 = "[waitForActivityCreated] No activity found, waiting for creation..."
            com.tencent.mars.xlog.Log.i(r5, r9)
            yn1.x0 r9 = new yn1.x0
            r2 = 0
            r9.<init>(r2)
            r0.f463878f = r4
            r6 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r9 = kotlinx.coroutines.a4.c(r6, r9, r0)
            if (r9 != r1) goto L51
            return r1
        L51:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            if (r9 != 0) goto L5b
            java.lang.String r9 = "[waitForActivityCreated] Timeout after 2s, proceeding anyway"
            com.tencent.mars.xlog.Log.e(r5, r9)
            goto L60
        L5b:
            java.lang.String r9 = "[waitForActivityCreated] Activity created successfully"
            com.tencent.mars.xlog.Log.i(r5, r9)
        L60:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: yn1.z0.v(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
