package v26;

/* loaded from: classes14.dex */
public final class a extends java.util.concurrent.CancellationException {

    /* renamed from: d, reason: collision with root package name */
    public final transient kotlinx.coroutines.flow.k f432972d;

    public a(kotlinx.coroutines.flow.k kVar) {
        super("Flow was aborted, no more elements needed");
        this.f432972d = kVar;
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable fillInStackTrace() {
        setStackTrace(new java.lang.StackTraceElement[0]);
        return this;
    }
}
