package d26;

/* loaded from: classes16.dex */
public final class f extends r16.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f225991a;

    public f(java.util.List list) {
        this.f225991a = list;
    }

    @Override // r16.p
    public void a(o06.d fakeOverride) {
        kotlin.jvm.internal.o.g(fakeOverride, "fakeOverride");
        r16.x.r(fakeOverride, null);
        this.f225991a.add(fakeOverride);
    }

    @Override // r16.o
    public void c(o06.d fromSuper, o06.d fromCurrent) {
        kotlin.jvm.internal.o.g(fromSuper, "fromSuper");
        kotlin.jvm.internal.o.g(fromCurrent, "fromCurrent");
        if (fromCurrent instanceof r06.j0) {
            ((r06.j0) fromCurrent).z0(o06.h0.f341967a, fromSuper);
        }
    }
}
