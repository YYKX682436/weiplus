package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class xd extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f115073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.be f115074e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd(com.tencent.mm.plugin.finder.live.plugin.be beVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f115074e = beVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.xd(this.f115074e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.xd) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f115073d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.finder.live.plugin.be beVar = this.f115074e;
            mm2.j2 j2Var = (mm2.j2) beVar.P0(mm2.j2.class);
            com.tencent.mm.plugin.finder.live.plugin.wd wdVar = new com.tencent.mm.plugin.finder.live.plugin.wd(beVar);
            this.f115073d = 1;
            mm2.v1 v1Var = mm2.j2.F;
            if (j2Var.V6(wdVar, false, this) == aVar) {
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
