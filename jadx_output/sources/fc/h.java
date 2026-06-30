package fc;

/* loaded from: classes15.dex */
public abstract class h implements java.util.Set {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fc.k f260913d;

    public h(fc.k kVar) {
        this.f260913d = kVar;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f260913d.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(java.lang.Object obj) {
        return d(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!d(it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract boolean d(java.lang.Object obj);

    public abstract boolean e(java.lang.Object obj);

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f260913d.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(java.lang.Object obj) {
        return e(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        boolean z17 = false;
        while (it.hasNext()) {
            if (e(it.next())) {
                z17 = true;
            }
        }
        return z17;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(java.util.Collection collection) {
        java.util.Iterator it = iterator();
        boolean z17 = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z17 = true;
            }
        }
        return z17;
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        return this.f260913d.f260900d;
    }

    @Override // java.util.Set, java.util.Collection
    public java.lang.Object[] toArray() {
        java.lang.Object[] objArr = new java.lang.Object[this.f260913d.f260900d];
        java.util.Iterator it = iterator();
        int i17 = 0;
        while (it.hasNext()) {
            objArr[i17] = it.next();
            i17++;
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public java.lang.Object[] toArray(java.lang.Object[] objArr) {
        int i17 = this.f260913d.f260900d;
        if (objArr.length < i17) {
            objArr = (java.lang.Object[]) java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), i17);
        }
        java.util.Iterator it = iterator();
        for (int i18 = 0; i18 < i17; i18++) {
            objArr[i18] = it.next();
        }
        if (objArr.length > i17) {
            objArr[i17] = null;
        }
        return objArr;
    }
}
