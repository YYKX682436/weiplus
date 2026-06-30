package jc3;

/* loaded from: classes7.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final jc3.u0 f298996a = new jc3.u0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Set f298997b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.List f298998c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.List f298999d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.List f299000e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.List f299001f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.List f299002g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.List f299003h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.List f299004i;

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.List f299005j;

    /* renamed from: k, reason: collision with root package name */
    public static final java.util.HashMap f299006k;

    /* renamed from: l, reason: collision with root package name */
    public static final java.util.HashMap f299007l;

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.List f299008m;

    static {
        java.util.Set D0 = kz5.z.D0(jc3.t0.values());
        f298997b = D0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : D0) {
            if (!((jc3.t0) obj).f298992i) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((jc3.t0) it.next()).f298987d);
        }
        f298998c = kz5.n0.S0(arrayList2);
        java.util.Set set = f298997b;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj2 : set) {
            if (((jc3.t0) obj2).f298992i) {
                arrayList3.add(obj2);
            }
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(arrayList3, 10));
        java.util.Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            arrayList4.add(((jc3.t0) it6.next()).f298987d);
        }
        java.util.List S0 = kz5.n0.S0(arrayList4);
        f298999d = S0;
        f299000e = kz5.n0.t0(f298998c, S0);
        java.util.Set set2 = f298997b;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        for (java.lang.Object obj3 : set2) {
            if (((jc3.t0) obj3).f298988e) {
                arrayList5.add(obj3);
            }
        }
        java.util.ArrayList arrayList6 = new java.util.ArrayList(kz5.d0.q(arrayList5, 10));
        java.util.Iterator it7 = arrayList5.iterator();
        while (it7.hasNext()) {
            arrayList6.add(((jc3.t0) it7.next()).f298987d);
        }
        f299001f = kz5.n0.S0(arrayList6);
        java.util.Set set3 = f298997b;
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        for (java.lang.Object obj4 : set3) {
            if (((jc3.t0) obj4).f298989f) {
                arrayList7.add(obj4);
            }
        }
        java.util.ArrayList arrayList8 = new java.util.ArrayList(kz5.d0.q(arrayList7, 10));
        java.util.Iterator it8 = arrayList7.iterator();
        while (it8.hasNext()) {
            arrayList8.add(((jc3.t0) it8.next()).f298987d);
        }
        f299002g = kz5.n0.S0(arrayList8);
        java.util.Set set4 = f298997b;
        java.util.ArrayList arrayList9 = new java.util.ArrayList();
        for (java.lang.Object obj5 : set4) {
            if (((jc3.t0) obj5).f298990g) {
                arrayList9.add(obj5);
            }
        }
        java.util.ArrayList arrayList10 = new java.util.ArrayList(kz5.d0.q(arrayList9, 10));
        java.util.Iterator it9 = arrayList9.iterator();
        while (it9.hasNext()) {
            arrayList10.add(((jc3.t0) it9.next()).f298987d);
        }
        f299003h = kz5.n0.S0(arrayList10);
        java.util.Set set5 = f298997b;
        java.util.ArrayList arrayList11 = new java.util.ArrayList();
        for (java.lang.Object obj6 : set5) {
            if (((jc3.t0) obj6).f298991h) {
                arrayList11.add(obj6);
            }
        }
        java.util.ArrayList arrayList12 = new java.util.ArrayList(kz5.d0.q(arrayList11, 10));
        java.util.Iterator it10 = arrayList11.iterator();
        while (it10.hasNext()) {
            arrayList12.add(((jc3.t0) it10.next()).f298987d);
        }
        f299004i = kz5.n0.S0(arrayList12);
        java.util.Set set6 = f298997b;
        java.util.ArrayList arrayList13 = new java.util.ArrayList();
        for (java.lang.Object obj7 : set6) {
            if (((jc3.t0) obj7).f298993m) {
                arrayList13.add(obj7);
            }
        }
        java.util.ArrayList arrayList14 = new java.util.ArrayList(kz5.d0.q(arrayList13, 10));
        java.util.Iterator it11 = arrayList13.iterator();
        while (it11.hasNext()) {
            arrayList14.add(((jc3.t0) it11.next()).f298987d);
        }
        f299005j = kz5.n0.S0(arrayList14);
        java.util.HashMap hashMap = new java.util.HashMap();
        for (jc3.t0 t0Var : f298997b) {
            hashMap.put(t0Var.f298987d, t0Var.f298994n);
        }
        f299006k = hashMap;
        java.util.HashMap hashMap2 = new java.util.HashMap();
        for (jc3.t0 t0Var2 : f298997b) {
            hashMap2.put(t0Var2.f298994n, t0Var2.f298987d);
        }
        f299007l = hashMap2;
        java.util.Set set7 = f298997b;
        java.util.ArrayList arrayList15 = new java.util.ArrayList();
        for (java.lang.Object obj8 : set7) {
            if (((jc3.t0) obj8).f298995o) {
                arrayList15.add(obj8);
            }
        }
        java.util.ArrayList arrayList16 = new java.util.ArrayList(kz5.d0.q(arrayList15, 10));
        java.util.Iterator it12 = arrayList15.iterator();
        while (it12.hasNext()) {
            arrayList16.add(((jc3.t0) it12.next()).f298987d);
        }
        f299008m = kz5.n0.S0(arrayList16);
    }

    public final boolean a(java.lang.String bizName) {
        kotlin.jvm.internal.o.g(bizName, "bizName");
        return !((java.util.ArrayList) f299000e).contains(bizName);
    }
}
