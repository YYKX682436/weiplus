package ro5;

/* loaded from: classes14.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so5.b f398221d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ro5.m1 f398222e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f398223f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(so5.b bVar, ro5.m1 m1Var, int i17) {
        super(2);
        this.f398221d = bVar;
        this.f398222e = m1Var;
        this.f398223f = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Integer num;
        xo5.o textureRender = (xo5.o) obj;
        android.util.Size renderSize = (android.util.Size) obj2;
        kotlin.jvm.internal.o.g(textureRender, "$this$textureRender");
        kotlin.jvm.internal.o.g(renderSize, "renderSize");
        so5.b bVar = this.f398221d;
        android.util.Size size = bVar.f410792a;
        android.util.Size size2 = bVar.f410793b;
        zo5.e eVar = new zo5.e(size2.getWidth(), size2.getHeight(), 0, false, false, size, 24, null);
        ro5.m1 m1Var = this.f398222e;
        zo5.i iVar = (zo5.i) m1Var.f398257s.getValue();
        int i17 = this.f398223f;
        int intValue = (iVar == null || (num = (java.lang.Integer) iVar.b(new zo5.f(true, i17, eVar, size))) == null) ? i17 : num.intValue();
        ro5.h1 h1Var = (ro5.h1) textureRender;
        boolean z17 = false;
        if (h1Var.a()) {
            zo5.i iVar2 = m1Var.f398255q;
            boolean z18 = intValue == i17;
            if (intValue != i17) {
                eVar = new zo5.e(size.getWidth(), size.getHeight(), 0, false, false, null, 56, null);
            }
            iVar2.b(new zo5.f(z18, intValue, eVar, renderSize));
            z17 = h1Var.b("HWDecode");
            bp5.g b17 = m1Var.f398242d.f455802p.b(intValue, "HWDecode");
            ro5.c0.a(ro5.m1.C, b17 != null ? b17.a() : null, z17);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.MVR.VoIPMPRenderLogic", "hw decode: make current error");
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
