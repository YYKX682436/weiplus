package mx0;

/* loaded from: classes3.dex */
public final class v8 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332402d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout) {
        super(1);
        this.f332402d = shootComposingPluginLayout;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingPluginLayout", "showAigcDraftPreview ret:" + booleanValue);
        int i17 = com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout.f69541d2;
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f332402d;
        kotlinx.coroutines.y0 scope = shootComposingPluginLayout.getScope();
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(scope, kotlinx.coroutines.internal.b0.f310484a, null, new mx0.u8(shootComposingPluginLayout, booleanValue, null), 2, null);
        return jz5.f0.f302826a;
    }
}
