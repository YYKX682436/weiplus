package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class nd extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f113612d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.be f113613e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd(com.tencent.mm.plugin.finder.live.plugin.be beVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f113613e = beVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.nd(this.f113613e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((com.tencent.mm.plugin.finder.live.plugin.nd) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f113612d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.finder.live.plugin.be beVar = this.f113613e;
            kotlinx.coroutines.flow.j2 w17 = beVar.w1();
            com.tencent.mm.plugin.finder.live.plugin.md mdVar = new com.tencent.mm.plugin.finder.live.plugin.md(beVar);
            this.f113612d = 1;
            if (((kotlinx.coroutines.flow.h3) w17).a(mdVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new jz5.d();
    }
}
