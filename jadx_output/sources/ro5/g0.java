package ro5;

/* loaded from: classes14.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ro5.m1 f398195d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cp5.e f398196e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f398197f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zo5.e f398198g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ to5.a f398199h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(ro5.m1 m1Var, cp5.e eVar, int i17, zo5.e eVar2, to5.a aVar) {
        super(2);
        this.f398195d = m1Var;
        this.f398196e = eVar;
        this.f398197f = i17;
        this.f398198g = eVar2;
        this.f398199h = aVar;
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
        to5.a aVar = this.f398199h;
        if (a17) {
            ro5.m1 m1Var = this.f398195d;
            zo5.k kVar = m1Var.f398253o;
            int i17 = this.f398197f;
            cp5.e yuvGroup = this.f398196e;
            kotlin.jvm.internal.o.g(yuvGroup, "yuvGroup");
            zo5.e renderInfo = this.f398198g;
            kotlin.jvm.internal.o.g(renderInfo, "renderInfo");
            kVar.getClass();
            java.util.concurrent.locks.ReentrantLock reentrantLock = yuvGroup.f221138e;
            if (reentrantLock.isLocked()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.YuvRenderLogic", "execute: texture uploading, skip frame");
            } else {
                reentrantLock.lock();
                try {
                    ap5.a aVar2 = (ap5.a) ((jz5.n) kVar.f474895a).getValue();
                    aVar2.f12798u = i17;
                    aVar2.d(renderInfo.f474880a, renderInfo.f474881b);
                    int width = renderSize.getWidth();
                    aVar2.f12802d = renderSize.getHeight();
                    aVar2.f12801c = width;
                    aVar2.f12807i = renderInfo.f474882c;
                    aVar2.f12797t = yuvGroup;
                    aVar2.b();
                } finally {
                    reentrantLock.unlock();
                }
            }
            z17 = h1Var.b("SWDecode");
            bp5.g b17 = m1Var.f398242d.f455802p.b(aVar.f420992a, "SWDecode");
            ro5.c0.a(ro5.m1.C, b17 != null ? b17.a() : null, z17);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.MVR.VoIPMPRenderLogic", "handleResult: sw decode make current for " + aVar.f420992a + " error");
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
