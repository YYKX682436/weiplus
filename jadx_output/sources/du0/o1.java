package du0;

/* loaded from: classes5.dex */
public final class o1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f243404d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ du0.p1 f243405e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(du0.p1 p1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f243405e = p1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new du0.o1(this.f243405e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((du0.o1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f243404d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f243404d = 1;
            if (kotlinx.coroutines.k1.b(500L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        du0.p1 p1Var = this.f243405e;
        ev0.c cVar = p1Var.f243414q;
        if (cVar == null ? false : ((com.tencent.mm.mj_publisher.finder.movie_composing.music.MovieComposingMusicPickerComponentLayout) cVar.g().e()).r()) {
            try {
                ev0.c cVar2 = p1Var.f243414q;
                if (cVar2 != null) {
                    java.util.List mediaItems = p1Var.c7().N5();
                    com.tencent.maas.model.time.MJTime b76 = p1Var.b7();
                    kotlin.jvm.internal.o.g(mediaItems, "mediaItems");
                    ((com.tencent.mm.mj_publisher.finder.movie_composing.music.MovieComposingMusicPickerComponentLayout) cVar2.g().e()).t(cVar2.f222355e);
                    cVar2.p(mediaItems, b76);
                    ((com.tencent.mm.mj_publisher.finder.movie_composing.music.MovieComposingMusicPickerComponentLayout) cVar2.g().e()).w();
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MusicTipUIC", "refreshRecommendData error: " + e17.getMessage());
            }
        }
        return jz5.f0.f302826a;
    }
}
