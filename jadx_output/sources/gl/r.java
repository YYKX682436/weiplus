package gl;

/* loaded from: classes14.dex */
public interface r {
    boolean a();

    void b();

    java.lang.Object c(kotlin.coroutines.Continuation continuation);

    java.lang.Object d(kotlin.coroutines.Continuation continuation);

    default void e(android.content.Intent intent) {
        kotlin.jvm.internal.o.g(intent, "intent");
    }

    java.lang.Object f(kotlin.coroutines.Continuation continuation);

    default void g(int i17, java.lang.String str) {
    }

    java.lang.Object h(kotlin.coroutines.Continuation continuation);

    boolean i();

    void j(gl.q qVar);

    boolean k();

    void release();
}
