package ro5;

/* loaded from: classes14.dex */
public final class y0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ro5.m1 f398316d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f398317e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f398318f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f398319g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f398320h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(ro5.m1 m1Var, int i17, int i18, int i19, int i27) {
        super(2);
        this.f398316d = m1Var;
        this.f398317e = i17;
        this.f398318f = i18;
        this.f398319g = i19;
        this.f398320h = i27;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean z17;
        xo5.o textureRender = (xo5.o) obj;
        android.util.Size renderSize = (android.util.Size) obj2;
        kotlin.jvm.internal.o.g(textureRender, "$this$textureRender");
        kotlin.jvm.internal.o.g(renderSize, "renderSize");
        ro5.h1 h1Var = (ro5.h1) textureRender;
        boolean a17 = h1Var.a();
        int i17 = this.f398320h;
        if (a17) {
            ro5.m1 m1Var = this.f398316d;
            m1Var.f398254p.b(new zo5.f(true, this.f398317e, new zo5.e(this.f398318f, this.f398319g, 270 - m1Var.A, false, false, null, 56, null), renderSize));
            z17 = h1Var.b("LocalRender" + i17);
            bp5.g b17 = m1Var.f398242d.f455802p.b(i17, "LocalRender" + i17);
            ro5.c0.a(ro5.m1.C, b17 != null ? b17.a() : null, z17);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.MVR.VoIPMPRenderLogic", "render: makeCurrent for " + i17 + " error");
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
