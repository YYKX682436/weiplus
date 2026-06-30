package yx0;

/* loaded from: classes.dex */
public final class l5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f467435d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467436e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelgeo.Addr f467437f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(yx0.b8 b8Var, com.tencent.mm.modelgeo.Addr addr, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467436e = b8Var;
        this.f467437f = addr;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.l5(this.f467436e, this.f467437f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.l5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f467435d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.f467436e.f467192s != yx0.v.f467695f) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "setLocationInfo >> but state is " + this.f467436e.f467192s);
                return f0Var;
            }
            pp0.p0 p0Var = this.f467436e.K;
            if (p0Var != null) {
                com.tencent.maas.moviecomposing.segments.GeographicInfo a17 = tx0.a.a(this.f467437f);
                this.f467435d = 1;
                obj = p0Var.G0(a17, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return f0Var;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        return f0Var;
    }
}
