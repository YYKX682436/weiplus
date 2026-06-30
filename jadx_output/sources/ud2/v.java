package ud2;

/* loaded from: classes10.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f426654d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ud2.c0 f426655e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f426656f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(xg2.h hVar, kotlin.coroutines.Continuation continuation, ud2.c0 c0Var, kotlin.jvm.internal.h0 h0Var) {
        super(2, continuation);
        this.f426654d = hVar;
        this.f426655e = c0Var;
        this.f426656f = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ud2.v(this.f426654d, continuation, this.f426655e, this.f426656f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ud2.v vVar = (ud2.v) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        vVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.z61) ((xg2.i) this.f426654d).f454393b).getCustom(1);
        if (finderObject != null) {
            com.tencent.mars.xlog.Log.i(this.f426655e.f426595f, "got finderObject " + finderObject.getId());
            this.f426656f.f310123d = finderObject;
        }
        return jz5.f0.f302826a;
    }
}
