package df2;

/* loaded from: classes3.dex */
public final class xt extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f231802d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f231803e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gk2.e f231804f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xt(com.tencent.mm.ui.MMActivity mMActivity, gk2.e eVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f231803e = mMActivity;
        this.f231804f = eVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.xt(this.f231803e, this.f231804f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.xt) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f231802d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ld2.i iVar = ld2.i.f318103a;
            this.f231802d = 1;
            if (iVar.a(this.f231803e, this.f231804f, false, this) == aVar) {
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
