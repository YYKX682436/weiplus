package mx0;

/* loaded from: classes.dex */
public final class p6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332213d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332213d = shootComposingPluginLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.p6(this.f332213d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        mx0.p6 p6Var = (mx0.p6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        p6Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f332213d;
        db5.e1.C(shootComposingPluginLayout.getContext(), i65.a.r(shootComposingPluginLayout.getContext(), com.tencent.mm.R.string.hss), i65.a.r(shootComposingPluginLayout.getContext(), com.tencent.mm.R.string.hsu), i65.a.r(shootComposingPluginLayout.getContext(), com.tencent.mm.R.string.hst), i65.a.r(shootComposingPluginLayout.getContext(), com.tencent.mm.R.string.hsr), false, new mx0.n6(shootComposingPluginLayout), mx0.o6.f332194d);
        return jz5.f0.f302826a;
    }
}
