package x;

/* loaded from: classes14.dex */
public final class k implements java.util.Iterator, java.util.Map.Entry {

    /* renamed from: d, reason: collision with root package name */
    public int f450832d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x.m f450835g;

    /* renamed from: f, reason: collision with root package name */
    public boolean f450834f = false;

    /* renamed from: e, reason: collision with root package name */
    public int f450833e = -1;

    public k(x.m mVar) {
        this.f450835g = mVar;
        this.f450832d = mVar.d() - 1;
    }

    @Override // java.util.Map.Entry
    public boolean equals(java.lang.Object obj) {
        if (!this.f450834f) {
            throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.lang.Object key = entry.getKey();
        int i17 = this.f450833e;
        x.m mVar = this.f450835g;
        java.lang.Object b17 = mVar.b(i17, 0);
        if (!(key == b17 || (key != null && key.equals(b17)))) {
            return false;
        }
        java.lang.Object value = entry.getValue();
        java.lang.Object b18 = mVar.b(this.f450833e, 1);
        return value == b18 || (value != null && value.equals(b18));
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getKey() {
        if (!this.f450834f) {
            throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f450835g.b(this.f450833e, 0);
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getValue() {
        if (!this.f450834f) {
            throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f450835g.b(this.f450833e, 1);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f450833e < this.f450832d;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        if (!this.f450834f) {
            throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i17 = this.f450833e;
        x.m mVar = this.f450835g;
        java.lang.Object b17 = mVar.b(i17, 0);
        java.lang.Object b18 = mVar.b(this.f450833e, 1);
        return (b17 == null ? 0 : b17.hashCode()) ^ (b18 != null ? b18.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        this.f450833e++;
        this.f450834f = true;
        return this;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f450834f) {
            throw new java.lang.IllegalStateException();
        }
        this.f450835g.h(this.f450833e);
        this.f450833e--;
        this.f450832d--;
        this.f450834f = false;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object setValue(java.lang.Object obj) {
        if (this.f450834f) {
            return this.f450835g.i(this.f450833e, obj);
        }
        throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public java.lang.String toString() {
        return getKey() + "=" + getValue();
    }
}
