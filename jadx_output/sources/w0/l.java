package w0;

/* loaded from: classes14.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f441842a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f441843b;

    /* renamed from: c, reason: collision with root package name */
    public final w0.s f441844c;

    public l(w0.p this$0, java.lang.Object key) {
        kotlin.jvm.internal.o.g(this$0, "this$0");
        kotlin.jvm.internal.o.g(key, "key");
        this.f441842a = key;
        this.f441843b = true;
        java.util.Map map = (java.util.Map) this$0.f441856a.get(key);
        w0.k kVar = new w0.k(this$0);
        n0.h3 h3Var = w0.w.f441867a;
        this.f441844c = new w0.u(map, kVar);
    }
}
