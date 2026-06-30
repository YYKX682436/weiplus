package cr0;

/* loaded from: classes12.dex */
public abstract class a3 extends rh.d3 {

    /* renamed from: d, reason: collision with root package name */
    public rh.x2 f221582d = rh.x2.b(0L);

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f221583e = jz5.h.a(jz5.i.f302829d, cr0.z2.f221821d);

    /* renamed from: f, reason: collision with root package name */
    public rh.x2 f221584f;

    public a3() {
        rh.x2.b(0);
        this.f221584f = rh.x2.b(0L);
    }

    public final java.util.List b() {
        return (java.util.List) this.f221583e.getValue();
    }

    public final void c() {
        java.util.Iterator it = b().iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Number number = ((cr0.w2) it.next()).f221798e.f395552a;
            kotlin.jvm.internal.o.f(number, "get(...)");
            i17 += ((java.lang.Integer) number).intValue();
        }
        rh.x2.b(java.lang.Integer.valueOf(i17));
        java.util.Iterator it6 = b().iterator();
        long j17 = 0;
        while (it6.hasNext()) {
            java.lang.Number number2 = ((cr0.w2) it6.next()).f221799f.f395552a;
            kotlin.jvm.internal.o.f(number2, "get(...)");
            j17 += ((java.lang.Long) number2).longValue();
        }
        this.f221584f = rh.x2.b(java.lang.Long.valueOf(j17));
    }
}
