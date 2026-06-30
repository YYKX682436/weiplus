package df2;

/* loaded from: classes5.dex */
public final class mb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f230766d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.zb f230767e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f230768f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb(xg2.h hVar, kotlin.coroutines.Continuation continuation, df2.zb zbVar, java.util.List list) {
        super(2, continuation);
        this.f230766d = hVar;
        this.f230767e = zbVar;
        this.f230768f = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.mb(this.f230766d, continuation, this.f230767e, this.f230768f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.mb mbVar = (df2.mb) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        mbVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i(this.f230767e.f231939m, "[aiAssistant] reportInitToolList: success, reported " + this.f230768f.size() + " tools");
        return jz5.f0.f302826a;
    }
}
