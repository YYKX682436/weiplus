package kotlinx.coroutines;

/* loaded from: classes14.dex */
public final class y3 extends kotlinx.coroutines.internal.h0 implements java.lang.Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final long f310706g;

    public y3(long j17, kotlin.coroutines.Continuation continuation) {
        super(continuation.getContext(), continuation);
        this.f310706g = j17;
    }

    @Override // kotlinx.coroutines.a, kotlinx.coroutines.c3
    public java.lang.String W() {
        return super.W() + "(timeMillis=" + this.f310706g + ')';
    }

    @Override // java.lang.Runnable
    public void run() {
        y(new kotlinx.coroutines.x3("Timed out waiting for " + this.f310706g + " ms", this));
    }
}
