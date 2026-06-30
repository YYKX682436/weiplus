package ro5;

/* loaded from: classes14.dex */
public final class d1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ro5.m1 f398180d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(ro5.m1 m1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f398180d = m1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ro5.d1(this.f398180d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ro5.d1 d1Var = (ro5.d1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        d1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        zo5.i iVar;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ro5.m1 m1Var = this.f398180d;
        m1Var.f398255q.a();
        jz5.g gVar = m1Var.f398257s;
        if (gVar.isInitialized() && (iVar = (zo5.i) gVar.getValue()) != null) {
            iVar.a();
        }
        m1Var.f398252n.getClass();
        zo5.k kVar = m1Var.f398253o;
        kVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.YuvRenderLogic", "release");
        android.opengl.GLES20.glDeleteProgram(((ap5.a) ((jz5.n) kVar.f474895a).getValue()).f12790m);
        return jz5.f0.f302826a;
    }
}
