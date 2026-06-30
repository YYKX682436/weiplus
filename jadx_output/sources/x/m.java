package x;

/* loaded from: classes14.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public x.i f450837a;

    /* renamed from: b, reason: collision with root package name */
    public x.j f450838b;

    /* renamed from: c, reason: collision with root package name */
    public x.l f450839c;

    public static boolean j(java.util.Set set, java.lang.Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof java.util.Set) {
            java.util.Set set2 = (java.util.Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean k(java.util.Map map, java.util.Collection collection) {
        int size = map.size();
        java.util.Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public abstract void a();

    public abstract java.lang.Object b(int i17, int i18);

    public abstract java.util.Map c();

    public abstract int d();

    public abstract int e(java.lang.Object obj);

    public abstract int f(java.lang.Object obj);

    public abstract void g(java.lang.Object obj, java.lang.Object obj2);

    public abstract void h(int i17);

    public abstract java.lang.Object i(int i17, java.lang.Object obj);

    public java.lang.Object[] l(java.lang.Object[] objArr, int i17) {
        int d17 = d();
        if (objArr.length < d17) {
            objArr = (java.lang.Object[]) java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), d17);
        }
        for (int i18 = 0; i18 < d17; i18++) {
            objArr[i18] = b(i18, i17);
        }
        if (objArr.length > d17) {
            objArr[d17] = null;
        }
        return objArr;
    }
}
