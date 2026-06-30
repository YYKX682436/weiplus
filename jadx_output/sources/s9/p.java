package s9;

/* loaded from: classes13.dex */
public final class p implements s9.j, java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.TreeSet f404970d = new java.util.TreeSet(this);

    /* renamed from: e, reason: collision with root package name */
    public long f404971e;

    public p(long j17) {
    }

    @Override // s9.b
    public void a(s9.c cVar, s9.k kVar, s9.k kVar2) {
        c(cVar, kVar);
        b(cVar, kVar2);
    }

    @Override // s9.b
    public void b(s9.c cVar, s9.k kVar) {
        java.util.TreeSet treeSet = this.f404970d;
        treeSet.add(kVar);
        this.f404971e += kVar.f404953f;
        while (this.f404971e + 0 > 536870912 && !treeSet.isEmpty()) {
            try {
                cVar.g((s9.k) treeSet.first());
            } catch (s9.a unused) {
            }
        }
    }

    @Override // s9.b
    public void c(s9.c cVar, s9.k kVar) {
        this.f404970d.remove(kVar);
        this.f404971e -= kVar.f404953f;
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        s9.k kVar = (s9.k) obj;
        s9.k kVar2 = (s9.k) obj2;
        long j17 = kVar.f404956i;
        long j18 = kVar2.f404956i;
        return j17 - j18 == 0 ? kVar.compareTo(kVar2) : j17 < j18 ? -1 : 1;
    }
}
