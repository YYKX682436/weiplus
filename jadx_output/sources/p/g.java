package p;

/* loaded from: classes16.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f350340d = 0;

    public g(p.h hVar, p.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f350340d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f350340d;
        this.f350340d = i17 + 1;
        if (i17 == 0) {
            return j.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
