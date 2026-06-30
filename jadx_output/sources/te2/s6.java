package te2;

/* loaded from: classes3.dex */
public final class s6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f418406d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f418407e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(te2.p8 p8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f418407e = p8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new te2.s6(this.f418407e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((te2.s6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f418406d;
        te2.p8 p8Var = this.f418407e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f418406d = 1;
            obj = te2.p8.O6(p8Var, false, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            db5.t7.h(p8Var.getContext(), p8Var.getActivity().getResources().getString(com.tencent.mm.R.string.e09));
            p8Var.C1 = true;
        }
        te2.p8.x7(p8Var, false, null, 2, null);
        te2.p8.X6(p8Var, false, 1, null);
        return jz5.f0.f302826a;
    }
}
