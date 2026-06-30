package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class a7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f116178d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView f116179e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7(com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView finderLiveMiniView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f116179e = finderLiveMiniView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.view.a7(this.f116179e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((com.tencent.mm.plugin.finder.live.view.a7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f116178d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView finderLiveMiniView = this.f116179e;
            kotlinx.coroutines.flow.j2 j2Var = finderLiveMiniView.f116046u;
            com.tencent.mm.plugin.finder.live.view.z6 z6Var = new com.tencent.mm.plugin.finder.live.view.z6(finderLiveMiniView);
            this.f116178d = 1;
            if (((kotlinx.coroutines.flow.h3) j2Var).a(z6Var, this) == aVar) {
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
