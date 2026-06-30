package zn5;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f474510d = 0;

    public c(zn5.d dVar, zn5.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f474510d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f474510d;
        this.f474510d = i17 + 1;
        if (i17 == 0) {
            return zn5.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
