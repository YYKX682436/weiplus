package jg0;

/* loaded from: classes12.dex */
public final class q extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jg0.x f299605d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qi3.f0 f299606e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(jg0.x xVar, qi3.f0 f0Var, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f299605d = xVar;
        this.f299606e = f0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new jg0.q(this.f299605d, this.f299606e, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((jg0.q) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        cv.h1 h1Var = (cv.h1) i95.n0.c(cv.h1.class);
        jg0.x xVar = this.f299605d;
        java.lang.String str = xVar.f299638i.f41049b;
        ((bv.p0) h1Var).getClass();
        w21.w0 j17 = w21.x0.j(str);
        boolean z17 = false;
        if (j17 != null && j17.f442492i == 1) {
            z17 = true;
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!z17) {
            return f0Var;
        }
        cg0.d dVar = xVar.f299638i;
        dVar.f41054g = true;
        j17.f442492i = 2;
        j17.f442484a = 64;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = jg0.x.f299637r;
        java.lang.String str2 = dVar.f41049b;
        java.lang.Object obj2 = xVar.f299638i.f41057j;
        concurrentHashMap.put(str2, new java.lang.ref.WeakReference(obj2 instanceof com.tencent.mm.modelbase.g1 ? (com.tencent.mm.modelbase.g1) obj2 : null));
        if (!((bv.p0) ((cv.i1) i95.n0.c(cv.i1.class))).Ui(xVar.f299638i.f41049b, j17)) {
            this.f299606e.f363700a = -520014;
        }
        return f0Var;
    }
}
