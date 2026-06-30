package x2;

/* loaded from: classes15.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final m3.e f451478a = new m3.f(10);

    /* renamed from: b, reason: collision with root package name */
    public final x.n f451479b = new x.n();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f451480c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f451481d = new java.util.HashSet();

    public final void a(java.lang.Object obj, java.util.ArrayList arrayList, java.util.HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new java.lang.RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        java.util.ArrayList arrayList2 = (java.util.ArrayList) this.f451479b.getOrDefault(obj, null);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i17 = 0; i17 < size; i17++) {
                a(arrayList2.get(i17), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }
}
