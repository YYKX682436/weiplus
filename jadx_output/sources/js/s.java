package js;

/* loaded from: classes6.dex */
public class s implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f301446d = 0;

    public s(js.t tVar, js.r rVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f301446d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f301446d;
        this.f301446d = i17 + 1;
        if (i17 == 0) {
            return is.j0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
