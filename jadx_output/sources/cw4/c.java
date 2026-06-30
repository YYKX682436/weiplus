package cw4;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f224200d = 0;

    public c(cw4.d dVar, cw4.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f224200d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f224200d;
        this.f224200d = i17 + 1;
        if (i17 == 0) {
            return cw4.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
