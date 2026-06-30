package uz;

/* loaded from: classes6.dex */
public class u implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f432089d = 0;

    public u(uz.v vVar, uz.t tVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f432089d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f432089d;
        this.f432089d = i17 + 1;
        if (i17 == 0) {
            return uz.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
