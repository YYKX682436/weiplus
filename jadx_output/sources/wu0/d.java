package wu0;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.l f449654a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f449655b;

    /* renamed from: c, reason: collision with root package name */
    public final wu0.c f449656c;

    public d(yz5.l progressBlock) {
        kotlin.jvm.internal.o.g(progressBlock, "progressBlock");
        this.f449654a = progressBlock;
        this.f449655b = new java.util.concurrent.ConcurrentHashMap();
        this.f449656c = new wu0.c(this, android.os.Looper.getMainLooper());
    }

    public final void a() {
        java.util.Collection<wu0.b> values = this.f449655b.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        float f17 = 0.0f;
        for (wu0.b bVar : values) {
            f17 = f17 + (bVar.f449650a * 0.4f) + (bVar.f449651b * 0.6f);
        }
        float size = f17 / r0.size();
        if (size > 0.999f) {
            size = 0.999f;
        }
        this.f449654a.invoke(java.lang.Float.valueOf(size));
    }
}
