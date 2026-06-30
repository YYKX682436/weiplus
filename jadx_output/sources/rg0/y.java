package rg0;

/* loaded from: classes3.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f395201d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rg0.z f395202e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(rg0.z zVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f395202e = zVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rg0.y(this.f395202e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rg0.y) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f395201d;
        rg0.z zVar = this.f395202e;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                rg0.x xVar = new rg0.x(zVar, null);
                this.f395201d = 1;
                if (kotlinx.coroutines.a4.b(3000L, xVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
        } catch (java.lang.Exception e17) {
            zVar.getClass();
            com.tencent.mars.xlog.Log.e("SecinfoOnKindaNotifyEventListener", "initHonorSecResult error: " + e17.getMessage());
        }
        return jz5.f0.f302826a;
    }
}
