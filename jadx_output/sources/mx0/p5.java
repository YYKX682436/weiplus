package mx0;

/* loaded from: classes5.dex */
public final /* synthetic */ class p5 extends kotlin.jvm.internal.m implements yz5.p {
    public p5(java.lang.Object obj) {
        super(2, obj, com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout.class, "onSurfaceCreated", "onSurfaceCreated(Landroid/view/Surface;Landroid/util/Size;)V", 0);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.view.Surface p07 = (android.view.Surface) obj;
        android.util.Size p17 = (android.util.Size) obj2;
        kotlin.jvm.internal.o.g(p07, "p0");
        kotlin.jvm.internal.o.g(p17, "p1");
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = (com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout) this.receiver;
        int i17 = com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout.f69541d2;
        shootComposingPluginLayout.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingPluginLayout", "onSurfaceCreated surface:" + p07 + " outputSize:" + p17);
        kotlinx.coroutines.y0 scope = shootComposingPluginLayout.getScope();
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(scope, kotlinx.coroutines.internal.b0.f310484a, null, new mx0.p7(shootComposingPluginLayout, p07, p17, null), 2, null);
        return jz5.f0.f302826a;
    }
}
