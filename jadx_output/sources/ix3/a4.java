package ix3;

/* loaded from: classes.dex */
public final class a4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hx3.e f295364d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ix3.c4 f295365e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(hx3.e eVar, ix3.c4 c4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f295364d = eVar;
        this.f295365e = c4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ix3.a4(this.f295364d, this.f295365e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ix3.a4 a4Var = (ix3.a4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        a4Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        j75.f stateCenter;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        hx3.e eVar = this.f295364d;
        boolean z17 = !r26.n0.N(eVar.f285661b);
        ix3.c4 c4Var = this.f295365e;
        if (z17) {
            for (r45.dp5 dp5Var : c4Var.f295380e) {
                java.lang.String string = dp5Var.getString(1);
                boolean z18 = false;
                if (string != null && r26.n0.B(string, eVar.f285661b, true)) {
                    z18 = true;
                }
                if (z18) {
                    linkedList.add(dp5Var);
                }
            }
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = c4Var.P6();
        if (P6 != null && (stateCenter = P6.getStateCenter()) != null) {
            stateCenter.B3(new hx3.c(linkedList));
        }
        return jz5.f0.f302826a;
    }
}
