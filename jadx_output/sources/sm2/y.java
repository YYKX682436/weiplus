package sm2;

/* loaded from: classes3.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f409790d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gk2.e f409791e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409792f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(gk2.e eVar, sm2.o4 o4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f409791e = eVar;
        this.f409792f = o4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sm2.y(this.f409791e, this.f409792f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((sm2.y) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f409790d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            zl2.r4 r4Var = zl2.r4.f473950a;
            sm2.x xVar = new sm2.x(this.f409792f);
            this.f409790d = 1;
            if (r4Var.s2(this.f409791e, xVar, this) == aVar) {
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
