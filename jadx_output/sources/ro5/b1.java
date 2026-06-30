package ro5;

/* loaded from: classes14.dex */
public final class b1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ro5.m1 f398162d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f398163e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zo5.e f398164f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f398165g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f398166h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(ro5.m1 m1Var, int i17, zo5.e eVar, int i18, int i19) {
        super(2);
        this.f398162d = m1Var;
        this.f398163e = i17;
        this.f398164f = eVar;
        this.f398165g = i18;
        this.f398166h = i19;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean z17;
        xo5.o textureRender = (xo5.o) obj;
        android.util.Size renderSize = (android.util.Size) obj2;
        kotlin.jvm.internal.o.g(textureRender, "$this$textureRender");
        kotlin.jvm.internal.o.g(renderSize, "renderSize");
        ro5.h1 h1Var = (ro5.h1) textureRender;
        if (h1Var.a()) {
            ro5.m1 m1Var = this.f398162d;
            ((zo5.i) m1Var.f398256r.getValue()).b(new zo5.f(true, this.f398163e, this.f398164f, renderSize));
            z17 = h1Var.b("Camera");
            bp5.g b17 = m1Var.f398242d.f455802p.b(this.f398166h, "Camera");
            ro5.c0.a(ro5.m1.C, b17 != null ? b17.a() : null, z17);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.MVR.VoIPMPRenderLogic", "render: makeCurrent for " + this.f398165g + " error");
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
