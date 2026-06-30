package df2;

/* loaded from: classes3.dex */
public final class he extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.xm1 f230321d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f230322e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public he(r45.xm1 xm1Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230321d = xm1Var;
        this.f230322e = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.he(this.f230321d, this.f230322e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.he heVar = (df2.he) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        heVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        dk2.ef efVar = dk2.ef.f233372a;
        dk2.ef.f233410y.put(new java.lang.Integer(this.f230321d.getInteger(0)), this.f230322e);
        return jz5.f0.f302826a;
    }
}
