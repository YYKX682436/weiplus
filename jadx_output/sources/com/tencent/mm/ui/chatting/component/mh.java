package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class mh extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f199509d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.nh f199510e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f199511f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mh(com.tencent.mm.ui.chatting.component.nh nhVar, com.tencent.mm.storage.f9 f9Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f199510e = nhVar;
        this.f199511f = f9Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.ui.chatting.component.mh(this.f199510e, this.f199511f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.ui.chatting.component.mh) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f199509d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.ui.chatting.component.nh nhVar = this.f199510e;
            com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(nhVar.f199592a.g(), null, nhVar.f199592a.s().getString(com.tencent.mm.R.string.b5q), true, false, null);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            com.tencent.mm.ui.chatting.component.lh lhVar = new com.tencent.mm.ui.chatting.component.lh(this.f199511f, nhVar, Q, null);
            this.f199509d = 1;
            if (kotlinx.coroutines.l.g(p0Var, lhVar, this) == aVar) {
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
