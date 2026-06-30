package mx0;

/* loaded from: classes5.dex */
public final class w0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f332407d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mx0.e1 f332408e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(mx0.e1 e1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332408e = e1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.w0(this.f332408e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.w0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f332407d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mx0.e1 e1Var = this.f332408e;
            this.f332407d = 1;
            java.util.Objects.toString(e1Var.f331935b);
            int ordinal = e1Var.f331935b.ordinal();
            obj = (ordinal == 6 || ordinal == 7 || ordinal == 8) ? java.lang.Boolean.FALSE : e1Var.f331934a.E0(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
