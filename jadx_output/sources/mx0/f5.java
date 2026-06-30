package mx0;

/* loaded from: classes5.dex */
public final class f5 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f331976d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ py0.f0 f331977e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.q f331978f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, py0.f0 f0Var, yz5.q qVar) {
        super(2);
        this.f331976d = shootComposingPluginLayout;
        this.f331977e = f0Var;
        this.f331978f = qVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        rx0.k kVar = (rx0.k) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        int i17 = com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout.f69541d2;
        kotlinx.coroutines.y0 scope = this.f331976d.getScope();
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(scope, kotlinx.coroutines.internal.b0.f310484a, null, new mx0.e5(this.f331977e, kVar, this.f331976d, booleanValue, this.f331978f, null), 2, null);
        return jz5.f0.f302826a;
    }
}
