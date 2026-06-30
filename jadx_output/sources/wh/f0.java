package wh;

/* loaded from: classes12.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wh.a0 f445769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicInteger f445770e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wh.j0 f445771f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f445772g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f445773h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(wh.a0 a0Var, java.util.concurrent.atomic.AtomicInteger atomicInteger, wh.j0 j0Var, float f17, boolean z17) {
        super(4);
        this.f445769d = a0Var;
        this.f445770e = atomicInteger;
        this.f445771f = j0Var;
        this.f445772g = f17;
        this.f445773h = z17;
    }

    @Override // yz5.r
    public /* bridge */ /* synthetic */ java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        return java.lang.Boolean.valueOf(a((wh.z) obj, ((java.lang.Number) obj2).intValue(), ((java.lang.Number) obj3).intValue(), ((java.lang.Number) obj4).intValue()));
    }

    public final boolean a(wh.z node, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(node, "node");
        java.lang.String s17 = r26.i0.s("  ", i17);
        int i27 = node.f445902a;
        int i28 = (i19 * i27) / i18;
        if (i28 < 1) {
            i28 = 1;
        }
        wh.j0 j0Var = this.f445771f;
        float f17 = (i27 * 100.0f) / j0Var.f445812d;
        java.lang.String a17 = wh.g0.f445783d.a(i28, f17);
        boolean z17 = f17 > this.f445772g * ((float) 100);
        boolean z18 = !this.f445773h || z17;
        wh.a0 a0Var = this.f445769d;
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.f445770e;
        if (!z18) {
            int size = ((java.util.ArrayList) j0Var.f(kz5.b0.c(node))).size();
            atomicInteger.getAndAdd(size);
            a0Var.a(s17 + "..(skip " + size + " nodes)");
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(s17);
        sb6.append(a17);
        sb6.append(' ');
        sb6.append(node.f445904c);
        sb6.append('(');
        sb6.append(node.f445902a);
        sb6.append('|');
        java.lang.String format = java.lang.String.format("%.2f%%", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(f17)}, 1));
        kotlin.jvm.internal.o.f(format, "java.lang.String.format(this, *args)");
        sb6.append(format);
        sb6.append(')');
        sb6.append(z17 ? "!!" : "");
        a0Var.a(sb6.toString());
        java.util.List F0 = kz5.n0.F0(((java.util.LinkedHashMap) node.f445903b).values(), new wh.e0());
        int i29 = 0;
        for (java.lang.Object obj : F0) {
            int i37 = i29 + 1;
            if (i29 < 0) {
                kz5.c0.p();
                throw null;
            }
            if (!a((wh.z) obj, i17 + 1, node.f445902a, i28)) {
                atomicInteger.getAndAdd(((java.util.ArrayList) j0Var.f(F0.subList(i37, F0.size()))).size());
                return false;
            }
            i29 = i37;
        }
        return true;
    }
}
