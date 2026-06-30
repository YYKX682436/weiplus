package mz0;

/* loaded from: classes5.dex */
public final class w2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f333074d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mz0.x2 f333075e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f333076f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(boolean z17, mz0.x2 x2Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f333074d = z17;
        this.f333075e = x2Var;
        this.f333076f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mz0.w2(this.f333074d, this.f333075e, this.f333076f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        mz0.w2 w2Var = (mz0.w2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        w2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        boolean z17 = this.f333074d;
        mz0.x2 x2Var = this.f333075e;
        if (z17) {
            x2Var.I7(this.f333076f, false);
        } else {
            x2Var.f7().dismiss();
        }
        return jz5.f0.f302826a;
    }
}
