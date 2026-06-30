package jm;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f300229d = 0;

    public f(jm.g gVar, jm.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f300229d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f300229d;
        this.f300229d = i17 + 1;
        if (i17 == 0) {
            return jm.a0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
