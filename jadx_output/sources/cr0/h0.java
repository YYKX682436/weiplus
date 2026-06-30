package cr0;

/* loaded from: classes12.dex */
public abstract class h0 extends rh.d3 {

    /* renamed from: k, reason: collision with root package name */
    public static final cr0.b0 f221633k = new cr0.b0(null);

    /* renamed from: d, reason: collision with root package name */
    public rh.x2 f221634d = rh.x2.b(0L);

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f221635e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f221636f;

    /* renamed from: g, reason: collision with root package name */
    public rh.x2 f221637g;

    /* renamed from: h, reason: collision with root package name */
    public rh.x2 f221638h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f221639i;

    /* renamed from: j, reason: collision with root package name */
    public rh.x2 f221640j;

    public h0() {
        jz5.i iVar = jz5.i.f302829d;
        this.f221635e = jz5.h.a(iVar, cr0.e0.f221619d);
        this.f221636f = jz5.h.a(iVar, cr0.g0.f221629d);
        this.f221637g = rh.x2.b(0L);
        this.f221638h = rh.x2.b(0L);
        this.f221639i = kz5.p0.f313996d;
        this.f221640j = rh.x2.b(0L);
    }

    public final java.util.List b() {
        return (java.util.List) this.f221635e.getValue();
    }

    public final java.util.List c() {
        return (java.util.List) this.f221636f.getValue();
    }

    public final void d() {
        java.lang.Long l17;
        java.lang.Object obj;
        java.lang.Object obj2;
        rh.x2 x2Var;
        rh.x2 x2Var2;
        java.lang.Long l18;
        java.util.Iterator it = b().iterator();
        long j17 = 0;
        long j18 = 0;
        while (it.hasNext()) {
            java.lang.Number number = ((cr0.d0) it.next()).f221605e.f395552a;
            kotlin.jvm.internal.o.f(number, "get(...)");
            j18 += ((java.lang.Long) number).longValue();
        }
        this.f221637g = rh.x2.b(java.lang.Long.valueOf(j18));
        java.util.Iterator it6 = c().iterator();
        long j19 = 0;
        while (it6.hasNext()) {
            java.lang.Number number2 = ((cr0.d0) it6.next()).f221605e.f395552a;
            kotlin.jvm.internal.o.f(number2, "get(...)");
            j19 += ((java.lang.Long) number2).longValue();
        }
        this.f221638h = rh.x2.b(java.lang.Long.valueOf(j19));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List[] listArr = new java.util.List[2];
        java.util.List b17 = b();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(b17, 10));
        java.util.Iterator it7 = b17.iterator();
        while (it7.hasNext()) {
            arrayList2.add(((cr0.d0) it7.next()).f221604d);
        }
        listArr[0] = arrayList2;
        java.util.List c17 = c();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(c17, 10));
        java.util.Iterator it8 = c17.iterator();
        while (it8.hasNext()) {
            arrayList3.add(((cr0.d0) it8.next()).f221604d);
        }
        listArr[1] = arrayList3;
        for (java.lang.String str : kz5.n0.Q(kz5.d0.r(kz5.c0.i(listArr)))) {
            java.util.Iterator it9 = b().iterator();
            while (true) {
                l17 = null;
                if (it9.hasNext()) {
                    obj = it9.next();
                    if (kotlin.jvm.internal.o.b(((cr0.d0) obj).f221604d, str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            cr0.d0 d0Var = (cr0.d0) obj;
            long longValue = (d0Var == null || (x2Var2 = d0Var.f221605e) == null || (l18 = (java.lang.Long) x2Var2.f395552a) == null) ? 0L : l18.longValue();
            java.util.Iterator it10 = c().iterator();
            while (true) {
                if (it10.hasNext()) {
                    obj2 = it10.next();
                    if (kotlin.jvm.internal.o.b(((cr0.d0) obj2).f221604d, str)) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            cr0.d0 d0Var2 = (cr0.d0) obj2;
            if (d0Var2 != null && (x2Var = d0Var2.f221605e) != null) {
                l17 = (java.lang.Long) x2Var.f395552a;
            }
            arrayList.add(new cr0.d0(str, longValue + (l17 == null ? 0L : l17.longValue())));
        }
        java.util.List S0 = kz5.n0.S0(kz5.n0.F0(arrayList, new cr0.f0()));
        this.f221639i = S0;
        java.util.Iterator it11 = S0.iterator();
        while (it11.hasNext()) {
            java.lang.Number number3 = ((cr0.d0) it11.next()).f221605e.f395552a;
            kotlin.jvm.internal.o.f(number3, "get(...)");
            j17 += ((java.lang.Long) number3).longValue();
        }
        this.f221640j = rh.x2.b(java.lang.Long.valueOf(j17));
    }
}
