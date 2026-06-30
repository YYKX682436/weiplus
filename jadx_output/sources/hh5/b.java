package hh5;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f281479d = 0;

    public b(hh5.c cVar, hh5.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f281479d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f281479d;
        this.f281479d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.ui.c9.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
