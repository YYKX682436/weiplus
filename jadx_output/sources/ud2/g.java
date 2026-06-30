package ud2;

/* loaded from: classes10.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f426616d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ud2.o f426617e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f426618f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(xg2.h hVar, kotlin.coroutines.Continuation continuation, ud2.o oVar, kotlin.jvm.internal.h0 h0Var) {
        super(2, continuation);
        this.f426616d = hVar;
        this.f426617e = oVar;
        this.f426618f = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ud2.g(this.f426616d, continuation, this.f426617e, this.f426618f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ud2.g gVar = (ud2.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        gVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.z61) ((xg2.i) this.f426616d).f454393b).getCustom(1);
        if (finderObject != null) {
            com.tencent.mars.xlog.Log.i(this.f426617e.f426636c, "got finderObject " + finderObject.getId());
            this.f426618f.f310123d = finderObject;
        }
        return jz5.f0.f302826a;
    }
}
