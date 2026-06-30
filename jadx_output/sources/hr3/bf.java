package hr3;

/* loaded from: classes.dex */
public final class bf extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f283429d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hr3.pf f283430e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(kotlin.jvm.internal.h0 h0Var, hr3.pf pfVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f283429d = h0Var;
        this.f283430e = pfVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hr3.bf(this.f283429d, this.f283430e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        hr3.bf bfVar = (hr3.bf) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        bfVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        hr3.pf pfVar = this.f283430e;
        this.f283429d.f310123d = db5.e1.Q(pfVar.getContext(), pfVar.getString(com.tencent.mm.R.string.f490573yv), pfVar.getString(com.tencent.mm.R.string.f490960bd4), true, false, null);
        return jz5.f0.f302826a;
    }
}
