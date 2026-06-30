package df2;

/* loaded from: classes.dex */
public final class ob extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f230949d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.zb f230950e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob(xg2.h hVar, kotlin.coroutines.Continuation continuation, df2.zb zbVar) {
        super(2, continuation);
        this.f230949d = hVar;
        this.f230950e = zbVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.ob(this.f230949d, continuation, this.f230950e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.ob obVar = (df2.ob) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        obVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i(this.f230950e.f231939m, "[aiAssistant sendAiAssistantCloseDialogAction] failed");
        return jz5.f0.f302826a;
    }
}
