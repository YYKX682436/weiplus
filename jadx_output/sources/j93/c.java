package j93;

/* loaded from: classes.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f298363d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j93.n f298364e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(kotlin.jvm.internal.h0 h0Var, j93.n nVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f298363d = h0Var;
        this.f298364e = nVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new j93.c(this.f298363d, this.f298364e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        j93.c cVar = (j93.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        cVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        j93.n nVar = this.f298364e;
        this.f298363d.f310123d = db5.e1.Q(nVar.getActivity(), nVar.getString(com.tencent.mm.R.string.f490573yv), nVar.getString(com.tencent.mm.R.string.g9k), true, true, null);
        return jz5.f0.f302826a;
    }
}
