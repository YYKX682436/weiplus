package df2;

/* loaded from: classes3.dex */
public final class aq extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f229734d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.gq f229735e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f229736f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq(xg2.h hVar, kotlin.coroutines.Continuation continuation, df2.gq gqVar, kotlin.jvm.internal.c0 c0Var) {
        super(2, continuation);
        this.f229734d = hVar;
        this.f229735e = gqVar;
        this.f229736f = c0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.aq(this.f229734d, continuation, this.f229735e, this.f229736f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.aq aqVar = (df2.aq) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        aqVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.fu1 fu1Var = (r45.fu1) ((xg2.i) this.f229734d).f454393b;
        df2.gq gqVar = this.f229735e;
        com.tencent.mars.xlog.Log.i(gqVar.f230237m, "[cgiGetPanelData], success, resp = " + pm0.b0.g(fu1Var));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("old-dataVersion = ");
        r45.fu1 fu1Var2 = gqVar.f230238n;
        sb6.append(fu1Var2 != null ? java.lang.Integer.valueOf(fu1Var2.getInteger(3)) : null);
        sb6.append(", new-dataVersion = ");
        sb6.append(java.lang.Integer.valueOf(fu1Var.getInteger(3)));
        com.tencent.mars.xlog.Log.i(gqVar.f230237m, sb6.toString());
        r45.fu1 fu1Var3 = gqVar.f230238n;
        if (fu1Var3 == null) {
            gqVar.f230238n = fu1Var;
        } else if (fu1Var3.getInteger(3) <= fu1Var.getInteger(3)) {
            gqVar.f230238n = fu1Var;
        }
        this.f229736f.f310112d = true;
        return jz5.f0.f302826a;
    }
}
