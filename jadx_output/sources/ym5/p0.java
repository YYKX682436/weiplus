package ym5;

/* loaded from: classes15.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ym5.p0 f463459d = new ym5.p0();

    public p0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.Iterator it = ym5.a1.f463190b.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            ym5.r0.a(ym5.r0.f463485a, ((ym5.b1) entry.getValue()).f463210a, (ym5.b1) entry.getValue());
            if (((ym5.b1) entry.getValue()).f463219j || ((ym5.b1) entry.getValue()).f463218i) {
                it.remove();
            }
        }
        ym5.r0 r0Var = ym5.r0.f463485a;
        ym5.r0.f463488d = ym5.a1.f463190b.size();
        ym5.r0.f463486b = java.lang.System.nanoTime();
        return jz5.f0.f302826a;
    }
}
