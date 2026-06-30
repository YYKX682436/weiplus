package mx0;

/* loaded from: classes5.dex */
public final /* synthetic */ class r5 extends kotlin.jvm.internal.m implements yz5.r {
    public r5(java.lang.Object obj) {
        super(4, obj, com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout.class, "onSwitchToTemplate", "onSwitchToTemplate(Lkotlin/Pair;Lkotlin/Pair;ZLjava/util/List;)V", 0);
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        boolean booleanValue = ((java.lang.Boolean) obj3).booleanValue();
        java.util.List p37 = (java.util.List) obj4;
        kotlin.jvm.internal.o.g(p37, "p3");
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = (com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout) this.receiver;
        shootComposingPluginLayout.p0(shootComposingPluginLayout.f69557v.Q);
        kotlinx.coroutines.y0 scope = shootComposingPluginLayout.getScope();
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(scope, kotlinx.coroutines.internal.b0.f310484a, null, new mx0.s7(shootComposingPluginLayout, (jz5.l) obj, (jz5.l) obj2, p37, booleanValue, null), 2, null);
        return jz5.f0.f302826a;
    }
}
