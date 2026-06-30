package mo5;

/* loaded from: classes14.dex */
public final class b implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final to5.c f330425d;

    /* renamed from: e, reason: collision with root package name */
    public java.nio.ByteBuffer f330426e;

    public b(to5.c engineOp) {
        kotlin.jvm.internal.o.g(engineOp, "engineOp");
        this.f330425d = engineOp;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f330426e = null;
    }
}
