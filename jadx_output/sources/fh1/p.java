package fh1;

/* loaded from: classes7.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fh1.z f262576d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f262577e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f262578f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f262579g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f262580h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f262581i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(fh1.z zVar, java.lang.String str, int i17, java.lang.String str2, int i18, int i19) {
        super(0);
        this.f262576d = zVar;
        this.f262577e = str;
        this.f262578f = i17;
        this.f262579g = str2;
        this.f262580h = i18;
        this.f262581i = i19;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fq0.x xVar;
        com.tencent.mars.xlog.Log.i(this.f262576d.f262631e, "onCreateFrameSet appId:" + this.f262577e + " frameId:" + this.f262578f + " name:" + this.f262579g + " width:" + this.f262580h + " height:" + this.f262581i);
        fh1.x0 a17 = this.f262576d.a();
        java.lang.String frameSetName = this.f262579g;
        kotlin.jvm.internal.o.g(frameSetName, "frameSetName");
        hq0.e0 e0Var = a17.B;
        if (e0Var == null) {
            com.tencent.mars.xlog.Log.e(a17.A, "frameSetRoot is null, create frameset:" + frameSetName + " fail");
            xVar = null;
        } else {
            fq0.x xVar2 = (fq0.x) e0Var.e(frameSetName).f302833d;
            a17.C.put(frameSetName, xVar2);
            xVar = xVar2;
        }
        if (xVar != null) {
            int i17 = this.f262580h;
            int i18 = this.f262581i;
            int i19 = this.f262578f;
            xVar.f265482f = i17;
            xVar.f265483g = i18;
            xVar.d();
            xVar.b();
            fh1.s0 s0Var = fh1.x0.I;
            java.lang.String frameSetId = xVar.f265478b;
            kotlin.jvm.internal.o.g(frameSetId, "frameSetId");
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclMBFrameBiz", "notifyFrameSetId2TextureId frameSetId:" + frameSetId + " textureId:" + i19);
            synchronized (s0Var) {
                fh1.x0.K.put(frameSetId, java.lang.Integer.valueOf(i19));
            }
            s0Var.a();
            hq0.e0 e0Var2 = a17.B;
            if (e0Var2 != null) {
                e0Var2.a("", "");
            }
        }
        return jz5.f0.f302826a;
    }
}
