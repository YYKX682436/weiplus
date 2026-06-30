package rn2;

/* loaded from: classes.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f397843d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f397844e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.tencent.mm.ui.MMActivity mMActivity, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f397844e = mMActivity;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rn2.t(this.f397844e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rn2.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f397843d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            dk2.q4 q4Var = dk2.q4.f233938a;
            com.tencent.mm.ui.MMActivity mMActivity = this.f397844e;
            this.f397843d = 1;
            obj = dk2.q4.i(q4Var, mMActivity, false, this, 2, null);
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
