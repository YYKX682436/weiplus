package gx0;

/* loaded from: classes5.dex */
public final class nd extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.bf f276768d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.SurfaceView f276769e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd(gx0.bf bfVar, android.view.SurfaceView surfaceView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276768d = bfVar;
        this.f276769e = surfaceView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.nd(this.f276768d, this.f276769e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.nd) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        jz5.f0 f0Var = jz5.f0.f302826a;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            com.tencent.maas.moviecomposing.PlaybackSession playbackSession = this.f276768d.B;
            if (playbackSession == null) {
                return null;
            }
            playbackSession.bindRenderView(this.f276769e);
            return f0Var;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MovieComp.PlaybackControlUIC", "bindRenderView - failed:" + e17.getMessage(), e17);
            return f0Var;
        }
    }
}
