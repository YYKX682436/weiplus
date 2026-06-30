package o90;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f343694d = 0;

    public j(o90.k kVar, o90.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f343694d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f343694d;
        this.f343694d = i17 + 1;
        if (i17 == 0) {
            return o90.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
