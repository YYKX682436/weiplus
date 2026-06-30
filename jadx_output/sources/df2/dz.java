package df2;

/* loaded from: classes3.dex */
public final class dz extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f230007d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.lz f230008e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.aq4 f230009f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dz(df2.lz lzVar, r45.aq4 aq4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230008e = lzVar;
        this.f230009f = aq4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.dz(this.f230008e, this.f230009f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.dz) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f230007d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            df2.lz lzVar = this.f230008e;
            java.lang.String str = lzVar.f230730m;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("receive moneyoff info ");
            r45.aq4 aq4Var = this.f230009f;
            sb6.append(aq4Var != null ? aq4Var.toJSON() : null);
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            this.f230007d = 1;
            if (df2.lz.Z6(lzVar, aq4Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
