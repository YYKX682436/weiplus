package df2;

/* loaded from: classes10.dex */
public final class xb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.zb f231769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.lb2 f231770e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb(df2.zb zbVar, r45.lb2 lb2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f231769d = zbVar;
        this.f231770e = lb2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.xb(this.f231769d, this.f231770e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.xb xbVar = (df2.xb) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        xbVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        df2.zb zbVar = this.f231769d;
        zbVar.getClass();
        pm0.v.X(new df2.bb(zbVar, this.f231770e));
        return jz5.f0.f302826a;
    }
}
