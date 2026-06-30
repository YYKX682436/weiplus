package mx0;

/* loaded from: classes3.dex */
public final /* synthetic */ class t5 extends kotlin.jvm.internal.m implements yz5.p {
    public t5(java.lang.Object obj) {
        super(2, obj, com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout.class, "onTemplateDownloadProgressUpdate", "onTemplateDownloadProgressUpdate(Ljava/lang/String;F)V", 0);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String p07 = (java.lang.String) obj;
        float floatValue = ((java.lang.Number) obj2).floatValue();
        kotlin.jvm.internal.o.g(p07, "p0");
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = (com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout) this.receiver;
        int i17 = com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout.f69541d2;
        kotlinx.coroutines.y0 scope = shootComposingPluginLayout.getScope();
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(scope, kotlinx.coroutines.internal.b0.f310484a, null, new mx0.u7(p07, floatValue, shootComposingPluginLayout, null), 2, null);
        return jz5.f0.f302826a;
    }
}
