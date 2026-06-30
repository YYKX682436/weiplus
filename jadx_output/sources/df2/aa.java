package df2;

/* loaded from: classes5.dex */
public final class aa extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f229701d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.zb f229702e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f229703f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(xg2.h hVar, kotlin.coroutines.Continuation continuation, df2.zb zbVar, java.lang.String str) {
        super(2, continuation);
        this.f229701d = hVar;
        this.f229702e = zbVar;
        this.f229703f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.aa(this.f229701d, continuation, this.f229702e, this.f229703f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.aa aaVar = (df2.aa) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        aaVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        df2.zb zbVar = this.f229702e;
        com.tencent.mars.xlog.Log.i(zbVar.f231939m, "[aiAssistant doStartDialog] CGI failed");
        java.util.Set set = zbVar.f231941o;
        java.lang.String str = this.f229703f;
        set.remove(str);
        df2.zb.Z6(zbVar, str);
        return jz5.f0.f302826a;
    }
}
