package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class hd0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f112800d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.LazyPlayPAGView f112801e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd0(com.tencent.mm.view.LazyPlayPAGView lazyPlayPAGView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f112801e = lazyPlayPAGView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.hd0(this.f112801e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.hd0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f112800d;
        com.tencent.mm.view.LazyPlayPAGView lazyPlayPAGView = this.f112801e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            vl2.s sVar = vl2.s.f437868a;
            vl2.h hVar = vl2.h.I;
            this.f112800d = 1;
            if (sVar.d(hVar, lazyPlayPAGView, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        lazyPlayPAGView.setProgress(0.0d);
        lazyPlayPAGView.d();
        lazyPlayPAGView.g();
        return jz5.f0.f302826a;
    }
}
