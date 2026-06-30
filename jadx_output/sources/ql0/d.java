package ql0;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f364461d = 0;

    public d(ql0.e eVar, ql0.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f364461d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f364461d;
        this.f364461d = i17 + 1;
        if (i17 == 0) {
            return ql0.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
