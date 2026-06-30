package o26;

/* loaded from: classes16.dex */
public abstract class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public boolean f342608d;

    public p(o26.m mVar) {
    }

    public abstract void a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f342608d;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (this.f342608d) {
            throw new java.util.NoSuchElementException();
        }
        this.f342608d = true;
        a();
        return ((o26.o) this).f342607f.f342610e;
    }
}
