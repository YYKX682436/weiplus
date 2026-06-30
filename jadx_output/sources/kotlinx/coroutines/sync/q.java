package kotlinx.coroutines.sync;

/* loaded from: classes14.dex */
public final class q extends kotlinx.coroutines.internal.i0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray f310676e;

    public q(long j17, kotlinx.coroutines.sync.q qVar, int i17) {
        super(j17, qVar, i17);
        this.f310676e = new java.util.concurrent.atomic.AtomicReferenceArray(kotlinx.coroutines.sync.p.f310675f);
    }

    @Override // kotlinx.coroutines.internal.i0
    public int f() {
        return kotlinx.coroutines.sync.p.f310675f;
    }

    public java.lang.String toString() {
        return "SemaphoreSegment[id=" + this.f310501c + ", hashCode=" + hashCode() + ']';
    }
}
