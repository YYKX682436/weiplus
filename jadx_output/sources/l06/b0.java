package l06;

/* loaded from: classes15.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Set f314874a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f314875b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f314876c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Set f314877d;

    static {
        l06.a0[] values = l06.a0.values();
        java.util.ArrayList arrayList = new java.util.ArrayList(values.length);
        for (l06.a0 a0Var : values) {
            arrayList.add(a0Var.f314870e);
        }
        f314874a = kz5.n0.X0(arrayList);
        l06.z[] values2 = l06.z.values();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(values2.length);
        for (l06.z zVar : values2) {
            arrayList2.add(zVar.f314968d);
        }
        kz5.n0.X0(arrayList2);
        f314875b = new java.util.HashMap();
        f314876c = new java.util.HashMap();
        kz5.c1.i(new jz5.l(l06.z.f314963e, n16.g.k("ubyteArrayOf")), new jz5.l(l06.z.f314964f, n16.g.k("ushortArrayOf")), new jz5.l(l06.z.f314965g, n16.g.k("uintArrayOf")), new jz5.l(l06.z.f314966h, n16.g.k("ulongArrayOf")));
        l06.a0[] values3 = l06.a0.values();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (l06.a0 a0Var2 : values3) {
            linkedHashSet.add(a0Var2.f314871f.j());
        }
        f314877d = linkedHashSet;
        for (l06.a0 a0Var3 : l06.a0.values()) {
            java.util.HashMap hashMap = f314875b;
            n16.b bVar = a0Var3.f314871f;
            n16.b bVar2 = a0Var3.f314869d;
            hashMap.put(bVar, bVar2);
            f314876c.put(bVar2, a0Var3.f314871f);
        }
    }

    public static final boolean a(f26.o0 type) {
        o06.j i17;
        kotlin.jvm.internal.o.g(type, "type");
        if (f26.z2.o(type) || (i17 = type.w0().i()) == null) {
            return false;
        }
        o06.m e17 = i17.e();
        return (e17 instanceof o06.d1) && kotlin.jvm.internal.o.b(((r06.z0) ((o06.d1) e17)).f368566h, l06.x.f314956k) && f314874a.contains(i17.getName());
    }
}
