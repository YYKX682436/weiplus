package z7;

/* loaded from: classes16.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Iterator f470470d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Iterator f470471e;

    public f(z7.i iVar, java.util.Iterator it, java.util.Iterator it6) {
        this.f470470d = it;
        this.f470471e = it6;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f470470d.hasNext();
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        return new z7.h((java.lang.String) this.f470470d.next(), (z7.l) this.f470471e.next());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
