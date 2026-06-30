package l7;

/* loaded from: classes13.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f316789a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f316790b = new java.util.HashMap();

    public final synchronized java.util.List a(java.lang.String str) {
        java.util.List list;
        if (!((java.util.ArrayList) this.f316789a).contains(str)) {
            ((java.util.ArrayList) this.f316789a).add(str);
        }
        list = (java.util.List) ((java.util.HashMap) this.f316790b).get(str);
        if (list == null) {
            list = new java.util.ArrayList();
            ((java.util.HashMap) this.f316790b).put(str, list);
        }
        return list;
    }

    public synchronized java.util.List b(java.lang.Class cls, java.lang.Class cls2) {
        java.util.ArrayList arrayList;
        arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) this.f316789a).iterator();
        while (it.hasNext()) {
            java.util.List<l7.f> list = (java.util.List) ((java.util.HashMap) this.f316790b).get((java.lang.String) it.next());
            if (list != null) {
                for (l7.f fVar : list) {
                    if ((fVar.f316786a.isAssignableFrom(cls) && cls2.isAssignableFrom(fVar.f316787b)) && !arrayList.contains(fVar.f316787b)) {
                        arrayList.add(fVar.f316787b);
                    }
                }
            }
        }
        return arrayList;
    }
}
