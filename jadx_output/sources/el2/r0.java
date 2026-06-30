package el2;

/* loaded from: classes3.dex */
public final class r0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.i1 f253897d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(el2.i1 i1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f253897d = i1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new el2.r0(this.f253897d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((el2.r0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        dk2.ef efVar = dk2.ef.f233372a;
        el2.i1 i1Var = this.f253897d;
        dk2.xf j17 = efVar.j(i1Var.f253814f.R0());
        if (j17 == null) {
            return null;
        }
        ((dk2.r4) j17).T(java.lang.System.currentTimeMillis(), new el2.q0(i1Var));
        return jz5.f0.f302826a;
    }
}
