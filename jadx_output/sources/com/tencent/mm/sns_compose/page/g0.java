package com.tencent.mm.sns_compose.page;

/* loaded from: classes3.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q85.g f193469d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f193470e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(q85.g gVar, n0.e5 e5Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f193469d = gVar;
        this.f193470e = e5Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.sns_compose.page.g0(this.f193469d, this.f193470e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.sns_compose.page.g0 g0Var = (com.tencent.mm.sns_compose.page.g0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        g0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pk4.d dVar;
        pk4.d dVar2;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        boolean booleanValue = ((java.lang.Boolean) this.f193470e.getValue()).booleanValue();
        q85.g gVar = this.f193469d;
        gVar.f360808m = booleanValue;
        pk4.d dVar3 = gVar.f360807i;
        if (dVar3 != null) {
            if (booleanValue) {
                if (!dVar3.isPlaying() && (dVar2 = gVar.f360807i) != null) {
                    dVar2.start();
                }
            } else if (dVar3.isPlaying() && (dVar = gVar.f360807i) != null) {
                dVar.pause();
            }
        }
        return jz5.f0.f302826a;
    }
}
