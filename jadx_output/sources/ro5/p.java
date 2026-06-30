package ro5;

/* loaded from: classes14.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f398273d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ro5.b0 f398274e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ro5.b0 b0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f398274e = b0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ro5.p(this.f398274e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ro5.p) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object e17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f398273d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ro5.b0 b0Var = this.f398274e;
            if (b0Var.f398145b == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPRenderController", "getCameraSurfaceTexture failed");
                b0Var.f398152i = 4;
                ((jp5.o) i95.n0.c(jp5.o.class)).reportIDKey(2093L, 29L, 1L);
            }
            ro5.m1 m1Var = b0Var.f398145b;
            if (m1Var == null) {
                return null;
            }
            this.f398273d = 1;
            e17 = m1Var.e("camera", 134217728, (yo5.e) m1Var.f398242d.f455796g.getValue(), ro5.n0.f398266d, this);
            if (e17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            e17 = obj;
        }
        return (android.graphics.SurfaceTexture) e17;
    }
}
