package dt2;

/* loaded from: classes3.dex */
public final class w extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f243208d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.replay.widget.FinderLiveReplaySeekbar f243209e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.tencent.mm.plugin.finder.replay.widget.FinderLiveReplaySeekbar finderLiveReplaySeekbar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f243209e = finderLiveReplaySeekbar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dt2.w(this.f243209e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dt2.w) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f243208d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            long doubleTapTimeout = android.view.ViewConfiguration.getDoubleTapTimeout();
            this.f243208d = 1;
            if (kotlinx.coroutines.k1.b(doubleTapTimeout, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.plugin.finder.replay.widget.FinderLiveReplaySeekbar finderLiveReplaySeekbar = this.f243209e;
        yz5.l lVar = finderLiveReplaySeekbar.f124924i;
        if (lVar != null) {
            lVar.invoke(finderLiveReplaySeekbar.f124926n);
        }
        finderLiveReplaySeekbar.f124926n = null;
        return jz5.f0.f302826a;
    }
}
