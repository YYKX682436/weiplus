package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class g1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f158409d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t45.l0 f158410e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f158411f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(t45.l0 l0Var, kotlin.coroutines.Continuation continuation, kotlin.coroutines.Continuation continuation2) {
        super(2, continuation2);
        this.f158410e = l0Var;
        this.f158411f = continuation;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.ringtone.uic.g1(this.f158410e, this.f158411f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.ringtone.uic.g1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f158409d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mx3.s sVar = mx3.u.f332620f;
            t45.l0 l0Var = this.f158410e;
            int i18 = l0Var.f415602e;
            int i19 = l0Var.f415603f;
            this.f158409d = 1;
            obj = sVar.d(1, 1, l0Var, i18, i19, 0, "", this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean z17 = ((rm0.i) obj).f397421a;
        kotlin.coroutines.Continuation continuation = this.f158411f;
        if (z17) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
        } else {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
        }
        return jz5.f0.f302826a;
    }
}
