package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class u2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderConversationFragment f129896d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(com.tencent.mm.plugin.finder.ui.FinderConversationFragment finderConversationFragment, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f129896d = finderConversationFragment;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.ui.u2(this.f129896d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.ui.u2 u2Var = (com.tencent.mm.plugin.finder.ui.u2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        u2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        int i17 = com.tencent.mm.plugin.finder.ui.FinderConversationFragment.I;
        this.f129896d.w0().notifyItemChanged(0);
        return jz5.f0.f302826a;
    }
}
