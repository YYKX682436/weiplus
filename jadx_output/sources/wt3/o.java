package wt3;

/* loaded from: classes5.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f449459d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wt3.q f449460e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(wt3.q qVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f449460e = qVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wt3.o(this.f449460e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((wt3.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.maas.instamovie.base.MJError.MaasEC maasEC;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f449459d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            pp0.n0 n0Var = (pp0.n0) i95.n0.c(pp0.n0.class);
            this.f449459d = 1;
            ((yy0.q7) n0Var).getClass();
            obj = az0.l2.f15656a.a(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!booleanValue) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AudioMaasClassifier", "load maas so error");
            return f0Var;
        }
        wt3.q qVar = this.f449460e;
        if (qVar.f449472a == null) {
            com.tencent.maas.utils.MJVideoClassifier mJVideoClassifier = new com.tencent.maas.utils.MJVideoClassifier();
            qVar.f449472a = mJVideoClassifier;
            com.tencent.maas.instamovie.base.MJError d17 = mJVideoClassifier.d(qVar.c());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init result >> ");
            sb6.append(java.lang.Thread.currentThread().getName());
            sb6.append(", ");
            com.tencent.maas.utils.MJVideoClassifier mJVideoClassifier2 = qVar.f449472a;
            sb6.append(mJVideoClassifier2 != null ? mJVideoClassifier2.hashCode() : 0);
            sb6.append(", ");
            sb6.append((d17 == null || (maasEC = d17.f48175ec) == null) ? null : new java.lang.Integer(maasEC.getErrorCode()));
            sb6.append(", ");
            sb6.append(d17 != null ? d17.message : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.AudioMaasClassifier", sb6.toString());
        }
        return f0Var;
    }
}
