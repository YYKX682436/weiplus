package s1;

/* loaded from: classes14.dex */
public abstract class n1 {

    /* renamed from: a, reason: collision with root package name */
    public static final s1.m1 f402041a = new s1.m1(null);

    /* renamed from: b, reason: collision with root package name */
    public static p2.s f402042b = p2.s.Ltr;

    /* renamed from: c, reason: collision with root package name */
    public static int f402043c;

    public static final int a(s1.n1 n1Var) {
        ((s1.m1) n1Var).getClass();
        return f402043c;
    }

    public static void b(s1.n1 n1Var, s1.o1 o1Var, int i17, int i18, float f17, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
        }
        if ((i19 & 4) != 0) {
            f17 = 0.0f;
        }
        n1Var.getClass();
        kotlin.jvm.internal.o.g(o1Var, "<this>");
        long a17 = p2.n.a(i17, i18);
        long u17 = o1Var.u();
        o1Var.B(p2.n.a(((int) (a17 >> 32)) + ((int) (u17 >> 32)), p2.m.b(a17) + p2.m.b(u17)), f17, null);
    }

    public static /* synthetic */ void d(s1.n1 n1Var, s1.o1 o1Var, long j17, float f17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
        }
        if ((i17 & 2) != 0) {
            f17 = 0.0f;
        }
        n1Var.c(o1Var, j17, f17);
    }

    public static void e(s1.n1 n1Var, s1.o1 o1Var, int i17, int i18, float f17, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
        }
        if ((i19 & 4) != 0) {
            f17 = 0.0f;
        }
        n1Var.getClass();
        kotlin.jvm.internal.o.g(o1Var, "<this>");
        long a17 = p2.n.a(i17, i18);
        if (f402042b == p2.s.Ltr || a(n1Var) == 0) {
            long u17 = o1Var.u();
            o1Var.B(p2.n.a(((int) (a17 >> 32)) + ((int) (u17 >> 32)), p2.m.b(a17) + p2.m.b(u17)), f17, null);
        } else {
            long a18 = p2.n.a((a(n1Var) - ((int) (o1Var.f402052f >> 32))) - ((int) (a17 >> 32)), p2.m.b(a17));
            long u18 = o1Var.u();
            o1Var.B(p2.n.a(((int) (a18 >> 32)) + ((int) (u18 >> 32)), p2.m.b(a18) + p2.m.b(u18)), f17, null);
        }
    }

    public static void f(s1.n1 n1Var, s1.o1 o1Var, int i17, int i18, float f17, yz5.l layerBlock, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
        }
        if ((i19 & 4) != 0) {
            f17 = 0.0f;
        }
        if ((i19 & 8) != 0) {
            int i27 = s1.q1.f402074b;
            layerBlock = s1.p1.f402057d;
        }
        n1Var.getClass();
        kotlin.jvm.internal.o.g(o1Var, "<this>");
        kotlin.jvm.internal.o.g(layerBlock, "layerBlock");
        long a17 = p2.n.a(i17, i18);
        if (f402042b == p2.s.Ltr || a(n1Var) == 0) {
            long u17 = o1Var.u();
            o1Var.B(p2.n.a(((int) (a17 >> 32)) + ((int) (u17 >> 32)), p2.m.b(a17) + p2.m.b(u17)), f17, layerBlock);
        } else {
            long a18 = p2.n.a((a(n1Var) - ((int) (o1Var.f402052f >> 32))) - ((int) (a17 >> 32)), p2.m.b(a17));
            long u18 = o1Var.u();
            o1Var.B(p2.n.a(((int) (a18 >> 32)) + ((int) (u18 >> 32)), p2.m.b(a18) + p2.m.b(u18)), f17, layerBlock);
        }
    }

    public static void g(s1.n1 n1Var, s1.o1 placeRelativeWithLayer, long j17, float f17, yz5.l layerBlock, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
        }
        if ((i17 & 2) != 0) {
            f17 = 0.0f;
        }
        if ((i17 & 4) != 0) {
            int i18 = s1.q1.f402074b;
            layerBlock = s1.p1.f402057d;
        }
        n1Var.getClass();
        kotlin.jvm.internal.o.g(placeRelativeWithLayer, "$this$placeRelativeWithLayer");
        kotlin.jvm.internal.o.g(layerBlock, "layerBlock");
        if (f402042b == p2.s.Ltr || a(n1Var) == 0) {
            long u17 = placeRelativeWithLayer.u();
            placeRelativeWithLayer.B(p2.n.a(((int) (j17 >> 32)) + ((int) (u17 >> 32)), p2.m.b(j17) + p2.m.b(u17)), f17, layerBlock);
        } else {
            long a17 = p2.n.a((a(n1Var) - ((int) (placeRelativeWithLayer.f402052f >> 32))) - ((int) (j17 >> 32)), p2.m.b(j17));
            long u18 = placeRelativeWithLayer.u();
            placeRelativeWithLayer.B(p2.n.a(((int) (a17 >> 32)) + ((int) (u18 >> 32)), p2.m.b(a17) + p2.m.b(u18)), f17, layerBlock);
        }
    }

    public static void h(s1.n1 n1Var, s1.o1 o1Var, int i17, int i18, float f17, yz5.l layerBlock, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
        }
        if ((i19 & 4) != 0) {
            f17 = 0.0f;
        }
        if ((i19 & 8) != 0) {
            int i27 = s1.q1.f402074b;
            layerBlock = s1.p1.f402057d;
        }
        n1Var.getClass();
        kotlin.jvm.internal.o.g(o1Var, "<this>");
        kotlin.jvm.internal.o.g(layerBlock, "layerBlock");
        long a17 = p2.n.a(i17, i18);
        long u17 = o1Var.u();
        o1Var.B(p2.n.a(((int) (a17 >> 32)) + ((int) (u17 >> 32)), p2.m.b(a17) + p2.m.b(u17)), f17, layerBlock);
    }

    public static /* synthetic */ void j(s1.n1 n1Var, s1.o1 o1Var, long j17, float f17, yz5.l lVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
        }
        if ((i17 & 2) != 0) {
            f17 = 0.0f;
        }
        float f18 = f17;
        if ((i17 & 4) != 0) {
            int i18 = s1.q1.f402074b;
            lVar = s1.p1.f402057d;
        }
        n1Var.i(o1Var, j17, f18, lVar);
    }

    public final void c(s1.o1 place, long j17, float f17) {
        kotlin.jvm.internal.o.g(place, "$this$place");
        long u17 = place.u();
        place.B(p2.n.a(((int) (j17 >> 32)) + ((int) (u17 >> 32)), p2.m.b(j17) + p2.m.b(u17)), f17, null);
    }

    public final void i(s1.o1 placeWithLayer, long j17, float f17, yz5.l layerBlock) {
        kotlin.jvm.internal.o.g(placeWithLayer, "$this$placeWithLayer");
        kotlin.jvm.internal.o.g(layerBlock, "layerBlock");
        long u17 = placeWithLayer.u();
        placeWithLayer.B(p2.n.a(((int) (j17 >> 32)) + ((int) (u17 >> 32)), p2.m.b(j17) + p2.m.b(u17)), f17, layerBlock);
    }
}
