package fr4;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f265818d = 0;

    public f(fr4.g gVar, fr4.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f265818d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f265818d;
        this.f265818d = i17 + 1;
        if (i17 == 0) {
            return fr4.i0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
