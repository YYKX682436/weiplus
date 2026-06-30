package l06;

/* loaded from: classes15.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final l06.e f314879a = new l06.e();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Set f314880b;

    static {
        java.util.Set<l06.r> set = l06.r.f314895h;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(set, 10));
        for (l06.r primitiveType : set) {
            kotlin.jvm.internal.o.g(primitiveType, "primitiveType");
            arrayList.add(l06.x.f314956k.c(primitiveType.f314905d));
        }
        n16.c h17 = l06.w.f314926g.h();
        kotlin.jvm.internal.o.f(h17, "toSafe(...)");
        java.util.List u07 = kz5.n0.u0(arrayList, h17);
        n16.c h18 = l06.w.f314928i.h();
        kotlin.jvm.internal.o.f(h18, "toSafe(...)");
        java.util.List u08 = kz5.n0.u0(u07, h18);
        n16.c h19 = l06.w.f314930k.h();
        kotlin.jvm.internal.o.f(h19, "toSafe(...)");
        java.util.List u09 = kz5.n0.u0(u08, h19);
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator it = ((java.util.ArrayList) u09).iterator();
        while (it.hasNext()) {
            linkedHashSet.add(n16.b.l((n16.c) it.next()));
        }
        f314880b = linkedHashSet;
    }
}
