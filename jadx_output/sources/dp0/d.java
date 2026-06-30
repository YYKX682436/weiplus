package dp0;

/* loaded from: classes15.dex */
public abstract class d implements zo0.k {

    /* renamed from: a, reason: collision with root package name */
    public dp0.d f242114a;

    /* renamed from: b, reason: collision with root package name */
    public final dp0.b f242115b = dp0.b.f242107e;

    /* renamed from: c, reason: collision with root package name */
    public dp0.c f242116c = dp0.c.f242110d;

    public final dp0.d c(dp0.d next) {
        kotlin.jvm.internal.o.g(next, "next");
        dp0.d dVar = this.f242114a;
        if (dVar == null) {
            this.f242114a = next;
        } else {
            kotlin.jvm.internal.o.d(dVar);
            dVar.c(next);
        }
        return this;
    }
}
