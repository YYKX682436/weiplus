package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class l4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f135019d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.q4 f135020e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(com.tencent.mm.modelbase.f fVar, com.tencent.mm.plugin.finder.viewmodel.component.q4 q4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f135019d = fVar;
        this.f135020e = q4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.l4(this.f135019d, this.f135020e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.viewmodel.component.l4 l4Var = (com.tencent.mm.plugin.finder.viewmodel.component.l4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        l4Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("errType:");
        com.tencent.mm.modelbase.f fVar = this.f135019d;
        sb6.append(fVar != null ? new java.lang.Integer(fVar.f70615a) : null);
        sb6.append(", errCode:");
        sb6.append(fVar != null ? new java.lang.Integer(fVar.f70616b) : null);
        sb6.append(", errMsg:");
        sb6.append(fVar != null ? fVar.f70617c : null);
        com.tencent.mars.xlog.Log.i("Finder.FinderBaseCreateAccountHalfScreenUIC", sb6.toString());
        com.tencent.mm.plugin.finder.viewmodel.component.q4 q4Var = this.f135020e;
        az2.f fVar2 = q4Var.f135659e;
        if (fVar2 != null) {
            fVar2.b();
        }
        db5.t7.m(q4Var.getContext(), q4Var.getString(com.tencent.mm.R.string.cro));
        q4Var.T6();
        return jz5.f0.f302826a;
    }
}
