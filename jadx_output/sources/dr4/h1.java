package dr4;

/* loaded from: classes14.dex */
public final class h1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.p1 f242643d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f242644e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(dr4.p1 p1Var, yz5.l lVar) {
        super(1);
        this.f242643d = p1Var;
        this.f242644e = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.util.Size size;
        android.graphics.SurfaceTexture surfaceTexture = (android.graphics.SurfaceTexture) obj;
        if (surfaceTexture == null) {
            return null;
        }
        dr4.p1 p1Var = this.f242643d;
        xq4.a aVar = p1Var.f242704c;
        if (aVar != null) {
            ((zq4.b) aVar).f475054n = surfaceTexture;
        }
        if (aVar != null) {
            aVar.a();
        }
        xq4.a aVar2 = p1Var.f242704c;
        if (aVar2 == null || (size = ((zq4.b) aVar2).f475046f) == null) {
            return null;
        }
        p1Var.p(size);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        p1Var.I = java.lang.System.currentTimeMillis();
        p1Var.o(gq4.v.wi().f365967a);
        yz5.l lVar = this.f242644e;
        if (lVar == null) {
            return null;
        }
        lVar.invoke(java.lang.Boolean.TRUE);
        return null;
    }
}
