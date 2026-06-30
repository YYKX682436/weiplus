package mx0;

/* loaded from: classes5.dex */
public final /* synthetic */ class m5 extends kotlin.jvm.internal.m implements yz5.p {
    public m5(java.lang.Object obj) {
        super(2, obj, com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout.class, "onRecordingTimeChangeCallback", "onRecordingTimeChangeCallback(Lcom/tencent/maas/model/time/MJTime;Lcom/tencent/maas/model/time/MJTime;)V", 0);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.maas.model.time.MJTime p07 = (com.tencent.maas.model.time.MJTime) obj;
        com.tencent.maas.model.time.MJTime p17 = (com.tencent.maas.model.time.MJTime) obj2;
        kotlin.jvm.internal.o.g(p07, "p0");
        kotlin.jvm.internal.o.g(p17, "p1");
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = (com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout) this.receiver;
        int i17 = com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout.f69541d2;
        kotlinx.coroutines.y0 scope = shootComposingPluginLayout.getScope();
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(scope, kotlinx.coroutines.internal.b0.f310484a, null, new mx0.i7(p07, p17, shootComposingPluginLayout, null), 2, null);
        return jz5.f0.f302826a;
    }
}
