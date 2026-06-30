package y;

/* loaded from: classes14.dex */
public abstract class x0 {

    /* renamed from: a, reason: collision with root package name */
    public static final z.w2 f458469a = z.q3.a(y.h0.f458356d, y.i0.f458367d);

    /* renamed from: b, reason: collision with root package name */
    public static final n0.v2 f458470b = n0.s4.c(java.lang.Float.valueOf(1.0f), null, 2, null);

    /* renamed from: c, reason: collision with root package name */
    public static final z.p1 f458471c = z.q.c(0.0f, 400.0f, null, 5, null);

    /* renamed from: d, reason: collision with root package name */
    public static final z.p1 f458472d;

    /* renamed from: e, reason: collision with root package name */
    public static final z.p1 f458473e;

    static {
        int i17 = p2.m.f351389c;
        f458472d = z.q.c(0.0f, 400.0f, new p2.m(p2.n.a(1, 1)), 1, null);
        f458473e = z.q.c(0.0f, 400.0f, new p2.q(z.f4.a(p2.q.f351395b)), 1, null);
    }

    public static final y.y0 a(z.k0 animationSpec, z0.d expandFrom, boolean z17, yz5.l initialSize) {
        kotlin.jvm.internal.o.g(animationSpec, "animationSpec");
        kotlin.jvm.internal.o.g(expandFrom, "expandFrom");
        kotlin.jvm.internal.o.g(initialSize, "initialSize");
        return new y.z0(new y.a2(null, null, new y.u(expandFrom, initialSize, animationSpec, z17), null, 11, null));
    }

    public static y.y0 b(z.k0 animationSpec, float f17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            animationSpec = z.q.c(0.0f, 400.0f, null, 5, null);
        }
        if ((i17 & 2) != 0) {
            f17 = 0.0f;
        }
        kotlin.jvm.internal.o.g(animationSpec, "animationSpec");
        return new y.z0(new y.a2(new y.i1(f17, animationSpec), null, null, null, 14, null));
    }

    public static y.a1 c(z.k0 animationSpec, float f17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            animationSpec = z.q.c(0.0f, 400.0f, null, 5, null);
        }
        if ((i17 & 2) != 0) {
            f17 = 0.0f;
        }
        kotlin.jvm.internal.o.g(animationSpec, "animationSpec");
        return new y.b1(new y.a2(new y.i1(f17, animationSpec), null, null, null, 14, null));
    }

    public static final y.a1 d(z.k0 animationSpec, z0.d shrinkTowards, boolean z17, yz5.l targetSize) {
        kotlin.jvm.internal.o.g(animationSpec, "animationSpec");
        kotlin.jvm.internal.o.g(shrinkTowards, "shrinkTowards");
        kotlin.jvm.internal.o.g(targetSize, "targetSize");
        return new y.b1(new y.a2(null, null, new y.u(shrinkTowards, targetSize, animationSpec, z17), null, 11, null));
    }

    public static final y.y0 e(z.k0 animationSpec, yz5.l initialOffsetY) {
        kotlin.jvm.internal.o.g(animationSpec, "animationSpec");
        kotlin.jvm.internal.o.g(initialOffsetY, "initialOffsetY");
        return new y.z0(new y.a2(null, new y.t1(new y.v0(initialOffsetY), animationSpec), null, null, 13, null));
    }

    public static final y.a1 f(z.k0 animationSpec, yz5.l targetOffsetY) {
        kotlin.jvm.internal.o.g(animationSpec, "animationSpec");
        kotlin.jvm.internal.o.g(targetOffsetY, "targetOffsetY");
        return new y.b1(new y.a2(null, new y.t1(new y.w0(targetOffsetY), animationSpec), null, null, 13, null));
    }
}
