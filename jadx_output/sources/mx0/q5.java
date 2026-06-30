package mx0;

/* loaded from: classes5.dex */
public final /* synthetic */ class q5 extends kotlin.jvm.internal.m implements yz5.a {
    public q5(java.lang.Object obj) {
        super(0, obj, com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout.class, "onSurfaceDestroyed", "onSurfaceDestroyed()V", 0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = (com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout) this.receiver;
        int i17 = com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout.f69541d2;
        shootComposingPluginLayout.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingPluginLayout", "onSurfaceDestroyed");
        if (java.lang.Thread.currentThread().getId() == android.os.Looper.getMainLooper().getThread().getId()) {
            bs0.j jVar = shootComposingPluginLayout.f69552q;
            bs0.h hVar = jVar instanceof bs0.h ? (bs0.h) jVar : null;
            if (hVar != null) {
                hVar.d();
            }
        } else {
            kotlinx.coroutines.y0 scope = shootComposingPluginLayout.getScope();
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(scope, kotlinx.coroutines.internal.b0.f310484a, null, new mx0.q7(shootComposingPluginLayout, null), 2, null);
        }
        return jz5.f0.f302826a;
    }
}
