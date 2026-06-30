package sj4;

/* loaded from: classes.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f408855d = 0;

    public j(sj4.k kVar, sj4.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f408855d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f408855d;
        this.f408855d = i17 + 1;
        if (i17 == 0) {
            return sj4.m0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
