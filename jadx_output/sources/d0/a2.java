package d0;

/* loaded from: classes14.dex */
public abstract class a2 {
    public static final d0.d2 a(float f17) {
        return new d0.e2(f17, f17, f17, f17, null);
    }

    public static d0.d2 b(float f17, float f18, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            f17 = 0;
        }
        float f19 = f17;
        if ((i17 & 2) != 0) {
            f18 = 0;
        }
        float f27 = f18;
        return new d0.e2(f19, f27, f19, f27, null);
    }

    public static final d0.d2 c(float f17, float f18, float f19, float f27) {
        return new d0.e2(f17, f18, f19, f27, null);
    }

    public static final float d(d0.d2 d2Var, p2.s layoutDirection) {
        kotlin.jvm.internal.o.g(d2Var, "<this>");
        kotlin.jvm.internal.o.g(layoutDirection, "layoutDirection");
        return layoutDirection == p2.s.Ltr ? ((d0.e2) d2Var).b(layoutDirection) : ((d0.e2) d2Var).a(layoutDirection);
    }

    public static final float e(d0.d2 d2Var, p2.s layoutDirection) {
        kotlin.jvm.internal.o.g(d2Var, "<this>");
        kotlin.jvm.internal.o.g(layoutDirection, "layoutDirection");
        return layoutDirection == p2.s.Ltr ? ((d0.e2) d2Var).a(layoutDirection) : ((d0.e2) d2Var).b(layoutDirection);
    }

    public static final z0.t f(z0.t padding, float f17) {
        kotlin.jvm.internal.o.g(padding, "$this$padding");
        boolean z17 = androidx.compose.ui.platform.f3.f10562a;
        return padding.k(new d0.c2(f17, f17, f17, f17, true, androidx.compose.ui.platform.e3.f10553d, null));
    }

    public static final z0.t g(z0.t padding, float f17, float f18) {
        kotlin.jvm.internal.o.g(padding, "$this$padding");
        boolean z17 = androidx.compose.ui.platform.f3.f10562a;
        return padding.k(new d0.c2(f17, f18, f17, f18, true, androidx.compose.ui.platform.e3.f10553d, null));
    }

    public static z0.t h(z0.t tVar, float f17, float f18, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            f17 = 0;
        }
        if ((i17 & 2) != 0) {
            f18 = 0;
        }
        return g(tVar, f17, f18);
    }

    public static final z0.t i(z0.t padding, float f17, float f18, float f19, float f27) {
        kotlin.jvm.internal.o.g(padding, "$this$padding");
        boolean z17 = androidx.compose.ui.platform.f3.f10562a;
        return padding.k(new d0.c2(f17, f18, f19, f27, true, androidx.compose.ui.platform.e3.f10553d, null));
    }

    public static z0.t j(z0.t tVar, float f17, float f18, float f19, float f27, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            f17 = 0;
        }
        if ((i17 & 2) != 0) {
            f18 = 0;
        }
        if ((i17 & 4) != 0) {
            f19 = 0;
        }
        if ((i17 & 8) != 0) {
            f27 = 0;
        }
        return i(tVar, f17, f18, f19, f27);
    }
}
