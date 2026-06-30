package mx0;

/* loaded from: classes5.dex */
public final class k7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx0.k f332100d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332101e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7(rx0.k kVar, com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332100d = kVar;
        this.f332101e = shootComposingPluginLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.k7(this.f332100d, this.f332101e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        mx0.k7 k7Var = (mx0.k7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        k7Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        rx0.k kVar = this.f332100d;
        java.lang.String str = kVar.f400941h;
        boolean z17 = str == null || str.length() == 0;
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f332101e;
        if (!z17) {
            shootComposingPluginLayout.U0(kVar.f400941h, null);
        }
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout.k0(shootComposingPluginLayout);
        return jz5.f0.f302826a;
    }
}
