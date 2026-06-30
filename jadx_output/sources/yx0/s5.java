package yx0;

/* loaded from: classes5.dex */
public final class s5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467640d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xx0.i f467641e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(yx0.b8 b8Var, xx0.i iVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467640d = b8Var;
        this.f467641e = iVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.s5(this.f467640d, this.f467641e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yx0.s5 s5Var = (yx0.s5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        s5Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        yx0.b8 b8Var = this.f467640d;
        xx0.i iVar = this.f467641e;
        if (!b8Var.K1) {
            b8Var.K1 = true;
            ((com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout) b8Var.f467177d).I0(iVar);
        }
        return jz5.f0.f302826a;
    }
}
