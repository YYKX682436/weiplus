package j0;

/* loaded from: classes14.dex */
public abstract class u3 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f296581a = r26.i0.s("H", 10);

    public static final long a(a2.o1 style, p2.f density, f2.g fontFamilyResolver, java.lang.String text, int i17) {
        kotlin.jvm.internal.o.g(style, "style");
        kotlin.jvm.internal.o.g(density, "density");
        kotlin.jvm.internal.o.g(fontFamilyResolver, "fontFamilyResolver");
        kotlin.jvm.internal.o.g(text, "text");
        kz5.p0 p0Var = kz5.p0.f313996d;
        long b17 = p2.d.b(0, 0, 0, 0, 15, null);
        i2.e eVar = new i2.e(text, style, p0Var, p0Var, fontFamilyResolver, density);
        return p2.r.a(a06.d.b((float) java.lang.Math.ceil(eVar.b())), a06.d.b((float) java.lang.Math.ceil(new i2.c(eVar, i17, false, b17, null).b())));
    }
}
