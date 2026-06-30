package jt;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f301576d = 0;

    public f(jt.g gVar, jt.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f301576d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f301576d;
        this.f301576d = i17 + 1;
        if (i17 == 0) {
            return jb0.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
