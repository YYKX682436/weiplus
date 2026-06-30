package df2;

/* loaded from: classes3.dex */
public final class no extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.to f230868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.v71 f230869e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no(df2.to toVar, r45.v71 v71Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230868d = toVar;
        this.f230869e = v71Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.no(this.f230868d, this.f230869e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.no noVar = (df2.no) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        noVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        df2.to.b7(this.f230868d, (r45.j32) this.f230869e.getCustom(4));
        return jz5.f0.f302826a;
    }
}
