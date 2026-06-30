package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class p6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.t6 f151359d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(com.tencent.mm.plugin.mv.ui.uic.t6 t6Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f151359d = t6Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.mv.ui.uic.p6(this.f151359d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.mv.ui.uic.p6 p6Var = (com.tencent.mm.plugin.mv.ui.uic.p6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        p6Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f151359d.O6().notifyDataSetChanged();
        return jz5.f0.f302826a;
    }
}
