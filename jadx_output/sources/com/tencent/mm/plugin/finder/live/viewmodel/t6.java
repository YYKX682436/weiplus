package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class t6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f117420d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yl2.g1 f117421e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f117422f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6(yl2.g1 g1Var, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f117421e = g1Var;
        this.f117422f = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.viewmodel.t6(this.f117421e, this.f117422f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.viewmodel.t6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f117420d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f117420d = 1;
            if (this.f117421e.j(this.f117422f, this) == aVar) {
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
