package v30;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f433082d = 0;

    public b(v30.c cVar, v30.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f433082d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f433082d;
        this.f433082d = i17 + 1;
        if (i17 == 0) {
            return u30.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
