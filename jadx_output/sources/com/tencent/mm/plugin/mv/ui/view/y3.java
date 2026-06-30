package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes.dex */
public final class y3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f151995d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f151996e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(com.tencent.mm.modelbase.f fVar, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f151995d = fVar;
        this.f151996e = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.mv.ui.view.y3(this.f151995d, this.f151996e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.mv.ui.view.y3 y3Var = (com.tencent.mm.plugin.mv.ui.view.y3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        y3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("errType: ");
        com.tencent.mm.modelbase.f fVar = this.f151995d;
        sb6.append(fVar != null ? new java.lang.Integer(fVar.f70615a) : null);
        sb6.append(", errCode: ");
        sb6.append(fVar != null ? new java.lang.Integer(fVar.f70616b) : null);
        sb6.append(", errMsg: ");
        sb6.append(fVar != null ? fVar.f70617c : null);
        com.tencent.mars.xlog.Log.w("MusicMvTabMyPostFragment", sb6.toString());
        this.f151996e.invoke();
        return jz5.f0.f302826a;
    }
}
