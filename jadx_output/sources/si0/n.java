package si0;

/* loaded from: classes13.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f408134d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ si0.v f408135e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f408136f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(si0.v vVar, double d17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f408135e = vVar;
        this.f408136f = d17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new si0.n(this.f408135e, this.f408136f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((si0.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f408134d;
        si0.v vVar = this.f408135e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.r2 r2Var = vVar.f408199v;
            if (r2Var != null) {
                this.f408134d = 1;
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
        com.tencent.mm.rfx.RfxPagPlayer rfxPagPlayer = vVar.f408183f;
        if (rfxPagPlayer != null) {
            rfxPagPlayer.setProgress(this.f408136f);
        }
        com.tencent.mm.rfx.RfxPagPlayer rfxPagPlayer2 = vVar.f408183f;
        if (rfxPagPlayer2 != null) {
            rfxPagPlayer2.flush();
        }
        return jz5.f0.f302826a;
    }
}
