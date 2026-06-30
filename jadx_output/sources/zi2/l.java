package zi2;

/* loaded from: classes.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f473115d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f473116e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(xg2.h hVar, kotlin.coroutines.Continuation continuation, yz5.l lVar) {
        super(2, continuation);
        this.f473115d = hVar;
        this.f473116e = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zi2.l(this.f473115d, continuation, this.f473116e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        zi2.l lVar = (zi2.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        lVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("FinderLiveMicCoverPlugin", "opChangeLiveMode success");
        yz5.l lVar = this.f473116e;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.TRUE);
        }
        return jz5.f0.f302826a;
    }
}
