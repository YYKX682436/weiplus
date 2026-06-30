package zq5;

/* loaded from: classes15.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final jz5.g f475090a = jz5.h.b(zq5.r.f475089d);

    public static final long a(float f17, float f18) {
        long floatToIntBits = (java.lang.Float.floatToIntBits(f18) & io.flutter.embedding.android.KeyboardMap.kValueMask) | (java.lang.Float.floatToIntBits(f17) << 32);
        zq5.p pVar = zq5.q.f475086b;
        return floatToIntBits;
    }

    public static final long b(zq5.p pVar) {
        kotlin.jvm.internal.o.g(pVar, "<this>");
        return ((zq5.q) ((jz5.n) f475090a).getValue()).f475088a;
    }

    public static final long c(long j17, long j18) {
        return zq5.u.a(zq5.t.b(j17) * zq5.q.b(j18), zq5.t.a(j17) * zq5.q.c(j18));
    }

    public static final java.lang.String d(long j17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(zq5.b.c(zq5.q.b(j17), 2));
        sb6.append('x');
        sb6.append(zq5.b.c(zq5.q.c(j17), 2));
        return sb6.toString();
    }
}
