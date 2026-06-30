package gq4;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f274578d = 0;

    public c(gq4.d dVar, gq4.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f274578d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f274578d;
        this.f274578d = i17 + 1;
        if (i17 == 0) {
            return gq4.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
