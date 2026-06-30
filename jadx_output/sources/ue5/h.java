package ue5;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f426955d = 0;

    public h(ue5.i iVar, ue5.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f426955d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f426955d;
        this.f426955d = i17 + 1;
        if (i17 == 0) {
            return ue5.e.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
