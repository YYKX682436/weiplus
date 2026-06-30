package y22;

/* loaded from: classes10.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y22.g f459072d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(y22.g gVar) {
        super(1);
        this.f459072d = gVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.SurfaceTexture it = (android.graphics.SurfaceTexture) obj;
        kotlin.jvm.internal.o.g(it, "it");
        y22.g gVar = this.f459072d;
        com.tencent.mars.xlog.Log.i(gVar.f459085e, "onFrameAvailable: " + it);
        gVar.b(new y22.e(gVar, it.getTimestamp()));
        return jz5.f0.f302826a;
    }
}
