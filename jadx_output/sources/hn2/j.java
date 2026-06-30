package hn2;

/* loaded from: classes10.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f282532d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.singlist.common.FinderLiveSongInfoView f282533e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.plugin.finder.live.widget.singlist.common.FinderLiveSongInfoView finderLiveSongInfoView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f282533e = finderLiveSongInfoView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hn2.j(this.f282533e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hn2.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f282532d;
        com.tencent.mm.plugin.finder.live.widget.singlist.common.FinderLiveSongInfoView finderLiveSongInfoView = this.f282533e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            vl2.s sVar = vl2.s.f437868a;
            vl2.h hVar = vl2.h.N;
            com.tencent.mm.view.LazyPlayPAGView lazyPlayPAGView = finderLiveSongInfoView.f119784z;
            this.f282532d = 1;
            if (sVar.d(hVar, lazyPlayPAGView, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        finderLiveSongInfoView.F = true;
        return jz5.f0.f302826a;
    }
}
