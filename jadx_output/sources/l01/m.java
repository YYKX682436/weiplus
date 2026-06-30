package l01;

/* loaded from: classes7.dex */
public class m extends kk.l {

    /* renamed from: k, reason: collision with root package name */
    public final java.util.Map f314779k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l01.n f314780l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(l01.n nVar, int i17) {
        super(i17);
        this.f314780l = nVar;
        this.f314779k = new java.util.concurrent.ConcurrentHashMap();
    }

    @Override // kk.l, kk.j
    public void c(kk.g gVar) {
        clear();
        ((java.util.concurrent.ConcurrentHashMap) this.f314779k).clear();
    }

    @Override // kk.l, kk.j
    public void clear() {
        try {
            super.clear();
        } catch (java.lang.IllegalStateException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("LRUMap", e17, "clear", new java.lang.Object[0]);
        }
        ((java.util.concurrent.ConcurrentHashMap) this.f314779k).clear();
    }

    @Override // kk.l, com.tencent.mm.sdk.platformtools.r2
    public int g(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.ref.Reference reference = (java.lang.ref.Reference) obj2;
        int i17 = 0;
        if (reference == null) {
            return 0;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) this.f314779k;
        java.lang.Integer num = (java.lang.Integer) concurrentHashMap.get(reference);
        if (num != null && num.intValue() >= 0) {
            return num.intValue();
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) reference.get();
        if (bitmap != null && !bitmap.isRecycled()) {
            i17 = e3.a.a(bitmap);
        }
        concurrentHashMap.put(reference, java.lang.Integer.valueOf(i17));
        return i17;
    }

    @Override // kk.l, com.tencent.mm.sdk.platformtools.r2
    public void o(boolean z17, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.Object obj4 = (java.lang.String) obj;
        java.lang.ref.Reference reference = (java.lang.ref.Reference) obj2;
        java.lang.ref.Reference reference2 = (java.lang.ref.Reference) obj3;
        l01.n nVar = this.f314780l;
        int size = ((com.tencent.mm.sdk.platformtools.r2) nVar.f314781a).size() / 10;
        int q17 = ((com.tencent.mm.sdk.platformtools.r2) nVar.f314781a).q() / 10;
        if (reference != null) {
            reference.get();
        }
        if (reference2 != null) {
            reference2.get();
        }
        super.o(z17, obj4, reference, reference2);
        android.graphics.Bitmap bitmap = reference == null ? null : (android.graphics.Bitmap) reference.get();
        if (bitmap != (reference2 != null ? (android.graphics.Bitmap) reference2.get() : null) && bitmap != null) {
            bitmap.isRecycled();
        }
        ((java.util.concurrent.ConcurrentHashMap) this.f314779k).remove(reference);
    }
}
