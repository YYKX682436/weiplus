package zi2;

/* loaded from: classes.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f473141d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f473142e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(xg2.h hVar, kotlin.coroutines.Continuation continuation, kotlin.jvm.internal.c0 c0Var) {
        super(2, continuation);
        this.f473141d = hVar;
        this.f473142e = c0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zi2.s(this.f473141d, continuation, this.f473142e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        zi2.s sVar = (zi2.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        sVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("FinderLiveMicCoverPlugin", "updateMicSeatInfo success");
        this.f473142e.f310112d = true;
        return jz5.f0.f302826a;
    }
}
