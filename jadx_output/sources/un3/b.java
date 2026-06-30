package un3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f429482d = 0;

    public b(un3.c cVar, un3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f429482d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f429482d;
        this.f429482d = i17 + 1;
        if (i17 == 0) {
            return un3.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
