package kotlinx.coroutines;

/* loaded from: classes5.dex */
public final class r1 implements kotlinx.coroutines.s1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.Future f310579d;

    public r1(java.util.concurrent.Future future) {
        this.f310579d = future;
    }

    @Override // kotlinx.coroutines.s1
    public void dispose() {
        this.f310579d.cancel(false);
    }

    public java.lang.String toString() {
        return "DisposableFutureHandle[" + this.f310579d + ']';
    }
}
