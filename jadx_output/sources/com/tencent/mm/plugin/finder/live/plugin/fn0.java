package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class fn0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.wn0 f112578d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn0(com.tencent.mm.plugin.finder.live.plugin.wn0 wn0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f112578d = wn0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.fn0(this.f112578d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.fn0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.finder.live.plugin.wn0 wn0Var = this.f112578d;
        dk2.xf W0 = wn0Var.W0();
        if (W0 == null) {
            return null;
        }
        ((dk2.r4) W0).T(java.lang.System.currentTimeMillis(), new com.tencent.mm.plugin.finder.live.plugin.en0(wn0Var));
        return jz5.f0.f302826a;
    }
}
