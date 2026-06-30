package com.tencent.mm.plugin.multitalk.ui;

/* loaded from: classes14.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f150398d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ui.b0 f150399e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(int i17, com.tencent.mm.plugin.multitalk.ui.b0 b0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f150398d = i17;
        this.f150399e = b0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.multitalk.ui.y(this.f150398d, this.f150399e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.multitalk.ui.y yVar = (com.tencent.mm.plugin.multitalk.ui.y) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        yVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        zi3.f Di = com.tencent.mm.plugin.multitalk.model.e3.Di();
        int i17 = this.f150398d;
        Di.O(i17, true);
        this.f150399e.R6(i17 == 1);
        return jz5.f0.f302826a;
    }
}
