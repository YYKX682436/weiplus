package ko;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f309815d = 0;

    public d(ko.e eVar, ko.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f309815d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f309815d;
        this.f309815d = i17 + 1;
        if (i17 == 0) {
            return ko.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
