package lt3;

/* loaded from: classes10.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lt3.f0 f321284d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(lt3.f0 f0Var) {
        super(1);
        this.f321284d = f0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.Bitmap bitmap;
        ((java.lang.Number) obj).longValue();
        zv3.g gVar = this.f321284d.f321216e;
        if (gVar == null) {
            kotlin.jvm.internal.o.o("frameRetriever");
            throw null;
        }
        zv3.d dVar = gVar.f476445a;
        zv3.a aVar = (!((dVar.f476438j.length() > 0) && com.tencent.mm.vfs.w6.j(dVar.f476438j)) || (bitmap = gVar.f476452h) == null) ? null : new zv3.a(bitmap, 0L);
        if (aVar != null) {
            return aVar.f476427a;
        }
        return null;
    }
}
