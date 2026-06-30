package mx0;

/* loaded from: classes5.dex */
public final class t7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f332353d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332354e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(java.lang.String str, com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332353d = str;
        this.f332354e = shootComposingPluginLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.t7(this.f332353d, this.f332354e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        mx0.t7 t7Var = (mx0.t7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        t7Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        mx0.ja templateUIPlugin;
        xx0.f0 f0Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onTemplateDownloadFinished templateId:");
        java.lang.String templateId = this.f332353d;
        sb6.append(templateId);
        com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingPluginLayout", sb6.toString());
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f332354e;
        templateUIPlugin = shootComposingPluginLayout.getTemplateUIPlugin();
        templateUIPlugin.getClass();
        kotlin.jvm.internal.o.g(templateId, "templateId");
        templateUIPlugin.f332080i.L(templateId);
        xx0.n nVar = shootComposingPluginLayout.K1;
        if (nVar != null) {
            kotlin.jvm.internal.o.g(templateId, "templateId");
            xx0.c a17 = nVar.a();
            if (a17 != null && (f0Var = a17.f457864g) != null) {
                java.util.Iterator it = ((java.util.LinkedHashMap) f0Var.f457899h).values().iterator();
                while (it.hasNext()) {
                    xx0.d0 d0Var = ((xx0.e0) it.next()).f457888a;
                    d0Var.getClass();
                    d0Var.f457881i.y(templateId);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
