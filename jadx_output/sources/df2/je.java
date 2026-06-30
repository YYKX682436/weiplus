package df2;

/* loaded from: classes3.dex */
public final class je extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f230472d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f230473e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.qe f230474f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public je(java.util.List list, df2.qe qeVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230473e = list;
        this.f230474f = qeVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        df2.je jeVar = new df2.je(this.f230473e, this.f230474f, continuation);
        jeVar.f230472d = obj;
        return jeVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.je jeVar = (df2.je) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        jeVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f230472d;
        for (r45.xm1 xm1Var : this.f230473e) {
            dk2.ef efVar = dk2.ef.f233372a;
            java.lang.String str = (java.lang.String) dk2.ef.f233410y.get(new java.lang.Integer(xm1Var.getInteger(0)));
            if (str == null || kotlin.jvm.internal.o.b(str, "")) {
                ((kotlinx.coroutines.c3) kotlinx.coroutines.l.b(y0Var, null, null, new df2.ie(xm1Var, this.f230474f, null), 3, null)).start();
            }
        }
        return jz5.f0.f302826a;
    }
}
