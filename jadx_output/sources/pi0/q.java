package pi0;

/* loaded from: classes11.dex */
public final class q {

    /* renamed from: t, reason: collision with root package name */
    public static int f354694t;

    /* renamed from: u, reason: collision with root package name */
    public static int f354695u;

    /* renamed from: v, reason: collision with root package name */
    public static int f354696v;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f354697a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String[] f354698b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlinx.coroutines.r2 f354699c;

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.embedding.engine.MMFlutterEngineGroup f354700d;

    /* renamed from: e, reason: collision with root package name */
    public io.flutter.embedding.engine.FlutterEngine f354701e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f354702f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f354703g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f354704h;

    /* renamed from: i, reason: collision with root package name */
    public final kotlinx.coroutines.r2 f354705i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f354706j;

    /* renamed from: k, reason: collision with root package name */
    public final pi0.w f354707k;

    /* renamed from: l, reason: collision with root package name */
    public final pi0.y f354708l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashSet f354709m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashSet f354710n;

    /* renamed from: o, reason: collision with root package name */
    public pi0.a f354711o;

    /* renamed from: p, reason: collision with root package name */
    public final long f354712p;

    /* renamed from: q, reason: collision with root package name */
    public yz5.l f354713q;

    /* renamed from: r, reason: collision with root package name */
    public yz5.l f354714r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f354715s;

    public q(android.content.Context context, java.lang.String[] dartVmArgs, kotlinx.coroutines.r2 r2Var) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(dartVmArgs, "dartVmArgs");
        this.f354697a = context;
        this.f354698b = dartVmArgs;
        this.f354699c = r2Var;
        this.f354702f = new java.util.LinkedList();
        this.f354703g = new java.util.LinkedList();
        this.f354704h = java.lang.String.valueOf(hashCode());
        this.f354706j = true;
        this.f354707k = new pi0.w();
        this.f354708l = new pi0.y();
        this.f354709m = new java.util.HashSet();
        this.f354710n = new java.util.HashSet();
        kotlinx.coroutines.y0 a17 = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.plus(kotlinx.coroutines.t3.a(null, 1, null)));
        io.flutter.Log.i("MicroMsg.CachedFlutterEngineGroup", "init: " + this);
        this.f354712p = java.lang.System.currentTimeMillis();
        this.f354705i = kotlinx.coroutines.l.d(a17, null, null, new pi0.g(this, null), 3, null);
        f354694t++;
    }

    public final void a(java.lang.Object ref) {
        kotlin.jvm.internal.o.g(ref, "ref");
        synchronized (this.f354709m) {
            io.flutter.Log.i("MicroMsg.CachedFlutterEngineGroup", "addRef:" + ref);
            this.f354709m.add(ref);
            if (ref instanceof pi0.l1) {
                this.f354710n.add(ref);
                yz5.l lVar = this.f354713q;
                if (lVar != null) {
                    lVar.invoke(java.lang.Integer.valueOf(this.f354710n.size()));
                }
            }
        }
    }

    public final java.lang.Object b(kotlin.coroutines.Continuation continuation) {
        java.lang.Object C;
        kotlinx.coroutines.r2 r2Var = this.f354705i;
        boolean z17 = false;
        if (r2Var != null && ((kotlinx.coroutines.a) r2Var).a()) {
            z17 = true;
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (z17) {
            io.flutter.Log.i("MicroMsg.CachedFlutterEngineGroup", "await initJob");
            if (r2Var != null && (C = ((kotlinx.coroutines.c3) r2Var).C(continuation)) == pz5.a.f359186d) {
                return C;
            }
        }
        return f0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(android.content.Context r5, io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint r6, java.lang.String r7, boolean r8, java.util.List r9, kotlin.coroutines.Continuation r10) {
        /*
            r4 = this;
            boolean r0 = r10 instanceof pi0.c
            if (r0 == 0) goto L13
            r0 = r10
            pi0.c r0 = (pi0.c) r0
            int r1 = r0.f354537o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f354537o = r1
            goto L18
        L13:
            pi0.c r0 = new pi0.c
            r0.<init>(r4, r10)
        L18:
            java.lang.Object r10 = r0.f354535m
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f354537o
            r3 = 1
            if (r2 == 0) goto L48
            if (r2 != r3) goto L40
            boolean r8 = r0.f354534i
            java.lang.Object r5 = r0.f354533h
            r9 = r5
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r5 = r0.f354532g
            r7 = r5
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r5 = r0.f354531f
            r6 = r5
            io.flutter.embedding.engine.dart.DartExecutor$DartEntrypoint r6 = (io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint) r6
            java.lang.Object r5 = r0.f354530e
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r0 = r0.f354529d
            pi0.q r0 = (pi0.q) r0
            kotlin.ResultKt.throwOnFailure(r10)
            goto L61
        L40:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L48:
            kotlin.ResultKt.throwOnFailure(r10)
            r0.f354529d = r4
            r0.f354530e = r5
            r0.f354531f = r6
            r0.f354532g = r7
            r0.f354533h = r9
            r0.f354534i = r8
            r0.f354537o = r3
            java.lang.Object r10 = r4.b(r0)
            if (r10 != r1) goto L60
            return r1
        L60:
            r0 = r4
        L61:
            io.flutter.embedding.engine.MMFlutterEngineGroup r10 = r0.d()
            io.flutter.embedding.engine.FlutterEngineGroup$Options r1 = new io.flutter.embedding.engine.FlutterEngineGroup$Options
            r1.<init>(r5)
            io.flutter.embedding.engine.FlutterEngineGroup$Options r5 = r1.setDartEntrypoint(r6)
            io.flutter.embedding.engine.FlutterEngineGroup$Options r5 = r5.setInitialRoute(r7)
            io.flutter.embedding.engine.FlutterEngineGroup$Options r5 = r5.setAutomaticallyRegisterPlugins(r8)
            io.flutter.embedding.engine.FlutterEngineGroup$Options r5 = r5.setDartEntrypointArgs(r9)
            java.lang.String r6 = "setDartEntrypointArgs(...)"
            kotlin.jvm.internal.o.f(r5, r6)
            io.flutter.embedding.engine.FlutterEngine r5 = r10.createAndRunEngine(r5)
            int r6 = pi0.q.f354696v
            int r6 = r6 + r3
            pi0.q.f354696v = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "create engine "
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "MicroMsg.CachedFlutterEngineGroup"
            io.flutter.Log.i(r7, r6)
            r0.a(r5)
            pi0.u r6 = new pi0.u
            java.lang.String r7 = "liteapp"
            r6.<init>(r5, r7)
            java.util.LinkedList r7 = r0.f354703g
            r7.add(r6)
            pi0.d r7 = new pi0.d
            r7.<init>(r5, r0, r6)
            r5.addEngineLifecycleListener(r7)
            boolean r7 = r0.f354715s
            if (r7 == 0) goto Lcd
            com.tencent.pigeon.weapm.WeAPMFlutterApi r7 = new com.tencent.pigeon.weapm.WeAPMFlutterApi
            io.flutter.embedding.engine.FlutterEngine r6 = r6.f354727a
            io.flutter.embedding.engine.dart.DartExecutor r6 = r6.getDartExecutor()
            java.lang.String r8 = "getDartExecutor(...)"
            kotlin.jvm.internal.o.f(r6, r8)
            r8 = 2
            r9 = 0
            r7.<init>(r6, r9, r8, r9)
            pi0.e r6 = pi0.e.f354556d
            r7.startFluencyTracker(r6)
        Lcd:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: pi0.q.c(android.content.Context, io.flutter.embedding.engine.dart.DartExecutor$DartEntrypoint, java.lang.String, boolean, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final io.flutter.embedding.engine.MMFlutterEngineGroup d() {
        io.flutter.embedding.engine.MMFlutterEngineGroup mMFlutterEngineGroup = this.f354700d;
        if (mMFlutterEngineGroup != null) {
            kotlin.jvm.internal.o.d(mMFlutterEngineGroup);
            return mMFlutterEngineGroup;
        }
        throw new java.lang.RuntimeException(this + " group is not initialized!");
    }

    public final int e() {
        java.util.List<io.flutter.embedding.engine.FlutterEngine> activeEngines;
        io.flutter.embedding.engine.MMFlutterEngineGroup mMFlutterEngineGroup = this.f354700d;
        if (mMFlutterEngineGroup == null || (activeEngines = mMFlutterEngineGroup.getActiveEngines()) == null) {
            return 0;
        }
        return activeEngines.size();
    }

    public final void f(java.lang.Object ref) {
        kotlin.jvm.internal.o.g(ref, "ref");
        synchronized (this.f354709m) {
            io.flutter.Log.i("MicroMsg.CachedFlutterEngineGroup", "removeRef:" + ref);
            this.f354709m.remove(ref);
            if (ref instanceof pi0.l1) {
                this.f354710n.remove(ref);
                yz5.l lVar = this.f354713q;
                if (lVar != null) {
                    lVar.invoke(java.lang.Integer.valueOf(this.f354710n.size()));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0218 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01d9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(pi0.m1 r32, boolean r33, boolean r34, boolean r35, yz5.l r36, kotlin.coroutines.Continuation r37) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pi0.q.g(pi0.m1, boolean, boolean, boolean, yz5.l, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
