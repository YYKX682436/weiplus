package uz1;

/* loaded from: classes13.dex */
public class a implements java.lang.Iterable, java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f432151d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public int f432152e = 0;

    public void add(java.lang.Object obj) {
        if (obj == null) {
            return;
        }
        d();
        if (contains(obj)) {
            return;
        }
        ((java.util.ArrayList) this.f432151d).add(new java.lang.ref.WeakReference(obj));
    }

    public boolean contains(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        d();
        java.util.Iterator it = ((java.util.ArrayList) this.f432151d).iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            if (weakReference != null && weakReference.get() == obj) {
                return true;
            }
        }
        return false;
    }

    public final void d() {
        java.util.Iterator it = ((java.util.ArrayList) this.f432151d).iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            if (weakReference == null || weakReference.get() == null) {
                it.remove();
            }
        }
    }

    public void e(java.lang.Object obj) {
        if (obj == null) {
            return;
        }
        d();
        java.util.Iterator it = ((java.util.ArrayList) this.f432151d).iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            if (weakReference != null && weakReference.get() == obj) {
                it.remove();
            }
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f432152e < ((java.util.ArrayList) this.f432151d).size();
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        d();
        this.f432152e = 0;
        return this;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        java.lang.Object obj;
        while (true) {
            int i17 = this.f432152e;
            java.util.List list = this.f432151d;
            if (i17 >= ((java.util.ArrayList) list).size()) {
                return null;
            }
            int i18 = this.f432152e;
            this.f432152e = i18 + 1;
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.ArrayList) list).get(i18);
            if (weakReference != null && (obj = weakReference.get()) != null) {
                return obj;
            }
        }
    }

    public int size() {
        d();
        return ((java.util.ArrayList) this.f432151d).size();
    }
}
