package s0;

/* loaded from: classes13.dex */
public class c implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f401845d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f401846e;

    /* renamed from: f, reason: collision with root package name */
    public int f401847f;

    public c(java.lang.Object obj, java.util.Map map) {
        kotlin.jvm.internal.o.g(map, "map");
        this.f401845d = obj;
        this.f401846e = map;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f401847f < this.f401846e.size();
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object obj = this.f401845d;
        this.f401847f++;
        java.lang.Object obj2 = this.f401846e.get(obj);
        if (obj2 != null) {
            this.f401845d = ((s0.a) obj2).f401840b;
            return obj;
        }
        throw new java.util.ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
