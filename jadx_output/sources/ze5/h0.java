package ze5;

/* loaded from: classes9.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ze5.n8 f471958d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ze5.n0 f471959e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(ze5.n8 n8Var, ze5.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f471958d = n8Var;
        this.f471959e = n0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ze5.h0(this.f471958d, this.f471959e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ze5.h0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.mvvm.MvvmView mvvmView = this.f471958d.f472111c;
        if (mvvmView == null) {
            return null;
        }
        i95.m c17 = i95.n0.c(c00.z2.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c00.z2 z2Var = (c00.z2) c17;
        bw5.u8 u8Var = this.f471959e.f472102t;
        if (u8Var != null) {
            ((b00.r) z2Var).f16757d.getClass();
            com.tencent.mm.feature.ecs.card.view.EcsProductCardViewNewStyle ecsProductCardViewNewStyle = mvvmView instanceof com.tencent.mm.feature.ecs.card.view.EcsProductCardViewNewStyle ? (com.tencent.mm.feature.ecs.card.view.EcsProductCardViewNewStyle) mvvmView : null;
            if (ecsProductCardViewNewStyle != null) {
                ecsProductCardViewNewStyle.j(u8Var);
            }
        }
        return jz5.f0.f302826a;
    }
}
