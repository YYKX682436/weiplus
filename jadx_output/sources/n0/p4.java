package n0;

/* loaded from: classes14.dex */
public final class p4 extends x0.a1 {

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Object f333672c;

    public p4(java.lang.Object obj) {
        this.f333672c = obj;
    }

    @Override // x0.a1
    public void a(x0.a1 value) {
        kotlin.jvm.internal.o.g(value, "value");
        this.f333672c = ((n0.p4) value).f333672c;
    }

    @Override // x0.a1
    public x0.a1 b() {
        return new n0.p4(this.f333672c);
    }
}
