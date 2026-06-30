package d0;

/* loaded from: classes14.dex */
public abstract class a3 {

    /* renamed from: a, reason: collision with root package name */
    public static final d0.s0 f225065a = new d0.s0(d0.q0.Horizontal, 1.0f, new d0.t2(1.0f));

    /* renamed from: b, reason: collision with root package name */
    public static final d0.s0 f225066b = new d0.s0(d0.q0.Vertical, 1.0f, new d0.r2(1.0f));

    /* renamed from: c, reason: collision with root package name */
    public static final d0.s0 f225067c = new d0.s0(d0.q0.Both, 1.0f, new d0.s2(1.0f));

    /* renamed from: d, reason: collision with root package name */
    public static final d0.l3 f225068d = c(z0.a.f468901m, false);

    /* renamed from: e, reason: collision with root package name */
    public static final d0.l3 f225069e = c(z0.a.f468900l, false);

    /* renamed from: f, reason: collision with root package name */
    public static final d0.l3 f225070f = a(z0.a.f468899k, false);

    /* renamed from: g, reason: collision with root package name */
    public static final d0.l3 f225071g = a(z0.a.f468898j, false);

    /* renamed from: h, reason: collision with root package name */
    public static final d0.l3 f225072h = b(z0.a.f468893e, false);

    /* renamed from: i, reason: collision with root package name */
    public static final d0.l3 f225073i = b(z0.a.f468889a, false);

    public static final d0.l3 a(z0.c cVar, boolean z17) {
        return new d0.l3(d0.q0.Vertical, z17, new d0.u2(cVar), cVar, new d0.v2(cVar, z17));
    }

    public static final d0.l3 b(z0.d dVar, boolean z17) {
        return new d0.l3(d0.q0.Both, z17, new d0.w2(dVar), dVar, new d0.x2(dVar, z17));
    }

    public static final d0.l3 c(z0.b bVar, boolean z17) {
        return new d0.l3(d0.q0.Horizontal, z17, new d0.y2(bVar), bVar, new d0.z2(bVar, z17));
    }

    public static final z0.t d(z0.t defaultMinSize, float f17, float f18) {
        kotlin.jvm.internal.o.g(defaultMinSize, "$this$defaultMinSize");
        boolean z17 = androidx.compose.ui.platform.f3.f10562a;
        return defaultMinSize.k(new d0.i3(f17, f18, androidx.compose.ui.platform.e3.f10553d, null));
    }

    public static z0.t e(z0.t tVar, float f17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            f17 = 1.0f;
        }
        kotlin.jvm.internal.o.g(tVar, "<this>");
        return tVar.k(f17 == 1.0f ? f225067c : new d0.s0(d0.q0.Both, f17, new d0.s2(f17)));
    }

    public static z0.t f(z0.t tVar, float f17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            f17 = 1.0f;
        }
        kotlin.jvm.internal.o.g(tVar, "<this>");
        return tVar.k(f17 == 1.0f ? f225065a : new d0.s0(d0.q0.Horizontal, f17, new d0.t2(f17)));
    }

    public static final z0.t g(z0.t height, float f17) {
        kotlin.jvm.internal.o.g(height, "$this$height");
        boolean z17 = androidx.compose.ui.platform.f3.f10562a;
        return height.k(new d0.d3(0.0f, f17, 0.0f, f17, true, androidx.compose.ui.platform.e3.f10553d, 5, null));
    }

    public static final z0.t h(z0.t size, float f17) {
        kotlin.jvm.internal.o.g(size, "$this$size");
        boolean z17 = androidx.compose.ui.platform.f3.f10562a;
        return size.k(new d0.d3(f17, f17, f17, f17, true, androidx.compose.ui.platform.e3.f10553d, null));
    }

    public static final z0.t i(z0.t size, float f17, float f18) {
        kotlin.jvm.internal.o.g(size, "$this$size");
        boolean z17 = androidx.compose.ui.platform.f3.f10562a;
        return size.k(new d0.d3(f17, f18, f17, f18, true, androidx.compose.ui.platform.e3.f10553d, null));
    }

    public static final z0.t j(z0.t width, float f17) {
        kotlin.jvm.internal.o.g(width, "$this$width");
        boolean z17 = androidx.compose.ui.platform.f3.f10562a;
        return width.k(new d0.d3(f17, 0.0f, f17, 0.0f, true, androidx.compose.ui.platform.e3.f10553d, 10, null));
    }

    public static z0.t k(z0.t tVar, z0.c align, boolean z17, int i17, java.lang.Object obj) {
        int i18 = i17 & 1;
        z0.c cVar = z0.a.f468899k;
        if (i18 != 0) {
            int i19 = z0.d.f468903a;
            align = cVar;
        }
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        kotlin.jvm.internal.o.g(tVar, "<this>");
        kotlin.jvm.internal.o.g(align, "align");
        int i27 = z0.d.f468903a;
        return tVar.k((!kotlin.jvm.internal.o.b(align, cVar) || z17) ? (!kotlin.jvm.internal.o.b(align, z0.a.f468898j) || z17) ? a(align, z17) : f225071g : f225070f);
    }

    public static z0.t l(z0.t tVar, z0.d align, boolean z17, int i17, java.lang.Object obj) {
        int i18 = i17 & 1;
        z0.d dVar = z0.a.f468893e;
        if (i18 != 0) {
            int i19 = z0.d.f468903a;
            align = dVar;
        }
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        kotlin.jvm.internal.o.g(tVar, "<this>");
        kotlin.jvm.internal.o.g(align, "align");
        int i27 = z0.d.f468903a;
        return tVar.k((!kotlin.jvm.internal.o.b(align, dVar) || z17) ? (!kotlin.jvm.internal.o.b(align, z0.a.f468889a) || z17) ? b(align, z17) : f225073i : f225072h);
    }
}
