package ro5;

/* loaded from: classes14.dex */
public final class z0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ro5.m1 f398322d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f398323e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zo5.e f398324f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f398325g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(ro5.m1 m1Var, int i17, zo5.e eVar, int i18) {
        super(2);
        this.f398322d = m1Var;
        this.f398323e = i17;
        this.f398324f = eVar;
        this.f398325g = i18;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        xo5.o textureRender = (xo5.o) obj;
        android.util.Size renderSize = (android.util.Size) obj2;
        kotlin.jvm.internal.o.g(textureRender, "$this$textureRender");
        kotlin.jvm.internal.o.g(renderSize, "renderSize");
        ro5.h1 h1Var = (ro5.h1) textureRender;
        boolean a17 = h1Var.a();
        boolean z17 = false;
        int i17 = this.f398325g;
        ro5.m1 m1Var = this.f398322d;
        if (a17) {
            if (m1Var.f398251m) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MVR.VoIPMPRenderLogic", "skip one local frame due to resolution switching");
                m1Var.f398251m = false;
            } else {
                m1Var.f398254p.b(new zo5.f(true, this.f398323e, this.f398324f, renderSize));
            }
            z17 = h1Var.b("Process");
            bp5.g b17 = m1Var.f398242d.f455802p.b(i17, "Process");
            ro5.c0.a(ro5.m1.C, b17 != null ? b17.a() : null, z17);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.MVR.VoIPMPRenderLogic", "render: makeCurrent for " + i17 + " error");
            bp5.g b18 = m1Var.f398242d.f455802p.b(i17, "Process");
            bp5.h a18 = b18 != null ? b18.a() : null;
            if (a18 != null) {
                a18.setNeedRecreate(true);
            }
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
