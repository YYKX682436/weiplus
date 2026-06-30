package df2;

/* loaded from: classes.dex */
public final class iq extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f230424d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.ar f230425e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iq(xg2.h hVar, kotlin.coroutines.Continuation continuation, df2.ar arVar) {
        super(2, continuation);
        this.f230424d = hVar;
        this.f230425e = arVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.iq(this.f230424d, continuation, this.f230425e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.iq iqVar = (df2.iq) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        iqVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i(this.f230425e.f229737m, "followAttend failed");
        return jz5.f0.f302826a;
    }
}
