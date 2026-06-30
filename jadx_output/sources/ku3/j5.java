package ku3;

/* loaded from: classes10.dex */
public final class j5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f312286d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ku3.l5 f312287e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f312288f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(boolean z17, ku3.l5 l5Var, boolean z18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f312286d = z17;
        this.f312287e = l5Var;
        this.f312288f = z18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ku3.j5(this.f312286d, this.f312287e, this.f312288f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ku3.j5 j5Var = (ku3.j5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        j5Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ku3.l5 l5Var = this.f312287e;
        boolean z17 = this.f312286d;
        if (!z17) {
            boolean z18 = l5Var.f312308e;
            boolean z19 = this.f312288f;
            if (z18 && !z19 && l5Var.f312309f == 1) {
                l5Var.f312307d.f475577e.setLightTorch(false);
            }
            if (l5Var.f312308e && z19) {
                l5Var.f312307d.f475577e.setLightTorch(false);
            }
        } else if (l5Var.f312309f == 2) {
            l5Var.f312307d.f475577e.setLightTorch(z17);
        }
        return jz5.f0.f302826a;
    }
}
