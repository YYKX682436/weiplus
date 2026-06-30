package jd0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f299053d = 0;

    public f(jd0.g gVar, jd0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f299053d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f299053d;
        this.f299053d = i17 + 1;
        if (i17 == 0) {
            return jd0.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
