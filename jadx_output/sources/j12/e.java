package j12;

/* loaded from: classes15.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f297156d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j12.f f297157e;

    public e(j12.f fVar, j12.d dVar) {
        this.f297157e = fVar;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i17 = this.f297156d;
        java.util.ArrayList arrayList = this.f297157e.f297158d;
        return i17 < (arrayList == null ? 0 : arrayList.size());
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        java.util.ArrayList arrayList;
        int i17 = this.f297156d;
        this.f297156d = i17 + 1;
        j12.f fVar = this.f297157e;
        java.util.ArrayList arrayList2 = fVar.f297158d;
        if (arrayList2 == null || arrayList2.size() <= i17 || i17 < 0 || (arrayList = fVar.f297158d) == null) {
            return null;
        }
        return (j12.i) arrayList.get(i17);
    }

    @Override // java.util.Iterator
    public void remove() {
    }
}
