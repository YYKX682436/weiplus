package z35;

/* loaded from: classes10.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f470051d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.seekbar.FinderHeroSeekBarView f470052e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.mm.pluginsdk.ui.seekbar.FinderHeroSeekBarView finderHeroSeekBarView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f470052e = finderHeroSeekBarView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new z35.y(this.f470052e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((z35.y) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        z35.v videoPlayDurationProvider;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f470051d;
        if (i17 != 0 && i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        do {
            com.tencent.mm.pluginsdk.ui.seekbar.FinderHeroSeekBarView finderHeroSeekBarView = this.f470052e;
            if (!finderHeroSeekBarView.f191139u) {
                return jz5.f0.f302826a;
            }
            if (!finderHeroSeekBarView.f191134p && (videoPlayDurationProvider = this.f470052e.getVideoPlayDurationProvider()) != null) {
                zy2.g5 g5Var = ((lo2.b0) videoPlayDurationProvider).f320106a.f121408z;
                long currentPlayMs = g5Var != null ? g5Var.getCurrentPlayMs() : 0L;
                com.tencent.mm.pluginsdk.ui.seekbar.FinderHeroSeekBarView finderHeroSeekBarView2 = this.f470052e;
                int i18 = finderHeroSeekBarView2.f191129h;
                if (i18 <= 0) {
                    com.tencent.mm.pluginsdk.ui.seekbar.FinderHeroSeekBarView.e(finderHeroSeekBarView2, currentPlayMs);
                } else if (currentPlayMs >= (i18 * finderHeroSeekBarView2.f191128g) / 2500) {
                    com.tencent.mm.pluginsdk.ui.seekbar.FinderHeroSeekBarView.e(finderHeroSeekBarView2, currentPlayMs);
                    finderHeroSeekBarView2.f191129h = -1;
                }
            }
            this.f470051d = 1;
        } while (kotlinx.coroutines.k1.b(16L, this) != aVar);
        return aVar;
    }
}
