package js;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f301420d = 0;

    public c(js.d dVar, js.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f301420d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f301420d;
        this.f301420d = i17 + 1;
        if (i17 == 0) {
            return is.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
