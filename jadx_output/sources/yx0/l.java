package yx0;

/* loaded from: classes5.dex */
public final class l implements com.tencent.maas.camstudio.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f467424a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467425b;

    public l(boolean z17, yx0.b8 b8Var) {
        this.f467424a = z17;
        this.f467425b = b8Var;
    }

    @Override // com.tencent.maas.camstudio.d0
    public final void onComplete(com.tencent.maas.instamovie.base.MJError mJError) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("beginAITemplate: updateAIGCResult: err: ");
        sb6.append(mJError != null ? mJError.message : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", sb6.toString());
        yx0.b8 b8Var = this.f467425b;
        if (mJError != null && this.f467424a) {
            kotlinx.coroutines.l.d(b8Var.L, null, null, new yx0.k(b8Var, mJError, null), 3, null);
            return;
        }
        mx0.z zVar = b8Var.f467177d;
        b8Var.Z();
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = (com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout) zVar;
        shootComposingPluginLayout.getClass();
        ym5.a1.f(new mx0.a7(shootComposingPluginLayout));
    }
}
