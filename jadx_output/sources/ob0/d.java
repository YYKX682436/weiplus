package ob0;

/* loaded from: classes12.dex */
public abstract class d {
    private ob0.e continuation;
    private final java.lang.String name;

    public d(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        this.name = name;
    }

    public final void attach(ob0.e continuation) {
        kotlin.jvm.internal.o.g(continuation, "continuation");
        this.continuation = continuation;
    }

    public final ob0.e getContinuation() {
        ob0.e eVar = this.continuation;
        kotlin.jvm.internal.o.d(eVar);
        return eVar;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public abstract void onResume();

    public abstract void onSuspend();
}
