package mx0;

/* loaded from: classes3.dex */
public final class b5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f331848d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ py0.f0 f331849e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, py0.f0 f0Var) {
        super(1);
        this.f331848d = shootComposingPluginLayout;
        this.f331849e = f0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        int i17 = com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout.f69541d2;
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f331848d;
        kotlinx.coroutines.y0 scope = shootComposingPluginLayout.getScope();
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(scope, kotlinx.coroutines.internal.b0.f310484a, null, new mx0.a5(this.f331849e, shootComposingPluginLayout, intValue, null), 2, null);
        return jz5.f0.f302826a;
    }
}
