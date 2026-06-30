package ro5;

/* loaded from: classes12.dex */
public final class j1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ro5.m1 f398224d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f398225e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f398226f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(ro5.m1 m1Var, java.lang.String str, yz5.p pVar) {
        super(2);
        this.f398224d = m1Var;
        this.f398225e = str;
        this.f398226f = pVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object m521constructorimpl;
        jz5.f0 f0Var = jz5.f0.f302826a;
        int intValue = ((java.lang.Number) obj).intValue();
        android.graphics.SurfaceTexture surfaceTexture = (android.graphics.SurfaceTexture) obj2;
        kotlin.jvm.internal.o.g(surfaceTexture, "surfaceTexture");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            surfaceTexture.updateTexImage();
            m521constructorimpl = kotlin.Result.m521constructorimpl(f0Var);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        java.lang.String str = this.f398225e;
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MVR.VoIPMPRenderLogic", str + " updateTexImage error", surfaceTexture);
        }
        ro5.m1 m1Var = this.f398224d;
        if (m1Var.f398248j) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MVR.VoIPMPRenderLogic", str + " onFrameAvailable skip, released");
        } else {
            m1Var.f398247i.a(str, ((java.lang.Boolean) this.f398226f.invoke(java.lang.Integer.valueOf(intValue), java.lang.Long.valueOf(surfaceTexture.getTimestamp()))).booleanValue());
        }
        return f0Var;
    }
}
