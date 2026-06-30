package f93;

/* loaded from: classes3.dex */
public final class k5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f260373d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f93.p5 f260374e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(f93.p5 p5Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f260374e = p5Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new f93.k5(this.f260374e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((f93.k5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f260373d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            c93.b a17 = c93.a.a();
            f93.p5 p5Var = this.f260374e;
            p5Var.f260429u.append((java.lang.CharSequence) com.tencent.mm.smiley.x1.Di().Ri(((b93.b) a17).g(p5Var.f260427s), true));
            java.util.List j17 = ((b93.b) c93.a.a()).j(p5Var.f260427s);
            if (j17 != null) {
                java.util.Iterator it = j17.iterator();
                while (it.hasNext()) {
                    p5Var.A.add(((com.tencent.mm.storage.k4) ((com.tencent.mm.storage.e8) ((jz5.n) p5Var.f260434z).getValue())).n((java.lang.String) it.next(), true));
                }
            }
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            f93.j5 j5Var = new f93.j5(p5Var, null);
            this.f260373d = 1;
            if (kotlinx.coroutines.l.g(g3Var, j5Var, this) == aVar) {
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
