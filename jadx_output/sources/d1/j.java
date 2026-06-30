package d1;

/* loaded from: classes14.dex */
public abstract class j {
    public static final d1.i a(float f17, float f18, float f19, float f27, long j17) {
        long a17 = d1.b.a(d1.a.b(j17), d1.a.c(j17));
        return new d1.i(f17, f18, f19, f27, a17, a17, a17, a17, null);
    }

    public static final boolean b(d1.i iVar) {
        kotlin.jvm.internal.o.g(iVar, "<this>");
        long j17 = iVar.f225637e;
        if (d1.a.b(j17) == d1.a.c(j17)) {
            float b17 = d1.a.b(j17);
            long j18 = iVar.f225638f;
            if (b17 == d1.a.b(j18)) {
                if (d1.a.b(j17) == d1.a.c(j18)) {
                    float b18 = d1.a.b(j17);
                    long j19 = iVar.f225639g;
                    if (b18 == d1.a.b(j19)) {
                        if (d1.a.b(j17) == d1.a.c(j19)) {
                            float b19 = d1.a.b(j17);
                            long j27 = iVar.f225640h;
                            if (b19 == d1.a.b(j27)) {
                                if (d1.a.b(j17) == d1.a.c(j27)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
