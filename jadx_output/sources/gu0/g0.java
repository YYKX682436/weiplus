package gu0;

/* loaded from: classes5.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gu0.k2 f275676d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.SurfaceView f275677e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(gu0.k2 k2Var, android.view.SurfaceView surfaceView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f275676d = k2Var;
        this.f275677e = surfaceView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gu0.g0(this.f275676d, this.f275677e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        gu0.g0 g0Var = (gu0.g0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        g0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            com.tencent.maas.moviecomposing.PlaybackSession playbackSession = this.f275676d.f275738n;
            if (playbackSession != null) {
                playbackSession.bindRenderView(this.f275677e);
            }
            this.f275676d.f275742r = true;
            com.tencent.mars.xlog.Log.i("MJCC.Session", "bindSurfaceView: success");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MJCC.Session", "bindSurfaceView: failed: " + e17.getMessage());
        }
        return jz5.f0.f302826a;
    }
}
