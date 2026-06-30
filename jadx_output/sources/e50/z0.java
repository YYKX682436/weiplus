package e50;

@j95.b
/* loaded from: classes11.dex */
public final class z0 extends i95.w implements f50.y {

    /* renamed from: r, reason: collision with root package name */
    public static final jz5.g f249556r;

    /* renamed from: e, reason: collision with root package name */
    public pi0.q f249558e;

    /* renamed from: f, reason: collision with root package name */
    public b03.l f249559f;

    /* renamed from: g, reason: collision with root package name */
    public kotlinx.coroutines.r2 f249560g;

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f249557d = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c);

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f249561h = jz5.h.b(e50.d0.f249485d);

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f249562i = jz5.h.b(new e50.c0(this));

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f249563m = jz5.h.b(new e50.e0(this));

    /* renamed from: n, reason: collision with root package name */
    public boolean f249564n = true;

    /* renamed from: o, reason: collision with root package name */
    public final e50.b0 f249565o = new e50.b0();

    /* renamed from: p, reason: collision with root package name */
    public final e50.u0 f249566p = new e50.u0();

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.Object f249567q = new java.lang.Object();

    static {
        new e50.t(null);
        f249556r = jz5.h.b(e50.s.f249533d);
    }

    public z0() {
        jz5.h.b(e50.j0.f249507d);
    }

    public int Ai() {
        java.lang.String str;
        boolean z17;
        boolean z18 = false;
        if (com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner.INSTANCE.isBackground()) {
            return 0;
        }
        pi0.q qVar = this.f249558e;
        if (qVar == null) {
            return 2;
        }
        bj0.p pVar = bj0.s.f21129f;
        if (qVar == null || (str = qVar.f354704h) == null) {
            str = "";
        }
        bj0.s a17 = pVar.a(str);
        if (a17 != null) {
            synchronized (a17.f21131a) {
                java.util.ArrayList arrayList = a17.f21131a;
                if (!(arrayList instanceof java.util.Collection) || !arrayList.isEmpty()) {
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        bj0.q qVar2 = (bj0.q) it.next();
                        if (qVar2.f21127e && !qVar2.f21126d) {
                            z17 = true;
                            break;
                        }
                    }
                }
                z17 = false;
            }
            if (z17) {
                z18 = true;
            }
        }
        return z18 ? 1 : 2;
    }

    public com.tencent.pigeon.mm_foundation.DartServiceCallerApi Bi() {
        Zi();
        return (com.tencent.pigeon.mm_foundation.DartServiceCallerApi) ((jz5.n) this.f249562i).getValue();
    }

    public final e50.m1 Di() {
        return (e50.m1) ((jz5.n) this.f249561h).getValue();
    }

    public java.util.List Ni() {
        int K;
        b03.l lVar = this.f249559f;
        if (lVar == null) {
            return kz5.p0.f313996d;
        }
        java.util.LinkedList linkedList = lVar.f16838a.f354702f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            java.lang.String str = ((pi0.u0) it.next()).f354734e;
            if (str != null && (K = r26.n0.K(str, '/', 0, false, 6, null)) > 0) {
                str = str.substring(0, K);
                kotlin.jvm.internal.o.f(str, "substring(...)");
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        return kz5.n0.D0(arrayList);
    }

    public int Ri() {
        pi0.q qVar = this.f249558e;
        if (qVar != null) {
            return qVar.e();
        }
        return 0;
    }

    public pi0.q Ui() {
        Zi();
        pi0.q qVar = this.f249558e;
        kotlin.jvm.internal.o.d(qVar);
        return qVar;
    }

    public boolean Vi() {
        return this.f249558e != null;
    }

    public final void Zi() {
        bm5.v1.a("launchInitEngineGroup", new e50.k0(this));
    }

    public void aj(boolean z17) {
        java.lang.String i17 = com.tencent.mm.vfs.w6.i(com.tencent.mm.vfs.q7.c("flutter_mem_cache"), true);
        kotlin.jvm.internal.o.d(i17);
        java.lang.String concat = i17.concat("/memcache.bin");
        io.flutter.embedding.engine.FlutterEngine flutterEngine = Ui().f354701e;
        if (flutterEngine != null) {
            flutterEngine.swapMemFromFile(concat, z17, true);
        }
    }

    public void bj(boolean z17) {
        java.lang.String i17 = com.tencent.mm.vfs.w6.i(com.tencent.mm.vfs.q7.c("flutter_mem_cache"), true);
        kotlin.jvm.internal.o.d(i17);
        java.lang.String concat = i17.concat("/memcache.bin");
        io.flutter.embedding.engine.FlutterEngine flutterEngine = Ui().f354701e;
        if (flutterEngine != null) {
            flutterEngine.swapMemToFile(concat, z17, true);
        }
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        fp.d0.n("aff_biz");
        fp.d0.n("flutter");
        fp.d0.n("mm_foundation_lib");
        new io.flutter.embedding.engine.FlutterJNI.Factory().provideFlutterJNI().loadLibrary(context);
        pi0.r.f354718b = new a03.m();
        pi0.r.f354719c = e50.l0.f249517d;
        i95.n0.c(e70.q.class);
        java.util.HashMap hashMap = f50.u.f259591a;
        f50.w wVar = f50.w.f259594a;
        java.util.HashMap hashMap2 = f50.u.f259591a;
        hashMap2.put("engine_kv", wVar);
        hashMap2.put("engine_params", f50.v.f259592a);
        com.tencent.wechat.aff.mm_foundation.f.f217399c = e50.m0.f249521a;
        com.tencent.wechat.aff.mm_foundation.f.f217397a = e50.n0.f249527a;
        com.tencent.wechat.aff.mm_foundation.f.f217398b = e50.o0.f249528a;
        com.tencent.wechat.aff.mm_foundation.f.f217400d = e50.p0.f249530a;
        com.tencent.mm.flutter.base.MMFoundationLib.Companion companion = com.tencent.mm.flutter.base.MMFoundationLib.INSTANCE;
        e50.q0 q0Var = new e50.q0();
        companion.getClass();
        com.tencent.mm.flutter.base.MMFoundationLib.exceptionReporter = q0Var;
        a03.g.f423b = new e50.r0();
        this.f249564n = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_flutter_engine_sync_to_file_in_background, true);
        com.tencent.matrix.lifecycle.owners.ProcessUIStartedStateOwner processUIStartedStateOwner = com.tencent.matrix.lifecycle.owners.ProcessUIStartedStateOwner.INSTANCE;
        processUIStartedStateOwner.addLifecycleCallback(this.f249565o);
        com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner overlayWindowLifecycleOwner = com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner.INSTANCE;
        overlayWindowLifecycleOwner.observeForever(this.f249566p);
        if (processUIStartedStateOwner.isForeground()) {
            io.flutter.embedding.engine.FlutterJNI.updateAppForegroundState(io.flutter.embedding.engine.FlutterJNI.AppForegroundState.FOREGROUND);
        } else if (overlayWindowLifecycleOwner.hasOverlayWindow()) {
            io.flutter.embedding.engine.FlutterJNI.updateAppForegroundState(io.flutter.embedding.engine.FlutterJNI.AppForegroundState.FLOAT_WINDOW_FOREGROUND);
        } else {
            io.flutter.embedding.engine.FlutterJNI.updateAppForegroundState(io.flutter.embedding.engine.FlutterJNI.AppForegroundState.BACKGROUND);
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_flutter_engine_create_on_start, true)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterEngineService", "onCreate: createOnStart");
            ((ku5.t0) ku5.t0.f312615d).B(new e50.s0(this));
        }
        ((ku5.t0) ku5.t0.f312615d).a(e50.t0.f249535d);
        boolean z17 = j62.e.g().c(new com.tencent.mm.repairer.config.flutter.RepairerConfigFlutterPagUseRfx()) == 1;
        si0.f.f408067h = z17;
        io.flutter.Log.i("MicroMsg.FlutterPAGPlugin", "setUseRfxPag:" + z17);
    }

    public java.lang.String[] wi() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_flutter_bind_cpu_cores, true);
        java.lang.String[] strArr = new java.lang.String[2];
        strArr[0] = io.flutter.embedding.engine.FlutterShellArgs.ARG_VERBOSE_LOGGING;
        strArr[1] = fj6 ? io.flutter.embedding.engine.FlutterShellArgs.ARG_BIND_CPU_CORES : null;
        return (java.lang.String[]) kz5.z.I(strArr).toArray(new java.lang.String[0]);
    }
}
