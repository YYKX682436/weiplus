package t10;

/* loaded from: classes9.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f414550a;

    /* renamed from: b, reason: collision with root package name */
    public final t10.b f414551b;

    public c(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        this.f414550a = name;
        this.f414551b = new t10.b(this);
    }

    public abstract boolean a(pq.a aVar, bw5.x7 x7Var);

    public abstract void b(pq.a aVar, bw5.x7 x7Var, t10.d dVar);

    public abstract void c(pq.a aVar, bw5.x7 x7Var, bw5.l8 l8Var, t10.d dVar);
}
