package wt3;

/* loaded from: classes5.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f449437d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wt3.q f449438e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(wt3.q qVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f449438e = qVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wt3.m(this.f449438e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((wt3.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f449437d;
        wt3.q qVar = this.f449438e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.r2 r2Var = qVar.f449475d;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            qVar.f449475d = null;
            kotlinx.coroutines.f1 f1Var = qVar.f449477f;
            if (f1Var != null) {
                this.f449437d = 1;
                if (kotlinx.coroutines.v2.d(f1Var, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        qVar.f449477f = null;
        if (qVar.f449472a != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("destroy ");
            sb6.append(java.lang.Thread.currentThread().getName());
            sb6.append(' ');
            com.tencent.maas.utils.MJVideoClassifier mJVideoClassifier = qVar.f449472a;
            sb6.append(mJVideoClassifier != null ? mJVideoClassifier.hashCode() : 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.AudioMaasClassifier", sb6.toString());
            com.tencent.maas.utils.MJVideoClassifier mJVideoClassifier2 = qVar.f449472a;
            if (mJVideoClassifier2 != null && mJVideoClassifier2.e()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AudioMaasClassifier", "release resource");
                com.tencent.maas.utils.MJVideoClassifier mJVideoClassifier3 = qVar.f449472a;
                if (mJVideoClassifier3 != null) {
                    mJVideoClassifier3.f();
                }
            }
            qVar.f449472a = null;
        }
        return jz5.f0.f302826a;
    }
}
