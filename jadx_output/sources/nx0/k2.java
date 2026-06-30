package nx0;

/* loaded from: classes5.dex */
public final class k2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f341149d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.FilterView f341150e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nx0.i2 f341151f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.FilterView filterView, nx0.i2 i2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f341150e = filterView;
        this.f341151f = i2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nx0.k2(this.f341150e, this.f341151f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((nx0.k2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f341149d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            yz5.p pVar = this.f341150e.f69603h;
            this.f341149d = 1;
            if (pVar.invoke(this.f341151f, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
