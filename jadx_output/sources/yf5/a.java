package yf5;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f461844a = -1;

    /* renamed from: b, reason: collision with root package name */
    public android.util.SparseArray f461845b = new android.util.SparseArray();

    /* renamed from: c, reason: collision with root package name */
    public java.util.HashMap f461846c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f461847d = kz5.p0.f313996d;

    public final void a(java.util.List list) {
        kotlin.jvm.internal.o.g(list, "list");
        this.f461844a = list.size();
        android.util.SparseArray sparseArray = new android.util.SparseArray(list.size());
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        for (java.lang.Object obj : list) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            yf5.x xVar = (yf5.x) obj;
            java.lang.String h17 = xVar.f461995d.h1();
            if (h17 == null) {
                h17 = "";
            }
            sparseArray.put(i17, h17);
            java.lang.String h18 = xVar.f461995d.h1();
            kotlin.jvm.internal.o.f(h18, "getUsername(...)");
            com.tencent.mm.storage.l4 conv = xVar.f461995d;
            kotlin.jvm.internal.o.f(conv, "conv");
            hashMap.put(h18, conv);
            arrayList.add(xVar);
            i17 = i18;
        }
        this.f461845b = sparseArray;
        this.f461846c = hashMap;
        this.f461847d = arrayList;
    }
}
