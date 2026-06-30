package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class k1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.playlist.s1 f122334d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f122335e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(com.tencent.mm.plugin.finder.playlist.s1 s1Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f122334d = s1Var;
        this.f122335e = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.playlist.k1(this.f122334d, this.f122335e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.playlist.k1 k1Var = (com.tencent.mm.plugin.finder.playlist.k1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        k1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f122334d.g(this.f122335e, 0);
        return jz5.f0.f302826a;
    }
}
