package l0;

/* loaded from: classes14.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final n0.h3 f314314a = n0.n1.c(l0.j.f314274d);

    public static final long a(l0.i contentColorFor, long j17) {
        kotlin.jvm.internal.o.g(contentColorFor, "$this$contentColorFor");
        if (!e1.y.c(j17, contentColorFor.g()) && !e1.y.c(j17, contentColorFor.h())) {
            if (!e1.y.c(j17, contentColorFor.i()) && !e1.y.c(j17, contentColorFor.j())) {
                return e1.y.c(j17, contentColorFor.b()) ? ((e1.y) ((n0.q4) contentColorFor.f314238j).getValue()).f246322a : e1.y.c(j17, contentColorFor.k()) ? contentColorFor.f() : e1.y.c(j17, contentColorFor.c()) ? ((e1.y) ((n0.q4) contentColorFor.f314240l).getValue()).f246322a : e1.y.f246320k;
            }
            return contentColorFor.e();
        }
        return contentColorFor.d();
    }

    public static final long b(long j17, n0.o oVar, int i17) {
        long a17 = a((l0.i) ((n0.y0) oVar).i(f314314a), j17);
        int i18 = e1.y.f246321l;
        if (a17 != e1.y.f246320k) {
            return a17;
        }
        return ((e1.y) ((n0.y0) oVar).i(l0.p.f314416a)).f246322a;
    }
}
