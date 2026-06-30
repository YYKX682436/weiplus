package x0;

/* loaded from: classes14.dex */
public final class f0 extends x0.a1 {

    /* renamed from: c, reason: collision with root package name */
    public p0.e f450887c;

    /* renamed from: d, reason: collision with root package name */
    public int f450888d;

    public f0(p0.e list) {
        kotlin.jvm.internal.o.g(list, "list");
        this.f450887c = list;
    }

    @Override // x0.a1
    public void a(x0.a1 value) {
        kotlin.jvm.internal.o.g(value, "value");
        synchronized (x0.j0.f450899a) {
            this.f450887c = ((x0.f0) value).f450887c;
            this.f450888d = ((x0.f0) value).f450888d;
        }
    }

    @Override // x0.a1
    public x0.a1 b() {
        return new x0.f0(this.f450887c);
    }

    public final void c(p0.e eVar) {
        kotlin.jvm.internal.o.g(eVar, "<set-?>");
        this.f450887c = eVar;
    }
}
