package p16;

/* loaded from: classes15.dex */
public abstract class w0 extends java.util.AbstractMap {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f351363i = 0;

    /* renamed from: d, reason: collision with root package name */
    public final int f351364d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f351365e = java.util.Collections.emptyList();

    /* renamed from: f, reason: collision with root package name */
    public java.util.Map f351366f = java.util.Collections.emptyMap();

    /* renamed from: g, reason: collision with root package name */
    public boolean f351367g;

    /* renamed from: h, reason: collision with root package name */
    public volatile p16.v0 f351368h;

    public w0(int i17, p16.p0 p0Var) {
        this.f351364d = i17;
    }

    public final int a(java.lang.Comparable comparable) {
        int size = this.f351365e.size() - 1;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((p16.t0) this.f351365e.get(size)).f351350d);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i17 = 0;
        while (i17 <= size) {
            int i18 = (i17 + size) / 2;
            int compareTo2 = comparable.compareTo(((p16.t0) this.f351365e.get(i18)).f351350d);
            if (compareTo2 < 0) {
                size = i18 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i18;
                }
                i17 = i18 + 1;
            }
        }
        return -(i17 + 1);
    }

    public final void b() {
        if (this.f351367g) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public java.lang.Iterable c() {
        return this.f351366f.isEmpty() ? p16.s0.f351345b : this.f351366f.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        b();
        if (!this.f351365e.isEmpty()) {
            this.f351365e.clear();
        }
        if (this.f351366f.isEmpty()) {
            return;
        }
        this.f351366f.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        return a(comparable) >= 0 || this.f351366f.containsKey(comparable);
    }

    public final java.util.SortedMap d() {
        b();
        if (this.f351366f.isEmpty() && !(this.f351366f instanceof java.util.TreeMap)) {
            this.f351366f = new java.util.TreeMap();
        }
        return (java.util.SortedMap) this.f351366f;
    }

    public java.lang.Object e(java.lang.Comparable comparable, java.lang.Object obj) {
        b();
        int a17 = a(comparable);
        if (a17 >= 0) {
            return ((p16.t0) this.f351365e.get(a17)).setValue(obj);
        }
        b();
        boolean isEmpty = this.f351365e.isEmpty();
        int i17 = this.f351364d;
        if (isEmpty && !(this.f351365e instanceof java.util.ArrayList)) {
            this.f351365e = new java.util.ArrayList(i17);
        }
        int i18 = -(a17 + 1);
        if (i18 >= i17) {
            return d().put(comparable, obj);
        }
        if (this.f351365e.size() == i17) {
            p16.t0 t0Var = (p16.t0) this.f351365e.remove(i17 - 1);
            d().put(t0Var.f351350d, t0Var.f351351e);
        }
        this.f351365e.add(i18, new p16.t0(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set entrySet() {
        if (this.f351368h == null) {
            this.f351368h = new p16.v0(this, null);
        }
        return this.f351368h;
    }

    public final java.lang.Object f(int i17) {
        b();
        java.lang.Object obj = ((p16.t0) this.f351365e.remove(i17)).f351351e;
        if (!this.f351366f.isEmpty()) {
            java.util.Iterator it = d().entrySet().iterator();
            java.util.List list = this.f351365e;
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            list.add(new p16.t0(this, (java.lang.Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.lang.Object get(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int a17 = a(comparable);
        return a17 >= 0 ? ((p16.t0) this.f351365e.get(a17)).f351351e : this.f351366f.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.lang.Object remove(java.lang.Object obj) {
        b();
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int a17 = a(comparable);
        if (a17 >= 0) {
            return f(a17);
        }
        if (this.f351366f.isEmpty()) {
            return null;
        }
        return this.f351366f.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f351365e.size() + this.f351366f.size();
    }
}
