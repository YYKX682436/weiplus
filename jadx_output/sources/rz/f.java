package rz;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f401780d = 0;

    public f(rz.g gVar, rz.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f401780d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f401780d;
        this.f401780d = i17 + 1;
        if (i17 == 0) {
            return qz.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
