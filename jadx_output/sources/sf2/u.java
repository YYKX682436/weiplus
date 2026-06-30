package sf2;

/* loaded from: classes10.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f407294d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf2.x f407295e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(sf2.x xVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f407295e = xVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sf2.u(this.f407295e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((sf2.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f407294d;
        sf2.x xVar = this.f407295e;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                gn2.a aVar2 = xVar.f407347p;
                if (aVar2 != null) {
                    aVar2.c(true);
                }
                this.f407294d = 1;
                if (xVar.k7(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            gn2.a aVar3 = xVar.f407347p;
            if (aVar3 != null) {
                aVar3.e();
            }
            gn2.a aVar4 = xVar.f407347p;
            if (aVar4 != null) {
                gn2.a.q(aVar4, false, 1, null);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FinderLiveAnchorMusicSingSongController", "showOldSongListPanel error: " + e17.getMessage(), e17);
        }
        return jz5.f0.f302826a;
    }
}
