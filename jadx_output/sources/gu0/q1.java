package gu0;

/* loaded from: classes5.dex */
public final class q1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gu0.k2 f275795d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(gu0.k2 k2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f275795d = k2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gu0.q1(this.f275795d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        gu0.q1 q1Var = (gu0.q1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        q1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        gu0.k2 k2Var = this.f275795d;
        com.tencent.maas.moviecomposing.PlaybackSession playbackSession = k2Var.f275738n;
        if (playbackSession != null) {
            try {
                playbackSession.unbindRenderView();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MJCC.Session", "releaseResources: unbindRenderView failed: " + e17.getMessage());
            }
            try {
                playbackSession.release();
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MJCC.Session", "releaseResources: release playbackSession failed: " + e18.getMessage());
            }
            k2Var.f275738n = null;
        }
        try {
            com.tencent.maas.moviecomposing.ExportSession exportSession = k2Var.f275739o;
            if (exportSession != null) {
                exportSession.b();
            }
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.e("MJCC.Session", "releaseResources: release exportSession failed: " + e19.getMessage());
        }
        k2Var.f275739o = null;
        k2Var.getClass();
        k2Var.f275737m = null;
        try {
            com.tencent.maas.camstudio.MJCamResourceManager mJCamResourceManager = k2Var.f275740p;
            if (mJCamResourceManager != null) {
                mJCamResourceManager.q();
            }
        } catch (java.lang.Exception e27) {
            com.tencent.mars.xlog.Log.e("MJCC.Session", "releaseResources: release camResourceManager failed: " + e27.getMessage());
        }
        k2Var.f275740p = null;
        return jz5.f0.f302826a;
    }
}
