package gr5;

/* loaded from: classes15.dex */
public abstract class o {
    public static final java.lang.String a(gr5.n nVar) {
        kotlin.jvm.internal.o.g(nVar, "<this>");
        int i17 = gr5.n.f274941a;
        if (kotlin.jvm.internal.o.b(nVar, gr5.m.f274937d)) {
            return "FillWidth";
        }
        if (kotlin.jvm.internal.o.b(nVar, gr5.m.f274936c)) {
            return "FillHeight";
        }
        if (kotlin.jvm.internal.o.b(nVar, gr5.m.f274940g)) {
            return "FillBounds";
        }
        if (kotlin.jvm.internal.o.b(nVar, gr5.m.f274935b)) {
            return "Fit";
        }
        if (kotlin.jvm.internal.o.b(nVar, gr5.m.f274934a)) {
            return "Crop";
        }
        if (kotlin.jvm.internal.o.b(nVar, gr5.m.f274938e)) {
            return "Inside";
        }
        if (kotlin.jvm.internal.o.b(nVar, gr5.m.f274939f)) {
            return "None";
        }
        return "Unknown ContentScaleCompat: " + nVar;
    }
}
