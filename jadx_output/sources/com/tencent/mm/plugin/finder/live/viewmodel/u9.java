package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes.dex */
public final class u9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f117462d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.v9 f117463e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9(com.tencent.mm.plugin.finder.live.viewmodel.v9 v9Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f117463e = v9Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.viewmodel.u9(this.f117463e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.viewmodel.u9) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f117462d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f117462d = 1;
            if (this.f117463e.P6(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
