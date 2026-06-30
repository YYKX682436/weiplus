package gr5;

/* loaded from: classes15.dex */
public abstract class c {
    public static final java.lang.String a(gr5.b bVar) {
        kotlin.jvm.internal.o.g(bVar, "<this>");
        int i17 = gr5.b.f274909a;
        if (kotlin.jvm.internal.o.b(bVar, gr5.a.f274899a)) {
            return "TopStart";
        }
        if (kotlin.jvm.internal.o.b(bVar, gr5.a.f274900b)) {
            return "TopCenter";
        }
        if (kotlin.jvm.internal.o.b(bVar, gr5.a.f274901c)) {
            return "TopEnd";
        }
        if (kotlin.jvm.internal.o.b(bVar, gr5.a.f274902d)) {
            return "CenterStart";
        }
        if (kotlin.jvm.internal.o.b(bVar, gr5.a.f274903e)) {
            return "Center";
        }
        if (kotlin.jvm.internal.o.b(bVar, gr5.a.f274904f)) {
            return "CenterEnd";
        }
        if (kotlin.jvm.internal.o.b(bVar, gr5.a.f274905g)) {
            return "BottomStart";
        }
        if (kotlin.jvm.internal.o.b(bVar, gr5.a.f274906h)) {
            return "BottomCenter";
        }
        if (kotlin.jvm.internal.o.b(bVar, gr5.a.f274907i)) {
            return "BottomEnd";
        }
        return "Unknown AlignmentCompat: " + bVar;
    }

    public static final boolean b(gr5.b bVar) {
        kotlin.jvm.internal.o.g(bVar, "<this>");
        int i17 = gr5.b.f274909a;
        return kotlin.jvm.internal.o.b(bVar, gr5.a.f274905g) || kotlin.jvm.internal.o.b(bVar, gr5.a.f274906h) || kotlin.jvm.internal.o.b(bVar, gr5.a.f274907i);
    }

    public static final boolean c(gr5.b bVar) {
        kotlin.jvm.internal.o.g(bVar, "<this>");
        int i17 = gr5.b.f274909a;
        return kotlin.jvm.internal.o.b(bVar, gr5.a.f274901c) || kotlin.jvm.internal.o.b(bVar, gr5.a.f274904f) || kotlin.jvm.internal.o.b(bVar, gr5.a.f274907i);
    }

    public static final boolean d(gr5.b bVar) {
        kotlin.jvm.internal.o.g(bVar, "<this>");
        int i17 = gr5.b.f274909a;
        return kotlin.jvm.internal.o.b(bVar, gr5.a.f274899a) || kotlin.jvm.internal.o.b(bVar, gr5.a.f274902d) || kotlin.jvm.internal.o.b(bVar, gr5.a.f274905g);
    }

    public static final boolean e(gr5.b bVar) {
        kotlin.jvm.internal.o.g(bVar, "<this>");
        int i17 = gr5.b.f274909a;
        return kotlin.jvm.internal.o.b(bVar, gr5.a.f274899a) || kotlin.jvm.internal.o.b(bVar, gr5.a.f274900b) || kotlin.jvm.internal.o.b(bVar, gr5.a.f274901c);
    }

    public static final gr5.b f(gr5.b bVar, java.lang.Boolean bool) {
        kotlin.jvm.internal.o.g(bVar, "<this>");
        if (bool != null && !bool.booleanValue()) {
            return bVar;
        }
        int i17 = gr5.b.f274909a;
        gr5.b bVar2 = gr5.a.f274899a;
        boolean b17 = kotlin.jvm.internal.o.b(bVar, bVar2);
        gr5.b bVar3 = gr5.a.f274901c;
        if (!b17) {
            gr5.b bVar4 = gr5.a.f274900b;
            if (!kotlin.jvm.internal.o.b(bVar, bVar4)) {
                if (!kotlin.jvm.internal.o.b(bVar, bVar3)) {
                    bVar2 = gr5.a.f274902d;
                    boolean b18 = kotlin.jvm.internal.o.b(bVar, bVar2);
                    bVar3 = gr5.a.f274904f;
                    if (!b18) {
                        bVar4 = gr5.a.f274903e;
                        if (!kotlin.jvm.internal.o.b(bVar, bVar4)) {
                            if (!kotlin.jvm.internal.o.b(bVar, bVar3)) {
                                bVar2 = gr5.a.f274905g;
                                boolean b19 = kotlin.jvm.internal.o.b(bVar, bVar2);
                                bVar3 = gr5.a.f274907i;
                                if (!b19) {
                                    bVar4 = gr5.a.f274906h;
                                    if (!kotlin.jvm.internal.o.b(bVar, bVar4)) {
                                        if (!kotlin.jvm.internal.o.b(bVar, bVar3)) {
                                            return bVar;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return bVar2;
            }
            return bVar4;
        }
        return bVar3;
    }
}
