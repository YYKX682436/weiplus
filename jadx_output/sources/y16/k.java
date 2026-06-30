package y16;

/* loaded from: classes16.dex */
public final class k extends r16.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f458963a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y16.l f458964b;

    public k(java.util.ArrayList arrayList, y16.l lVar) {
        this.f458963a = arrayList;
        this.f458964b = lVar;
    }

    @Override // r16.p
    public void a(o06.d fakeOverride) {
        kotlin.jvm.internal.o.g(fakeOverride, "fakeOverride");
        r16.x.r(fakeOverride, null);
        this.f458963a.add(fakeOverride);
    }

    @Override // r16.o
    public void c(o06.d fromSuper, o06.d fromCurrent) {
        kotlin.jvm.internal.o.g(fromSuper, "fromSuper");
        kotlin.jvm.internal.o.g(fromCurrent, "fromCurrent");
        throw new java.lang.IllegalStateException(("Conflict in scope of " + this.f458964b.f458966b + ": " + fromSuper + " vs " + fromCurrent).toString());
    }
}
