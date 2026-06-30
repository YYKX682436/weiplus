package yx0;

/* loaded from: classes5.dex */
public final class b0 implements com.tencent.maas.camstudio.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467144a;

    public b0(yx0.b8 b8Var) {
        this.f467144a = b8Var;
    }

    @Override // com.tencent.maas.camstudio.d0
    public final void onComplete(com.tencent.maas.instamovie.base.MJError mJError) {
        java.util.Objects.toString(mJError);
        yx0.b8 b8Var = this.f467144a;
        b8Var.Z();
        mx0.z zVar = b8Var.f467177d;
        if (mJError == null) {
            b8Var.Z();
            com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = (com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout) zVar;
            shootComposingPluginLayout.getClass();
            ym5.a1.f(new mx0.a7(shootComposingPluginLayout));
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ShootComposingCorePlugin", "aigcFinishCallback: aigc request failed, error code = " + mJError.getErrorCode() + ", message = " + mJError.message);
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout2 = (com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout) zVar;
        shootComposingPluginLayout2.getClass();
        ym5.a1.f(new mx0.z6(mJError, shootComposingPluginLayout2));
        kotlinx.coroutines.l.d(b8Var.L, null, null, new yx0.a0(b8Var, mJError, null), 3, null);
    }
}
