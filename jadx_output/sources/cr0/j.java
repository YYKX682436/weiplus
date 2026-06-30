package cr0;

/* loaded from: classes12.dex */
public final class j extends cr0.w {

    /* renamed from: j, reason: collision with root package name */
    public static final cr0.f f221654j = new cr0.f(null);

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f221655i = jz5.h.a(jz5.i.f302829d, cr0.i.f221646d);

    @Override // rh.d3
    public rh.o2 a(rh.d3 d3Var) {
        cr0.j bgn = (cr0.j) d3Var;
        kotlin.jvm.internal.o.g(bgn, "bgn");
        return new cr0.g(bgn, this);
    }

    public final java.util.LinkedHashMap d() {
        return (java.util.LinkedHashMap) this.f221655i.getValue();
    }

    public final void e() {
        java.util.Collection values = d().values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.lang.Long valueOf = java.lang.Long.valueOf(kz5.n0.J0(values));
        if (!(valueOf.longValue() > 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            long longValue = valueOf.longValue();
            java.util.LinkedHashMap d17 = d();
            java.util.ArrayList arrayList = new java.util.ArrayList(d17.size());
            java.util.Iterator it = d17.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(new jz5.l(((java.util.Map.Entry) it.next()).getKey(), java.lang.Long.valueOf(a06.d.c((((java.lang.Number) r4.getValue()).floatValue() * 100.0f) / ((float) longValue)))));
            }
            java.util.Map q17 = kz5.c1.q(kz5.n0.F0(arrayList, new cr0.h()));
            d().clear();
            d().putAll(q17);
        }
    }
}
