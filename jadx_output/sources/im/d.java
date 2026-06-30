package im;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f292153d = 0;

    public d(im.e eVar, im.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f292153d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f292153d;
        this.f292153d = i17 + 1;
        if (i17 == 0) {
            return im.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
