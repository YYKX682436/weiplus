package mx0;

/* loaded from: classes5.dex */
public final class d9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f331923d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f331923d = shootComposingPluginLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.d9(this.f331923d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        mx0.d9 d9Var = (mx0.d9) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        d9Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f331923d.r0();
        return jz5.f0.f302826a;
    }
}
