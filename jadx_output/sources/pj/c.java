package pj;

/* loaded from: classes4.dex */
public abstract class c extends java.util.concurrent.CopyOnWriteArrayList {
    public abstract java.lang.Object d(java.lang.Object obj);

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
    public int indexOf(java.lang.Object obj) {
        int indexOf = super.indexOf(obj);
        if (indexOf >= 0) {
            return indexOf;
        }
        java.util.Iterator it = iterator();
        int i17 = 0;
        while (it.hasNext()) {
            int i18 = i17 + 1;
            if (kotlin.jvm.internal.o.b(d(it.next()), obj)) {
                return i17;
            }
            i17 = i18;
        }
        return indexOf;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
    public int lastIndexOf(java.lang.Object obj) {
        int lastIndexOf = super.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return lastIndexOf;
        }
        for (int h17 = kz5.c0.h(this); -1 < h17; h17--) {
            if (kotlin.jvm.internal.o.b(d(get(h17)), obj)) {
                return h17;
            }
        }
        return lastIndexOf;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public boolean remove(java.lang.Object obj) {
        boolean remove = super.remove(obj);
        if (!remove) {
            java.util.Iterator it = iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                if (kotlin.jvm.internal.o.b(d(next), obj)) {
                    return super.remove(next);
                }
            }
        }
        return remove;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public java.lang.Object[] toArray() {
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(this, 10));
        for (java.lang.Object obj : this) {
            java.lang.Object d17 = d(obj);
            if (d17 != null) {
                obj = d17;
            }
            arrayList.add(obj);
        }
        return arrayList.toArray(new java.lang.Object[0]);
    }
}
