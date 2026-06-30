package df2;

/* loaded from: classes5.dex */
public final class pb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f231057d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.zb f231058e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb(xg2.h hVar, kotlin.coroutines.Continuation continuation, df2.zb zbVar) {
        super(2, continuation);
        this.f231057d = hVar;
        this.f231058e = zbVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.pb(this.f231057d, continuation, this.f231058e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.pb pbVar = (df2.pb) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        pbVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i(this.f231058e.f231939m, "[aiAssistant sendAiAssistantCloseDialogAction] success");
        return jz5.f0.f302826a;
    }
}
