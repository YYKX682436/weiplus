package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public final class g1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f199073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.i1 f199074e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(com.tencent.mm.ui.chatting.component.i1 i1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f199074e = i1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.ui.chatting.component.g1(this.f199074e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.ui.chatting.component.g1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f199073d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f199073d = 1;
            if (kotlinx.coroutines.k1.b(1300L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        ((com.tencent.mm.feature.chatrecordstts.b1) ((oy.i) ((jz5.n) this.f199074e.f199207e).getValue())).pj();
        return jz5.f0.f302826a;
    }
}
