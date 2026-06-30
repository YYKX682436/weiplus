package lm;

/* loaded from: classes9.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lm.r f319305d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w65.o f319306e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(lm.r rVar, w65.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f319305d = rVar;
        this.f319306e = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new lm.h(this.f319305d, this.f319306e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        lm.h hVar = (lm.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        hVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ((java.util.HashSet) ((jz5.n) this.f319305d.f319330n).getValue()).remove(new d75.c(this.f319306e));
        return jz5.f0.f302826a;
    }
}
