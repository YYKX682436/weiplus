package mx0;

/* loaded from: classes5.dex */
public final class j7 implements d85.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f332071a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332072b;

    public j7(boolean z17, com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout) {
        this.f332071a = z17;
        this.f332072b = shootComposingPluginLayout;
    }

    @Override // d85.k0
    public final void onOp(java.lang.Boolean bool) {
        kotlin.jvm.internal.o.d(bool);
        if (!bool.booleanValue() || this.f332071a) {
            return;
        }
        int i17 = com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout.f69541d2;
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f332072b;
        shootComposingPluginLayout.getClass();
        try {
            shootComposingPluginLayout.f69547n.f(androidx.lifecycle.m.ON_RESUME);
            shootComposingPluginLayout.M = android.os.SystemClock.elapsedRealtime();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ShootComposingPluginLayout", e17, "handleLifecycleEvent error", new java.lang.Object[0]);
        }
    }
}
