package df2;

/* loaded from: classes.dex */
public final class fa extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f230130d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.zb f230131e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa(xg2.h hVar, kotlin.coroutines.Continuation continuation, df2.zb zbVar) {
        super(2, continuation);
        this.f230130d = hVar;
        this.f230131e = zbVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.fa(this.f230130d, continuation, this.f230131e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.fa faVar = (df2.fa) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        faVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.e(this.f230131e.f231939m, "[aiAssistant] fetchWelcomeConfig: CGI failed");
        return jz5.f0.f302826a;
    }
}
