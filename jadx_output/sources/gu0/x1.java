package gu0;

/* loaded from: classes5.dex */
public final class x1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.PlaybackSession f275855d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.SurfaceView f275856e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(com.tencent.maas.moviecomposing.PlaybackSession playbackSession, android.view.SurfaceView surfaceView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f275855d = playbackSession;
        this.f275856e = surfaceView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gu0.x1(this.f275855d, this.f275856e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        gu0.x1 x1Var = (gu0.x1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        x1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            this.f275855d.bindRenderView(this.f275856e);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MJCC.Session", "setupPlayback: bindRenderView failed: " + e17.getMessage());
        }
        return jz5.f0.f302826a;
    }
}
