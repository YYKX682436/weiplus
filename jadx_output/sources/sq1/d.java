package sq1;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f411340d = 0;

    public d(sq1.e eVar, sq1.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f411340d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f411340d;
        this.f411340d = i17 + 1;
        if (i17 == 0) {
            return rq1.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
