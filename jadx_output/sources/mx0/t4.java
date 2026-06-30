package mx0;

/* loaded from: classes5.dex */
public final class t4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332350d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vt3.p f332351e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, vt3.p pVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332350d = shootComposingPluginLayout;
        this.f332351e = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.t4(this.f332350d, this.f332351e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        mx0.t4 t4Var = (mx0.t4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        t4Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        boolean z17 = this.f332351e.f440031m;
        int i17 = com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout.f69541d2;
        this.f332350d.d1(z17);
        return jz5.f0.f302826a;
    }
}
