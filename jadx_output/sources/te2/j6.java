package te2;

/* loaded from: classes3.dex */
public final class j6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f418139d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f418140e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(te2.p8 p8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f418140e = p8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new te2.j6(this.f418140e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((te2.j6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f418139d;
        te2.p8 p8Var = this.f418140e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f418139d = 1;
            obj = p8Var.S6(1, this);
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
            r45.h32 h32Var = p8Var.A1.f418391b;
            if (h32Var != null) {
                h32Var.set(15, java.lang.Boolean.TRUE);
            }
            db5.t7.h(p8Var.getContext(), p8Var.getActivity().getResources().getString(com.tencent.mm.R.string.f491732e21));
            p8Var.C1 = true;
        }
        te2.p8.x7(p8Var, false, null, 2, null);
        return jz5.f0.f302826a;
    }
}
