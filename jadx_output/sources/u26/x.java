package u26;

/* loaded from: classes14.dex */
public abstract class x extends kotlinx.coroutines.a implements u26.w {

    /* renamed from: f, reason: collision with root package name */
    public final u26.w f424201f;

    public x(oz5.l lVar, u26.w wVar, boolean z17, boolean z18) {
        super(lVar, z17, z18);
        this.f424201f = wVar;
    }

    @Override // kotlinx.coroutines.c3
    public void B(java.lang.Throwable th6) {
        java.util.concurrent.CancellationException cancellationException = th6 instanceof java.util.concurrent.CancellationException ? (java.util.concurrent.CancellationException) th6 : null;
        if (cancellationException == null) {
            cancellationException = new kotlinx.coroutines.s2(E(), th6, this);
        }
        this.f424201f.b(cancellationException);
        y(cancellationException);
    }

    @Override // kotlinx.coroutines.c3, kotlinx.coroutines.r2
    public final void b(java.util.concurrent.CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new kotlinx.coroutines.s2(E(), null, this);
        }
        B(cancellationException);
    }

    @Override // u26.y0
    public java.lang.Object e(java.lang.Object obj) {
        return this.f424201f.e(obj);
    }

    @Override // u26.t0
    public kotlinx.coroutines.selects.g g() {
        return this.f424201f.g();
    }

    @Override // u26.t0
    public java.lang.Object h() {
        return this.f424201f.h();
    }

    @Override // u26.t0
    public java.lang.Object i(kotlin.coroutines.Continuation continuation) {
        java.lang.Object i17 = this.f424201f.i(continuation);
        pz5.a aVar = pz5.a.f359186d;
        return i17;
    }

    @Override // u26.t0
    public boolean isEmpty() {
        return this.f424201f.isEmpty();
    }

    @Override // u26.t0
    public u26.y iterator() {
        return this.f424201f.iterator();
    }

    @Override // u26.y0
    public boolean j() {
        return this.f424201f.j();
    }

    @Override // u26.t0
    public boolean m() {
        return this.f424201f.m();
    }

    @Override // u26.y0
    public void n(yz5.l lVar) {
        this.f424201f.n(lVar);
    }

    @Override // u26.y0
    public boolean offer(java.lang.Object obj) {
        return this.f424201f.offer(obj);
    }

    @Override // u26.t0
    public java.lang.Object r(kotlin.coroutines.Continuation continuation) {
        return this.f424201f.r(continuation);
    }

    @Override // u26.y0
    public boolean s(java.lang.Throwable th6) {
        return this.f424201f.s(th6);
    }

    @Override // u26.y0
    public java.lang.Object t(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return this.f424201f.t(obj, continuation);
    }
}
