package um2;

/* loaded from: classes3.dex */
public final class x4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f429018d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f429019e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(um2.x5 x5Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f429019e = x5Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new um2.x4(this.f429019e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((um2.x4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f429018d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            um2.x5 x5Var = this.f429019e;
            com.tencent.mars.xlog.Log.i(x5Var.f429032f, "iscollect");
            kotlinx.coroutines.flow.j2 j2Var = ((mm2.c1) x5Var.c(mm2.c1.class)).U;
            um2.w4 w4Var = new um2.w4(x5Var);
            this.f429018d = 1;
            if (((kotlinx.coroutines.flow.h3) j2Var).a(w4Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new jz5.d();
    }
}
