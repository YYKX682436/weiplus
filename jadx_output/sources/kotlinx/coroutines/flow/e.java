package kotlinx.coroutines.flow;

/* loaded from: classes14.dex */
public final class e extends v26.g {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f310234i = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.flow.e.class, "consumed");
    private volatile /* synthetic */ int consumed;

    /* renamed from: g, reason: collision with root package name */
    public final u26.t0 f310235g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f310236h;

    public /* synthetic */ e(u26.t0 t0Var, boolean z17, oz5.l lVar, int i17, u26.u uVar, int i18, kotlin.jvm.internal.i iVar) {
        this(t0Var, z17, (i18 & 4) != 0 ? oz5.m.f350329d : lVar, (i18 & 8) != 0 ? -3 : i17, (i18 & 16) != 0 ? u26.u.SUSPEND : uVar);
    }

    @Override // v26.g, kotlinx.coroutines.flow.j
    public java.lang.Object a(kotlinx.coroutines.flow.k kVar, kotlin.coroutines.Continuation continuation) {
        int i17 = this.f433003e;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 != -3) {
            java.lang.Object a17 = super.a(kVar, continuation);
            return a17 == pz5.a.f359186d ? a17 : f0Var;
        }
        j();
        java.lang.Object a18 = kotlinx.coroutines.flow.t.a(kVar, this.f310235g, this.f310236h, continuation);
        return a18 == pz5.a.f359186d ? a18 : f0Var;
    }

    @Override // v26.g
    public java.lang.String c() {
        return "channel=" + this.f310235g;
    }

    @Override // v26.g
    public java.lang.Object f(u26.r0 r0Var, kotlin.coroutines.Continuation continuation) {
        java.lang.Object a17 = kotlinx.coroutines.flow.t.a(new v26.q0(r0Var), this.f310235g, this.f310236h, continuation);
        return a17 == pz5.a.f359186d ? a17 : jz5.f0.f302826a;
    }

    @Override // v26.g
    public v26.g g(oz5.l lVar, int i17, u26.u uVar) {
        return new kotlinx.coroutines.flow.e(this.f310235g, this.f310236h, lVar, i17, uVar);
    }

    @Override // v26.g
    public kotlinx.coroutines.flow.j h() {
        return new kotlinx.coroutines.flow.e(this.f310235g, this.f310236h, null, 0, null, 28, null);
    }

    @Override // v26.g
    public u26.t0 i(kotlinx.coroutines.y0 y0Var) {
        j();
        return this.f433003e == -3 ? this.f310235g : super.i(y0Var);
    }

    public final void j() {
        if (this.f310236h) {
            if (!(f310234i.getAndSet(this, 1) == 0)) {
                throw new java.lang.IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
            }
        }
    }

    public e(u26.t0 t0Var, boolean z17, oz5.l lVar, int i17, u26.u uVar) {
        super(lVar, i17, uVar);
        this.f310235g = t0Var;
        this.f310236h = z17;
        this.consumed = 0;
    }
}
