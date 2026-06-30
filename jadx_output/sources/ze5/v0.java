package ze5;

/* loaded from: classes9.dex */
public final class v0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ze5.n8 f472239d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.ue0 f472240e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(ze5.n8 n8Var, bw5.ue0 ue0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f472239d = n8Var;
        this.f472240e = ue0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ze5.v0(this.f472239d, this.f472240e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ze5.v0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        i95.m c17 = i95.n0.c(c00.z2.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c00.z2 z2Var = (c00.z2) c17;
        android.view.ViewParent viewParent = this.f472239d.f472111c;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (viewParent == null) {
            return f0Var;
        }
        bw5.ue0 shopCard = this.f472240e;
        kotlin.jvm.internal.o.g(shopCard, "shopCard");
        ((b00.r) z2Var).f16757d.getClass();
        f00.t tVar = viewParent instanceof f00.t ? (f00.t) viewParent : null;
        if (tVar != null) {
            tVar.a(shopCard);
        }
        return f0Var;
    }
}
