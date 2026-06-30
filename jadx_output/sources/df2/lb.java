package df2;

/* loaded from: classes.dex */
public final class lb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f230652d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.zb f230653e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb(xg2.h hVar, kotlin.coroutines.Continuation continuation, df2.zb zbVar) {
        super(2, continuation);
        this.f230652d = hVar;
        this.f230653e = zbVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.lb(this.f230652d, continuation, this.f230653e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.lb lbVar = (df2.lb) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        lbVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.e(this.f230653e.f231939m, "[aiAssistant] reportInitToolList: failed");
        return jz5.f0.f302826a;
    }
}
