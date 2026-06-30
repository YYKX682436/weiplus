package lp4;

/* loaded from: classes5.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zv3.c f320405d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f320406e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(zv3.c cVar, yz5.l lVar) {
        super(1);
        this.f320405d = cVar;
        this.f320406e = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ((zv3.f) this.f320405d).a();
        pm0.v.X(new lp4.o0(this.f320406e, (android.graphics.Bitmap) obj));
        return jz5.f0.f302826a;
    }
}
