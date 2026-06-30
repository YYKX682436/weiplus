package g16;

/* loaded from: classes16.dex */
public final class z implements b26.e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final g16.z f267677a = new g16.z();

    @Override // b26.e0
    public f26.o0 a(i16.l1 proto, java.lang.String flexibleId, f26.z0 lowerBound, f26.z0 upperBound) {
        kotlin.jvm.internal.o.g(proto, "proto");
        kotlin.jvm.internal.o.g(flexibleId, "flexibleId");
        kotlin.jvm.internal.o.g(lowerBound, "lowerBound");
        kotlin.jvm.internal.o.g(upperBound, "upperBound");
        return !kotlin.jvm.internal.o.b(flexibleId, "kotlin.jvm.PlatformType") ? h26.m.c(h26.l.f278364s, flexibleId, lowerBound.toString(), upperBound.toString()) : proto.g(l16.r.f315098g) ? new c16.k(lowerBound, upperBound) : f26.r0.a(lowerBound, upperBound);
    }
}
