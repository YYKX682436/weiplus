package kh;

/* loaded from: classes12.dex */
public final class f1 {
    public f1(kotlin.jvm.internal.i iVar) {
    }

    public final kh.g1 a(java.lang.String target, java.lang.String callback, int i17, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(target, "target");
        kotlin.jvm.internal.o.g(callback, "callback");
        kh.g1 g1Var = (kh.g1) ((pj.g) kh.g1.f307807h.getValue()).b();
        g1Var.f307812e = ((java.util.concurrent.atomic.AtomicInteger) kh.g1.f307806g.getValue()).getAndIncrement();
        g1Var.f307808a = target;
        g1Var.f307809b = callback;
        g1Var.f307810c = i17;
        g1Var.f307811d = obj;
        return g1Var;
    }
}
