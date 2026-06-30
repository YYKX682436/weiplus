package mx0;

/* loaded from: classes5.dex */
public final /* synthetic */ class o5 extends kotlin.jvm.internal.m implements yz5.p {
    public o5(java.lang.Object obj) {
        super(2, obj, com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout.class, "onCoreStateChanged", "onCoreStateChanged(Lcom/tencent/mm/mj_publisher/finder/shoot_composing/viewmodel/CorePlugin$State;Lcom/tencent/mm/mj_publisher/finder/shoot_composing/viewmodel/CorePlugin$State;)V", 0);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yx0.v p07 = (yx0.v) obj;
        yx0.v p17 = (yx0.v) obj2;
        kotlin.jvm.internal.o.g(p07, "p0");
        kotlin.jvm.internal.o.g(p17, "p1");
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = (com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout) this.receiver;
        int i17 = com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout.f69541d2;
        kotlinx.coroutines.y0 scope = shootComposingPluginLayout.getScope();
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(scope, kotlinx.coroutines.internal.b0.f310484a, null, new mx0.e7(shootComposingPluginLayout, p17, p07, null), 2, null);
        return jz5.f0.f302826a;
    }
}
