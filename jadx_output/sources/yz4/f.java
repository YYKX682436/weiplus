package yz4;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f468556d = 0;

    public f(yz4.g gVar, yz4.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f468556d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f468556d;
        this.f468556d = i17 + 1;
        if (i17 == 0) {
            return yz4.q.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
