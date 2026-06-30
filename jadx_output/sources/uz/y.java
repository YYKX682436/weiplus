package uz;

/* loaded from: classes6.dex */
public class y implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f432101d = 0;

    public y(uz.z zVar, uz.x xVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f432101d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f432101d;
        this.f432101d = i17 + 1;
        if (i17 == 0) {
            return uz.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
