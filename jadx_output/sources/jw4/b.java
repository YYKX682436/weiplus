package jw4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f302337d = 0;

    public b(jw4.c cVar, jw4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f302337d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f302337d;
        this.f302337d = i17 + 1;
        if (i17 == 0) {
            return jw4.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
