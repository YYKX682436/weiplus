package ug3;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f427533d = 0;

    public f(ug3.g gVar, ug3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f427533d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f427533d;
        this.f427533d = i17 + 1;
        if (i17 == 0) {
            return ug3.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
