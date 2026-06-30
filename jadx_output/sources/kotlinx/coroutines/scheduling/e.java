package kotlinx.coroutines.scheduling;

/* loaded from: classes14.dex */
public final class e extends kotlinx.coroutines.scheduling.h {

    /* renamed from: f, reason: collision with root package name */
    public static final kotlinx.coroutines.scheduling.e f310609f = new kotlinx.coroutines.scheduling.e();

    public e() {
        super(kotlinx.coroutines.scheduling.n.f310615b, kotlinx.coroutines.scheduling.n.f310616c, kotlinx.coroutines.scheduling.n.f310617d, "DefaultDispatcher");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new java.lang.UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // kotlinx.coroutines.p0
    public java.lang.String toString() {
        return "Dispatchers.Default";
    }
}
