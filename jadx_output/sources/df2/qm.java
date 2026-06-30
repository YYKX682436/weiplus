package df2;

/* loaded from: classes3.dex */
public final class qm extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f231171d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.cn f231172e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f231173f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qm(df2.cn cnVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f231172e = cnVar;
        this.f231173f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.qm(this.f231172e, this.f231173f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.qm) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f231171d;
        df2.cn cnVar = this.f231172e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            long j17 = cnVar.A;
            this.f231171d = 1;
            if (kotlinx.coroutines.k1.b(j17, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.String str = cnVar.f229892p;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str2 = this.f231173f;
        sb6.append(str2);
        sb6.append(" dismiss after like, delay = ");
        sb6.append(cnVar.A);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        cnVar.n7(str2 + "-dismissAfterLikeJob", false);
        return jz5.f0.f302826a;
    }
}
