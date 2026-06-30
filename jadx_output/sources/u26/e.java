package u26;

/* loaded from: classes14.dex */
public final class e extends u26.s0 implements kotlinx.coroutines.s1 {

    /* renamed from: g, reason: collision with root package name */
    public final u26.k f424144g;

    /* renamed from: h, reason: collision with root package name */
    public final kotlinx.coroutines.selects.h f424145h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.p f424146i;

    /* renamed from: m, reason: collision with root package name */
    public final int f424147m;

    public e(u26.k kVar, kotlinx.coroutines.selects.h hVar, yz5.p pVar, int i17) {
        this.f424144g = kVar;
        this.f424145h = hVar;
        this.f424146i = pVar;
        this.f424147m = i17;
    }

    @Override // kotlinx.coroutines.internal.t, kotlinx.coroutines.s1
    public void dispose() {
        if (q()) {
            this.f424144g.getClass();
        }
    }

    @Override // u26.u0
    public void g(java.lang.Object obj) {
        java.lang.Object c0Var = this.f424147m == 1 ? new u26.c0(obj) : obj;
        kotlinx.coroutines.selects.f fVar = (kotlinx.coroutines.selects.f) this.f424145h;
        fVar.getClass();
        yz5.l u17 = u(obj);
        try {
            kotlin.coroutines.Continuation b17 = pz5.f.b(pz5.f.a(this.f424146i, c0Var, fVar));
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            kotlinx.coroutines.internal.i.a(b17, kotlin.Result.m521constructorimpl(jz5.f0.f302826a), u17);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            fVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6)));
            throw th6;
        }
    }

    @Override // u26.u0
    public kotlinx.coroutines.internal.l0 h(java.lang.Object obj, kotlinx.coroutines.internal.q qVar) {
        return (kotlinx.coroutines.internal.l0) ((kotlinx.coroutines.selects.f) this.f424145h).E(qVar);
    }

    @Override // kotlinx.coroutines.internal.t
    public java.lang.String toString() {
        return "ReceiveSelect@" + kotlinx.coroutines.c1.a(this) + '[' + this.f424145h + ",receiveMode=" + this.f424147m + ']';
    }

    @Override // u26.s0
    public yz5.l u(java.lang.Object obj) {
        yz5.l lVar = this.f424144g.f424181d;
        if (lVar == null) {
            return null;
        }
        kotlinx.coroutines.selects.f fVar = (kotlinx.coroutines.selects.f) this.f424145h;
        fVar.getClass();
        return new kotlinx.coroutines.internal.c0(lVar, obj, fVar.getContext());
    }

    @Override // u26.s0
    public void w(u26.e0 e0Var) {
        kotlinx.coroutines.selects.f fVar = (kotlinx.coroutines.selects.f) this.f424145h;
        if (fVar.B()) {
            int i17 = this.f424147m;
            if (i17 == 0) {
                fVar.A(e0Var.A());
                return;
            }
            if (i17 != 1) {
                return;
            }
            yz5.p pVar = this.f424146i;
            u26.c0 c0Var = new u26.c0(new u26.a0(e0Var.f424148g));
            fVar.getClass();
            try {
                kotlin.coroutines.Continuation b17 = pz5.f.b(pz5.f.a(pVar, c0Var, fVar));
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                kotlinx.coroutines.internal.i.a(b17, kotlin.Result.m521constructorimpl(jz5.f0.f302826a), null);
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                fVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6)));
                throw th6;
            }
        }
    }
}
