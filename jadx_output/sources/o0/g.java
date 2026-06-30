package o0;

/* loaded from: classes5.dex */
public final class g implements java.util.List, zz5.d {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f341845d;

    /* renamed from: e, reason: collision with root package name */
    public final int f341846e;

    /* renamed from: f, reason: collision with root package name */
    public int f341847f;

    public g(java.util.List list, int i17, int i18) {
        kotlin.jvm.internal.o.g(list, "list");
        this.f341845d = list;
        this.f341846e = i17;
        this.f341847f = i18;
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(java.lang.Object obj) {
        int i17 = this.f341847f;
        this.f341847f = i17 + 1;
        this.f341845d.add(i17, obj);
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int i17, java.util.Collection elements) {
        kotlin.jvm.internal.o.g(elements, "elements");
        this.f341845d.addAll(i17 + this.f341846e, elements);
        this.f341847f += elements.size();
        return elements.size() > 0;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        int i17 = this.f341847f - 1;
        int i18 = this.f341846e;
        if (i18 <= i17) {
            while (true) {
                this.f341845d.remove(i17);
                if (i17 == i18) {
                    break;
                } else {
                    i17--;
                }
            }
        }
        this.f341847f = i18;
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(java.lang.Object obj) {
        int i17 = this.f341847f;
        for (int i18 = this.f341846e; i18 < i17; i18++) {
            if (kotlin.jvm.internal.o.b(this.f341845d.get(i18), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(java.util.Collection elements) {
        kotlin.jvm.internal.o.g(elements, "elements");
        java.util.Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public java.lang.Object get(int i17) {
        o0.j.a(this, i17);
        return this.f341845d.get(i17 + this.f341846e);
    }

    @Override // java.util.List
    public int indexOf(java.lang.Object obj) {
        int i17 = this.f341847f;
        int i18 = this.f341846e;
        for (int i19 = i18; i19 < i17; i19++) {
            if (kotlin.jvm.internal.o.b(this.f341845d.get(i19), obj)) {
                return i19 - i18;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f341847f == this.f341846e;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return new o0.h(this, 0);
    }

    @Override // java.util.List
    public int lastIndexOf(java.lang.Object obj) {
        int i17 = this.f341847f - 1;
        int i18 = this.f341846e;
        if (i18 > i17) {
            return -1;
        }
        while (!kotlin.jvm.internal.o.b(this.f341845d.get(i17), obj)) {
            if (i17 == i18) {
                return -1;
            }
            i17--;
        }
        return i17 - i18;
    }

    @Override // java.util.List
    public java.util.ListIterator listIterator() {
        return new o0.h(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(java.lang.Object obj) {
        int i17 = this.f341847f;
        for (int i18 = this.f341846e; i18 < i17; i18++) {
            java.util.List list = this.f341845d;
            if (kotlin.jvm.internal.o.b(list.get(i18), obj)) {
                list.remove(i18);
                this.f341847f--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(java.util.Collection elements) {
        kotlin.jvm.internal.o.g(elements, "elements");
        int i17 = this.f341847f;
        java.util.Iterator it = elements.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i17 != this.f341847f;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(java.util.Collection elements) {
        kotlin.jvm.internal.o.g(elements, "elements");
        int i17 = this.f341847f;
        int i18 = i17 - 1;
        int i19 = this.f341846e;
        if (i19 <= i18) {
            while (true) {
                java.util.List list = this.f341845d;
                if (!elements.contains(list.get(i18))) {
                    list.remove(i18);
                    this.f341847f--;
                }
                if (i18 == i19) {
                    break;
                }
                i18--;
            }
        }
        return i17 != this.f341847f;
    }

    @Override // java.util.List
    public java.lang.Object set(int i17, java.lang.Object obj) {
        o0.j.a(this, i17);
        return this.f341845d.set(i17 + this.f341846e, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f341847f - this.f341846e;
    }

    @Override // java.util.List
    public java.util.List subList(int i17, int i18) {
        o0.j.b(this, i17, i18);
        return new o0.g(this, i17, i18);
    }

    @Override // java.util.List, java.util.Collection
    public java.lang.Object[] toArray() {
        return kotlin.jvm.internal.h.a(this);
    }

    @Override // java.util.List
    public void add(int i17, java.lang.Object obj) {
        this.f341845d.add(i17 + this.f341846e, obj);
        this.f341847f++;
    }

    @Override // java.util.List
    public java.util.ListIterator listIterator(int i17) {
        return new o0.h(this, i17);
    }

    @Override // java.util.List, java.util.Collection
    public java.lang.Object[] toArray(java.lang.Object[] array) {
        kotlin.jvm.internal.o.g(array, "array");
        return kotlin.jvm.internal.h.b(this, array);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(java.util.Collection elements) {
        kotlin.jvm.internal.o.g(elements, "elements");
        this.f341845d.addAll(this.f341847f, elements);
        this.f341847f += elements.size();
        return elements.size() > 0;
    }

    @Override // java.util.List
    public final java.lang.Object remove(int i17) {
        o0.j.a(this, i17);
        this.f341847f--;
        return this.f341845d.remove(i17 + this.f341846e);
    }
}
