package zq5;

/* loaded from: classes15.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final jz5.g f475056a = jz5.h.b(zq5.z.f475102d);

    public static final long a(float f17, float f18) {
        long floatToIntBits = (java.lang.Float.floatToIntBits(f18) & io.flutter.embedding.android.KeyboardMap.kValueMask) | (java.lang.Float.floatToIntBits(f17) << 32);
        zq5.x xVar = zq5.y.f475100b;
        return floatToIntBits;
    }

    public static final long b(zq5.x xVar) {
        kotlin.jvm.internal.o.g(xVar, "<this>");
        return ((zq5.y) ((jz5.n) f475056a).getValue()).f475101a;
    }

    public static final java.lang.String c(long j17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        zq5.x xVar = zq5.y.f475100b;
        sb6.append(zq5.b.c(java.lang.Float.intBitsToFloat((int) (j17 >> 32)), 2));
        sb6.append('x');
        sb6.append(zq5.b.c(java.lang.Float.intBitsToFloat((int) (j17 & io.flutter.embedding.android.KeyboardMap.kValueMask)), 2));
        return sb6.toString();
    }
}
