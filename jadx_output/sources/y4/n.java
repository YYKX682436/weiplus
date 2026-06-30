package y4;

/* loaded from: classes13.dex */
public abstract class n {
    public static boolean a(java.lang.String str) {
        boolean z17;
        z4.b bVar = z4.e0.f470059a;
        java.util.Set<z4.r> unmodifiableSet = java.util.Collections.unmodifiableSet(z4.j.f470068c);
        java.util.HashSet hashSet = new java.util.HashSet();
        for (z4.r rVar : unmodifiableSet) {
            if (((z4.j) rVar).f470069a.equals(str)) {
                hashSet.add(rVar);
            }
        }
        if (hashSet.isEmpty()) {
            throw new java.lang.RuntimeException("Unknown feature " + str);
        }
        java.util.Iterator it = hashSet.iterator();
        do {
            z17 = false;
            if (!it.hasNext()) {
                return false;
            }
            z4.j jVar = (z4.j) ((z4.r) it.next());
            if (jVar.a() || jVar.b()) {
                z17 = true;
            }
        } while (!z17);
        return true;
    }
}
