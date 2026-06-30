package df2;

/* loaded from: classes3.dex */
public final class po extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f231103d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xg2.h f231104e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.to f231105f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po(xg2.h hVar, kotlin.coroutines.Continuation continuation, df2.to toVar) {
        super(2, continuation);
        this.f231104e = hVar;
        this.f231105f = toVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.po(this.f231104e, continuation, this.f231105f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.po) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.LinkedList list;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f231103d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r45.v71 v71Var = (r45.v71) ((xg2.i) this.f231104e).f454393b;
            df2.to toVar = this.f231105f;
            java.lang.String str = toVar.f231460m;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getLiveNotice: cgi success， noticeSize=");
            r45.j32 j32Var = (r45.j32) v71Var.getCustom(4);
            sb6.append((j32Var == null || (list = j32Var.getList(0)) == null) ? null : new java.lang.Integer(list.size()));
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            df2.no noVar = new df2.no(toVar, v71Var, null);
            this.f231103d = 1;
            if (kotlinx.coroutines.l.g(g3Var, noVar, this) == aVar) {
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
