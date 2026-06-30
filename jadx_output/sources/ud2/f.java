package ud2;

/* loaded from: classes10.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f426614d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ud2.o f426615e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(xg2.h hVar, kotlin.coroutines.Continuation continuation, ud2.o oVar) {
        super(2, continuation);
        this.f426614d = hVar;
        this.f426615e = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ud2.f(this.f426614d, continuation, this.f426615e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ud2.f fVar = (ud2.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        fVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f426614d).f454381b;
        com.tencent.mars.xlog.Log.e(this.f426615e.f426636c, "get finderObject failed, " + aVar2.f454379a);
        return jz5.f0.f302826a;
    }
}
