package z35;

/* loaded from: classes4.dex */
public final class m0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f470023d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView f470024e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView heroSeekBarView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f470024e = heroSeekBarView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new z35.m0(this.f470024e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((z35.m0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        z35.h0 videoPlayDurationProvider;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f470023d;
        if (i17 != 0 && i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        do {
            com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView heroSeekBarView = this.f470024e;
            if (!heroSeekBarView.isSeekBarActive) {
                return jz5.f0.f302826a;
            }
            if (!heroSeekBarView.getUserTouching() && (videoPlayDurationProvider = heroSeekBarView.getVideoPlayDurationProvider()) != null) {
                long a17 = videoPlayDurationProvider.a();
                if (heroSeekBarView.getUserSeekProgress() <= 0) {
                    com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView.a(heroSeekBarView, a17);
                } else if (a17 >= heroSeekBarView.c(heroSeekBarView.getUserSeekProgress())) {
                    com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView.a(heroSeekBarView, a17);
                    heroSeekBarView.setUserSeekProgress(-1);
                }
            }
            this.f470023d = 1;
        } while (kotlinx.coroutines.k1.b(16L, this) != aVar);
        return aVar;
    }
}
