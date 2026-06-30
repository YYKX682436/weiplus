package ly0;

/* loaded from: classes5.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public final ly0.p f322216a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f322217b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f322218c;

    /* renamed from: d, reason: collision with root package name */
    public volatile ly0.e f322219d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f322220e;

    /* renamed from: f, reason: collision with root package name */
    public volatile ly0.d f322221f;

    /* renamed from: g, reason: collision with root package name */
    public volatile kotlinx.coroutines.r2 f322222g;

    /* renamed from: h, reason: collision with root package name */
    public volatile kotlinx.coroutines.r2 f322223h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.a f322224i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.Object f322225j;

    /* renamed from: k, reason: collision with root package name */
    public yz5.l f322226k;

    /* renamed from: l, reason: collision with root package name */
    public final kotlinx.coroutines.r0 f322227l;

    public n(ly0.p scene, java.util.List cndUrls, s26.a aVar, yz5.l rawCompletionCallback, kotlin.jvm.internal.i iVar) {
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(cndUrls, "cndUrls");
        kotlin.jvm.internal.o.g(rawCompletionCallback, "rawCompletionCallback");
        this.f322216a = scene;
        this.f322217b = cndUrls;
        this.f322218c = rawCompletionCallback;
        this.f322219d = ly0.e.f322191d;
        this.f322220e = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.J(1).plus(kotlinx.coroutines.t3.a(null, 1, null)));
        this.f322225j = new java.lang.Object();
        this.f322224i = new ly0.b(new java.lang.ref.WeakReference(this));
        int i17 = kotlinx.coroutines.r0.N0;
        this.f322227l = new ly0.k(kotlinx.coroutines.q0.f310567d, this);
        this.f322226k = new ly0.c(this);
    }

    public static final void a(ly0.n nVar, java.lang.String str, ly0.d dVar, boolean z17) {
        boolean z18;
        java.util.Objects.toString(nVar.f322219d);
        if (nVar.f322219d != ly0.e.f322194g) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AIGC.AIMediaGeneratePollingTask", "tryQueryResult - state is not WAITING_NEXT_QUERY, but " + nVar.f322219d);
            return;
        }
        if (dVar != null) {
            dVar.toString();
            int i17 = dVar.f322187a;
            if (i17 <= dVar.f322190d) {
                dVar.f322187a = i17 + 1;
                z18 = true;
            } else {
                z18 = false;
            }
            if (!z18) {
                return;
            }
        }
        java.lang.Object value = ((kotlin.Result) kotlinx.coroutines.l.f(null, new ly0.f(nVar, str, dVar, null), 1, null)).getValue();
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(value);
        if (m524exceptionOrNullimpl != null) {
            nVar.f(m524exceptionOrNullimpl);
            return;
        }
        if (kotlin.Result.m527isFailureimpl(value)) {
            value = null;
        }
        java.util.List list = (java.util.List) value;
        if (list == null || list.isEmpty()) {
            if (z17) {
                if (dVar == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AIGC.AIMediaGeneratePollingTask", "tryQueryResult - queryState is null");
                    return;
                } else {
                    nVar.f322222g = kotlinx.coroutines.l.d(nVar.f322220e, nVar.f322227l, null, new ly0.j(new ly0.h(dVar, nVar, null), null), 2, null);
                    return;
                }
            }
            return;
        }
        synchronized (nVar.f322225j) {
            java.util.Objects.toString(nVar.f322219d);
            nVar.d();
            yz5.l lVar = nVar.f322226k;
            if (lVar == null) {
                return;
            }
            nVar.f322219d = ly0.e.f322197m;
            nVar.b();
            ((ly0.c) lVar).invoke(new ly0.x(str, list));
            nVar.f322226k = null;
        }
    }

    public final void b() {
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            kotlinx.coroutines.r2 r2Var = this.f322222g;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            this.f322222g = null;
            kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
    }

    public abstract void c();

    public final void d() {
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            kotlinx.coroutines.r2 r2Var = this.f322223h;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            this.f322223h = null;
            kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
    }

    public abstract java.lang.Object e(java.lang.String str, ly0.d dVar, kotlin.coroutines.Continuation continuation);

    public final void f(java.lang.Throwable normalException) {
        ky0.e eVar;
        ky0.e eVar2;
        synchronized (this.f322225j) {
            java.util.Objects.toString(this.f322219d);
            java.util.Objects.toString(normalException);
            d();
            yz5.l lVar = this.f322226k;
            if (lVar == null) {
                return;
            }
            b();
            this.f322219d = ly0.e.f322196i;
            b();
            kotlin.jvm.internal.o.g(normalException, "normalException");
            if (normalException instanceof ky0.e) {
                eVar2 = (ky0.e) normalException;
            } else {
                if (normalException instanceof java.util.concurrent.CancellationException) {
                    java.lang.String message = normalException.getMessage();
                    if (message == null) {
                        message = "Cancel";
                    }
                    eVar = new ky0.e(-6, message);
                } else {
                    java.lang.String message2 = normalException.getMessage();
                    if (message2 == null) {
                        message2 = "Unknown error";
                    }
                    eVar = new ky0.e(-1000, message2);
                }
                eVar2 = eVar;
            }
            lVar.invoke(new ly0.w(eVar2));
            this.f322226k = null;
        }
    }

    public abstract java.lang.Object g(java.util.List list, kotlin.coroutines.Continuation continuation);
}
