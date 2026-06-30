package ud2;

/* loaded from: classes10.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f426652d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ud2.c0 f426653e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(xg2.h hVar, kotlin.coroutines.Continuation continuation, ud2.c0 c0Var) {
        super(2, continuation);
        this.f426652d = hVar;
        this.f426653e = c0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ud2.u(this.f426652d, continuation, this.f426653e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ud2.u uVar = (ud2.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        uVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f426652d).f454381b;
        com.tencent.mars.xlog.Log.e(this.f426653e.f426595f, "get finderObject failed, " + aVar2.f454379a);
        return jz5.f0.f302826a;
    }
}
