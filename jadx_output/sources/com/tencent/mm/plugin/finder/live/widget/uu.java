package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class uu extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f120004d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.vu f120005e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu(com.tencent.mm.plugin.finder.live.widget.vu vuVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f120005e = vuVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.uu(this.f120005e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.uu) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f120004d;
        com.tencent.mm.plugin.finder.live.widget.vu vuVar = this.f120005e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.view.LazyPlayPAGView lazyPlayPAGView = vuVar.f120097i;
            if (lazyPlayPAGView == null) {
                com.tencent.mars.xlog.Log.i("FinderLiveRequestSingingSongWidget", "No songPlayingIcon for singing song widget");
                return jz5.f0.f302826a;
            }
            vl2.s sVar = vl2.s.f437868a;
            vl2.h hVar = vl2.h.N;
            kotlin.jvm.internal.o.d(lazyPlayPAGView);
            this.f120004d = 1;
            if (sVar.d(hVar, lazyPlayPAGView, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        vuVar.f120105q = true;
        com.tencent.mars.xlog.Log.i("FinderLiveRequestSingingSongWidget", "Loaded PAG for singing song widget");
        return jz5.f0.f302826a;
    }
}
