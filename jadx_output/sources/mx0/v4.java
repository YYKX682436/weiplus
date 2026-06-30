package mx0;

/* loaded from: classes5.dex */
public final class v4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332397d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mx0.r3 f332398e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, mx0.r3 r3Var) {
        super(1);
        this.f332397d = shootComposingPluginLayout;
        this.f332398e = r3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int i17 = com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout.f69541d2;
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f332397d;
        kotlinx.coroutines.y0 scope = shootComposingPluginLayout.getScope();
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(scope, kotlinx.coroutines.internal.b0.f310484a, null, new mx0.u4(shootComposingPluginLayout, booleanValue, this.f332398e, null), 2, null);
        return jz5.f0.f302826a;
    }
}
