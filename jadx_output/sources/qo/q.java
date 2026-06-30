package qo;

/* loaded from: classes12.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final qo.q f365321a = new qo.q();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f365322b = jz5.h.a(jz5.i.f302829d, qo.n.f365318d);

    public final java.util.concurrent.Executor a(java.lang.String tag, yz5.a aVar) {
        java.util.concurrent.Executor executor;
        kotlin.jvm.internal.o.g(tag, "tag");
        if (((java.lang.Boolean) f365322b.getValue()).booleanValue()) {
            return new qo.p(tag);
        }
        if (aVar != null && (executor = (java.util.concurrent.Executor) aVar.invoke()) != null) {
            return executor;
        }
        java.util.concurrent.ExecutorService newSingleThreadExecutor = java.util.concurrent.Executors.newSingleThreadExecutor();
        kotlin.jvm.internal.o.f(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
        return newSingleThreadExecutor;
    }
}
