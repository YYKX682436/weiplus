package si0;

/* loaded from: classes13.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f408048d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ si0.l0 f408049e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f408050f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(si0.l0 l0Var, double d17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f408049e = l0Var;
        this.f408050f = d17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new si0.d0(this.f408049e, this.f408050f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((si0.d0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f408048d;
        si0.l0 l0Var = this.f408049e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.r2 r2Var = l0Var.f408119v;
            if (r2Var != null) {
                this.f408048d = 1;
                if (((kotlinx.coroutines.c3) r2Var).C(this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        org.libpag.PAGPlayer pAGPlayer = l0Var.f408103f;
        if (pAGPlayer != null) {
            pAGPlayer.setProgress(this.f408050f);
        }
        org.libpag.PAGPlayer pAGPlayer2 = l0Var.f408103f;
        if (pAGPlayer2 != null) {
            pAGPlayer2.flush();
        }
        return jz5.f0.f302826a;
    }
}
