package mh2;

/* loaded from: classes3.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mh2.k f326373d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(mh2.k kVar) {
        super(1);
        this.f326373d = kVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.Bitmap originBitmap = (android.graphics.Bitmap) obj;
        kotlin.jvm.internal.o.g(originBitmap, "originBitmap");
        mh2.k kVar = this.f326373d;
        kVar.f326379h = originBitmap;
        kVar.d(originBitmap);
        return jz5.f0.f302826a;
    }
}
