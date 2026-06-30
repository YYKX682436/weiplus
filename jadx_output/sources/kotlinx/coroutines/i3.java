package kotlinx.coroutines;

/* loaded from: classes14.dex */
public final class i3 extends oz5.a implements kotlinx.coroutines.r2 {

    /* renamed from: d, reason: collision with root package name */
    public static final kotlinx.coroutines.i3 f310478d = new kotlinx.coroutines.i3();

    public i3() {
        super(kotlinx.coroutines.q2.f310571d);
    }

    @Override // kotlinx.coroutines.r2
    public boolean A() {
        return false;
    }

    @Override // kotlinx.coroutines.r2
    public java.lang.Object C(kotlin.coroutines.Continuation continuation) {
        throw new java.lang.UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.r2
    public boolean a() {
        return true;
    }

    @Override // kotlinx.coroutines.r2
    public void b(java.util.concurrent.CancellationException cancellationException) {
    }

    @Override // kotlinx.coroutines.r2
    public q26.n c() {
        return q26.g.f359840a;
    }

    @Override // kotlinx.coroutines.r2
    public boolean isCancelled() {
        return false;
    }

    @Override // kotlinx.coroutines.r2
    public kotlinx.coroutines.s1 p(yz5.l lVar) {
        return kotlinx.coroutines.j3.f310548d;
    }

    @Override // kotlinx.coroutines.r2
    public kotlinx.coroutines.w q(kotlinx.coroutines.y yVar) {
        return kotlinx.coroutines.j3.f310548d;
    }

    @Override // kotlinx.coroutines.r2
    public boolean start() {
        return false;
    }

    public java.lang.String toString() {
        return "NonCancellable";
    }

    @Override // kotlinx.coroutines.r2
    public java.util.concurrent.CancellationException x() {
        throw new java.lang.IllegalStateException("This job is always active");
    }

    @Override // kotlinx.coroutines.r2
    public kotlinx.coroutines.s1 z(boolean z17, boolean z18, yz5.l lVar) {
        return kotlinx.coroutines.j3.f310548d;
    }
}
