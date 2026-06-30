package cr0;

/* loaded from: classes12.dex */
public abstract class w extends rh.d3 {

    /* renamed from: h, reason: collision with root package name */
    public static final cr0.u f221786h = new cr0.u(null);

    /* renamed from: d, reason: collision with root package name */
    public rh.x2 f221787d = rh.x2.b(0L);

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f221788e = jz5.h.a(jz5.i.f302829d, cr0.v.f221776d);

    /* renamed from: f, reason: collision with root package name */
    public rh.x2 f221789f = rh.x2.b(0);

    /* renamed from: g, reason: collision with root package name */
    public rh.x2 f221790g = rh.x2.b(0L);

    public final java.util.List b() {
        return (java.util.List) this.f221788e.getValue();
    }

    public final void c() {
        java.util.Iterator it = b().iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Number number = ((cr0.r) it.next()).f221726e.f395552a;
            kotlin.jvm.internal.o.f(number, "get(...)");
            i17 += ((java.lang.Integer) number).intValue();
        }
        this.f221789f = rh.x2.b(java.lang.Integer.valueOf(i17));
        java.util.Iterator it6 = b().iterator();
        long j17 = 0;
        while (it6.hasNext()) {
            java.lang.Number number2 = ((cr0.r) it6.next()).f221727f.f395552a;
            kotlin.jvm.internal.o.f(number2, "get(...)");
            j17 += ((java.lang.Long) number2).longValue();
        }
        this.f221790g = rh.x2.b(java.lang.Long.valueOf(j17));
    }
}
