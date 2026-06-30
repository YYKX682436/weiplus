package i0;

/* loaded from: classes14.dex */
public abstract class a implements e1.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final i0.b f286486a;

    /* renamed from: b, reason: collision with root package name */
    public final i0.b f286487b;

    /* renamed from: c, reason: collision with root package name */
    public final i0.b f286488c;

    /* renamed from: d, reason: collision with root package name */
    public final i0.b f286489d;

    public a(i0.b topStart, i0.b topEnd, i0.b bottomEnd, i0.b bottomStart) {
        kotlin.jvm.internal.o.g(topStart, "topStart");
        kotlin.jvm.internal.o.g(topEnd, "topEnd");
        kotlin.jvm.internal.o.g(bottomEnd, "bottomEnd");
        kotlin.jvm.internal.o.g(bottomStart, "bottomStart");
        this.f286486a = topStart;
        this.f286487b = topEnd;
        this.f286488c = bottomEnd;
        this.f286489d = bottomStart;
    }

    @Override // e1.a1
    public final e1.m0 a(long j17, p2.s layoutDirection, p2.f density) {
        kotlin.jvm.internal.o.g(layoutDirection, "layoutDirection");
        kotlin.jvm.internal.o.g(density, "density");
        float a17 = this.f286486a.a(j17, density);
        float a18 = this.f286487b.a(j17, density);
        float a19 = this.f286488c.a(j17, density);
        float a27 = this.f286489d.a(j17, density);
        float c17 = d1.k.c(j17);
        float f17 = a17 + a27;
        if (f17 > c17) {
            float f18 = c17 / f17;
            a17 *= f18;
            a27 *= f18;
        }
        float f19 = a18 + a19;
        if (f19 > c17) {
            float f27 = c17 / f19;
            a18 *= f27;
            a19 *= f27;
        }
        if (!(a17 >= 0.0f && a18 >= 0.0f && a19 >= 0.0f && a27 >= 0.0f)) {
            throw new java.lang.IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + a17 + ", topEnd = " + a18 + ", bottomEnd = " + a19 + ", bottomStart = " + a27 + ")!").toString());
        }
        if (((a17 + a18) + a19) + a27 == 0.0f) {
            return new e1.k0(d1.h.a(d1.e.f225623b, j17));
        }
        d1.g a28 = d1.h.a(d1.e.f225623b, j17);
        p2.s sVar = p2.s.Ltr;
        long b17 = d1.b.b(layoutDirection == sVar ? a17 : a18, 0.0f, 2, null);
        if (layoutDirection == sVar) {
            a17 = a18;
        }
        long b18 = d1.b.b(a17, 0.0f, 2, null);
        long b19 = d1.b.b(layoutDirection == sVar ? a19 : a27, 0.0f, 2, null);
        if (layoutDirection != sVar) {
            a27 = a19;
        }
        return new e1.l0(new d1.i(a28.f225629a, a28.f225630b, a28.f225631c, a28.f225632d, b17, b18, b19, d1.b.b(a27, 0.0f, 2, null), null));
    }

    public abstract i0.a b(i0.b bVar, i0.b bVar2, i0.b bVar3, i0.b bVar4);
}
