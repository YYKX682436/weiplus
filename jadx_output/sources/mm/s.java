package mm;

/* loaded from: classes6.dex */
public class s implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f328539d = 0;

    public s(mm.t tVar, mm.r rVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f328539d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f328539d;
        this.f328539d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.pluginsdk.model.app.z0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
