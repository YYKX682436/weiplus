package p1;

/* loaded from: classes14.dex */
public abstract class m {
    public static final boolean a(p1.s sVar) {
        kotlin.jvm.internal.o.g(sVar, "<this>");
        return !sVar.f350885g && sVar.f350882d;
    }

    public static final boolean b(p1.s sVar) {
        kotlin.jvm.internal.o.g(sVar, "<this>");
        return (sVar.b() || !sVar.f350885g || sVar.f350882d) ? false : true;
    }

    public static final boolean c(p1.s sVar) {
        kotlin.jvm.internal.o.g(sVar, "<this>");
        return sVar.f350885g && !sVar.f350882d;
    }

    public static final boolean d(p1.s isOutOfBounds, long j17) {
        kotlin.jvm.internal.o.g(isOutOfBounds, "$this$isOutOfBounds");
        long j18 = isOutOfBounds.f350881c;
        float c17 = d1.e.c(j18);
        float d17 = d1.e.d(j18);
        return c17 < 0.0f || c17 > ((float) ((int) (j17 >> 32))) || d17 < 0.0f || d17 > ((float) p2.q.b(j17));
    }

    public static final boolean e(p1.s isOutOfBounds, long j17, long j18) {
        kotlin.jvm.internal.o.g(isOutOfBounds, "$this$isOutOfBounds");
        if (!(isOutOfBounds.f350886h == 1)) {
            return d(isOutOfBounds, j17);
        }
        long j19 = isOutOfBounds.f350881c;
        float c17 = d1.e.c(j19);
        float d17 = d1.e.d(j19);
        return c17 < (-d1.k.d(j18)) || c17 > ((float) ((int) (j17 >> 32))) + d1.k.d(j18) || d17 < (-d1.k.b(j18)) || d17 > ((float) p2.q.b(j17)) + d1.k.b(j18);
    }

    public static final long f(p1.s sVar, boolean z17) {
        long e17 = d1.e.e(sVar.f350881c, sVar.f350884f);
        if (z17 || !sVar.b()) {
            return e17;
        }
        int i17 = d1.e.f225626e;
        return d1.e.f225623b;
    }
}
