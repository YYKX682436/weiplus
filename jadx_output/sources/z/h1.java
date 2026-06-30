package z;

/* loaded from: classes14.dex */
public final class h1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f468677d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f468678e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f468679f;

    /* renamed from: g, reason: collision with root package name */
    public int f468680g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f468681h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z.f1 f468682i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z.i1 f468683m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.l f468684n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(z.f1 f1Var, z.i1 i1Var, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f468682i = f1Var;
        this.f468683m = i1Var;
        this.f468684n = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        z.h1 h1Var = new z.h1(this.f468682i, this.f468683m, this.f468684n, continuation);
        h1Var.f468681h = obj;
        return h1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((z.h1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        z.i1 i1Var;
        z.g1 g1Var;
        boolean z17;
        yz5.l lVar;
        z.g1 g1Var2;
        java.lang.Object obj2;
        java.lang.Object obj3;
        z.g1 g1Var3;
        z.i1 i1Var2;
        java.lang.Throwable th6;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        java.util.concurrent.atomic.AtomicReference atomicReference2;
        pz5.a aVar = pz5.a.f359186d;
        ?? r17 = this.f468680g;
        try {
            try {
                if (r17 == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    oz5.l f11582e = ((kotlinx.coroutines.y0) this.f468681h).getF11582e();
                    int i17 = kotlinx.coroutines.r2.O0;
                    oz5.i iVar = f11582e.get(kotlinx.coroutines.q2.f310571d);
                    kotlin.jvm.internal.o.d(iVar);
                    z.g1 g1Var4 = new z.g1(this.f468682i, (kotlinx.coroutines.r2) iVar);
                    do {
                        i1Var = this.f468683m;
                        java.util.concurrent.atomic.AtomicReference atomicReference3 = i1Var.f468697a;
                        g1Var = (z.g1) atomicReference3.get();
                        z17 = false;
                        if (g1Var != null) {
                            if (!(g1Var4.f468667a.compareTo(g1Var.f468667a) >= 0)) {
                                throw new java.util.concurrent.CancellationException("Current mutation had a higher priority");
                            }
                        }
                        while (true) {
                            if (atomicReference3.compareAndSet(g1Var, g1Var4)) {
                                z17 = true;
                                break;
                            }
                            if (atomicReference3.get() != g1Var) {
                                break;
                            }
                        }
                    } while (!z17);
                    if (g1Var != null) {
                        kotlinx.coroutines.p2.a(g1Var.f468668b, null, 1, null);
                    }
                    kotlinx.coroutines.sync.d dVar = i1Var.f468698b;
                    this.f468681h = g1Var4;
                    this.f468677d = dVar;
                    yz5.l lVar2 = this.f468684n;
                    this.f468678e = lVar2;
                    this.f468679f = i1Var;
                    this.f468680g = 1;
                    kotlinx.coroutines.sync.k kVar = (kotlinx.coroutines.sync.k) dVar;
                    if (kVar.b(null, this) == aVar) {
                        return aVar;
                    }
                    lVar = lVar2;
                    g1Var2 = g1Var4;
                    obj2 = kVar;
                } else {
                    if (r17 != 1) {
                        if (r17 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i1Var2 = (z.i1) this.f468678e;
                        obj3 = (kotlinx.coroutines.sync.d) this.f468677d;
                        g1Var3 = (z.g1) this.f468681h;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            atomicReference2 = i1Var2.f468697a;
                            while (!atomicReference2.compareAndSet(g1Var3, null) && atomicReference2.get() == g1Var3) {
                            }
                            ((kotlinx.coroutines.sync.k) obj3).d(null);
                            return obj;
                        } catch (java.lang.Throwable th7) {
                            th6 = th7;
                            atomicReference = i1Var2.f468697a;
                            while (!atomicReference.compareAndSet(g1Var3, null)) {
                            }
                            throw th6;
                        }
                    }
                    z.i1 i1Var3 = (z.i1) this.f468679f;
                    lVar = (yz5.l) this.f468678e;
                    java.lang.Object obj4 = (kotlinx.coroutines.sync.d) this.f468677d;
                    g1Var2 = (z.g1) this.f468681h;
                    kotlin.ResultKt.throwOnFailure(obj);
                    i1Var = i1Var3;
                    obj2 = obj4;
                }
                this.f468681h = g1Var2;
                this.f468677d = obj3;
                this.f468678e = i1Var;
                this.f468679f = null;
                this.f468680g = 2;
                java.lang.Object invoke = lVar.invoke(this);
                if (invoke == aVar) {
                    return aVar;
                }
                i1Var2 = i1Var;
                obj = invoke;
                g1Var3 = g1Var2;
                atomicReference2 = i1Var2.f468697a;
                while (!atomicReference2.compareAndSet(g1Var3, null)) {
                }
                ((kotlinx.coroutines.sync.k) obj3).d(null);
                return obj;
            } catch (java.lang.Throwable th8) {
                g1Var3 = g1Var2;
                i1Var2 = i1Var;
                th6 = th8;
                atomicReference = i1Var2.f468697a;
                while (!atomicReference.compareAndSet(g1Var3, null) && atomicReference.get() == g1Var3) {
                }
                throw th6;
            }
            obj3 = obj2;
        } catch (java.lang.Throwable th9) {
            ((kotlinx.coroutines.sync.k) r17).d(null);
            throw th9;
        }
    }
}
