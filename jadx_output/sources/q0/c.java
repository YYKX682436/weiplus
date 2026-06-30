package q0;

/* loaded from: classes14.dex */
public abstract class c extends kz5.h implements p0.e {
    @Override // java.util.Collection, java.util.List, p0.e
    public p0.e addAll(java.util.Collection elements) {
        kotlin.jvm.internal.o.g(elements, "elements");
        p0.d x17 = x();
        x17.addAll(elements);
        return ((q0.h) x17).g();
    }

    @Override // kz5.b, java.util.Collection
    public boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // kz5.b, java.util.Collection
    public boolean containsAll(java.util.Collection elements) {
        kotlin.jvm.internal.o.g(elements, "elements");
        java.util.Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // kz5.h, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator iterator() {
        return listIterator(0);
    }

    @Override // kz5.h, java.util.List
    public java.util.ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // kz5.h, java.util.List
    public java.util.List subList(int i17, int i18) {
        return new p0.a(this, i17, i18);
    }
}
