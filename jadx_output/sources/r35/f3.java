package r35;

/* loaded from: classes6.dex */
public class f3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f369110d = 0;

    public f3(r35.g3 g3Var, r35.e3 e3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f369110d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f369110d;
        this.f369110d = i17 + 1;
        if (i17 == 0) {
            return ez.b1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
