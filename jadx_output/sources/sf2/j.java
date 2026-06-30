package sf2;

/* loaded from: classes10.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f407171d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf2.x f407172e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(sf2.x xVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f407172e = xVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sf2.j(this.f407172e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((sf2.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f407171d;
        sf2.x xVar = this.f407172e;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicSingSongController", "handleSongListOnLiveStart: has song list, loading...");
                this.f407171d = 1;
                if (xVar.i7(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            sf2.e1 e1Var = (sf2.e1) xVar.getStore().controller(sf2.e1.class);
            if (e1Var != null) {
                if (dk2.ef.f233388i) {
                    com.tencent.mars.xlog.Log.i("FinderLiveNormalRoomSingController", "checkAndClearSingingSongIfNeeded: already cleared, skip");
                } else {
                    dk2.ef.f233388i = true;
                    com.tencent.mm.plugin.finder.live.util.y.d(e1Var, null, null, new sf2.n0(e1Var, null), 3, null);
                }
            }
            com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicSingSongController", "handleSongListOnLiveStart: completed");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FinderLiveAnchorMusicSingSongController", "handleSongListOnLiveStart exception: " + e17.getMessage());
        }
        return jz5.f0.f302826a;
    }
}
